package com.kohlschutter.jacline.lib.coding;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

/**
 * A {@link KeyDecoderProvider} that can decode objects from a {@link ResultSet} row.
 * 
 * @author Christian Kohlschütter
 */
public class ResultSetRowKeyDecoderProvider implements KeyDecoderProvider {
  private final Map<String, String> keyToColumn = new HashMap<>();

  private static final ResultSetRowKeyDecoderProvider DEFAULT =
      new ResultSetRowKeyDecoderProvider() {
        @Override
        public void setColumnForKey(String key, String column) {
          throw new UnsupportedOperationException();
        }
      };

  /**
   * Returns the default {@link ResultSetRowKeyDecoderProvider} instance, which does not allow or
   * require any further customization.
   * 
   * @return The default instance.
   */
  @SuppressFBWarnings("MS_EXPOSE_REP")
  public static ResultSetRowKeyDecoderProvider getDefaultInstance() {
    return DEFAULT;
  }

  /**
   * Constructs a new {@link ResultSetRowKeyDecoderProvider}, to be customized via
   * {@link #setColumnForKey(String, String)}.
   * 
   * @see #getDefaultInstance()
   */
  public ResultSetRowKeyDecoderProvider() {
  }

  private String columnForKey(String key) {
    String column = keyToColumn.get(key);
    if (column == null) {
      return key;
    } else {
      return column;
    }
  }

  /**
   * Registers a certain {@link ResultSet} column for the given coding key.
   * 
   * By default (or when {@code column} is {@code null}), the assumed column name is identical to
   * the key's value.
   * 
   * @param key The key.
   * @param column The column.
   */
  public void setColumnForKey(String key, String column) {
    keyToColumn.put(key, column);
  }

  @Override
  public KeyDecoder keyDecoder(String expectedCodedType, Object encoded) throws CodingException {
    ResultSet rs = (ResultSet) encoded;

    return new KeyDecoder() {
      @Override
      public String stringForKey(String key) throws CodingException {
        try {
          return rs.getString(columnForKey(key));
        } catch (SQLException e) {
          throw new CodingException(e);
        }
      }

      @Override
      public <T> T objectForKey(String key, ObjectDecoder<T> decoder) throws CodingException {
        try {
          return decoder.decode(rs.getObject(columnForKey(key)));
        } catch (SQLException e) {
          throw new CodingException(e);
        }
      }

      @Override
      public Number numberForKey(String key) throws CodingException {
        try {
          String col = columnForKey(key);
          Object obj = rs.getObject(col);
          if (obj instanceof Number) {
            return (Number) obj;
          } else {
            return rs.getBigDecimal(col);
          }
        } catch (SQLException e) {
          throw new CodingException(e);
        }
      }

      @Override
      public boolean hasKey(String key) throws CodingException {
        try {
          rs.findColumn(columnForKey(key));
          return true;
        } catch (SQLException e) {
          return false;
        }
      }

      @Override
      public Boolean booleanForKey(String key) throws CodingException {
        try {
          return rs.getBoolean(columnForKey(key));
        } catch (SQLException e) {
          throw new CodingException(e);
        }
      }

      @Override
      public <T> T[] arrayForKey(String key, ArrayDecoder<T> decoder) throws CodingException {
        throw new CodingException("Not yet implemented");
      }

      @Override
      public void markAdvisory(CodingAdvisory advisory) throws CodingException {
      }

      @Override
      public CodingServiceProvider provider() {
        throw new UnsupportedOperationException();// FIXME
      }
    };
  }

  @Override
  public SequenceDecoder sequenceDecoder(Object encoded) throws CodingException {
    throw new UnsupportedOperationException(); // FIXME
  }
}

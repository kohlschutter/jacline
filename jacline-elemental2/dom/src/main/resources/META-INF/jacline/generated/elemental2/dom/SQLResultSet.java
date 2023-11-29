package elemental2.dom;
import elemental2.dom.SQLResultSetRowList;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SQLResultSet{
public int insertId;
public SQLResultSetRowList rows;
public int rowsAffected;
}

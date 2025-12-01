package elemental2.indexeddb;
import org.jspecify.annotations.Nullable;
import elemental2.indexeddb.IDBCursor;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBCursorWithValue extends IDBCursor{
public @Nullable Object value;
}

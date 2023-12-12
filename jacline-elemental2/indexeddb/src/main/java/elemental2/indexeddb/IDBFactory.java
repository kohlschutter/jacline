package elemental2.indexeddb;
import elemental2.indexeddb.IDBOpenDBRequest;
import elemental2.indexeddb.IDBDatabaseInfo;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBFactory{
public native int cmp(Object first,Object second);
public native Promise<JsArray<IDBDatabaseInfo>> databases();
public native IDBOpenDBRequest deleteDatabase(String name);
public native IDBOpenDBRequest open(String name,double version);
public native IDBOpenDBRequest open(String name);
}

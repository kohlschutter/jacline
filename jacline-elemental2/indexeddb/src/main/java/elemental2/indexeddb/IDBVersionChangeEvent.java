package elemental2.indexeddb;
import org.jspecify.annotations.Nullable;
import elemental2.indexeddb.IDBVersionChangeEventInit;
import java.lang.Double;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBVersionChangeEvent extends Event{
public @Nullable Double newVersion;
public double oldVersion;
public IDBVersionChangeEvent(String type,IDBVersionChangeEventInit eventInit){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public IDBVersionChangeEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}

package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.DOMException;
import java.lang.Object;
import elemental2.dom.FileSystemEntry;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FileSystemDirectoryReader{
@JsFunction
public interface ReadEntriesErrorCallbackFn{
@Nullable Object onInvoke(DOMException p0);
}
@JsFunction
public interface ReadEntriesSuccessCallbackFn{
@JsOverlay
default @Nullable Object onInvoke(@Nullable FileSystemEntry[] p0){
return onInvoke(Js.<JsArray<@Nullable FileSystemEntry>>uncheckedCast(p0));
}
@Nullable Object onInvoke(JsArray<@Nullable FileSystemEntry> p0);
}
public native void readEntries(FileSystemDirectoryReader.ReadEntriesSuccessCallbackFn successCallback,FileSystemDirectoryReader.ReadEntriesErrorCallbackFn errorCallback);
public native void readEntries(FileSystemDirectoryReader.ReadEntriesSuccessCallbackFn successCallback);
}

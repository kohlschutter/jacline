package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import elemental2.dom.DOMException;
import elemental2.dom.File;
import java.lang.Object;
import elemental2.dom.FileSystemEntry;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FileSystemFileEntry extends FileSystemEntry{
@JsFunction
public interface FileErrorCallbackFn{
@Nullable Object onInvoke(DOMException p0);
}
@JsFunction
public interface FileSuccessCallbackFn{
@Nullable Object onInvoke(File p0);
}
public native void file(FileSystemFileEntry.FileSuccessCallbackFn successCallback,FileSystemFileEntry.FileErrorCallbackFn errorCallback);
public native void file(FileSystemFileEntry.FileSuccessCallbackFn successCallback);
}

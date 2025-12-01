package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import elemental2.dom.DOMException;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.FileSystem;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FileSystemEntry{
@JsFunction
public interface GetParentErrorCallbackFn{
@Nullable Object onInvoke(DOMException p0);
}
@JsFunction
public interface GetParentSuccessCallbackFn{
@Nullable Object onInvoke(FileSystemEntry p0);
}
public FileSystem filesystem;
public String fullPath;
public boolean isDirectory;
public boolean isFile;
public String name;
public native void getParent();
public native void getParent(FileSystemEntry.GetParentSuccessCallbackFn successCallback,FileSystemEntry.GetParentErrorCallbackFn errorCallback);
public native void getParent(FileSystemEntry.GetParentSuccessCallbackFn successCallback);
}

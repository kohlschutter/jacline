package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.FileSystemDirectoryReader;
import elemental2.dom.FileSystemEntry;
import elemental2.dom.FileSystemFileEntry;
import elemental2.dom.FileSystemFlags;
import jsinterop.annotations.JsFunction;
import elemental2.dom.DOMException;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FileSystemDirectoryEntry extends FileSystemEntry{
@JsFunction
public interface GetDirectoryErrorCallbackFn{
@Nullable Object onInvoke(DOMException p0);
}
@JsFunction
public interface GetDirectorySuccessCallbackFn{
@Nullable Object onInvoke(FileSystemDirectoryEntry p0);
}
@JsFunction
public interface GetFileErrorCallbackFn{
@Nullable Object onInvoke(DOMException p0);
}
@JsFunction
public interface GetFileSuccessCallbackFn{
@Nullable Object onInvoke(FileSystemFileEntry p0);
}
public native FileSystemDirectoryReader createReader();
public native void getDirectory();
public native void getDirectory(@Nullable String path,FileSystemFlags options,FileSystemDirectoryEntry.GetDirectorySuccessCallbackFn successCallback,FileSystemDirectoryEntry.GetDirectoryErrorCallbackFn errorCallback);
public native void getDirectory(@Nullable String path,FileSystemFlags options,FileSystemDirectoryEntry.GetDirectorySuccessCallbackFn successCallback);
public native void getDirectory(@Nullable String path,FileSystemFlags options);
public native void getDirectory(@Nullable String path);
public native void getFile();
public native void getFile(@Nullable String path,FileSystemFlags options,FileSystemDirectoryEntry.GetFileSuccessCallbackFn successCallback,FileSystemDirectoryEntry.GetFileErrorCallbackFn errorCallback);
public native void getFile(@Nullable String path,FileSystemFlags options,FileSystemDirectoryEntry.GetFileSuccessCallbackFn successCallback);
public native void getFile(@Nullable String path,FileSystemFlags options);
public native void getFile(@Nullable String path);
}

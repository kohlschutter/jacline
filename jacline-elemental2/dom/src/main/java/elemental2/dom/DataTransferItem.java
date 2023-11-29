package elemental2.dom;
import jsinterop.annotations.JsFunction;
import elemental2.dom.File;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DataTransferItem{
@JsFunction
public interface GetAsStringCallbackFn{
Object onInvoke(String p0);
}
public String kind;
public String type;
public native File getAsFile();
public native void getAsString(DataTransferItem.GetAsStringCallbackFn callback);
}

package elemental2.dom;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaError{
@JsOverlay
public static final int MEDIA_ERR_ABORTED=MediaError__Constants.MEDIA_ERR_ABORTED;
@JsOverlay
public static final int MEDIA_ERR_DECODE=MediaError__Constants.MEDIA_ERR_DECODE;
@JsOverlay
public static final int MEDIA_ERR_NETWORK=MediaError__Constants.MEDIA_ERR_NETWORK;
@JsOverlay
public static final int MEDIA_ERR_SRC_NOT_SUPPORTED=MediaError__Constants.MEDIA_ERR_SRC_NOT_SUPPORTED;
public int code;
public String message;
}

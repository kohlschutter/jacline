package elemental2.dom;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XPathException{
@JsOverlay
public static final int INVALID_EXPRESSION_ERR=XPathException__Constants.INVALID_EXPRESSION_ERR;
@JsOverlay
public static final int TYPE_ERR=XPathException__Constants.TYPE_ERR;
public int code;
}

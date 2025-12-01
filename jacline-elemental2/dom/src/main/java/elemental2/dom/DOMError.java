package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMLocator;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMError{
@JsOverlay
public static final int SEVERITY_ERROR=DOMError__Constants.SEVERITY_ERROR;
@JsOverlay
public static final int SEVERITY_FATAL_ERROR=DOMError__Constants.SEVERITY_FATAL_ERROR;
@JsOverlay
public static final int SEVERITY_WARNING=DOMError__Constants.SEVERITY_WARNING;
public @Nullable DOMLocator location;
public String message;
public String name;
public @Nullable JsObject relatedData;
public @Nullable JsObject relatedException;
public double severity;
public String type;
}

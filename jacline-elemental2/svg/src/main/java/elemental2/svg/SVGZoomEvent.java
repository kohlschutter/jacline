package elemental2.svg;
import org.jspecify.annotations.Nullable;
import elemental2.svg.SVGPoint;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.svg.SVGRect;
import elemental2.dom.UIEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGZoomEvent extends UIEvent{
public double newScale;
public SVGPoint newTranslate;
public double previousScale;
public SVGPoint previousTranslate;
public SVGRect zoomRectScreen;
public SVGZoomEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable UIEventInit)null);
}
}

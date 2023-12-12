package elemental2.svg;
import elemental2.dom.Event;
import elemental2.svg.SVGSVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Document;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGDocument extends Document{
public SVGSVGElement rootElement;
public native Event createEvent();
public native Event createEvent(String eventType);
}

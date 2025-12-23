package elemental2.barcode;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMPointReadOnly;
import elemental2.core.JsArray;
import elemental2.dom.DOMRectReadOnly;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DetectedBarcode{
public DOMRectReadOnly boundingBox;
public JsArray<DOMPointReadOnly> cornerPoints;
public String format;
public String rawValue;
}

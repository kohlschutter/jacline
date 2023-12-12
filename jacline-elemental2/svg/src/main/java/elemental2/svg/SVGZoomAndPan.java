package elemental2.svg;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SVGZoomAndPan{
@JsProperty
int getZoomAndPan();
@JsProperty
void setZoomAndPan(int zoomAndPan);
}

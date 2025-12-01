package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface CanvasDrawingStyles{
@JsProperty
String getFont();
@JsProperty
String getLetterSpacing();
@JsProperty
String getLineCap();
JsArray<Double> getLineDash();
@JsProperty
String getLineJoin();
@JsProperty
double getLineWidth();
@JsProperty
double getMiterLimit();
@JsProperty
String getTextAlign();
@JsProperty
String getTextBaseline();
@JsProperty
void setFont(String font);
@JsProperty
void setLetterSpacing(String letterSpacing);
@JsProperty
void setLineCap(String lineCap);
void setLineDash(@Nullable JsArray<Double> segments);
@JsOverlay
default void setLineDash(double@Nullable [] segments){
setLineDash(Js.<@Nullable JsArray<Double>>uncheckedCast(segments));
}
@JsProperty
void setLineJoin(String lineJoin);
@JsProperty
void setLineWidth(double lineWidth);
@JsProperty
void setMiterLimit(double miterLimit);
@JsProperty
void setTextAlign(String textAlign);
@JsProperty
void setTextBaseline(String textBaseline);
}

package elemental2.svg;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGFilterPrimitiveStandardAttributes;
import elemental2.svg.SVGAnimatedNumber;
import elemental2.svg.SVGAnimatedString;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGFEDisplacementMapElement extends SVGElement implements SVGFilterPrimitiveStandardAttributes{
@JsOverlay
public static final double SVG_CHANNEL_A=SVGFEDisplacementMapElement__Constants.SVG_CHANNEL_A;
@JsOverlay
public static final double SVG_CHANNEL_B=SVGFEDisplacementMapElement__Constants.SVG_CHANNEL_B;
@JsOverlay
public static final double SVG_CHANNEL_G=SVGFEDisplacementMapElement__Constants.SVG_CHANNEL_G;
@JsOverlay
public static final double SVG_CHANNEL_R=SVGFEDisplacementMapElement__Constants.SVG_CHANNEL_R;
@JsOverlay
public static final double SVG_CHANNEL_UNKNOWN=SVGFEDisplacementMapElement__Constants.SVG_CHANNEL_UNKNOWN;
public SVGAnimatedLength height;
public SVGAnimatedString in1;
public SVGAnimatedString in2;
public SVGAnimatedString result;
public SVGAnimatedNumber scale;
public SVGAnimatedLength width;
public SVGAnimatedLength x;
public SVGAnimatedEnumeration xChannelSelector;
public SVGAnimatedLength y;
public SVGAnimatedEnumeration yChannelSelector;
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedLength getHeight();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGAnimatedString getResult();
@JsProperty
public native SVGAnimatedLength getWidth();
@JsProperty
public native SVGAnimatedLength getX();
@JsProperty
public native SVGAnimatedLength getY();
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setHeight(SVGAnimatedLength height);
@JsProperty
public native void setResult(SVGAnimatedString result);
@JsProperty
public native void setWidth(SVGAnimatedLength width);
@JsProperty
public native void setX(SVGAnimatedLength x);
@JsProperty
public native void setY(SVGAnimatedLength y);
}

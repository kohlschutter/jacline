package elemental2.svg;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGAngle;
import elemental2.svg.SVGAnimatedAngle;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGAnimatedRect;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGFitToViewBox;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGMarkerElement extends SVGElement implements SVGExternalResourcesRequired, SVGFitToViewBox, SVGLangSpace, SVGStylable{
@JsOverlay
public static final double SVG_MARKERUNITS_STROKEWIDTH=SVGMarkerElement__Constants.SVG_MARKERUNITS_STROKEWIDTH;
@JsOverlay
public static final double SVG_MARKERUNITS_UNKNOWN=SVGMarkerElement__Constants.SVG_MARKERUNITS_UNKNOWN;
@JsOverlay
public static final double SVG_MARKERUNITS_USERSPACEONUSE=SVGMarkerElement__Constants.SVG_MARKERUNITS_USERSPACEONUSE;
@JsOverlay
public static final double SVG_MARKER_ORIENT_ANGLE=SVGMarkerElement__Constants.SVG_MARKER_ORIENT_ANGLE;
@JsOverlay
public static final double SVG_MARKER_ORIENT_AUTO=SVGMarkerElement__Constants.SVG_MARKER_ORIENT_AUTO;
@JsOverlay
public static final double SVG_MARKER_ORIENT_UNKNOWN=SVGMarkerElement__Constants.SVG_MARKER_ORIENT_UNKNOWN;
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedLength markerHeight;
public SVGAnimatedEnumeration markerUnits;
public SVGAnimatedLength markerWidth;
public SVGAnimatedAngle orientAngle;
public SVGAnimatedEnumeration orientType;
public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
public SVGAnimatedLength refX;
public SVGAnimatedLength refY;
public SVGAnimatedRect viewBox;
public String xmllang;
public String xmlspace;
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty
public native SVGAnimatedRect getViewBox();
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
public native void setOrientToAngle();
public native void setOrientToAngle(SVGAngle angle);
public native Object setOrientToAuto();
@JsProperty
public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio preserveAspectRatio);
@JsProperty
public native void setViewBox(SVGAnimatedRect viewBox);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}

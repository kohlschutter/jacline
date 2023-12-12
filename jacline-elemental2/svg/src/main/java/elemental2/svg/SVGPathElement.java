package elemental2.svg;
import elemental2.svg.SVGPathSegCurvetoCubicRel;
import elemental2.svg.SVGPathSegCurvetoCubicSmoothAbs;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGPathSegArcRel;
import elemental2.svg.SVGPathSegLinetoRel;
import elemental2.svg.SVGPathSegCurvetoQuadraticAbs;
import elemental2.svg.SVGPathSegCurvetoQuadraticSmoothAbs;
import elemental2.svg.SVGPathSegMovetoRel;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGMatrix;
import elemental2.svg.SVGPathSegLinetoHorizontalAbs;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGPathSegArcAbs;
import elemental2.svg.SVGTransformable;
import elemental2.svg.SVGPathSegCurvetoQuadraticSmoothRel;
import elemental2.svg.SVGPathSegLinetoVerticalRel;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGTests;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGPathSegCurvetoCubicAbs;
import elemental2.svg.SVGAnimatedTransformList;
import elemental2.svg.SVGStringList;
import elemental2.svg.SVGPoint;
import elemental2.svg.SVGPathSegList;
import elemental2.svg.SVGPathSegClosePath;
import elemental2.svg.SVGAnimatedNumber;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGRect;
import elemental2.svg.SVGExternalResourcesRequired;
import elemental2.svg.SVGPathSegCurvetoQuadraticRel;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGPathSegLinetoAbs;
import elemental2.svg.SVGPathSegMovetoAbs;
import elemental2.svg.SVGPathSegLinetoVerticalAbs;
import elemental2.svg.SVGPathSegLinetoHorizontalRel;
import elemental2.svg.SVGPathSegCurvetoCubicSmoothRel;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGPathElement extends SVGElement implements SVGExternalResourcesRequired, SVGLangSpace, SVGStylable, SVGTests, SVGTransformable{
public SVGPathSegList animatedNormalizedPathSegList;
public SVGPathSegList animatedPathSegList;
public SVGAnimatedBoolean externalResourcesRequired;
public SVGElement farthestViewportElement;
public SVGElement nearestViewportElement;
public SVGPathSegList normalizedPathSegList;
public SVGAnimatedNumber pathLength;
public SVGPathSegList pathSegList;
public SVGStringList requiredExtensions;
public SVGStringList requiredFeatures;
public SVGStringList systemLanguage;
public SVGAnimatedTransformList transform;
public String xmllang;
public String xmlspace;
public native SVGPathSegArcAbs createSVGPathSegArcAbs();
public native SVGPathSegArcAbs createSVGPathSegArcAbs(double x,double y,double r1,double r2,double angle,boolean largeArcFlag,boolean sweepFlag);
public native SVGPathSegArcAbs createSVGPathSegArcAbs(double x,double y,double r1,double r2,double angle,boolean largeArcFlag);
public native SVGPathSegArcAbs createSVGPathSegArcAbs(double x,double y,double r1,double r2,double angle);
public native SVGPathSegArcAbs createSVGPathSegArcAbs(double x,double y,double r1,double r2);
public native SVGPathSegArcAbs createSVGPathSegArcAbs(double x,double y,double r1);
public native SVGPathSegArcAbs createSVGPathSegArcAbs(double x,double y);
public native SVGPathSegArcAbs createSVGPathSegArcAbs(double x);
public native SVGPathSegArcRel createSVGPathSegArcRel();
public native SVGPathSegArcRel createSVGPathSegArcRel(double x,double y,double r1,double r2,double angle,boolean largeArcFlag,boolean sweepFlag);
public native SVGPathSegArcRel createSVGPathSegArcRel(double x,double y,double r1,double r2,double angle,boolean largeArcFlag);
public native SVGPathSegArcRel createSVGPathSegArcRel(double x,double y,double r1,double r2,double angle);
public native SVGPathSegArcRel createSVGPathSegArcRel(double x,double y,double r1,double r2);
public native SVGPathSegArcRel createSVGPathSegArcRel(double x,double y,double r1);
public native SVGPathSegArcRel createSVGPathSegArcRel(double x,double y);
public native SVGPathSegArcRel createSVGPathSegArcRel(double x);
public native SVGPathSegClosePath createSVGPathSegClosePath();
public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs();
public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x,double y,double x1,double y1,double x2,double y2);
public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x,double y,double x1,double y1,double x2);
public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x,double y,double x1,double y1);
public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x,double y,double x1);
public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x,double y);
public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(double x);
public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel();
public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x,double y,double x1,double y1,double x2,double y2);
public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x,double y,double x1,double y1,double x2);
public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x,double y,double x1,double y1);
public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x,double y,double x1);
public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x,double y);
public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(double x);
public native SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs();
public native SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(double x,double y,double x2,double y2);
public native SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(double x,double y,double x2);
public native SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(double x,double y);
public native SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(double x);
public native SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel();
public native SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(double x,double y,double x2,double y2);
public native SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(double x,double y,double x2);
public native SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(double x,double y);
public native SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(double x);
public native SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs();
public native SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(double x,double y,double x1,double y1);
public native SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(double x,double y,double x1);
public native SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(double x,double y);
public native SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(double x);
public native SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel();
public native SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(double x,double y,double x1,double y1);
public native SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(double x,double y,double x1);
public native SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(double x,double y);
public native SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(double x);
public native SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs();
public native SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(double x,double y);
public native SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(double x);
public native SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel();
public native SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(double x,double y);
public native SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(double x);
public native SVGPathSegLinetoAbs createSVGPathSegLinetoAbs();
public native SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(double x,double y);
public native SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(double x);
public native SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs();
public native SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(double x);
public native SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel();
public native SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(double x);
public native SVGPathSegLinetoRel createSVGPathSegLinetoRel();
public native SVGPathSegLinetoRel createSVGPathSegLinetoRel(double x,double y);
public native SVGPathSegLinetoRel createSVGPathSegLinetoRel(double x);
public native SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs();
public native SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(double y);
public native SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel();
public native SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(double y);
public native SVGPathSegMovetoAbs createSVGPathSegMovetoAbs();
public native SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(double x,double y);
public native SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(double x);
public native SVGPathSegMovetoRel createSVGPathSegMovetoRel();
public native SVGPathSegMovetoRel createSVGPathSegMovetoRel(double x,double y);
public native SVGPathSegMovetoRel createSVGPathSegMovetoRel(double x);
public native SVGRect getBBox();
public native SVGMatrix getCTM();
@JsProperty
public native SVGAnimatedString getClassName();
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGElement getFarthestViewportElement();
@JsProperty
public native SVGElement getNearestViewportElement();
public native int getPathSegAtLength();
public native int getPathSegAtLength(double distance);
public native SVGPoint getPointAtLength();
public native SVGPoint getPointAtLength(double distance);
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGStringList getRequiredExtensions();
@JsProperty
public native SVGStringList getRequiredFeatures();
public native SVGMatrix getScreenCTM();
@JsProperty
public native SVGStringList getSystemLanguage();
public native int getTotalLength();
@JsProperty
public native SVGAnimatedTransformList getTransform();
public native SVGMatrix getTransformToElement();
public native SVGMatrix getTransformToElement(SVGElement element);
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
public native boolean hasExtension();
public native boolean hasExtension(String extension);
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setFarthestViewportElement(SVGElement farthestViewportElement);
@JsProperty
public native void setNearestViewportElement(SVGElement nearestViewportElement);
@JsProperty
public native void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
public native void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
public native void setSystemLanguage(SVGStringList systemLanguage);
@JsProperty
public native void setTransform(SVGAnimatedTransformList transform);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}

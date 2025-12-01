package elemental2.svg;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.svg.SVGLangSpace;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGMatrix;
import elemental2.dom.CSSValue;
import elemental2.dom.NodeList;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGTests;
import elemental2.svg.SVGZoomAndPan;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGStringList;
import elemental2.svg.SVGAnimatedPreserveAspectRatio;
import elemental2.svg.SVGPoint;
import elemental2.svg.SVGTransform;
import elemental2.svg.SVGLocatable;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGRect;
import elemental2.svg.SVGExternalResourcesRequired;
import elemental2.svg.SVGNumber;
import elemental2.svg.SVGLength;
import elemental2.svg.SVGAngle;
import elemental2.svg.SVGStylable;
import elemental2.svg.SVGAnimatedRect;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.svg.SVGFitToViewBox;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGSVGElement extends SVGElement implements SVGExternalResourcesRequired, SVGFitToViewBox, SVGLangSpace, SVGLocatable, SVGStylable, SVGTests, SVGZoomAndPan{
@JsOverlay
public static final double SVG_ZOOMANDPAN_DISABLE=SVGSVGElement__Constants.SVG_ZOOMANDPAN_DISABLE;
@JsOverlay
public static final double SVG_ZOOMANDPAN_MAGNIFY=SVGSVGElement__Constants.SVG_ZOOMANDPAN_MAGNIFY;
@JsOverlay
public static final double SVG_ZOOMANDPAN_UNKNOWN=SVGSVGElement__Constants.SVG_ZOOMANDPAN_UNKNOWN;
public String contentScriptType;
public String contentStyleType;
public double currentScale;
public SVGPoint currentTranslate;
public SVGAnimatedBoolean externalResourcesRequired;
public SVGElement farthestViewportElement;
public SVGAnimatedLength height;
public SVGElement nearestViewportElement;
public double pixelUnitToMillimeterX;
public double pixelUnitToMillimeterY;
public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
public SVGStringList requiredExtensions;
public SVGStringList requiredFeatures;
public double screenPixelToMillimeterX;
public double screenPixelToMillimeterY;
public SVGStringList systemLanguage;
public boolean useCurrentView;
public SVGAnimatedRect viewBox;
public SVGRect viewport;
public SVGAnimatedLength width;
public SVGAnimatedLength x;
public String xmllang;
public String xmlspace;
public SVGAnimatedLength y;
public double zoomAndPan;
public native boolean animationsPaused();
public native boolean checkEnclosure();
public native boolean checkEnclosure(SVGElement element,SVGRect rect);
public native boolean checkEnclosure(SVGElement element);
public native boolean checkIntersection();
public native boolean checkIntersection(SVGElement element,SVGRect rect);
public native boolean checkIntersection(SVGElement element);
public native SVGAngle createSVGAngle();
public native SVGLength createSVGLength();
public native SVGMatrix createSVGMatrix();
public native SVGNumber createSVGNumber();
public native SVGPoint createSVGPoint();
public native SVGRect createSVGRect();
public native SVGTransform createSVGTransform();
public native SVGTransform createSVGTransformFromMatrix();
public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
public native @Nullable Object deselectAll();
public native @Nullable Object forceRedraw();
public native SVGRect getBBox();
public native SVGMatrix getCTM();
@JsProperty
public native SVGAnimatedString getClassName();
public native double getCurrentTime();
public native @Nullable Element getElementById();
public native @Nullable Element getElementById(String elementId);
public native NodeList<@Nullable Object> getEnclosureList();
public native NodeList<@Nullable Object> getEnclosureList(SVGRect rect,SVGElement referenceElement);
public native NodeList<@Nullable Object> getEnclosureList(SVGRect rect);
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
@JsProperty
public native SVGElement getFarthestViewportElement();
public native NodeList<@Nullable Object> getIntersectionList();
public native NodeList<@Nullable Object> getIntersectionList(SVGRect rect,SVGElement referenceElement);
public native NodeList<@Nullable Object> getIntersectionList(SVGRect rect);
@JsProperty
public native SVGElement getNearestViewportElement();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
@JsProperty
public native SVGStringList getRequiredExtensions();
@JsProperty
public native SVGStringList getRequiredFeatures();
public native SVGMatrix getScreenCTM();
@JsProperty
public native SVGStringList getSystemLanguage();
public native SVGMatrix getTransformToElement();
public native SVGMatrix getTransformToElement(SVGElement element);
@JsProperty
public native SVGAnimatedRect getViewBox();
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
@JsProperty
public native int getZoomAndPan();
public native boolean hasExtension();
public native boolean hasExtension(String extension);
public native @Nullable Object pauseAnimations();
@JsProperty
public native void setClassName(SVGAnimatedString className);
public native void setCurrentTime();
public native void setCurrentTime(double seconds);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setFarthestViewportElement(SVGElement farthestViewportElement);
@JsProperty
public native void setNearestViewportElement(SVGElement nearestViewportElement);
@JsProperty
public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio preserveAspectRatio);
@JsProperty
public native void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
public native void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
public native void setSystemLanguage(SVGStringList systemLanguage);
@JsProperty
public native void setViewBox(SVGAnimatedRect viewBox);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
@JsProperty
public native void setZoomAndPan(int zoomAndPan);
public native int suspendRedraw();
public native int suspendRedraw(int maxWaitMilliseconds);
public native @Nullable Object unpauseAnimations();
public native void unsuspendRedraw();
public native void unsuspendRedraw(int suspendHandleId);
public native @Nullable Object unsuspendRedrawAll();
}

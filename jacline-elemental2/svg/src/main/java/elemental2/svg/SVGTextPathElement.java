package elemental2.svg;
import jsinterop.annotations.JsProperty;
import elemental2.svg.SVGAnimatedEnumeration;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGURIReference;
import elemental2.svg.SVGTextContentElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGTextPathElement extends SVGTextContentElement implements SVGURIReference{
@JsOverlay
public static final double TEXTPATH_METHODTYPE_ALIGN=SVGTextPathElement__Constants.TEXTPATH_METHODTYPE_ALIGN;
@JsOverlay
public static final double TEXTPATH_METHODTYPE_STRETCH=SVGTextPathElement__Constants.TEXTPATH_METHODTYPE_STRETCH;
@JsOverlay
public static final double TEXTPATH_METHODTYPE_UNKNOWN=SVGTextPathElement__Constants.TEXTPATH_METHODTYPE_UNKNOWN;
@JsOverlay
public static final double TEXTPATH_SPACINGTYPE_AUTO=SVGTextPathElement__Constants.TEXTPATH_SPACINGTYPE_AUTO;
@JsOverlay
public static final double TEXTPATH_SPACINGTYPE_EXACT=SVGTextPathElement__Constants.TEXTPATH_SPACINGTYPE_EXACT;
@JsOverlay
public static final double TEXTPATH_SPACINGTYPE_UNKNOWN=SVGTextPathElement__Constants.TEXTPATH_SPACINGTYPE_UNKNOWN;
public SVGAnimatedString href;
public SVGAnimatedEnumeration method;
public SVGAnimatedEnumeration spacing;
public SVGAnimatedLength startOffset;
@JsProperty
public native SVGAnimatedString getHref();
@JsProperty
public native void setHref(SVGAnimatedString href);
}

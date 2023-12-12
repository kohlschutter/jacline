package elemental2.svg;
import elemental2.svg.SVGStringList;
import elemental2.svg.SVGPoint;
import elemental2.svg.SVGLangSpace;
import elemental2.svg.SVGAnimatedEnumeration;
import elemental2.svg.SVGAnimatedString;
import elemental2.svg.SVGRect;
import elemental2.svg.SVGExternalResourcesRequired;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import elemental2.svg.SVGStylable;
import jsinterop.annotations.JsOverlay;
import elemental2.svg.SVGElement;
import java.lang.String;
import elemental2.svg.SVGTests;
import jsinterop.annotations.JsType;
import elemental2.svg.SVGAnimatedBoolean;
import jsinterop.annotations.JsPackage;
import elemental2.svg.SVGAnimatedLength;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGTextContentElement extends SVGElement implements SVGExternalResourcesRequired, SVGLangSpace, SVGStylable, SVGTests{
@JsOverlay
public static final double LENGTHADJUST_SPACING=SVGTextContentElement__Constants.LENGTHADJUST_SPACING;
@JsOverlay
public static final double LENGTHADJUST_SPACINGANDGLYPHS=SVGTextContentElement__Constants.LENGTHADJUST_SPACINGANDGLYPHS;
@JsOverlay
public static final double LENGTHADJUST_UNKNOWN=SVGTextContentElement__Constants.LENGTHADJUST_UNKNOWN;
public SVGAnimatedBoolean externalResourcesRequired;
public SVGAnimatedEnumeration lengthAdjust;
public SVGStringList requiredExtensions;
public SVGStringList requiredFeatures;
public SVGStringList systemLanguage;
public SVGAnimatedLength textLength;
public String xmllang;
public String xmlspace;
public native int getCharNumAtPosition();
public native int getCharNumAtPosition(SVGPoint point);
@JsProperty
public native SVGAnimatedString getClassName();
public native int getComputedTextLength();
public native SVGPoint getEndPositionOfChar();
public native SVGPoint getEndPositionOfChar(int offset);
public native SVGRect getExtentOfChar();
public native SVGRect getExtentOfChar(int offset);
@JsProperty
public native SVGAnimatedBoolean getExternalResourcesRequired();
public native int getNumberOfChars();
public native CSSValue getPresentationAttribute();
public native CSSValue getPresentationAttribute(String name);
@JsProperty
public native SVGStringList getRequiredExtensions();
@JsProperty
public native SVGStringList getRequiredFeatures();
public native double getRotationOfChar();
public native double getRotationOfChar(int offset);
public native SVGPoint getStartPositionOfChar();
public native SVGPoint getStartPositionOfChar(int offset);
public native int getSubStringLength();
public native int getSubStringLength(int offset,int length);
public native int getSubStringLength(int offset);
@JsProperty
public native SVGStringList getSystemLanguage();
@JsProperty
public native String getXmllang();
@JsProperty
public native String getXmlspace();
public native boolean hasExtension();
public native boolean hasExtension(String extension);
public native void selectSubString();
public native void selectSubString(int offset,int length);
public native void selectSubString(int offset);
@JsProperty
public native void setClassName(SVGAnimatedString className);
@JsProperty
public native void setExternalResourcesRequired(SVGAnimatedBoolean externalResourcesRequired);
@JsProperty
public native void setRequiredExtensions(SVGStringList requiredExtensions);
@JsProperty
public native void setRequiredFeatures(SVGStringList requiredFeatures);
@JsProperty
public native void setSystemLanguage(SVGStringList systemLanguage);
@JsProperty
public native void setXmllang(String xmllang);
@JsProperty
public native void setXmlspace(String xmlspace);
}

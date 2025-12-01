package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import java.lang.Deprecated;
import elemental2.dom.CSSProperties;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import elemental2.dom.CSSValue;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSStyleDeclaration extends CSSProperties implements JsIterable<String, @Nullable Object, @Nullable Object>, JsArrayLike<String>, JsPropertyMap<String>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAttributeUnionType{
@JsOverlay
static CSSStyleDeclaration.@Nullable GetAttributeUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetExpressionUnionType{
@JsOverlay
static CSSStyleDeclaration.@Nullable GetExpressionUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public String accentColor;
public String alignmentBaseline;
public String animationComposition;
public String appearance;
public String backgroundClip;
public String backgroundOrigin;
public String baselineShift;
public String baselineSource;
public String borderBlock;
public String borderBlockColor;
public String borderBlockEnd;
public String borderBlockEndColor;
public String borderBlockEndStyle;
public String borderBlockEndWidth;
public String borderBlockStart;
public String borderBlockStartColor;
public String borderBlockStartStyle;
public String borderBlockStartWidth;
public String borderBlockStyle;
public String borderBlockWidth;
public String borderEndEndRadius;
public String borderEndStartRadius;
public String borderInline;
public String borderInlineColor;
public String borderInlineEnd;
public String borderInlineEndColor;
public String borderInlineEndStyle;
public String borderInlineEndWidth;
public String borderInlineStart;
public String borderInlineStartColor;
public String borderInlineStartStyle;
public String borderInlineStartWidth;
public String borderInlineStyle;
public String borderInlineWidth;
public String borderStartEndRadius;
public String borderStartStartRadius;
public String breakAfter;
public String breakBefore;
public String breakInside;
public String caretColor;
public String clipRule;
public String colorInterpolation;
public String colorInterpolationFilters;
public String columnCount;
public String columnFill;
public String columnGap;
public String columnRule;
public String columnRuleColor;
public String columnRuleStyle;
public String columnRuleWidth;
public String columnSpan;
public String columnWidth;
public String columns;
public String containIntrinsicBlockSize;
public String containIntrinsicHeight;
public String containIntrinsicInlineSize;
public String containIntrinsicSize;
public String containIntrinsicWidth;
public String container;
public String counterSet;
public String cssText;
public String dominantBaseline;
public String floatOpacity;
@JsProperty(name = "float")
public String float_;
public String floodColor;
public String fontFeatureSettings;
public String fontKerning;
public String fontOpticalSizing;
public String fontPalette;
public String fontSynthesis;
public String fontSynthesisSmallCaps;
public String fontSynthesisStyle;
public String fontSynthesisWeight;
public String fontVariantAlternates;
public String fontVariantCaps;
public String fontVariantEastAsian;
public String fontVariantLigatures;
public String fontVariantNumeric;
public String fontVariantPosition;
public String fontVariationSettings;
public String forcedColorAdjust;
public String gridColumnGap;
public String gridGap;
public String gridRowGap;
public String hyphenateCharacter;
public String hyphens;
public String imageRendering;
public String justifyItems;
public String justifySelf;
public int length;
public String lightingColor;
public String lineBreak;
public String marginBlock;
public String marginBlockEnd;
public String marginBlockStart;
public String marginInline;
public String marginInlineEnd;
public String marginInlineStart;
public String marker;
public String markerEnd;
public String markerMid;
public String markerStart;
public String mask;
public String maskClip;
public String maskComposite;
public String maskDepth;
public String maskMode;
public String maskOrigin;
public String maskPosition;
public String maskRepeat;
public String maskSize;
public String maskStyle;
public String maskType;
public String maxBlockSize;
public String maxInlineSize;
public String minBlockSize;
public String minInlineSize;
public String offsetAnchor;
public String offsetDistance;
public String offsetPath;
public String offsetPosition;
public String offsetRotate;
public String overflowAnchor;
public String overflowClipMargin;
public String overscrollBehaviorBlock;
public String overscrollBehaviorInline;
public String overscrollBehaviorX;
public String overscrollBehaviorY;
public String paddingBlock;
public String paddingBlockEnd;
public String paddingBlockStart;
public String paddingInline;
public String paddingInlineEnd;
public String paddingInlineStart;
public String paintOrder;
public @Nullable CSSRule parentRule;
public String placeContent;
public String placeItems;
public String placeSelf;
public String printColorAdjust;
public String rowGap;
public String rubyAlign;
public String rubyPosition;
public String scrollBehavior;
public String scrollMargin;
public String scrollMarginBlock;
public String scrollMarginBlockEnd;
public String scrollMarginBlockStart;
public String scrollMarginInline;
public String scrollMarginInlineEnd;
public String scrollMarginInlineStart;
public String scrollMarginLeft;
public String scrollMarginRight;
public String scrollMarginTop;
public String scrollSnapAlign;
public String scrollSnapStop;
public String scrollSnapType;
public String scrollbarColor;
public String scrollbarGutter;
public String scrollbarWidth;
public String shapeImageThreshold;
public String shapeMargin;
public String shapeOutside;
public String shapeRendering;
public String stopColor;
public String stopOpacity;
public String tabSize;
public String textAlignLast;
public String textAnchor;
public String textCombineUpright;
public String textDecorationSkipInk;
public String textDecorationThickness;
public String textEmphasis;
public String textEmphasisColor;
public String textEmphasisPosition;
public String textEmphasisStyle;
public String textOrientation;
public String textRendering;
public String textUnderlineOffset;
public String textUnderlinePosition;
public String textWrap;
public String textWrapMode;
public String textWrapStyle;
public String transformBox;
public String transitionBehavior;
public String vectorEffect;
public String viewTransitionName;
public String whiteSpaceCollapse;
public String wordBreak;
public native CSSStyleDeclaration.@Nullable GetAttributeUnionType getAttribute(String name,double flags);
public native CSSStyleDeclaration.@Nullable GetAttributeUnionType getAttribute(String name);
public native CSSStyleDeclaration.@Nullable GetExpressionUnionType getExpression(String name);
public native @Nullable CSSValue getPropertyCSSValue(String propertyName);
public native String getPropertyPriority(String propertyName);
public native String getPropertyValue(String propertyName);
public native String item(int index);
public native boolean removeAttribute(String name,double flags);
public native boolean removeAttribute(String name);
public native boolean removeExpression(String name);
public native String removeProperty(String propertyName);
@Deprecated
public native void setAttribute(String name,@Nullable Object value,double flags);
@Deprecated
public native void setAttribute(String name,@Nullable Object value);
public native void setExpression(String name,String expr,String language);
public native void setExpression(String name,String expr);
public native void setProperty(String propertyName,String value,String priority);
public native void setProperty(String propertyName,String value);
}

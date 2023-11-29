package elemental2.dom;
import elemental2.dom.CSSStyleDeclaration;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSStyleSheet;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSRule{
@JsOverlay
public static final int CHARSET_RULE=CSSRule__Constants.CHARSET_RULE;
@JsOverlay
public static final int FONT_FACE_RULE=CSSRule__Constants.FONT_FACE_RULE;
@JsOverlay
public static final int IMPORT_RULE=CSSRule__Constants.IMPORT_RULE;
@JsOverlay
public static final int MEDIA_RULE=CSSRule__Constants.MEDIA_RULE;
@JsOverlay
public static final int PAGE_RULE=CSSRule__Constants.PAGE_RULE;
@JsOverlay
public static final int STYLE_RULE=CSSRule__Constants.STYLE_RULE;
@JsOverlay
public static final int UNKNOWN_RULE=CSSRule__Constants.UNKNOWN_RULE;
public String cssText;
public CSSRule parentRule;
public CSSStyleSheet parentStyleSheet;
public CSSStyleDeclaration style;
public int type;
}

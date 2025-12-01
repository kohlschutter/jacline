package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.StyleSheet;
import elemental2.dom.CSSStyleSheetInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
import elemental2.dom.CSSRuleList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSStyleSheet extends StyleSheet{
public @Nullable CSSRuleList cssRules;
public @Nullable CSSRule ownerRule;
public CSSStyleSheet(){}
public CSSStyleSheet(@Nullable CSSStyleSheetInit options){}
public native void deleteRule(int index);
public native int insertRule(String rule,int index);
}

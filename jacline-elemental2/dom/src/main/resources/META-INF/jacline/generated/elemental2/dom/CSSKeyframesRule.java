package elemental2.dom;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
import elemental2.dom.CSSKeyframeRule;
import elemental2.dom.CSSRuleList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSKeyframesRule extends CSSRule{
public CSSRuleList cssRules;
public String name;
public native Object appendRule(String rule);
public native Object deleteRule(String key);
public native CSSKeyframeRule findRule(String key);
}

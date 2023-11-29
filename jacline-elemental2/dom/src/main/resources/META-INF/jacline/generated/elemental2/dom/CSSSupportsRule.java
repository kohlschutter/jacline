package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
import elemental2.dom.CSSRuleList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSSupportsRule extends CSSRule{
public String conditionText;
public CSSRuleList cssRules;
}

package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MediaList;
import elemental2.dom.CSSRule;
import elemental2.dom.CSSRuleList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSMediaRule extends CSSRule{
public @Nullable CSSRuleList cssRules;
public @Nullable MediaList media;
public native void deleteRule(int index);
public native double insertRule(String rule,int index);
}

package elemental2.core;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ITemplateArray extends JsArray<String>{
public JsArray<String> raw;
public ITemplateArray(){
// This super call is here only for the code to compile; it is never executed.
super((String)null);
}
}

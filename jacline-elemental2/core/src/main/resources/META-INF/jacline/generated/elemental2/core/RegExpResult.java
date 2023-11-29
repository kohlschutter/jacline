package elemental2.core;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.RegExpResultIndices;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RegExpResult extends JsArray<String>{
public JsPropertyMap<String> groups;
public int index;
public RegExpResultIndices indices;
public String input;
public int length;
public RegExpResult(){
// This super call is here only for the code to compile; it is never executed.
super((String)null);
}
}

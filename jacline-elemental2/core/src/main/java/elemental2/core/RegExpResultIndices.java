package elemental2.core;
import java.lang.Double;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RegExpResultIndices extends JsArray<JsArray<Double>>{
public JsPropertyMap<JsArray<Double>> groups;
public RegExpResultIndices(){
// This super call is here only for the code to compile; it is never executed.
super((JsArray<Double>)null);
}
}

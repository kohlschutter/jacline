package elemental2.dom;
import elemental2.dom.FontFace;
import elemental2.dom.FontFaceSetLoadEventInit;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FontFaceSetLoadEvent extends Event{
public JsArray<FontFace> fontfaces;
public FontFaceSetLoadEvent(String type,FontFaceSetLoadEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public FontFaceSetLoadEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}

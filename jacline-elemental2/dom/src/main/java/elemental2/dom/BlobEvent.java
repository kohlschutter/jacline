package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Blob;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class BlobEvent extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface BlobEventEventInitDictType{
@JsOverlay
static BlobEvent.BlobEventEventInitDictType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Blob getData();
@JsProperty
double getTimecode();
@JsProperty
void setData(Blob data);
@JsProperty
void setTimecode(double timecode);
}
public Blob data;
public double timecode;
public BlobEvent(String type,BlobEvent.BlobEventEventInitDictType eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}

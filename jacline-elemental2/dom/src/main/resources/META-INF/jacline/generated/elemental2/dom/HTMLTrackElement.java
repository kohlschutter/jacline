package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.HTMLElement;
import elemental2.dom.TextTrack;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLTrackElement extends HTMLElement{
@JsProperty(name = "default")
public boolean default_;
public String kind;
public String label;
public int readyState;
public String src;
public String srclang;
public TextTrack track;
}

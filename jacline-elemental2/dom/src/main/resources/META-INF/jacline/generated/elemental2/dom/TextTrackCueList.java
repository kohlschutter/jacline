package elemental2.dom;
import jsinterop.base.JsArrayLike;
import elemental2.dom.TextTrackCue;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextTrackCueList implements JsArrayLike<TextTrackCue>{
public int length;
public native TextTrackCue getCueById(String id);
}

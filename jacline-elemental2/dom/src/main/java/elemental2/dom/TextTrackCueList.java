package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import elemental2.dom.TextTrackCue;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextTrackCueList implements JsArrayLike<TextTrackCue>{
public int length;
public native @Nullable TextTrackCue getCueById(String id);
}

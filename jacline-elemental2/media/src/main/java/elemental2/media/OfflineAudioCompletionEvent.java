package elemental2.media;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.media.AudioBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class OfflineAudioCompletionEvent extends Event{
public @Nullable AudioBuffer renderedBuffer;
public OfflineAudioCompletionEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}

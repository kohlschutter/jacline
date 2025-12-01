package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.MediaStream;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MediaStreamEvent{
public @Nullable MediaStream stream;
public MediaStreamEvent(String type,JsObject eventInitDict){}
public MediaStreamEvent(String type,Object eventInitDict){}
}

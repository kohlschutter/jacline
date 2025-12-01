package elemental2.dom;
import elemental2.dom.WritableStream;
import org.jspecify.annotations.Nullable;
import elemental2.core.Uint8Array;
import elemental2.dom.ReadableStream;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextEncoderStream{
public String encoding;
public @Nullable ReadableStream<@Nullable Uint8Array> readable;
public @Nullable WritableStream<String> writable;
}

package elemental2.encoding;
import elemental2.dom.WritableStream;
import elemental2.core.Uint8Array;
import elemental2.dom.ReadableStream;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TextEncoderStream{
public String encoding;
public ReadableStream<Uint8Array> readable;
public WritableStream<String> writable;
}

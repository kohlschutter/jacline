package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaRecorderOptions{
@JsOverlay
static MediaRecorderOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getAudioBitsPerSecond();
@JsProperty
int getBitsPerSecond();
@JsProperty
String getMimeType();
@JsProperty
int getVideoBitsPerSecond();
@JsProperty
void setAudioBitsPerSecond(int audioBitsPerSecond);
@JsProperty
void setBitsPerSecond(int bitsPerSecond);
@JsProperty
void setMimeType(String mimeType);
@JsProperty
void setVideoBitsPerSecond(int videoBitsPerSecond);
}

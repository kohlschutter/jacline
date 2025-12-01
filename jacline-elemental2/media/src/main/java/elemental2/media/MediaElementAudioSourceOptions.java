package elemental2.media;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.HTMLMediaElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaElementAudioSourceOptions{
@JsOverlay
static MediaElementAudioSourceOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getChannelCount();
@JsProperty
String getChannelCountMode();
@JsProperty
String getChannelInterpretation();
@JsProperty
@Nullable HTMLMediaElement getMediaElement();
@JsProperty
void setChannelCount(double channelCount);
@JsProperty
void setChannelCountMode(String channelCountMode);
@JsProperty
void setChannelInterpretation(String channelInterpretation);
@JsProperty
void setMediaElement(@Nullable HTMLMediaElement mediaElement);
}

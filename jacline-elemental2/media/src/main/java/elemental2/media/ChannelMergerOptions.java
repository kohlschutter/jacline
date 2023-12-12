package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ChannelMergerOptions{
@JsOverlay
static ChannelMergerOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getChannelCount();
@JsProperty
String getChannelCountMode();
@JsProperty
String getChannelInterpretation();
@JsProperty
int getNumberOfInputs();
@JsProperty
void setChannelCount(int channelCount);
@JsProperty
void setChannelCountMode(String channelCountMode);
@JsProperty
void setChannelInterpretation(String channelInterpretation);
@JsProperty
void setNumberOfInputs(int numberOfInputs);
}

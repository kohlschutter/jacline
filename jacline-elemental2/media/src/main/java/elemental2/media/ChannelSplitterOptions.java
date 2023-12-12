package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ChannelSplitterOptions{
@JsOverlay
static ChannelSplitterOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getChannelCount();
@JsProperty
String getChannelCountMode();
@JsProperty
String getChannelInterpretation();
@JsProperty
int getNumberOfOutputs();
@JsProperty
void setChannelCount(int channelCount);
@JsProperty
void setChannelCountMode(String channelCountMode);
@JsProperty
void setChannelInterpretation(String channelInterpretation);
@JsProperty
void setNumberOfOutputs(int numberOfOutputs);
}

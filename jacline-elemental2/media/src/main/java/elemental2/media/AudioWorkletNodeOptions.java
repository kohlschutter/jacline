package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AudioWorkletNodeOptions{
@JsOverlay
static AudioWorkletNodeOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getNumberOfInputs();
@JsProperty
double getNumberOfOutputs();
@JsProperty
JsArray<Double> getOutputChannelCount();
@JsProperty
JsPropertyMap<Double> getParameterData();
@JsProperty
Object getProcessorOptions();
@JsProperty
void setNumberOfInputs(double numberOfInputs);
@JsProperty
void setNumberOfOutputs(double numberOfOutputs);
@JsProperty
void setOutputChannelCount(JsArray<Double> outputChannelCount);
@JsOverlay
default void setOutputChannelCount(double[] outputChannelCount){
setOutputChannelCount(Js.<JsArray<Double>>uncheckedCast(outputChannelCount));
}
@JsProperty
void setParameterData(JsPropertyMap<Double> parameterData);
@JsProperty
void setProcessorOptions(Object processorOptions);
}

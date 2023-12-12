package elemental2.media;
import elemental2.media.GainNode;
import java.lang.Double;
import elemental2.dom.Event;
import elemental2.media.DynamicsCompressorNode;
import elemental2.promise.Promise;
import elemental2.media.DelayNode;
import elemental2.media.StereoPannerNode;
import elemental2.dom.EventTarget;
import elemental2.media.AudioDestinationNode;
import elemental2.media.SpatialPannerNode;
import jsinterop.base.Js;
import elemental2.media.ConvolverNode;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsFunction;
import elemental2.media.ChannelMergerNode;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.media.AudioListener;
import elemental2.media.BiquadFilterNode;
import java.lang.Void;
import java.lang.Deprecated;
import elemental2.media.WaveShaperNode;
import elemental2.media.PeriodicWave;
import elemental2.media.IIRFilterNode;
import elemental2.core.Float32Array;
import elemental2.media.AudioWorklet;
import elemental2.core.ArrayBuffer;
import elemental2.media.AudioWorker;
import elemental2.media.AudioBuffer;
import elemental2.dom.EventListener;
import elemental2.media.AnalyserNode;
import elemental2.media.ConstantSourceNode;
import elemental2.media.PannerNode;
import elemental2.media.AudioBufferSourceNode;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.media.ChannelSplitterNode;
import elemental2.media.ScriptProcessorNode;
import elemental2.media.OscillatorNode;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class BaseAudioContext implements EventTarget{
@JsFunction
public interface DecodeAudioDataErrorCallbackFn{
Object onInvoke(Object p0);
}
@JsFunction
public interface DecodeAudioDataSuccessCallbackFn{
Object onInvoke(AudioBuffer p0);
}
@JsFunction
public interface OnstatechangeFn{
Object onInvoke(Event p0);
}
public AudioWorklet audioWorklet;
public double currentTime;
public AudioDestinationNode destination;
public AudioListener listener;
public BaseAudioContext.OnstatechangeFn onstatechange;
public double sampleRate;
public String state;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native Promise<Void> close();
public native AnalyserNode createAnalyser();
public native Promise<AudioWorker> createAudioWorker(String scriptURL);
public native BiquadFilterNode createBiquadFilter();
public native AudioBuffer createBuffer(int numberOfChannels,int length,double sampleRate);
public native AudioBufferSourceNode createBufferSource();
public native ChannelMergerNode createChannelMerger();
public native ChannelMergerNode createChannelMerger(int numberOfInputs);
public native ChannelSplitterNode createChannelSplitter();
public native ChannelSplitterNode createChannelSplitter(int numberOfOutputs);
public native ConstantSourceNode createConstantSource();
public native ConvolverNode createConvolver();
public native DelayNode createDelay();
public native DelayNode createDelay(double maxDelayTime);
public native DynamicsCompressorNode createDynamicsCompressor();
public native GainNode createGain();
public native IIRFilterNode createIIRFilter(JsArrayLike<Double> feedforward,JsArrayLike<Double> feedback);
@JsOverlay
public final IIRFilterNode createIIRFilter(double[] feedforward,double[] feedback){
return createIIRFilter(Js.<JsArrayLike<Double>>uncheckedCast(feedforward),Js.<JsArrayLike<Double>>uncheckedCast(feedback));
}
public native OscillatorNode createOscillator();
public native PannerNode createPanner();
public native PeriodicWave createPeriodicWave(Float32Array real,Float32Array imag);
@Deprecated
public native ScriptProcessorNode createScriptProcessor();
@Deprecated
public native ScriptProcessorNode createScriptProcessor(int bufferSize,int numberOfInputChannels_opt,int numberOfOutputChannels_opt);
@Deprecated
public native ScriptProcessorNode createScriptProcessor(int bufferSize,int numberOfInputChannels_opt);
@Deprecated
public native ScriptProcessorNode createScriptProcessor(int bufferSize);
public native SpatialPannerNode createSpatialPanner();
public native StereoPannerNode createStereoPanner();
public native WaveShaperNode createWaveShaper();
public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData,BaseAudioContext.DecodeAudioDataSuccessCallbackFn successCallback,BaseAudioContext.DecodeAudioDataErrorCallbackFn errorCallback);
public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData,BaseAudioContext.DecodeAudioDataSuccessCallbackFn successCallback);
public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native Promise<Void> resume();
public native Promise<Void> suspend();
}

package elemental2.dom;
import elemental2.dom.Event;
import elemental2.dom.MediaStreamEvent;
import elemental2.promise.Promise;
import elemental2.dom.RTCVoidCallback;
import elemental2.dom.RTCStatsReport;
import elemental2.dom.RTCPeerConnectionIceErrorEvent;
import elemental2.dom.EventTarget;
import jsinterop.base.Js;
import elemental2.dom.RTCDataChannelEvent;
import elemental2.dom.RTCRtpTransceiverInit;
import jsinterop.annotations.JsFunction;
import elemental2.dom.RTCSessionDescription;
import elemental2.dom.RTCRtpSender;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCIceCandidate;
import elemental2.dom.RTCStatsCallback;
import elemental2.core.JsObject;
import elemental2.dom.RTCConfiguration;
import elemental2.dom.RTCRtpReceiver;
import elemental2.dom.RTCPeerConnectionErrorCallback;
import elemental2.dom.MediaStreamTrack;
import elemental2.dom.RTCDataChannelInitRecord_;
import elemental2.dom.RTCRtpTransceiver;
import elemental2.core.JsArray;
import elemental2.dom.RTCPeerConnectionIceEvent;
import elemental2.dom.RTCDataChannel;
import elemental2.dom.RTCCertificate;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.DOMException;
import elemental2.dom.MediaStream;
import java.lang.Object;
import elemental2.dom.RTCTrackEvent;
import elemental2.dom.RTCSctpTransport;
import elemental2.dom.RTCDataChannelInitDictionary_;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCPeerConnection implements EventTarget{
@JsFunction
public interface AddIceCandidateErrorCallbackFn{
Object onInvoke(DOMException p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddTransceiverTrackOrKindUnionType{
@JsOverlay
static RTCPeerConnection.AddTransceiverTrackOrKindUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default MediaStreamTrack asMediaStreamTrack(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isMediaStreamTrack(){
return (Object)this instanceof MediaStreamTrack;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CreateDataChannelDataChannelDictUnionType{
@JsOverlay
static RTCPeerConnection.CreateDataChannelDataChannelDictUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default RTCDataChannelInitDictionary_ asRTCDataChannelInitDictionary_(){
return Js.cast(this);
}
@JsOverlay
default RTCDataChannelInitRecord_ asRTCDataChannelInitRecord_(){
return Js.cast(this);
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetStatsUnionType{
@JsOverlay
static RTCPeerConnection.GetStatsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Promise<RTCStatsReport> asPromise(){
return Js.cast(this);
}
@JsOverlay
default RTCStatsReport asRTCStatsReport(){
return Js.cast(this);
}
@JsOverlay
default boolean isPromise(){
return (Object)this instanceof Promise;
}
}
@JsFunction
public interface OnaddstreamFn{
Object onInvoke(MediaStreamEvent p0);
}
@JsFunction
public interface OnconnectionstatechangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OndatachannelFn{
Object onInvoke(RTCDataChannelEvent p0);
}
@JsFunction
public interface OnicecandidateFn{
Object onInvoke(RTCPeerConnectionIceEvent p0);
}
@JsFunction
public interface OnicecandidateerrorFn{
Object onInvoke(RTCPeerConnectionIceErrorEvent p0);
}
@JsFunction
public interface OniceconnectionstatechangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnicegatheringstatechangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnnegotiationneededFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnremovestreamFn{
Object onInvoke(MediaStreamEvent p0);
}
@JsFunction
public interface OnsignalingstatechangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OntrackFn{
Object onInvoke(RTCTrackEvent p0);
}
public static native Promise<RTCCertificate> generateCertificate(Object keygenAlgorithm);
public boolean canTrickleIceCandidates;
public String connectionState;
public RTCSessionDescription currentLocalDescription;
public RTCSessionDescription currentRemoteDescription;
public String iceConnectionState;
public String iceGatheringState;
public RTCSessionDescription localDescription;
public RTCPeerConnection.OnaddstreamFn onaddstream;
public RTCPeerConnection.OnconnectionstatechangeFn onconnectionstatechange;
public RTCPeerConnection.OndatachannelFn ondatachannel;
public RTCPeerConnection.OnicecandidateFn onicecandidate;
public RTCPeerConnection.OnicecandidateerrorFn onicecandidateerror;
public RTCPeerConnection.OniceconnectionstatechangeFn oniceconnectionstatechange;
public RTCPeerConnection.OnicegatheringstatechangeFn onicegatheringstatechange;
public RTCPeerConnection.OnnegotiationneededFn onnegotiationneeded;
public RTCPeerConnection.OnremovestreamFn onremovestream;
public RTCPeerConnection.OnsignalingstatechangeFn onsignalingstatechange;
public RTCPeerConnection.OntrackFn ontrack;
public RTCSessionDescription pendingLocalDescription;
public RTCSessionDescription pendingRemoteDescription;
public RTCSessionDescription remoteDescription;
public RTCSctpTransport sctp;
public String signalingState;
public RTCPeerConnection(RTCConfiguration configuration,JsObject constraints){}
public RTCPeerConnection(RTCConfiguration configuration,Object constraints){}
public RTCPeerConnection(RTCConfiguration configuration){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType useCapture);
public native void addEventListener(String type,EventListener listener);
public native Promise addIceCandidate(RTCIceCandidate candidate,RTCVoidCallback successCallback,RTCPeerConnection.AddIceCandidateErrorCallbackFn errorCallback);
public native Promise addIceCandidate(RTCIceCandidate candidate,RTCVoidCallback successCallback);
public native Promise addIceCandidate(RTCIceCandidate candidate);
public native void addStream(MediaStream stream,JsObject constraints);
@JsOverlay
public final void addStream(MediaStream stream,Object constraints){
addStream(stream,Js.<JsObject>uncheckedCast(constraints));
}
public native void addStream(MediaStream stream);
public native RTCRtpSender addTrack(MediaStreamTrack track,MediaStream stream,MediaStream... var_args);
public native RTCRtpTransceiver addTransceiver(RTCPeerConnection.AddTransceiverTrackOrKindUnionType trackOrKind,RTCRtpTransceiverInit init);
public native RTCRtpTransceiver addTransceiver(RTCPeerConnection.AddTransceiverTrackOrKindUnionType trackOrKind);
@JsOverlay
public final RTCRtpTransceiver addTransceiver(MediaStreamTrack trackOrKind,RTCRtpTransceiverInit init){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind),init);
}
@JsOverlay
public final RTCRtpTransceiver addTransceiver(MediaStreamTrack trackOrKind){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind));
}
@JsOverlay
public final RTCRtpTransceiver addTransceiver(String trackOrKind,RTCRtpTransceiverInit init){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind),init);
}
@JsOverlay
public final RTCRtpTransceiver addTransceiver(String trackOrKind){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind));
}
public native Object close();
public native Promise<RTCSessionDescription> createAnswer();
public native Promise<RTCSessionDescription> createAnswer(JsObject successCallbackOrConstraints,RTCPeerConnectionErrorCallback errorCallback,JsObject constraints);
public native Promise<RTCSessionDescription> createAnswer(JsObject successCallbackOrConstraints,RTCPeerConnectionErrorCallback errorCallback);
public native Promise<RTCSessionDescription> createAnswer(JsObject successCallbackOrConstraints);
@JsOverlay
public final Promise<RTCSessionDescription> createAnswer(Object successCallbackOrConstraints,RTCPeerConnectionErrorCallback errorCallback,Object constraints){
return createAnswer(Js.<JsObject>uncheckedCast(successCallbackOrConstraints),errorCallback,Js.<JsObject>uncheckedCast(constraints));
}
@JsOverlay
public final Promise<RTCSessionDescription> createAnswer(Object successCallbackOrConstraints,RTCPeerConnectionErrorCallback errorCallback){
return createAnswer(Js.<JsObject>uncheckedCast(successCallbackOrConstraints),errorCallback);
}
@JsOverlay
public final Promise<RTCSessionDescription> createAnswer(Object successCallbackOrConstraints){
return createAnswer(Js.<JsObject>uncheckedCast(successCallbackOrConstraints));
}
public native RTCDataChannel createDataChannel(String label,RTCPeerConnection.CreateDataChannelDataChannelDictUnionType dataChannelDict);
@JsOverlay
public final RTCDataChannel createDataChannel(String label,RTCDataChannelInitDictionary_ dataChannelDict){
return createDataChannel(label,Js.<RTCPeerConnection.CreateDataChannelDataChannelDictUnionType>uncheckedCast(dataChannelDict));
}
@JsOverlay
public final RTCDataChannel createDataChannel(String label,RTCDataChannelInitRecord_ dataChannelDict){
return createDataChannel(label,Js.<RTCPeerConnection.CreateDataChannelDataChannelDictUnionType>uncheckedCast(dataChannelDict));
}
public native RTCDataChannel createDataChannel(String label);
public native Promise<RTCSessionDescription> createOffer();
public native Promise<RTCSessionDescription> createOffer(JsObject successCallbackOrConstraintsOrOfferOptions,RTCPeerConnectionErrorCallback errorCallback,JsObject constraints);
public native Promise<RTCSessionDescription> createOffer(JsObject successCallbackOrConstraintsOrOfferOptions,RTCPeerConnectionErrorCallback errorCallback);
public native Promise<RTCSessionDescription> createOffer(JsObject successCallbackOrConstraintsOrOfferOptions);
@JsOverlay
public final Promise<RTCSessionDescription> createOffer(Object successCallbackOrConstraintsOrOfferOptions,RTCPeerConnectionErrorCallback errorCallback,Object constraints){
return createOffer(Js.<JsObject>uncheckedCast(successCallbackOrConstraintsOrOfferOptions),errorCallback,Js.<JsObject>uncheckedCast(constraints));
}
@JsOverlay
public final Promise<RTCSessionDescription> createOffer(Object successCallbackOrConstraintsOrOfferOptions,RTCPeerConnectionErrorCallback errorCallback){
return createOffer(Js.<JsObject>uncheckedCast(successCallbackOrConstraintsOrOfferOptions),errorCallback);
}
@JsOverlay
public final Promise<RTCSessionDescription> createOffer(Object successCallbackOrConstraintsOrOfferOptions){
return createOffer(Js.<JsObject>uncheckedCast(successCallbackOrConstraintsOrOfferOptions));
}
public native boolean dispatchEvent(Event evt);
public native RTCConfiguration getConfiguration();
public native JsArray<MediaStream> getLocalStreams();
public native JsArray<RTCRtpReceiver> getReceivers();
public native JsArray<MediaStream> getRemoteStreams();
public native JsArray<RTCRtpSender> getSenders();
public native RTCPeerConnection.GetStatsUnionType getStats();
public native RTCPeerConnection.GetStatsUnionType getStats(RTCStatsCallback successCallback,MediaStreamTrack selector);
public native RTCPeerConnection.GetStatsUnionType getStats(RTCStatsCallback successCallback);
public native MediaStream getStreamById(String streamId);
public native JsArray<RTCRtpTransceiver> getTransceivers();
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType useCapture);
public native void removeEventListener(String type,EventListener listener);
public native void removeStream(MediaStream stream);
public native void removeTrack(RTCRtpSender sender);
public native void restartIce();
public native void setConfiguration(RTCConfiguration configuration);
public native Promise<RTCSessionDescription> setLocalDescription();
public native Promise<RTCSessionDescription> setLocalDescription(RTCSessionDescription description,RTCVoidCallback successCallback,RTCPeerConnectionErrorCallback errorCallback);
public native Promise<RTCSessionDescription> setLocalDescription(RTCSessionDescription description,RTCVoidCallback successCallback);
public native Promise<RTCSessionDescription> setLocalDescription(RTCSessionDescription description);
public native Promise<RTCSessionDescription> setRemoteDescription(RTCSessionDescription description,RTCVoidCallback successCallback,RTCPeerConnectionErrorCallback errorCallback);
public native Promise<RTCSessionDescription> setRemoteDescription(RTCSessionDescription description,RTCVoidCallback successCallback);
public native Promise<RTCSessionDescription> setRemoteDescription(RTCSessionDescription description);
public native void updateIce();
public native void updateIce(RTCConfiguration configuration,JsObject constraints);
@JsOverlay
public final void updateIce(RTCConfiguration configuration,Object constraints){
updateIce(configuration,Js.<JsObject>uncheckedCast(constraints));
}
public native void updateIce(RTCConfiguration configuration);
}

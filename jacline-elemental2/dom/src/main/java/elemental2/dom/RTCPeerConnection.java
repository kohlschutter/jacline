package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.RTCDataChannelInitInterface_;
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
@Nullable Object onInvoke(@Nullable DOMException p0);
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
static RTCPeerConnection.@Nullable CreateDataChannelDataChannelDictUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable RTCDataChannelInitDictionary_ asRTCDataChannelInitDictionary_(){
return Js.cast(this);
}
@JsOverlay
default @Nullable RTCDataChannelInitInterface_ asRTCDataChannelInitInterface_(){
return Js.cast(this);
}
@JsOverlay
default @Nullable RTCDataChannelInitRecord_ asRTCDataChannelInitRecord_(){
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
@Nullable Object onInvoke(MediaStreamEvent p0);
}
@JsFunction
public interface OnconnectionstatechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OndatachannelFn{
@Nullable Object onInvoke(RTCDataChannelEvent p0);
}
@JsFunction
public interface OnicecandidateFn{
@Nullable Object onInvoke(RTCPeerConnectionIceEvent p0);
}
@JsFunction
public interface OnicecandidateerrorFn{
@Nullable Object onInvoke(RTCPeerConnectionIceErrorEvent p0);
}
@JsFunction
public interface OniceconnectionstatechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnicegatheringstatechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnnegotiationneededFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnremovestreamFn{
@Nullable Object onInvoke(MediaStreamEvent p0);
}
@JsFunction
public interface OnsignalingstatechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OntrackFn{
@Nullable Object onInvoke(RTCTrackEvent p0);
}
public static native @Nullable Promise<@Nullable RTCCertificate> generateCertificate(@Nullable Object keygenAlgorithm);
public boolean canTrickleIceCandidates;
public String connectionState;
public @Nullable RTCSessionDescription currentLocalDescription;
public @Nullable RTCSessionDescription currentRemoteDescription;
public String iceConnectionState;
public String iceGatheringState;
public @Nullable RTCSessionDescription localDescription;
public RTCPeerConnection.@Nullable OnaddstreamFn onaddstream;
public RTCPeerConnection.@Nullable OnconnectionstatechangeFn onconnectionstatechange;
public RTCPeerConnection.@Nullable OndatachannelFn ondatachannel;
public RTCPeerConnection.@Nullable OnicecandidateFn onicecandidate;
public RTCPeerConnection.@Nullable OnicecandidateerrorFn onicecandidateerror;
public RTCPeerConnection.@Nullable OniceconnectionstatechangeFn oniceconnectionstatechange;
public RTCPeerConnection.@Nullable OnicegatheringstatechangeFn onicegatheringstatechange;
public RTCPeerConnection.@Nullable OnnegotiationneededFn onnegotiationneeded;
public RTCPeerConnection.@Nullable OnremovestreamFn onremovestream;
public RTCPeerConnection.@Nullable OnsignalingstatechangeFn onsignalingstatechange;
public RTCPeerConnection.@Nullable OntrackFn ontrack;
public @Nullable RTCSessionDescription pendingLocalDescription;
public @Nullable RTCSessionDescription pendingRemoteDescription;
public @Nullable RTCSessionDescription remoteDescription;
public @Nullable RTCSctpTransport sctp;
public String signalingState;
public RTCPeerConnection(@Nullable RTCConfiguration configuration,JsObject constraints){}
public RTCPeerConnection(@Nullable RTCConfiguration configuration,Object constraints){}
public RTCPeerConnection(@Nullable RTCConfiguration configuration){}
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
public native RTCRtpSender addTrack(MediaStreamTrack track,MediaStream stream,@Nullable MediaStream... var_args);
public native RTCRtpTransceiver addTransceiver(RTCPeerConnection.AddTransceiverTrackOrKindUnionType trackOrKind,@Nullable RTCRtpTransceiverInit init);
public native RTCRtpTransceiver addTransceiver(RTCPeerConnection.AddTransceiverTrackOrKindUnionType trackOrKind);
@JsOverlay
public final RTCRtpTransceiver addTransceiver(MediaStreamTrack trackOrKind,@Nullable RTCRtpTransceiverInit init){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind),init);
}
@JsOverlay
public final RTCRtpTransceiver addTransceiver(MediaStreamTrack trackOrKind){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind));
}
@JsOverlay
public final RTCRtpTransceiver addTransceiver(String trackOrKind,@Nullable RTCRtpTransceiverInit init){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind),init);
}
@JsOverlay
public final RTCRtpTransceiver addTransceiver(String trackOrKind){
return addTransceiver(Js.<RTCPeerConnection.AddTransceiverTrackOrKindUnionType>uncheckedCast(trackOrKind));
}
public native @Nullable Object close();
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
public native RTCDataChannel createDataChannel(@Nullable String label,RTCPeerConnection.@Nullable CreateDataChannelDataChannelDictUnionType dataChannelDict);
@JsOverlay
public final RTCDataChannel createDataChannel(@Nullable String label,RTCDataChannelInitDictionary_ dataChannelDict){
return createDataChannel(label,Js.<RTCPeerConnection.@Nullable CreateDataChannelDataChannelDictUnionType>uncheckedCast(dataChannelDict));
}
@JsOverlay
public final RTCDataChannel createDataChannel(@Nullable String label,RTCDataChannelInitInterface_ dataChannelDict){
return createDataChannel(label,Js.<RTCPeerConnection.@Nullable CreateDataChannelDataChannelDictUnionType>uncheckedCast(dataChannelDict));
}
@JsOverlay
public final RTCDataChannel createDataChannel(@Nullable String label,RTCDataChannelInitRecord_ dataChannelDict){
return createDataChannel(label,Js.<RTCPeerConnection.@Nullable CreateDataChannelDataChannelDictUnionType>uncheckedCast(dataChannelDict));
}
public native RTCDataChannel createDataChannel(@Nullable String label);
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
public native RTCPeerConnection.GetStatsUnionType getStats(RTCStatsCallback successCallback,@Nullable MediaStreamTrack selector);
public native RTCPeerConnection.GetStatsUnionType getStats(RTCStatsCallback successCallback);
public native @Nullable MediaStream getStreamById(String streamId);
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
public native void updateIce(@Nullable RTCConfiguration configuration,@Nullable JsObject constraints);
@JsOverlay
public final void updateIce(@Nullable RTCConfiguration configuration,@Nullable Object constraints){
updateIce(configuration,Js.<@Nullable JsObject>uncheckedCast(constraints));
}
public native void updateIce(@Nullable RTCConfiguration configuration);
}

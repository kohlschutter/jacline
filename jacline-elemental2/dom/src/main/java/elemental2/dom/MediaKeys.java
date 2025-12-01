package elemental2.dom;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaKeySession;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaKeys{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetServerCertificateServerCertificateUnionType{
@JsOverlay
static MediaKeys.SetServerCertificateServerCertificateUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
MediaKeySession createSession();
MediaKeySession createSession(String sessionType);
@JsOverlay
default Promise setServerCertificate(ArrayBuffer serverCertificate){
return setServerCertificate(Js.<MediaKeys.SetServerCertificateServerCertificateUnionType>uncheckedCast(serverCertificate));
}
@JsOverlay
default Promise setServerCertificate(ArrayBufferView serverCertificate){
return setServerCertificate(Js.<MediaKeys.SetServerCertificateServerCertificateUnionType>uncheckedCast(serverCertificate));
}
Promise setServerCertificate(MediaKeys.SetServerCertificateServerCertificateUnionType serverCertificate);
}

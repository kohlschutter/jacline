package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCIceCandidateInit{
@JsOverlay
static RTCIceCandidateInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable String getCandidate();
@JsProperty
int getSdpMLineIndex();
@JsProperty
@Nullable String getSdpMid();
@JsProperty
String getUsernameFragment();
@JsProperty
void setCandidate(@Nullable String candidate);
@JsProperty
void setSdpMLineIndex(int sdpMLineIndex);
@JsProperty
void setSdpMid(@Nullable String sdpMid);
@JsProperty
void setUsernameFragment(String usernameFragment);
}

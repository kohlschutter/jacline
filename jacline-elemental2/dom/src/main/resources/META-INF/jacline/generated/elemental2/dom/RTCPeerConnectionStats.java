package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCStats;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCPeerConnectionStats extends RTCStats{
@JsProperty
double getDataChannelsClosed();
@JsProperty
double getDataChannelsOpened();
@JsProperty
void setDataChannelsClosed(double dataChannelsClosed);
@JsProperty
void setDataChannelsOpened(double dataChannelsOpened);
}

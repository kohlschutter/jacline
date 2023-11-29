package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCStats;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCTransportStats extends RTCStats{
@JsProperty
double getBytesReceived();
@JsProperty
double getBytesSent();
@JsProperty
String getDtlsCipher();
@JsProperty
String getDtlsRole();
@JsProperty
String getDtlsState();
@JsProperty
String getIceLocalUsernameFragment();
@JsProperty
String getIceRole();
@JsProperty
String getIceState();
@JsProperty
String getLocalCertificateId();
@JsProperty
double getPacketsReceived();
@JsProperty
double getPacketsSent();
@JsProperty
String getRemoteCertificateId();
@JsProperty
String getRtcpTransportStatsId();
@JsProperty
int getSelectedCandidatePairChanges();
@JsProperty
String getSelectedCandidatePairId();
@JsProperty
String getSrtpCipher();
@JsProperty
String getTlsVersion();
@JsProperty
void setBytesReceived(double bytesReceived);
@JsProperty
void setBytesSent(double bytesSent);
@JsProperty
void setDtlsCipher(String dtlsCipher);
@JsProperty
void setDtlsRole(String dtlsRole);
@JsProperty
void setDtlsState(String dtlsState);
@JsProperty
void setIceLocalUsernameFragment(String iceLocalUsernameFragment);
@JsProperty
void setIceRole(String iceRole);
@JsProperty
void setIceState(String iceState);
@JsProperty
void setLocalCertificateId(String localCertificateId);
@JsProperty
void setPacketsReceived(double packetsReceived);
@JsProperty
void setPacketsSent(double packetsSent);
@JsProperty
void setRemoteCertificateId(String remoteCertificateId);
@JsProperty
void setRtcpTransportStatsId(String rtcpTransportStatsId);
@JsProperty
void setSelectedCandidatePairChanges(double selectedCandidatePairChanges);
@JsProperty
void setSelectedCandidatePairId(String selectedCandidatePairId);
@JsProperty
void setSrtpCipher(String srtpCipher);
@JsProperty
void setTlsVersion(String tlsVersion);
}

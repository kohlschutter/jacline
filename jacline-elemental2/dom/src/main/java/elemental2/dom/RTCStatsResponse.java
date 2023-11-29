package elemental2.dom;
import java.lang.FunctionalInterface;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCStatsReport;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@FunctionalInterface
public interface RTCStatsResponse{
JsArray<RTCStatsReport> result();
}

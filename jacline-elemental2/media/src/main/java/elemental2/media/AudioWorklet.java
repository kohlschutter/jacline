package elemental2.media;
import elemental2.media.Worklet;
import java.lang.Void;
import elemental2.media.WorkletOptions;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AudioWorklet implements Worklet{
public native Promise<Void> addModule(Worklet.AddModuleModuleURLUnionType moduleURL,WorkletOptions options);
public native Promise<Void> addModule(Worklet.AddModuleModuleURLUnionType moduleURL);
}

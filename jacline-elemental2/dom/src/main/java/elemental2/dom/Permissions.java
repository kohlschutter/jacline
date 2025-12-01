package elemental2.dom;
import elemental2.dom.PermissionDescriptor;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.PermissionStatus;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Permissions{
public native Promise<PermissionStatus> query(PermissionDescriptor permission);
}

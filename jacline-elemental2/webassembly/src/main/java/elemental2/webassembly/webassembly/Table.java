package elemental2.webassembly.webassembly;
import org.jspecify.annotations.Nullable;
import elemental2.webassembly.TableDescriptor;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.webassembly.TableFunction;
@JsType(isNative = true,name = "WebAssembly.Table",namespace = JsPackage.GLOBAL)
public class Table{
public int length;
public Table(TableDescriptor tableDescriptor){}
public native TableFunction get(int index);
public native int grow(int delta);
public native void set(int index,@Nullable TableFunction value);
}

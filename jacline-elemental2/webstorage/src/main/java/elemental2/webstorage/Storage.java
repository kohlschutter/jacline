package elemental2.webstorage;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Storage{
void clear();
@Nullable String getItem(String key);
@JsProperty
int getLength();
@Nullable String key(int index);
void removeItem(String key);
void setItem(String key,String data);
}

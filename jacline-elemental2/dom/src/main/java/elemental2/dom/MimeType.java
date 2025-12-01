package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Plugin;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MimeType{
public String description;
public @Nullable Plugin enabledPlugin;
public String suffixes;
public String type;
}

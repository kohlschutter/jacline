package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MediaList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class StyleSheet{
public boolean disabled;
public String href;
public @Nullable MediaList media;
public @Nullable Node ownerNode;
public @Nullable StyleSheet parentStyleSheet;
public String title;
public String type;
}

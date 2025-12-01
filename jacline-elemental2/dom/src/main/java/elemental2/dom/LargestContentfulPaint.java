package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.dom.PerformanceEntry;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class LargestContentfulPaint extends PerformanceEntry{
public @Nullable Element element;
public String id;
public double loadTime;
public double renderTime;
public double size;
public String url;
}

package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XPathResult{
@JsOverlay
public static final int ANY_TYPE=XPathResult__Constants.ANY_TYPE;
@JsOverlay
public static final int ANY_UNORDERED_NODE_TYPE=XPathResult__Constants.ANY_UNORDERED_NODE_TYPE;
@JsOverlay
public static final int BOOLEAN_TYPE=XPathResult__Constants.BOOLEAN_TYPE;
@JsOverlay
public static final int FIRST_ORDERED_NODE_TYPE=XPathResult__Constants.FIRST_ORDERED_NODE_TYPE;
@JsOverlay
public static final int NUMBER_TYPE=XPathResult__Constants.NUMBER_TYPE;
@JsOverlay
public static final int ORDERED_NODE_ITERATOR_TYPE=XPathResult__Constants.ORDERED_NODE_ITERATOR_TYPE;
@JsOverlay
public static final int ORDERED_NODE_SNAPSHOT_TYPE=XPathResult__Constants.ORDERED_NODE_SNAPSHOT_TYPE;
@JsOverlay
public static final int STRING_TYPE=XPathResult__Constants.STRING_TYPE;
@JsOverlay
public static final int UNORDERED_NODE_ITERATOR_TYPE=XPathResult__Constants.UNORDERED_NODE_ITERATOR_TYPE;
@JsOverlay
public static final int UNORDERED_NODE_SNAPSHOT_TYPE=XPathResult__Constants.UNORDERED_NODE_SNAPSHOT_TYPE;
public boolean booleanValue;
public boolean invalidInteratorState;
public double numberValue;
public int resultType;
public @Nullable Node singleNodeValue;
public int snapshotLength;
public String stringValue;
public native @Nullable Node iterateNext();
public native @Nullable Node snapshotItem(int index);
}

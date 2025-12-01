package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import elemental2.dom.Range;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Selection{
public @Nullable Node anchorNode;
public int anchorOffset;
public @Nullable Node focusNode;
public int focusOffset;
public boolean isCollapsed;
public int rangeCount;
public String type;
public native void addRange(@Nullable Range range);
public native void collapse(@Nullable Node node,int offset);
public native void collapse(@Nullable Node node);
public native void collapseToEnd();
public native void collapseToStart();
public native boolean containsNode(Node node,boolean allowPartialContainment);
public native boolean containsNode(Node node);
public native void deleteFromDocument();
public native void empty();
public native void extend(@Nullable Node node,int offset);
public native void extend(@Nullable Node node);
public native Range getRangeAt(int index);
public native void removeAllRanges();
public native void removeRange(Range range);
public native void selectAllChildren(@Nullable Node node);
public native void setBaseAndExtent(@Nullable Node anchorNode,int anchorOffset,@Nullable Node focusNode,int focusOffset);
public native void setPosition(@Nullable Node node,int offset);
public native void setPosition(@Nullable Node node);
}

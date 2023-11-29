package elemental2.dom;
import elemental2.dom.Node;
import elemental2.dom.Range;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Selection{
public Node anchorNode;
public int anchorOffset;
public Node focusNode;
public int focusOffset;
public boolean isCollapsed;
public int rangeCount;
public String type;
public native void addRange(Range range);
public native void collapse(Node node,int offset);
public native void collapse(Node node);
public native void collapseToEnd();
public native void collapseToStart();
public native boolean containsNode(Node node,boolean allowPartialContainment);
public native boolean containsNode(Node node);
public native void deleteFromDocument();
public native void empty();
public native void extend(Node node,int offset);
public native void extend(Node node);
public native Range getRangeAt(int index);
public native void removeAllRanges();
public native void removeRange(Range range);
public native void selectAllChildren(Node node);
public native void setBaseAndExtent(Node anchorNode,int anchorOffset,Node focusNode,int focusOffset);
public native void setPosition(Node node,int offset);
public native void setPosition(Node node);
}

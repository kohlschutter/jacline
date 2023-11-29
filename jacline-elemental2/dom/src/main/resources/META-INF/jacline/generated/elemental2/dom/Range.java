package elemental2.dom;
import elemental2.dom.Node;
import elemental2.dom.ClientRectList;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.DocumentFragment;
import elemental2.dom.DOMRect;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Range{
@JsOverlay
public static final int END_TO_END=Range__Constants.END_TO_END;
@JsOverlay
public static final int END_TO_START=Range__Constants.END_TO_START;
@JsOverlay
public static final int START_TO_END=Range__Constants.START_TO_END;
@JsOverlay
public static final int START_TO_START=Range__Constants.START_TO_START;
public boolean collapsed;
public Node commonAncestorContainer;
public Node endContainer;
public int endOffset;
public Node startContainer;
public int startOffset;
public native DocumentFragment cloneContents();
public native Range cloneRange();
public native void collapse(boolean toStart);
public native int compareBoundaryPoints(int how,Range sourceRange);
public native double deleteContents();
public native void detach();
public native DocumentFragment extractContents();
public native DOMRect getBoundingClientRect();
public native ClientRectList getClientRects();
public native DocumentFragment insertNode(Node newNode);
public native void selectNode(Node refNode);
public native void selectNodeContents(Node refNode);
public native void setEnd(Node refNode,int offset);
public native void setEndAfter(Node refNode);
public native void setEndBefore(Node refNode);
public native void setStart(Node refNode,int offset);
public native void setStartAfter(Node refNode);
public native void setStartBefore(Node refNode);
public native void surroundContents(Node newParent);
}

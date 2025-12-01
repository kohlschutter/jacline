package elemental2.dom;
import elemental2.dom.Element;
import elemental2.dom.Attr;
import org.jspecify.annotations.Nullable;
import elemental2.dom.GetRootNodeOptions;
import elemental2.dom.Event;
import elemental2.dom.Document;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.NodeList;
import elemental2.dom.NamedNodeMap;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.HTMLSlotElement;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Node implements EventTarget{
@JsOverlay
public static final int ATTRIBUTE_NODE=Node__Constants.ATTRIBUTE_NODE;
@JsOverlay
public static final int CDATA_SECTION_NODE=Node__Constants.CDATA_SECTION_NODE;
@JsOverlay
public static final int COMMENT_NODE=Node__Constants.COMMENT_NODE;
@JsOverlay
public static final int DOCUMENT_FRAGMENT_NODE=Node__Constants.DOCUMENT_FRAGMENT_NODE;
@JsOverlay
public static final int DOCUMENT_NODE=Node__Constants.DOCUMENT_NODE;
@JsOverlay
public static final int DOCUMENT_POSITION_CONTAINED_BY=Node__Constants.DOCUMENT_POSITION_CONTAINED_BY;
@JsOverlay
public static final int DOCUMENT_POSITION_CONTAINS=Node__Constants.DOCUMENT_POSITION_CONTAINS;
@JsOverlay
public static final int DOCUMENT_POSITION_DISCONNECTED=Node__Constants.DOCUMENT_POSITION_DISCONNECTED;
@JsOverlay
public static final int DOCUMENT_POSITION_FOLLOWING=Node__Constants.DOCUMENT_POSITION_FOLLOWING;
@JsOverlay
public static final int DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC=Node__Constants.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC;
@JsOverlay
public static final int DOCUMENT_POSITION_PRECEDING=Node__Constants.DOCUMENT_POSITION_PRECEDING;
@JsOverlay
public static final int DOCUMENT_TYPE_NODE=Node__Constants.DOCUMENT_TYPE_NODE;
@JsOverlay
public static final int ELEMENT_NODE=Node__Constants.ELEMENT_NODE;
@JsOverlay
public static final int ENTITY_NODE=Node__Constants.ENTITY_NODE;
@JsOverlay
public static final int ENTITY_REFERENCE_NODE=Node__Constants.ENTITY_REFERENCE_NODE;
@JsOverlay
public static final int NOTATION_NODE=Node__Constants.NOTATION_NODE;
@JsOverlay
public static final int PROCESSING_INSTRUCTION_NODE=Node__Constants.PROCESSING_INSTRUCTION_NODE;
@JsOverlay
public static final int TEXT_NODE=Node__Constants.TEXT_NODE;
public @Nullable HTMLSlotElement assignedSlot;
public @Nullable NamedNodeMap<Attr> attributes;
public @Nullable String baseURI;
public NodeList<Node> childNodes;
public @Nullable Node firstChild;
public boolean isConnected;
public @Nullable Node lastChild;
public String localName;
public String namespaceURI;
public @Nullable Node nextSibling;
public String nodeName;
public int nodeType;
public String nodeValue;
public @Nullable Document ownerDocument;
public @Nullable Element parentElement;
public @Nullable Node parentNode;
public String prefix;
public @Nullable Node previousSibling;
public String textContent;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native Node appendChild(@Nullable Node newChild);
public native Node cloneNode(boolean deep);
public native int compareDocumentPosition(@Nullable Node other);
public native boolean contains(@Nullable Node n);
public native boolean dispatchEvent(Event evt);
public native @Nullable JsObject getFeature(String feature,String version);
public native Node getRootNode();
public native Node getRootNode(GetRootNodeOptions options);
public native @Nullable JsObject getUserData(String key);
public native boolean hasAttributes();
public native boolean hasChildNodes();
public native Node insertBefore(@Nullable Node newChild,@Nullable Node refChild);
public native boolean isDefaultNamespace(@Nullable String namespaceURI);
public native boolean isEqualNode(@Nullable Node arg);
public native boolean isSameNode(@Nullable Node other);
public native String lookupNamespaceURI(String prefix);
public native String lookupPrefix(@Nullable String namespaceURI);
public native void normalize();
public native @Nullable Element querySelector(String query);
public native NodeList<Element> querySelectorAll(String query);
public native Node removeChild(@Nullable Node oldChild);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native Node replaceChild(@Nullable Node newChild,@Nullable Node oldChild);
}

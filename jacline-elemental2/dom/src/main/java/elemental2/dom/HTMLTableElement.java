package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.HTMLCollection;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLTableRowElement;
import java.lang.String;
import elemental2.dom.HTMLTableCaptionElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.HTMLTableSectionElement;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLTableElement extends HTMLElement{
public String align;
public String bgColor;
public String border;
public @Nullable HTMLTableCaptionElement caption;
public String cellPadding;
public String cellSpacing;
public String frame;
public @Nullable HTMLCollection<HTMLTableRowElement> rows;
public String rules;
public String summary;
public @Nullable HTMLCollection<HTMLTableSectionElement> tBodies;
public @Nullable HTMLTableSectionElement tFoot;
public @Nullable HTMLTableSectionElement tHead;
public String width;
public native @Nullable HTMLElement createCaption();
public native HTMLTableSectionElement createTBody();
public native @Nullable HTMLElement createTFoot();
public native @Nullable HTMLElement createTHead();
public native void deleteCaption();
public native @Nullable HTMLElement deleteRow(int index);
public native void deleteTFoot();
public native void deleteTHead();
public native @Nullable HTMLElement insertRow();
public native @Nullable HTMLElement insertRow(int index);
}

package elemental2.dom;
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
public HTMLTableCaptionElement caption;
public String cellPadding;
public String cellSpacing;
public String frame;
public HTMLCollection<HTMLTableRowElement> rows;
public String rules;
public String summary;
public HTMLCollection<HTMLTableSectionElement> tBodies;
public HTMLTableSectionElement tFoot;
public HTMLTableSectionElement tHead;
public String width;
public native HTMLElement createCaption();
public native HTMLElement createTFoot();
public native HTMLElement createTHead();
public native void deleteCaption();
public native HTMLElement deleteRow(int index);
public native void deleteTFoot();
public native void deleteTHead();
public native HTMLElement insertRow();
public native HTMLElement insertRow(int index);
}

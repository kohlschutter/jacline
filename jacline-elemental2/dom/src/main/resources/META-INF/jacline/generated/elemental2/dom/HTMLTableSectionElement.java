package elemental2.dom;
import elemental2.dom.HTMLCollection;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLTableRowElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLTableSectionElement extends HTMLElement{
public String align;
public String ch;
public String chOff;
public HTMLCollection<HTMLTableRowElement> rows;
public String vAlign;
public native HTMLElement deleteRow(int index);
public native HTMLElement insertRow();
public native HTMLElement insertRow(int index);
}

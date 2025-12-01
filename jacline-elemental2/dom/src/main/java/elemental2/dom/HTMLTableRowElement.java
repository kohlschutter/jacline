package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.HTMLCollection;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLTableCellElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLTableRowElement extends HTMLElement{
public String align;
public String bgColor;
public @Nullable HTMLCollection<HTMLTableCellElement> cells;
public String ch;
public String chOff;
public int rowIndex;
public int sectionRowIndex;
public String vAlign;
public native void deleteCell(int index);
public native HTMLElement insertCell(int index);
}

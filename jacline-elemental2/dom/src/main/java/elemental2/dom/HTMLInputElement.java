package elemental2.dom;
import elemental2.dom.HTMLFormElement;
import elemental2.dom.ValidityState;
import elemental2.dom.HTMLElement;
import elemental2.dom.FileList;
import elemental2.dom.NodeList;
import elemental2.dom.HTMLLabelElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLInputElement extends HTMLElement{
public String accept;
public String accessKey;
public String align;
public String alt;
public String autocomplete;
public boolean autofocus;
public boolean checked;
public boolean defaultChecked;
public String defaultValue;
public String dirname;
public boolean disabled;
public FileList files;
public HTMLFormElement form;
public String formAction;
public String formEnctype;
public String formMethod;
public boolean formNoValidate;
public String formTarget;
public boolean indeterminate;
public NodeList<HTMLLabelElement> labels;
public String list;
public String max;
public int maxLength;
public String min;
public boolean multiple;
public String name;
public String pattern;
public String placeholder;
public boolean readOnly;
public boolean required;
public String selectionDirection;
public int selectionEnd;
public int selectionStart;
public int size;
public String src;
public String step;
public int tabIndex;
public String type;
public String useMap;
public String validationMessage;
public ValidityState validity;
public String value;
public JsDate valueAsDate;
public double valueAsNumber;
public boolean willValidate;
public native void blur();
public native boolean checkValidity();
public native void click();
public native void focus();
public native boolean reportValidity();
public native void select();
public native void setCustomValidity(String message);
public native void setRangeText(String replacement,int start,int end,String selectionMode);
public native void setRangeText(String replacement,int start,int end);
public native void setRangeText(String replacement,int start);
public native void setRangeText(String replacement);
public native void setSelectionRange(int start,int end,String direction);
public native void setSelectionRange(int start,int end);
public native void showPicker();
public native void stepDown();
public native void stepDown(int n);
public native void stepUp();
public native void stepUp(int n);
}

package elemental2.dom;
import elemental2.dom.DataTransferItemList;
import elemental2.dom.HTMLElement;
import elemental2.dom.FileList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DataTransfer{
public String dropEffect;
public String effectAllowed;
public FileList files;
public DataTransferItemList items;
public JsArray<String> types;
public native void addElement(HTMLElement elem);
public native void clearData();
public native void clearData(String format);
public native String getData(String format);
public native boolean setData(String format,String data);
public native void setDragImage(HTMLElement img,double x,int y);
}

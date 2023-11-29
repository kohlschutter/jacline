package elemental2.dom;
import elemental2.dom.TrustedTypePolicyOptions;
import elemental2.dom.TrustedTypePolicy;
import elemental2.dom.TrustedHTML;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.TrustedScript;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TrustedTypePolicyFactory{
public TrustedTypePolicy defaultPolicy;
public TrustedHTML emptyHTML;
public TrustedScript emptyScript;
public native TrustedTypePolicy createPolicy(String name,TrustedTypePolicyOptions policy);
public native String getAttributeType(String tagName,String attribute,String elementNs,String attrNs);
public native String getAttributeType(String tagName,String attribute,String elementNs);
public native String getAttributeType(String tagName,String attribute);
public native String getPropertyType(String tagName,String property,String elementNs);
public native String getPropertyType(String tagName,String property);
public native boolean isHTML(Object obj);
public native boolean isScript(Object obj);
public native boolean isScriptURL(Object obj);
}

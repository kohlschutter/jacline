package elemental2.dom;
import elemental2.dom.TrustedTypePolicyOptions;
import org.jspecify.annotations.Nullable;
import elemental2.dom.TrustedTypePolicy;
import elemental2.dom.TrustedHTML;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.TrustedScript;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class TrustedTypePolicyFactory{
public @Nullable TrustedTypePolicy defaultPolicy;
public TrustedHTML emptyHTML;
public TrustedScript emptyScript;
public native TrustedTypePolicy createPolicy(String name,TrustedTypePolicyOptions policy);
public native @Nullable String getAttributeType(String tagName,String attribute,String elementNs,String attrNs);
public native @Nullable String getAttributeType(String tagName,String attribute,String elementNs);
public native @Nullable String getAttributeType(String tagName,String attribute);
public native @Nullable String getPropertyType(String tagName,String property,String elementNs);
public native @Nullable String getPropertyType(String tagName,String property);
public native boolean isHTML(@Nullable Object obj);
public native boolean isScript(@Nullable Object obj);
public native boolean isScriptURL(@Nullable Object obj);
}

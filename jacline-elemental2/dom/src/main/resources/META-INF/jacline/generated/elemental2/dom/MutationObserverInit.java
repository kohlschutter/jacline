package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MutationObserverInit{
@JsOverlay
static MutationObserverInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<String> getAttributeFilter();
@JsProperty
boolean isAttributeOldValue();
@JsProperty
boolean isAttributes();
@JsProperty
boolean isCharacterData();
@JsProperty
boolean isCharacterDataOldValue();
@JsProperty
boolean isChildList();
@JsProperty
boolean isSubtree();
@JsProperty
void setAttributeFilter(JsArray<String> attributeFilter);
@JsOverlay
default void setAttributeFilter(String[] attributeFilter){
setAttributeFilter(Js.<JsArray<String>>uncheckedCast(attributeFilter));
}
@JsProperty
void setAttributeOldValue(boolean attributeOldValue);
@JsProperty
void setAttributes(boolean attributes);
@JsProperty
void setCharacterData(boolean characterData);
@JsProperty
void setCharacterDataOldValue(boolean characterDataOldValue);
@JsProperty
void setChildList(boolean childList);
@JsProperty
void setSubtree(boolean subtree);
}

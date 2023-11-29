package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface EventModifierInit extends UIEventInit{
@JsOverlay
static EventModifierInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isAltKey();
@JsProperty
boolean isCtrlKey();
@JsProperty
boolean isMetaKey();
@JsProperty
boolean isModifierAltGraph();
@JsProperty
boolean isModifierCapsLock();
@JsProperty
boolean isModifierFn();
@JsProperty
boolean isModifierFnLock();
@JsProperty
boolean isModifierHyper();
@JsProperty
boolean isModifierNumLock();
@JsProperty
boolean isModifierScrollLock();
@JsProperty
boolean isModifierSuper();
@JsProperty
boolean isModifierSymbol();
@JsProperty
boolean isModifierSymbolLock();
@JsProperty
boolean isShiftKey();
@JsProperty
void setAltKey(boolean altKey);
@JsProperty
void setCtrlKey(boolean ctrlKey);
@JsProperty
void setMetaKey(boolean metaKey);
@JsProperty
void setModifierAltGraph(boolean modifierAltGraph);
@JsProperty
void setModifierCapsLock(boolean modifierCapsLock);
@JsProperty
void setModifierFn(boolean modifierFn);
@JsProperty
void setModifierFnLock(boolean modifierFnLock);
@JsProperty
void setModifierHyper(boolean modifierHyper);
@JsProperty
void setModifierNumLock(boolean modifierNumLock);
@JsProperty
void setModifierScrollLock(boolean modifierScrollLock);
@JsProperty
void setModifierSuper(boolean modifierSuper);
@JsProperty
void setModifierSymbol(boolean modifierSymbol);
@JsProperty
void setModifierSymbolLock(boolean modifierSymbolLock);
@JsProperty
void setShiftKey(boolean shiftKey);
}

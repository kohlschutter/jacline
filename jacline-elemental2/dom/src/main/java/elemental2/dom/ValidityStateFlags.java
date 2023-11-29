package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ValidityStateFlags{
@JsOverlay
static ValidityStateFlags create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isBadInput();
@JsProperty
boolean isCustomError();
@JsProperty
boolean isPatternMismatch();
@JsProperty
boolean isRangeOverflow();
@JsProperty
boolean isRangeUnderflow();
@JsProperty
boolean isStepMismatch();
@JsProperty
boolean isTooLong();
@JsProperty
boolean isTooShort();
@JsProperty
boolean isTypeMismatch();
@JsProperty
boolean isValueMissing();
@JsProperty
void setBadInput(boolean badInput);
@JsProperty
void setCustomError(boolean customError);
@JsProperty
void setPatternMismatch(boolean patternMismatch);
@JsProperty
void setRangeOverflow(boolean rangeOverflow);
@JsProperty
void setRangeUnderflow(boolean rangeUnderflow);
@JsProperty
void setStepMismatch(boolean stepMismatch);
@JsProperty
void setTooLong(boolean tooLong);
@JsProperty
void setTooShort(boolean tooShort);
@JsProperty
void setTypeMismatch(boolean typeMismatch);
@JsProperty
void setValueMissing(boolean valueMissing);
}

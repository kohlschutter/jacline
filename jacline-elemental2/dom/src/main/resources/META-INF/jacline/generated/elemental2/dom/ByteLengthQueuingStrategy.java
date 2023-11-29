package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ByteLengthQueuingStrategy{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ByteLengthQueuingStrategyConfigType{
@JsOverlay
static ByteLengthQueuingStrategy.ByteLengthQueuingStrategyConfigType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getHighWaterMark();
@JsProperty
void setHighWaterMark(double highWaterMark);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SizeChunkType{
@JsOverlay
static ByteLengthQueuingStrategy.SizeChunkType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getByteLength();
@JsProperty
void setByteLength(int byteLength);
}
public ByteLengthQueuingStrategy(ByteLengthQueuingStrategy.ByteLengthQueuingStrategyConfigType config){}
public native int size(ByteLengthQueuingStrategy.SizeChunkType chunk);
}

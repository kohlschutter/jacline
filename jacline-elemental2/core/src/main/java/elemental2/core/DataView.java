package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsBigint;
import elemental2.core.ArrayBuffer;
import elemental2.core.SharedArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DataView extends ArrayBufferView{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorBufferUnionType{
@JsOverlay
static DataView.@Nullable ConstructorBufferUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default @Nullable SharedArrayBuffer asSharedArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isSharedArrayBuffer(){
return (Object)this instanceof SharedArrayBuffer;
}
}
public DataView(ArrayBuffer buffer,int byteOffset,int byteLength){}
public DataView(ArrayBuffer buffer,int byteOffset){}
public DataView(ArrayBuffer buffer){}
public DataView(DataView.@Nullable ConstructorBufferUnionType buffer,int byteOffset,int byteLength){}
public DataView(DataView.@Nullable ConstructorBufferUnionType buffer,int byteOffset){}
public DataView(DataView.@Nullable ConstructorBufferUnionType buffer){}
public DataView(SharedArrayBuffer buffer,int byteOffset,int byteLength){}
public DataView(SharedArrayBuffer buffer,int byteOffset){}
public DataView(SharedArrayBuffer buffer){}
public native JsBigint getBigInt64(double byteOffset,boolean littleEndian);
public native JsBigint getBigInt64(double byteOffset);
public native JsBigint getBigUint64(double byteOffset,boolean littleEndian);
public native JsBigint getBigUint64(double byteOffset);
public native double getFloat32(int byteOffset,boolean littleEndian);
public native double getFloat32(int byteOffset);
public native double getFloat64(int byteOffset,boolean littleEndian);
public native double getFloat64(int byteOffset);
public native int getInt16(int byteOffset,boolean littleEndian);
public native int getInt16(int byteOffset);
public native int getInt32(int byteOffset,boolean littleEndian);
public native int getInt32(int byteOffset);
public native int getInt8(int byteOffset);
public native int getUint16(int byteOffset,boolean littleEndian);
public native int getUint16(int byteOffset);
public native int getUint32(int byteOffset,boolean littleEndian);
public native int getUint32(int byteOffset);
public native int getUint8(int byteOffset);
public native void setBigInt64(double byteOffset,JsBigint value,boolean littleEndian);
public native void setBigInt64(double byteOffset,JsBigint value);
public native void setBigUint64(double byteOffset,JsBigint value,boolean littleEndian);
public native void setBigUint64(double byteOffset,JsBigint value);
public native void setFloat32(int byteOffset,double value,boolean littleEndian);
public native void setFloat32(int byteOffset,double value);
public native void setFloat64(int byteOffset,double value,boolean littleEndian);
public native void setFloat64(int byteOffset,double value);
public native void setInt16(int byteOffset,double value,boolean littleEndian);
public native void setInt16(int byteOffset,double value);
public native void setInt32(int byteOffset,double value,boolean littleEndian);
public native void setInt32(int byteOffset,double value);
public native void setInt8(int byteOffset,double value);
public native void setUint16(int byteOffset,double value,boolean littleEndian);
public native void setUint16(int byteOffset,double value);
public native void setUint32(int byteOffset,double value,boolean littleEndian);
public native void setUint32(int byteOffset,double value);
public native void setUint8(int byteOffset,double value);
}

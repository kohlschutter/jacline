package elemental2.dom;
import elemental2.core.Uint8ClampedArray;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ImageData{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorDataOrWidthUnionType{
@JsOverlay
static ImageData.ConstructorDataOrWidthUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default Uint8ClampedArray asUint8ClampedArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isUint8ClampedArray(){
return (Object)this instanceof Uint8ClampedArray;
}
}
public Uint8ClampedArray data;
public int height;
public int width;
public ImageData(ImageData.ConstructorDataOrWidthUnionType dataOrWidth,double widthOrHeight,double height){}
public ImageData(ImageData.ConstructorDataOrWidthUnionType dataOrWidth,double widthOrHeight){}
public ImageData(Uint8ClampedArray dataOrWidth,double widthOrHeight,double height){}
public ImageData(Uint8ClampedArray dataOrWidth,double widthOrHeight){}
public ImageData(double dataOrWidth,double widthOrHeight,double height){}
public ImageData(double dataOrWidth,double widthOrHeight){}
}

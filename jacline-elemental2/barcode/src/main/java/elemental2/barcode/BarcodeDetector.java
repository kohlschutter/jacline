package elemental2.barcode;
import elemental2.dom.OffscreenCanvas;
import elemental2.barcode.DetectedBarcode;
import elemental2.dom.HTMLVideoElement;
import elemental2.dom.Blob;
import elemental2.promise.Promise;
import elemental2.dom.HTMLCanvasElement;
import elemental2.core.JsArray;
import elemental2.barcode.BarcodeDetectorOptions;
import elemental2.dom.ImageBitmap;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import elemental2.dom.ImageData;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.HTMLImageElement;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class BarcodeDetector{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DetectImageUnionType{
@JsOverlay
static BarcodeDetector.DetectImageUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Blob asBlob(){
return Js.cast(this);
}
@JsOverlay
default HTMLCanvasElement asHTMLCanvasElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLImageElement asHTMLImageElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLVideoElement asHTMLVideoElement(){
return Js.cast(this);
}
@JsOverlay
default ImageBitmap asImageBitmap(){
return Js.cast(this);
}
@JsOverlay
default ImageData asImageData(){
return Js.cast(this);
}
@JsOverlay
default OffscreenCanvas asOffscreenCanvas(){
return Js.cast(this);
}
@JsOverlay
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isHTMLCanvasElement(){
return (Object)this instanceof HTMLCanvasElement;
}
@JsOverlay
default boolean isHTMLImageElement(){
return (Object)this instanceof HTMLImageElement;
}
@JsOverlay
default boolean isHTMLVideoElement(){
return (Object)this instanceof HTMLVideoElement;
}
@JsOverlay
default boolean isImageData(){
return (Object)this instanceof ImageData;
}
@JsOverlay
default boolean isOffscreenCanvas(){
return (Object)this instanceof OffscreenCanvas;
}
}
public static native Promise<JsArray<String>> getSupportedFormats();
public BarcodeDetector(){}
public BarcodeDetector(BarcodeDetectorOptions options){}
@JsOverlay
public final Promise<JsArray<DetectedBarcode>> detect(Blob image){
return detect(Js.<BarcodeDetector.DetectImageUnionType>uncheckedCast(image));
}
public native Promise<JsArray<DetectedBarcode>> detect(BarcodeDetector.DetectImageUnionType image);
@JsOverlay
public final Promise<JsArray<DetectedBarcode>> detect(HTMLCanvasElement image){
return detect(Js.<BarcodeDetector.DetectImageUnionType>uncheckedCast(image));
}
@JsOverlay
public final Promise<JsArray<DetectedBarcode>> detect(HTMLImageElement image){
return detect(Js.<BarcodeDetector.DetectImageUnionType>uncheckedCast(image));
}
@JsOverlay
public final Promise<JsArray<DetectedBarcode>> detect(HTMLVideoElement image){
return detect(Js.<BarcodeDetector.DetectImageUnionType>uncheckedCast(image));
}
@JsOverlay
public final Promise<JsArray<DetectedBarcode>> detect(ImageBitmap image){
return detect(Js.<BarcodeDetector.DetectImageUnionType>uncheckedCast(image));
}
@JsOverlay
public final Promise<JsArray<DetectedBarcode>> detect(ImageData image){
return detect(Js.<BarcodeDetector.DetectImageUnionType>uncheckedCast(image));
}
@JsOverlay
public final Promise<JsArray<DetectedBarcode>> detect(OffscreenCanvas image){
return detect(Js.<BarcodeDetector.DetectImageUnionType>uncheckedCast(image));
}
}

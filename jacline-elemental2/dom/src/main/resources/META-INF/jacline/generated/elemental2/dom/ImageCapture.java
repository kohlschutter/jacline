package elemental2.dom;
import elemental2.dom.PhotoCapabilities;
import elemental2.dom.PhotoSettings;
import elemental2.dom.MediaStreamTrack;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.Blob;
import elemental2.dom.ImageBitmap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ImageCapture{
public MediaStreamTrack track;
public ImageCapture(MediaStreamTrack videoTrack){}
public native Promise<PhotoCapabilities> getPhotoCapabilities();
public native Promise<ImageBitmap> grabFrame();
public native Promise<Blob> takePhoto();
public native Promise<Blob> takePhoto(PhotoSettings photoSettings);
}

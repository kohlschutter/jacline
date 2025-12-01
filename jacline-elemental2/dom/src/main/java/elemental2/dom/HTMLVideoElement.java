package elemental2.dom;
import elemental2.dom.VideoPlaybackQuality;
import elemental2.dom.VideoFrameRequestCallback;
import elemental2.dom.HTMLMediaElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLVideoElement extends HTMLMediaElement{
public int height;
public boolean playsInline;
public String poster;
public int videoHeight;
public int videoWidth;
public int webkitDecodedFrameCount;
public boolean webkitDisplayingFullscreen;
public int webkitDroppedFrameCount;
public boolean webkitSupportsFullscreen;
public int width;
public native void cancelVideoFrameCallback(int handle);
public native VideoPlaybackQuality getVideoPlaybackQuality();
public native int requestVideoFrameCallback(VideoFrameRequestCallback callback);
public native void webkitEnterFullScreen();
public native void webkitEnterFullscreen();
public native void webkitExitFullScreen();
public native void webkitExitFullscreen();
}

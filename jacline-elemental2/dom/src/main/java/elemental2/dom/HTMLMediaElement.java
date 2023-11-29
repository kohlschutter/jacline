package elemental2.dom;
import java.lang.Void;
import elemental2.dom.TimeRanges;
import elemental2.dom.Event;
import elemental2.dom.MediaError;
import elemental2.promise.Promise;
import jsinterop.annotations.JsFunction;
import elemental2.dom.HTMLElement;
import elemental2.dom.TextTrack;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaStream;
import java.lang.Object;
import elemental2.dom.TextTrackList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLMediaElement extends HTMLElement{
@JsFunction
public interface OnabortFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OncanplayFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OncanplaythroughFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OndurationchangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnemptiedFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnendedFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadeddataFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadedmetadataFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadstartFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnpauseFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnplayFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnplayingFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnprogressFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnratechangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnseekedFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnseekingFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnstalledFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnsuspendFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OntimeupdateFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnvolumechangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnwaitingFn{
Object onInvoke(Event p0);
}
@JsOverlay
public static final int HAVE_CURRENT_DATA=HTMLMediaElement__Constants.HAVE_CURRENT_DATA;
@JsOverlay
public static final int HAVE_ENOUGH_DATA=HTMLMediaElement__Constants.HAVE_ENOUGH_DATA;
@JsOverlay
public static final int HAVE_FUTURE_DATA=HTMLMediaElement__Constants.HAVE_FUTURE_DATA;
@JsOverlay
public static final int HAVE_METADATA=HTMLMediaElement__Constants.HAVE_METADATA;
@JsOverlay
public static final int HAVE_NOTHING=HTMLMediaElement__Constants.HAVE_NOTHING;
@JsOverlay
public static final int NETWORK_EMPTY=HTMLMediaElement__Constants.NETWORK_EMPTY;
@JsOverlay
public static final int NETWORK_IDLE=HTMLMediaElement__Constants.NETWORK_IDLE;
@JsOverlay
public static final int NETWORK_LOADING=HTMLMediaElement__Constants.NETWORK_LOADING;
@JsOverlay
public static final int NETWORK_NO_SOURCE=HTMLMediaElement__Constants.NETWORK_NO_SOURCE;
public boolean autobuffer;
public boolean autoplay;
public TimeRanges buffered;
public boolean controls;
public String crossOrigin;
public String currentSrc;
public double currentTime;
public double defaultPlaybackRate;
public double duration;
public boolean ended;
public MediaError error;
public boolean loop;
public boolean muted;
public int networkState;
public HTMLMediaElement.OnabortFn onabort;
public HTMLMediaElement.OncanplayFn oncanplay;
public HTMLMediaElement.OncanplaythroughFn oncanplaythrough;
public HTMLMediaElement.OndurationchangeFn ondurationchange;
public HTMLMediaElement.OnemptiedFn onemptied;
public HTMLMediaElement.OnendedFn onended;
public HTMLMediaElement.OnerrorFn onerror;
public HTMLMediaElement.OnloadeddataFn onloadeddata;
public HTMLMediaElement.OnloadedmetadataFn onloadedmetadata;
public HTMLMediaElement.OnloadstartFn onloadstart;
public HTMLMediaElement.OnpauseFn onpause;
public HTMLMediaElement.OnplayFn onplay;
public HTMLMediaElement.OnplayingFn onplaying;
public HTMLMediaElement.OnprogressFn onprogress;
public HTMLMediaElement.OnratechangeFn onratechange;
public HTMLMediaElement.OnseekedFn onseeked;
public HTMLMediaElement.OnseekingFn onseeking;
public HTMLMediaElement.OnstalledFn onstalled;
public HTMLMediaElement.OnsuspendFn onsuspend;
public HTMLMediaElement.OntimeupdateFn ontimeupdate;
public HTMLMediaElement.OnvolumechangeFn onvolumechange;
public HTMLMediaElement.OnwaitingFn onwaiting;
public boolean paused;
public double playbackRate;
public TimeRanges played;
public String preload;
public int readyState;
public TimeRanges seekable;
public boolean seeking;
public String sinkId;
public String src;
public MediaStream srcObject;
public TextTrackList textTracks;
public double volume;
public native TextTrack addTextTrack(String kind,String label,String language);
public native TextTrack addTextTrack(String kind,String label);
public native TextTrack addTextTrack(String kind);
public native String canPlayType(String type);
public native MediaStream captureStream();
public native JsDate getStartDate();
public native void load();
public native MediaStream mozCaptureStream();
public native void pause();
public native Promise<Void> play();
public native Promise<Void> setSinkId(String sinkId);
}

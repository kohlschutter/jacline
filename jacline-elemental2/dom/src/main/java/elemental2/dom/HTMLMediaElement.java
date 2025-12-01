package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Void;
import elemental2.dom.TimeRanges;
import elemental2.dom.Event;
import elemental2.dom.MediaError;
import elemental2.promise.Promise;
import elemental2.dom.MediaKeys;
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
import elemental2.dom.MediaEncryptedEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLMediaElement extends HTMLElement{
@JsFunction
public interface OnabortFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncanplayFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OncanplaythroughFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OndurationchangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnemptiedFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnencryptedFn{
@Nullable Object onInvoke(MediaEncryptedEvent p0);
}
@JsFunction
public interface OnendedFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnloadeddataFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadedmetadataFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadstartFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnpauseFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnplayFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnplayingFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnprogressFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnratechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnseekedFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnseekingFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnstalledFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnsuspendFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OntimeupdateFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnvolumechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnwaitingFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnwaitingforkeyFn{
@Nullable Object onInvoke(Event p0);
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
public boolean defaultMuted;
public double defaultPlaybackRate;
public boolean disableRemotePlayback;
public double duration;
public boolean ended;
public @Nullable MediaError error;
public boolean loop;
public @Nullable MediaKeys mediaKeys;
public boolean muted;
public int networkState;
public HTMLMediaElement.@Nullable OnabortFn onabort;
public HTMLMediaElement.@Nullable OncanplayFn oncanplay;
public HTMLMediaElement.@Nullable OncanplaythroughFn oncanplaythrough;
public HTMLMediaElement.@Nullable OndurationchangeFn ondurationchange;
public HTMLMediaElement.@Nullable OnemptiedFn onemptied;
public HTMLMediaElement.@Nullable OnencryptedFn onencrypted;
public HTMLMediaElement.@Nullable OnendedFn onended;
public HTMLMediaElement.@Nullable OnerrorFn onerror;
public HTMLMediaElement.@Nullable OnloadeddataFn onloadeddata;
public HTMLMediaElement.@Nullable OnloadedmetadataFn onloadedmetadata;
public HTMLMediaElement.@Nullable OnloadstartFn onloadstart;
public HTMLMediaElement.@Nullable OnpauseFn onpause;
public HTMLMediaElement.@Nullable OnplayFn onplay;
public HTMLMediaElement.@Nullable OnplayingFn onplaying;
public HTMLMediaElement.@Nullable OnprogressFn onprogress;
public HTMLMediaElement.@Nullable OnratechangeFn onratechange;
public HTMLMediaElement.@Nullable OnseekedFn onseeked;
public HTMLMediaElement.@Nullable OnseekingFn onseeking;
public HTMLMediaElement.@Nullable OnstalledFn onstalled;
public HTMLMediaElement.@Nullable OnsuspendFn onsuspend;
public HTMLMediaElement.@Nullable OntimeupdateFn ontimeupdate;
public HTMLMediaElement.@Nullable OnvolumechangeFn onvolumechange;
public HTMLMediaElement.@Nullable OnwaitingFn onwaiting;
public HTMLMediaElement.@Nullable OnwaitingforkeyFn onwaitingforkey;
public boolean paused;
public double playbackRate;
public @Nullable TimeRanges played;
public String preload;
public boolean preservesPitch;
public int readyState;
public @Nullable TimeRanges seekable;
public boolean seeking;
public String sinkId;
public String src;
public @Nullable MediaStream srcObject;
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
public native @Nullable Promise<Void> play();
public native Promise setMediaKeys(@Nullable MediaKeys mediaKeys);
public native Promise<Void> setSinkId(String sinkId);
}

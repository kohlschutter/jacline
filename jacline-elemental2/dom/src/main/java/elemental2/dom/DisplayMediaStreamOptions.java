package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.MediaTrackConstraints;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.CaptureController;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface DisplayMediaStreamOptions{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAudioUnionType{
@JsOverlay
static DisplayMediaStreamOptions.@Nullable GetAudioUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default @Nullable MediaTrackConstraints asMediaTrackConstraints(){
return Js.cast(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetVideoUnionType{
@JsOverlay
static DisplayMediaStreamOptions.@Nullable GetVideoUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default @Nullable MediaTrackConstraints asMediaTrackConstraints(){
return Js.cast(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
}
@JsOverlay
static DisplayMediaStreamOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
DisplayMediaStreamOptions.@Nullable GetAudioUnionType getAudio();
@JsProperty
CaptureController getController();
@JsProperty
String getSelfBrowserSurface();
@JsProperty
String getSurfaceSwitching();
@JsProperty
String getSystemAudio();
@JsProperty
DisplayMediaStreamOptions.@Nullable GetVideoUnionType getVideo();
@JsProperty
boolean isPreferCurrentTab();
@JsProperty
void setAudio(DisplayMediaStreamOptions.@Nullable GetAudioUnionType audio);
@JsOverlay
default void setAudio(MediaTrackConstraints audio){
setAudio(Js.<DisplayMediaStreamOptions.@Nullable GetAudioUnionType>uncheckedCast(audio));
}
@JsOverlay
default void setAudio(boolean audio){
setAudio(Js.<DisplayMediaStreamOptions.@Nullable GetAudioUnionType>uncheckedCast(audio));
}
@JsProperty
void setController(CaptureController controller);
@JsProperty
void setPreferCurrentTab(boolean preferCurrentTab);
@JsProperty
void setSelfBrowserSurface(String selfBrowserSurface);
@JsProperty
void setSurfaceSwitching(String surfaceSwitching);
@JsProperty
void setSystemAudio(String systemAudio);
@JsProperty
void setVideo(DisplayMediaStreamOptions.@Nullable GetVideoUnionType video);
@JsOverlay
default void setVideo(MediaTrackConstraints video){
setVideo(Js.<DisplayMediaStreamOptions.@Nullable GetVideoUnionType>uncheckedCast(video));
}
@JsOverlay
default void setVideo(boolean video){
setVideo(Js.<DisplayMediaStreamOptions.@Nullable GetVideoUnionType>uncheckedCast(video));
}
}

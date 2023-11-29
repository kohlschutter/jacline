package elemental2.dom;
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
static DisplayMediaStreamOptions.GetAudioUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default MediaTrackConstraints asMediaTrackConstraints(){
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
static DisplayMediaStreamOptions.GetVideoUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default MediaTrackConstraints asMediaTrackConstraints(){
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
DisplayMediaStreamOptions.GetAudioUnionType getAudio();
@JsProperty
CaptureController getController();
@JsProperty
String getSelfBrowserSurface();
@JsProperty
String getSurfaceSwitching();
@JsProperty
String getSystemAudio();
@JsProperty
DisplayMediaStreamOptions.GetVideoUnionType getVideo();
@JsProperty
boolean isPreferCurrentTab();
@JsProperty
void setAudio(DisplayMediaStreamOptions.GetAudioUnionType audio);
@JsOverlay
default void setAudio(MediaTrackConstraints audio){
setAudio(Js.<DisplayMediaStreamOptions.GetAudioUnionType>uncheckedCast(audio));
}
@JsOverlay
default void setAudio(boolean audio){
setAudio(Js.<DisplayMediaStreamOptions.GetAudioUnionType>uncheckedCast(audio));
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
void setVideo(DisplayMediaStreamOptions.GetVideoUnionType video);
@JsOverlay
default void setVideo(MediaTrackConstraints video){
setVideo(Js.<DisplayMediaStreamOptions.GetVideoUnionType>uncheckedCast(video));
}
@JsOverlay
default void setVideo(boolean video){
setVideo(Js.<DisplayMediaStreamOptions.GetVideoUnionType>uncheckedCast(video));
}
}

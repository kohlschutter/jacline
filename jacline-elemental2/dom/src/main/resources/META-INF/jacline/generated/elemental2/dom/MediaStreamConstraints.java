package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.MediaTrackConstraints;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaStreamConstraints{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAudioUnionType{
@JsOverlay
static MediaStreamConstraints.GetAudioUnionType of(Object o){
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
static MediaStreamConstraints.GetVideoUnionType of(Object o){
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
static MediaStreamConstraints create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
MediaStreamConstraints.GetAudioUnionType getAudio();
@JsProperty
MediaStreamConstraints.GetVideoUnionType getVideo();
@JsProperty
boolean isPreferCurrentTab();
@JsProperty
void setAudio(MediaStreamConstraints.GetAudioUnionType audio);
@JsOverlay
default void setAudio(MediaTrackConstraints audio){
setAudio(Js.<MediaStreamConstraints.GetAudioUnionType>uncheckedCast(audio));
}
@JsOverlay
default void setAudio(boolean audio){
setAudio(Js.<MediaStreamConstraints.GetAudioUnionType>uncheckedCast(audio));
}
@JsProperty
void setPreferCurrentTab(boolean preferCurrentTab);
@JsProperty
void setVideo(MediaStreamConstraints.GetVideoUnionType video);
@JsOverlay
default void setVideo(MediaTrackConstraints video){
setVideo(Js.<MediaStreamConstraints.GetVideoUnionType>uncheckedCast(video));
}
@JsOverlay
default void setVideo(boolean video){
setVideo(Js.<MediaStreamConstraints.GetVideoUnionType>uncheckedCast(video));
}
}

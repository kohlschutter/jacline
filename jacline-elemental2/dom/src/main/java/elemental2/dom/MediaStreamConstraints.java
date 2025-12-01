package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
static MediaStreamConstraints.@Nullable GetAudioUnionType of(@Nullable Object o){
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
static MediaStreamConstraints.@Nullable GetVideoUnionType of(@Nullable Object o){
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
static MediaStreamConstraints create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
MediaStreamConstraints.@Nullable GetAudioUnionType getAudio();
@JsProperty
MediaStreamConstraints.@Nullable GetVideoUnionType getVideo();
@JsProperty
boolean isPreferCurrentTab();
@JsProperty
void setAudio(MediaStreamConstraints.@Nullable GetAudioUnionType audio);
@JsOverlay
default void setAudio(MediaTrackConstraints audio){
setAudio(Js.<MediaStreamConstraints.@Nullable GetAudioUnionType>uncheckedCast(audio));
}
@JsOverlay
default void setAudio(boolean audio){
setAudio(Js.<MediaStreamConstraints.@Nullable GetAudioUnionType>uncheckedCast(audio));
}
@JsProperty
void setPreferCurrentTab(boolean preferCurrentTab);
@JsProperty
void setVideo(MediaStreamConstraints.@Nullable GetVideoUnionType video);
@JsOverlay
default void setVideo(MediaTrackConstraints video){
setVideo(Js.<MediaStreamConstraints.@Nullable GetVideoUnionType>uncheckedCast(video));
}
@JsOverlay
default void setVideo(boolean video){
setVideo(Js.<MediaStreamConstraints.@Nullable GetVideoUnionType>uncheckedCast(video));
}
}

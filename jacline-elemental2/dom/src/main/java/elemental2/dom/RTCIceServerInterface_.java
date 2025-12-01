package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCIceServerInterface_{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetUrlsUnionType{
@JsOverlay
static RTCIceServerInterface_.GetUrlsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsProperty
@Nullable String getCredential();
@JsProperty
RTCIceServerInterface_.GetUrlsUnionType getUrls();
@JsProperty
@Nullable String getUsername();
@JsProperty
void setCredential(@Nullable String credential);
@JsProperty
void setUrls(RTCIceServerInterface_.GetUrlsUnionType urls);
@JsOverlay
default void setUrls(JsArray<String> urls){
setUrls(Js.<RTCIceServerInterface_.GetUrlsUnionType>uncheckedCast(urls));
}
@JsOverlay
default void setUrls(String urls){
setUrls(Js.<RTCIceServerInterface_.GetUrlsUnionType>uncheckedCast(urls));
}
@JsOverlay
default void setUrls(String[] urls){
setUrls(Js.<JsArray<String>>uncheckedCast(urls));
}
@JsProperty
void setUsername(@Nullable String username);
}

package elemental2.dom;
import elemental2.dom.URLSearchParams;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaSource;
import elemental2.dom.MediaStream;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Blob;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class URL{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CanParseBaseUnionType{
@JsOverlay
static URL.CanParseBaseUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CanParseUrlUnionType{
@JsOverlay
static URL.CanParseUrlUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorBaseUnionType{
@JsOverlay
static URL.ConstructorBaseUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorUrlUnionType{
@JsOverlay
static URL.ConstructorUrlUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CreateObjectURLObjUnionType{
@JsOverlay
static URL.CreateObjectURLObjUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Blob asBlob(){
return Js.cast(this);
}
@JsOverlay
default MediaSource asMediaSource(){
return Js.cast(this);
}
@JsOverlay
default MediaStream asMediaStream(){
return Js.cast(this);
}
@JsOverlay
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isMediaSource(){
return (Object)this instanceof MediaSource;
}
@JsOverlay
default boolean isMediaStream(){
return (Object)this instanceof MediaStream;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RevokeObjectURLUrlUnionType{
@JsOverlay
static URL.RevokeObjectURLUrlUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
public static native boolean canParse(URL.CanParseUrlUnionType url,URL.CanParseBaseUnionType base);
@JsOverlay
public static final boolean canParse(URL.CanParseUrlUnionType url,String base){
return canParse(url,Js.<URL.CanParseBaseUnionType>uncheckedCast(base));
}
@JsOverlay
public static final boolean canParse(URL.CanParseUrlUnionType url,URL base){
return canParse(url,Js.<URL.CanParseBaseUnionType>uncheckedCast(base));
}
public static native boolean canParse(URL.CanParseUrlUnionType url);
@JsOverlay
public static final boolean canParse(String url,URL.CanParseBaseUnionType base){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url),base);
}
@JsOverlay
public static final boolean canParse(String url,String base){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url),Js.<URL.CanParseBaseUnionType>uncheckedCast(base));
}
@JsOverlay
public static final boolean canParse(String url,URL base){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url),Js.<URL.CanParseBaseUnionType>uncheckedCast(base));
}
@JsOverlay
public static final boolean canParse(String url){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public static final boolean canParse(URL url,URL.CanParseBaseUnionType base){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url),base);
}
@JsOverlay
public static final boolean canParse(URL url,String base){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url),Js.<URL.CanParseBaseUnionType>uncheckedCast(base));
}
@JsOverlay
public static final boolean canParse(URL url,URL base){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url),Js.<URL.CanParseBaseUnionType>uncheckedCast(base));
}
@JsOverlay
public static final boolean canParse(URL url){
return canParse(Js.<URL.CanParseUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public static final String createObjectURL(Blob obj){
return createObjectURL(Js.<URL.CreateObjectURLObjUnionType>uncheckedCast(obj));
}
public static native String createObjectURL(URL.CreateObjectURLObjUnionType obj);
@JsOverlay
public static final String createObjectURL(MediaSource obj){
return createObjectURL(Js.<URL.CreateObjectURLObjUnionType>uncheckedCast(obj));
}
@JsOverlay
public static final String createObjectURL(MediaStream obj){
return createObjectURL(Js.<URL.CreateObjectURLObjUnionType>uncheckedCast(obj));
}
public static native String domainToASCII(String domain);
public static native String domainToUnicode(String domain);
public static native void revokeObjectURL(URL.RevokeObjectURLUrlUnionType url);
@JsOverlay
public static final void revokeObjectURL(String url){
revokeObjectURL(Js.<URL.RevokeObjectURLUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public static final void revokeObjectURL(URL url){
revokeObjectURL(Js.<URL.RevokeObjectURLUrlUnionType>uncheckedCast(url));
}
public String hash;
public String host;
public String hostname;
public String href;
public String origin;
public String password;
public String pathname;
public String port;
public String protocol;
public String search;
public URLSearchParams searchParams;
public String username;
public URL(URL.ConstructorUrlUnionType url,URL.ConstructorBaseUnionType base){}
public URL(URL.ConstructorUrlUnionType url,String base){}
public URL(URL.ConstructorUrlUnionType url,URL base){}
public URL(URL.ConstructorUrlUnionType url){}
public URL(String url,URL.ConstructorBaseUnionType base){}
public URL(String url,String base){}
public URL(String url,URL base){}
public URL(String url){}
public URL(URL url,URL.ConstructorBaseUnionType base){}
public URL(URL url,String base){}
public URL(URL url,URL base){}
public URL(URL url){}
}

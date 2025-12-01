package elemental2.core;
import org.jspecify.annotations.Nullable;
import java.lang.Deprecated;
import jsinterop.annotations.JsMethod;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,name = "Date",namespace = JsPackage.GLOBAL)
public class JsDate{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ToLocaleDateStringLocalesUnionType{
@JsOverlay
static JsDate.@Nullable ToLocaleDateStringLocalesUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ToLocaleStringLocalesUnionType{
@JsOverlay
static JsDate.@Nullable ToLocaleStringLocalesUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ToLocaleTimeStringLocalesUnionType{
@JsOverlay
static JsDate.@Nullable ToLocaleTimeStringLocalesUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
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
public static native double UTC(double year,double month,double date,double hours,double minute,double second,double ms);
public static native double UTC(double year,double month,double date,double hours,double minute,double second);
public static native double UTC(double year,double month,double date,double hours,double minute);
public static native double UTC(double year,double month,double date,double hours);
public static native double UTC(double year,double month,double date);
public static native double UTC(double year,double month);
public static native double UTC(double year);
public static native double now();
public static native double parse(@Nullable Object date);
public JsDate(){}
public JsDate(@Nullable Object yr_num,@Nullable Object mo_num,@Nullable Object day_num,@Nullable Object hr_num,@Nullable Object min_num,@Nullable Object sec_num,@Nullable Object ms_num){}
public JsDate(@Nullable Object yr_num,@Nullable Object mo_num,@Nullable Object day_num,@Nullable Object hr_num,@Nullable Object min_num,@Nullable Object sec_num){}
public JsDate(@Nullable Object yr_num,@Nullable Object mo_num,@Nullable Object day_num,@Nullable Object hr_num,@Nullable Object min_num){}
public JsDate(@Nullable Object yr_num,@Nullable Object mo_num,@Nullable Object day_num,@Nullable Object hr_num){}
public JsDate(@Nullable Object yr_num,@Nullable Object mo_num,@Nullable Object day_num){}
public JsDate(@Nullable Object yr_num,@Nullable Object mo_num){}
public JsDate(@Nullable Object yr_num){}
public native int getDate();
public native int getDay();
public native int getFullYear();
public native int getHours();
public native int getMilliseconds();
public native int getMinutes();
public native int getMonth();
public native int getSeconds();
public native double getTime();
public native int getTimezoneOffset();
public native int getUTCDate();
public native int getUTCDay();
public native int getUTCFullYear();
public native int getUTCHours();
public native int getUTCMilliseconds();
public native int getUTCMinutes();
public native int getUTCMonth();
public native int getUTCSeconds();
public native int getYear();
public native double setDate(int dayValue);
public native double setFullYear(int yearValue,int monthValue,int dayValue);
public native double setFullYear(int yearValue,int monthValue);
public native double setFullYear(int yearValue);
public native double setHours(int hoursValue,int minutesValue,int secondsValue,int msValue);
public native double setHours(int hoursValue,int minutesValue,int secondsValue);
public native double setHours(int hoursValue,int minutesValue);
public native double setHours(int hoursValue);
public native double setMilliseconds(int millisecondsValue);
public native double setMinutes(int minutesValue,int secondsValue,int msValue);
public native double setMinutes(int minutesValue,int secondsValue);
public native double setMinutes(int minutesValue);
public native double setMonth(int monthValue,int dayValue);
public native double setMonth(int monthValue);
public native double setSeconds(int secondsValue,int msValue);
public native double setSeconds(int secondsValue);
public native double setTime(double timeValue);
public native double setUTCDate(int dayValue);
public native double setUTCFullYear(int yearValue,int monthValue,int dayValue);
public native double setUTCFullYear(int yearValue,int monthValue);
public native double setUTCFullYear(int yearValue);
public native double setUTCHours(int hoursValue,int minutesValue,int secondsValue,int msValue);
public native double setUTCHours(int hoursValue,int minutesValue,int secondsValue);
public native double setUTCHours(int hoursValue,int minutesValue);
public native double setUTCHours(int hoursValue);
public native double setUTCMilliseconds(int millisecondsValue);
public native double setUTCMinutes(int minutesValue,int secondsValue,int msValue);
public native double setUTCMinutes(int minutesValue,int secondsValue);
public native double setUTCMinutes(int minutesValue);
public native double setUTCMonth(int monthValue,int dayValue);
public native double setUTCMonth(int monthValue);
public native double setUTCSeconds(int secondsValue,int msValue);
public native double setUTCSeconds(int secondsValue);
@Deprecated
public native double setYear(int yearValue);
public native String toDateString();
public native String toGMTString();
public native String toISOString();
public native String toJSON();
public native String toJSON(@Nullable Object ignoredKey);
public native String toLocaleDateString();
@JsOverlay
public final String toLocaleDateString(JsArray<String> locales,@Nullable JsObject options){
return toLocaleDateString(Js.<JsDate.@Nullable ToLocaleDateStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleDateString(JsArray<String> locales,@Nullable Object options){
return toLocaleDateString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleDateString(JsArray<String> locales){
return toLocaleDateString(Js.<JsDate.@Nullable ToLocaleDateStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleDateString(String locales,@Nullable JsObject options){
return toLocaleDateString(Js.<JsDate.@Nullable ToLocaleDateStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleDateString(String[] locales,@Nullable JsObject options){
return toLocaleDateString(Js.<JsArray<String>>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleDateString(String locales,@Nullable Object options){
return toLocaleDateString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleDateString(String[] locales,@Nullable Object options){
return toLocaleDateString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleDateString(String locales){
return toLocaleDateString(Js.<JsDate.@Nullable ToLocaleDateStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleDateString(String[] locales){
return toLocaleDateString(Js.<JsArray<String>>uncheckedCast(locales));
}
public native String toLocaleDateString(JsDate.@Nullable ToLocaleDateStringLocalesUnionType locales,@Nullable JsObject options);
@JsOverlay
public final String toLocaleDateString(JsDate.@Nullable ToLocaleDateStringLocalesUnionType locales,@Nullable Object options){
return toLocaleDateString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
public native String toLocaleDateString(JsDate.@Nullable ToLocaleDateStringLocalesUnionType locales);
public native String toLocaleFormat(String formatString);
public native String toLocaleString();
@JsOverlay
public final String toLocaleString(JsArray<String> locales,@Nullable JsObject options){
return toLocaleString(Js.<JsDate.@Nullable ToLocaleStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleString(JsArray<String> locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleString(JsArray<String> locales){
return toLocaleString(Js.<JsDate.@Nullable ToLocaleStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleString(String locales,@Nullable JsObject options){
return toLocaleString(Js.<JsDate.@Nullable ToLocaleStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleString(String[] locales,@Nullable JsObject options){
return toLocaleString(Js.<JsArray<String>>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleString(String locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleString(String[] locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleString(String locales){
return toLocaleString(Js.<JsDate.@Nullable ToLocaleStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleString(String[] locales){
return toLocaleString(Js.<JsArray<String>>uncheckedCast(locales));
}
public native String toLocaleString(JsDate.@Nullable ToLocaleStringLocalesUnionType locales,@Nullable JsObject options);
@JsOverlay
public final String toLocaleString(JsDate.@Nullable ToLocaleStringLocalesUnionType locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
public native String toLocaleString(JsDate.@Nullable ToLocaleStringLocalesUnionType locales);
public native String toLocaleTimeString();
@JsOverlay
public final String toLocaleTimeString(JsArray<String> locales,@Nullable JsObject options){
return toLocaleTimeString(Js.<JsDate.@Nullable ToLocaleTimeStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleTimeString(JsArray<String> locales,@Nullable Object options){
return toLocaleTimeString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleTimeString(JsArray<String> locales){
return toLocaleTimeString(Js.<JsDate.@Nullable ToLocaleTimeStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleTimeString(String locales,@Nullable JsObject options){
return toLocaleTimeString(Js.<JsDate.@Nullable ToLocaleTimeStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleTimeString(String[] locales,@Nullable JsObject options){
return toLocaleTimeString(Js.<JsArray<String>>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleTimeString(String locales,@Nullable Object options){
return toLocaleTimeString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleTimeString(String[] locales,@Nullable Object options){
return toLocaleTimeString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleTimeString(String locales){
return toLocaleTimeString(Js.<JsDate.@Nullable ToLocaleTimeStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleTimeString(String[] locales){
return toLocaleTimeString(Js.<JsArray<String>>uncheckedCast(locales));
}
public native String toLocaleTimeString(JsDate.@Nullable ToLocaleTimeStringLocalesUnionType locales,@Nullable JsObject options);
@JsOverlay
public final String toLocaleTimeString(JsDate.@Nullable ToLocaleTimeStringLocalesUnionType locales,@Nullable Object options){
return toLocaleTimeString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
public native String toLocaleTimeString(JsDate.@Nullable ToLocaleTimeStringLocalesUnionType locales);
public native String toSource();
@JsMethod(name = "toString")
public native String toString_();
public native String toTimeString();
public native String toUTCString();
public native double valueOf();
}

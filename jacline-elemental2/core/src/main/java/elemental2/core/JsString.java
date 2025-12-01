package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsMethod;
import elemental2.core.JsRegExp;
import elemental2.core.JsArray;
import elemental2.core.ITemplateArray;
import elemental2.core.RegExpResult;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
import elemental2.core.JsObject;
@JsType(isNative = true,name = "String",namespace = JsPackage.GLOBAL)
public class JsString implements JsIterable<String, @Nullable Object, @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface LocaleCompareLocalesUnionType{
@JsOverlay
static JsString.@Nullable LocaleCompareLocalesUnionType of(@Nullable Object o){
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
public interface MatchAllRegexpUnionType{
@JsOverlay
static JsString.MatchAllRegexpUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsRegExp asJsRegExp(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsRegExp(){
return (Object)this instanceof JsRegExp;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsFunction
public interface ReplaceAllReplacementFn{
@Nullable Object onInvoke(String p0,@Nullable Object... p1);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ReplaceAllReplacementUnionType{
@JsOverlay
static JsString.@Nullable ReplaceAllReplacementUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default JsString.@Nullable ReplaceAllReplacementFn asReplaceAllReplacementFn(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isReplaceAllReplacementFn(){
return (Object)this instanceof JsString.ReplaceAllReplacementFn;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ReplaceAllSearchValueUnionType{
@JsOverlay
static JsString.ReplaceAllSearchValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsRegExp asJsRegExp(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsRegExp(){
return (Object)this instanceof JsRegExp;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ReplacePatternUnionType{
@JsOverlay
static JsString.@Nullable ReplacePatternUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsRegExp asJsRegExp(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsRegExp(){
return (Object)this instanceof JsRegExp;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsFunction
public interface ReplaceReplacementFn{
@Nullable Object onInvoke(String p0,@Nullable Object... p1);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ReplaceReplacementUnionType{
@JsOverlay
static JsString.@Nullable ReplaceReplacementUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default JsString.@Nullable ReplaceReplacementFn asReplaceReplacementFn(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isReplaceReplacementFn(){
return (Object)this instanceof JsString.ReplaceReplacementFn;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SearchPatternUnionType{
@JsOverlay
static JsString.@Nullable SearchPatternUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsRegExp asJsRegExp(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsRegExp(){
return (Object)this instanceof JsRegExp;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ToLocaleLowerCaseLocalesUnionType{
@JsOverlay
static JsString.@Nullable ToLocaleLowerCaseLocalesUnionType of(@Nullable Object o){
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
public interface ToLocaleUpperCaseLocalesUnionType{
@JsOverlay
static JsString.@Nullable ToLocaleUpperCaseLocalesUnionType of(@Nullable Object o){
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
public static native String fromCharCode(int... var_args);
public static native String fromCodePoint(int codePoint,int... var_args);
public static native String raw(ITemplateArray template,@Nullable Object... var_args);
public int length;
public JsString(){}
public JsString(@Nullable Object str){}
public native String anchor();
public native String at(int index);
public native String big();
public native String blink();
public native String bold();
public native String charAt(int index);
public native int charCodeAt();
public native int charCodeAt(int index);
public native int codePointAt(int index);
public native String concat(@Nullable Object... var_args);
public native boolean endsWith(String searchString,int position);
public native boolean endsWith(String searchString);
public native String fixed();
public native String fontcolor(String color);
public native String fontsize(int size);
public native boolean includes(String searchString,int position);
public native boolean includes(String searchString);
public native int indexOf(@Nullable String searchValue,int fromIndex);
public native int indexOf(@Nullable String searchValue);
public native String italics();
public native int lastIndexOf(@Nullable String searchValue,int fromIndex);
public native int lastIndexOf(@Nullable String searchValue);
public native String link(String hrefAttribute);
@JsOverlay
public final int localeCompare(@Nullable String compareString,JsArray<String> locales,@Nullable JsObject options){
return localeCompare(compareString,Js.<JsString.@Nullable LocaleCompareLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final int localeCompare(@Nullable String compareString,JsArray<String> locales,@Nullable Object options){
return localeCompare(compareString,locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final int localeCompare(@Nullable String compareString,JsArray<String> locales){
return localeCompare(compareString,Js.<JsString.@Nullable LocaleCompareLocalesUnionType>uncheckedCast(locales));
}
public native int localeCompare(@Nullable String compareString,JsString.@Nullable LocaleCompareLocalesUnionType locales,@Nullable JsObject options);
@JsOverlay
public final int localeCompare(@Nullable String compareString,JsString.@Nullable LocaleCompareLocalesUnionType locales,@Nullable Object options){
return localeCompare(compareString,locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
public native int localeCompare(@Nullable String compareString,JsString.@Nullable LocaleCompareLocalesUnionType locales);
@JsOverlay
public final int localeCompare(@Nullable String compareString,String locales,@Nullable JsObject options){
return localeCompare(compareString,Js.<JsString.@Nullable LocaleCompareLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final int localeCompare(@Nullable String compareString,String[] locales,@Nullable JsObject options){
return localeCompare(compareString,Js.<JsArray<String>>uncheckedCast(locales),options);
}
@JsOverlay
public final int localeCompare(@Nullable String compareString,String locales,@Nullable Object options){
return localeCompare(compareString,locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final int localeCompare(@Nullable String compareString,String[] locales,@Nullable Object options){
return localeCompare(compareString,locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final int localeCompare(@Nullable String compareString,String locales){
return localeCompare(compareString,Js.<JsString.@Nullable LocaleCompareLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final int localeCompare(@Nullable String compareString,String[] locales){
return localeCompare(compareString,Js.<JsArray<String>>uncheckedCast(locales));
}
public native int localeCompare(@Nullable String compareString);
public native @Nullable RegExpResult match(@Nullable Object regexp);
@JsOverlay
public final JsIteratorIterable<RegExpResult, @Nullable Object, @Nullable Object> matchAll(JsRegExp regexp){
return matchAll(Js.<JsString.MatchAllRegexpUnionType>uncheckedCast(regexp));
}
public native JsIteratorIterable<RegExpResult, @Nullable Object, @Nullable Object> matchAll(JsString.MatchAllRegexpUnionType regexp);
@JsOverlay
public final JsIteratorIterable<RegExpResult, @Nullable Object, @Nullable Object> matchAll(String regexp){
return matchAll(Js.<JsString.MatchAllRegexpUnionType>uncheckedCast(regexp));
}
public native String normalize();
public native String normalize(String form);
public native String padEnd(int targetLength,String padString);
public native String padEnd(int targetLength);
public native String padStart(int targetLength,String padString);
public native String padStart(int targetLength);
public native String quote();
public native String repeat(int count);
@JsOverlay
public final String replace(JsRegExp pattern,JsString.ReplaceReplacementFn replacement){
return replace(Js.<JsString.@Nullable ReplacePatternUnionType>uncheckedCast(pattern),Js.<JsString.@Nullable ReplaceReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replace(JsRegExp pattern,JsString.@Nullable ReplaceReplacementUnionType replacement){
return replace(Js.<JsString.@Nullable ReplacePatternUnionType>uncheckedCast(pattern),replacement);
}
@JsOverlay
public final String replace(JsRegExp pattern,String replacement){
return replace(Js.<JsString.@Nullable ReplacePatternUnionType>uncheckedCast(pattern),Js.<JsString.@Nullable ReplaceReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replace(JsString.@Nullable ReplacePatternUnionType pattern,JsString.ReplaceReplacementFn replacement){
return replace(pattern,Js.<JsString.@Nullable ReplaceReplacementUnionType>uncheckedCast(replacement));
}
public native String replace(JsString.@Nullable ReplacePatternUnionType pattern,JsString.@Nullable ReplaceReplacementUnionType replacement);
@JsOverlay
public final String replace(JsString.@Nullable ReplacePatternUnionType pattern,String replacement){
return replace(pattern,Js.<JsString.@Nullable ReplaceReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replace(String pattern,JsString.ReplaceReplacementFn replacement){
return replace(Js.<JsString.@Nullable ReplacePatternUnionType>uncheckedCast(pattern),Js.<JsString.@Nullable ReplaceReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replace(String pattern,JsString.@Nullable ReplaceReplacementUnionType replacement){
return replace(Js.<JsString.@Nullable ReplacePatternUnionType>uncheckedCast(pattern),replacement);
}
@JsOverlay
public final String replace(String pattern,String replacement){
return replace(Js.<JsString.@Nullable ReplacePatternUnionType>uncheckedCast(pattern),Js.<JsString.@Nullable ReplaceReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replaceAll(JsRegExp searchValue,JsString.ReplaceAllReplacementFn replacement){
return replaceAll(Js.<JsString.ReplaceAllSearchValueUnionType>uncheckedCast(searchValue),Js.<JsString.@Nullable ReplaceAllReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replaceAll(JsRegExp searchValue,JsString.@Nullable ReplaceAllReplacementUnionType replacement){
return replaceAll(Js.<JsString.ReplaceAllSearchValueUnionType>uncheckedCast(searchValue),replacement);
}
@JsOverlay
public final String replaceAll(JsRegExp searchValue,String replacement){
return replaceAll(Js.<JsString.ReplaceAllSearchValueUnionType>uncheckedCast(searchValue),Js.<JsString.@Nullable ReplaceAllReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replaceAll(JsString.ReplaceAllSearchValueUnionType searchValue,JsString.ReplaceAllReplacementFn replacement){
return replaceAll(searchValue,Js.<JsString.@Nullable ReplaceAllReplacementUnionType>uncheckedCast(replacement));
}
public native String replaceAll(JsString.ReplaceAllSearchValueUnionType searchValue,JsString.@Nullable ReplaceAllReplacementUnionType replacement);
@JsOverlay
public final String replaceAll(JsString.ReplaceAllSearchValueUnionType searchValue,String replacement){
return replaceAll(searchValue,Js.<JsString.@Nullable ReplaceAllReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replaceAll(String searchValue,JsString.ReplaceAllReplacementFn replacement){
return replaceAll(Js.<JsString.ReplaceAllSearchValueUnionType>uncheckedCast(searchValue),Js.<JsString.@Nullable ReplaceAllReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final String replaceAll(String searchValue,JsString.@Nullable ReplaceAllReplacementUnionType replacement){
return replaceAll(Js.<JsString.ReplaceAllSearchValueUnionType>uncheckedCast(searchValue),replacement);
}
@JsOverlay
public final String replaceAll(String searchValue,String replacement){
return replaceAll(Js.<JsString.ReplaceAllSearchValueUnionType>uncheckedCast(searchValue),Js.<JsString.@Nullable ReplaceAllReplacementUnionType>uncheckedCast(replacement));
}
@JsOverlay
public final int search(JsRegExp pattern){
return search(Js.<JsString.@Nullable SearchPatternUnionType>uncheckedCast(pattern));
}
public native int search(JsString.@Nullable SearchPatternUnionType pattern);
@JsOverlay
public final int search(String pattern){
return search(Js.<JsString.@Nullable SearchPatternUnionType>uncheckedCast(pattern));
}
public native String slice(int begin,int end);
public native String slice(int begin);
public native String small();
public native JsArray<String> split();
public native JsArray<String> split(@Nullable Object separator,int limit);
public native JsArray<String> split(@Nullable Object separator);
public native boolean startsWith(String searchString,int position);
public native boolean startsWith(String searchString);
public native String strike();
public native String sub();
public native String substr(int start,int length);
public native String substr(int start);
public native String substring(int start,int end);
public native String substring(int start);
public native String sup();
public native String toLocaleLowerCase();
@JsOverlay
public final String toLocaleLowerCase(JsArray<String> locales){
return toLocaleLowerCase(Js.<JsString.@Nullable ToLocaleLowerCaseLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleLowerCase(String locales){
return toLocaleLowerCase(Js.<JsString.@Nullable ToLocaleLowerCaseLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleLowerCase(String[] locales){
return toLocaleLowerCase(Js.<JsArray<String>>uncheckedCast(locales));
}
public native String toLocaleLowerCase(JsString.@Nullable ToLocaleLowerCaseLocalesUnionType locales);
public native String toLocaleUpperCase();
@JsOverlay
public final String toLocaleUpperCase(JsArray<String> locales){
return toLocaleUpperCase(Js.<JsString.@Nullable ToLocaleUpperCaseLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleUpperCase(String locales){
return toLocaleUpperCase(Js.<JsString.@Nullable ToLocaleUpperCaseLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleUpperCase(String[] locales){
return toLocaleUpperCase(Js.<JsArray<String>>uncheckedCast(locales));
}
public native String toLocaleUpperCase(JsString.@Nullable ToLocaleUpperCaseLocalesUnionType locales);
public native String toLowerCase();
public native String toSource();
@JsMethod(name = "toString")
public native String toString_();
public native String toUpperCase();
public native String trim();
public native String trimEnd();
public native String trimLeft();
public native String trimRight();
public native String trimStart();
public native String valueOf();
}

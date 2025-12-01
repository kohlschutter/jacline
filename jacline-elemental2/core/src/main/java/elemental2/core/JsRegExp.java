package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.RegExpResult;
import java.lang.Deprecated;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "RegExp",namespace = JsPackage.GLOBAL)
public class JsRegExp{
public static String $1;
public static String $2;
public static String $3;
public static String $4;
public static String $5;
public static String $6;
public static String $7;
public static String $8;
public static String $9;
public static String input;
public static String lastMatch;
public static String lastParen;
public static String leftContext;
public static String rightContext;
public boolean dotAll;
public String flags;
public boolean global;
public boolean ignoreCase;
public int lastIndex;
public boolean multiline;
public String source;
public boolean sticky;
public boolean unicode;
public JsRegExp(){}
public JsRegExp(@Nullable Object pattern,@Nullable Object flags){}
public JsRegExp(@Nullable Object pattern){}
@Deprecated
public native void compile(String pattern,@Nullable Object flags);
@Deprecated
public native void compile(String pattern);
public native @Nullable RegExpResult exec(String str);
public native boolean test(String str);
@JsMethod(name = "toString")
public native String toString_();
}

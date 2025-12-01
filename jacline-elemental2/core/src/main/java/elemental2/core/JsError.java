package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.core.Function;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,name = "Error",namespace = JsPackage.GLOBAL)
public class JsError{
public static double stackTraceLimit;
public static native void captureStackTrace(@Nullable JsObject error,@Nullable Function constructor);
public static native void captureStackTrace(@Nullable JsObject error);
@JsOverlay
public static final void captureStackTrace(@Nullable Object error,@Nullable Function constructor){
captureStackTrace(Js.<@Nullable JsObject>uncheckedCast(error),constructor);
}
@JsOverlay
public static final void captureStackTrace(@Nullable Object error){
captureStackTrace(Js.<@Nullable JsObject>uncheckedCast(error));
}
public @Nullable Object cause;
public String description;
public String fileName;
public double lineNumber;
public String message;
public String name;
public @Nullable Object sourceURL;
public String stack;
public JsError(){}
public JsError(@Nullable Object message,@Nullable Object fileNameOrOptions,@Nullable Object line){}
public JsError(@Nullable Object message,@Nullable Object fileNameOrOptions){}
public JsError(@Nullable Object message){}
}

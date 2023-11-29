package elemental2.core;
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
public static native void captureStackTrace(JsObject error,Function constructor);
public static native void captureStackTrace(JsObject error);
@JsOverlay
public static final void captureStackTrace(Object error,Function constructor){
captureStackTrace(Js.<JsObject>uncheckedCast(error),constructor);
}
@JsOverlay
public static final void captureStackTrace(Object error){
captureStackTrace(Js.<JsObject>uncheckedCast(error));
}
public JsError cause;
public String description;
public String fileName;
public double lineNumber;
public String message;
public String name;
public Object sourceURL;
public String stack;
public JsError(){}
public JsError(Object message,Object fileNameOrOptions,Object line){}
public JsError(Object message,Object fileNameOrOptions){}
public JsError(Object message){}
}

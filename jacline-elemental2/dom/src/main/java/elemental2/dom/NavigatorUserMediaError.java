package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.Deprecated;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NavigatorUserMediaError{
@Deprecated
@JsProperty
double getCode();
@JsProperty
String getConstraintName();
@JsProperty
String getMessage();
@JsProperty
String getName();
@Deprecated
@JsProperty(name = "PERMISSION_DENIED")
double getPERMISSION_DENIED();
@Deprecated
@JsProperty
void setCode(double code);
@JsProperty
void setConstraintName(String constraintName);
@JsProperty
void setMessage(String message);
@JsProperty
void setName(String name);
}

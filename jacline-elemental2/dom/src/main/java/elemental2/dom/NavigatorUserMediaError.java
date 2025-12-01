package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
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
@Nullable String getConstraintName();
@JsProperty
@Nullable String getMessage();
@JsProperty
String getName();
@Deprecated
@JsProperty(name = "PERMISSION_DENIED")
double getPERMISSION_DENIED();
@Deprecated
@JsProperty
void setCode(double code);
@JsProperty
void setConstraintName(@Nullable String constraintName);
@JsProperty
void setMessage(@Nullable String message);
@JsProperty
void setName(String name);
}

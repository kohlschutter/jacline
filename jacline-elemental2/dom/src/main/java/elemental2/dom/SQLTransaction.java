package elemental2.dom;
import elemental2.dom.SQLStatementCallback;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsArray;
import elemental2.dom.SQLError;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SQLTransaction{
@JsFunction
public interface ExecuteSqlErrorCallbackFn{
boolean onInvoke(SQLTransaction p0,SQLError p1);
}
public native void executeSql(String sqlStatement,@Nullable JsArray<@Nullable Object> queryArgs,SQLStatementCallback callback,SQLTransaction.ExecuteSqlErrorCallbackFn errorCallback);
public native void executeSql(String sqlStatement,@Nullable JsArray<@Nullable Object> queryArgs,SQLStatementCallback callback);
public native void executeSql(String sqlStatement,@Nullable JsArray<@Nullable Object> queryArgs);
@JsOverlay
public final void executeSql(String sqlStatement,@Nullable Object@Nullable [] queryArgs,SQLStatementCallback callback,SQLTransaction.ExecuteSqlErrorCallbackFn errorCallback){
executeSql(sqlStatement,Js.<@Nullable JsArray<@Nullable Object>>uncheckedCast(queryArgs),callback,errorCallback);
}
@JsOverlay
public final void executeSql(String sqlStatement,@Nullable Object@Nullable [] queryArgs,SQLStatementCallback callback){
executeSql(sqlStatement,Js.<@Nullable JsArray<@Nullable Object>>uncheckedCast(queryArgs),callback);
}
@JsOverlay
public final void executeSql(String sqlStatement,@Nullable Object@Nullable [] queryArgs){
executeSql(sqlStatement,Js.<@Nullable JsArray<@Nullable Object>>uncheckedCast(queryArgs));
}
public native void executeSql(String sqlStatement);
}

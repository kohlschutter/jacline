package elemental2.dom;
import elemental2.dom.SQLStatementCallback;
import elemental2.dom.SQLError;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SQLTransaction{
@JsFunction
public interface ExecuteSqlErrorCallbackFn{
boolean onInvoke(SQLTransaction p0,SQLError p1);
}
public native void executeSql(String sqlStatement,JsArray<Object> queryArgs,SQLStatementCallback callback,SQLTransaction.ExecuteSqlErrorCallbackFn errorCallback);
public native void executeSql(String sqlStatement,JsArray<Object> queryArgs,SQLStatementCallback callback);
public native void executeSql(String sqlStatement,JsArray<Object> queryArgs);
@JsOverlay
public final void executeSql(String sqlStatement,Object[] queryArgs,SQLStatementCallback callback,SQLTransaction.ExecuteSqlErrorCallbackFn errorCallback){
executeSql(sqlStatement,Js.<JsArray<Object>>uncheckedCast(queryArgs),callback,errorCallback);
}
@JsOverlay
public final void executeSql(String sqlStatement,Object[] queryArgs,SQLStatementCallback callback){
executeSql(sqlStatement,Js.<JsArray<Object>>uncheckedCast(queryArgs),callback);
}
@JsOverlay
public final void executeSql(String sqlStatement,Object[] queryArgs){
executeSql(sqlStatement,Js.<JsArray<Object>>uncheckedCast(queryArgs));
}
public native void executeSql(String sqlStatement);
}

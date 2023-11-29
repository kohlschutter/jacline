package elemental2.dom;
import elemental2.dom.SQLError;
import jsinterop.annotations.JsFunction;
import elemental2.dom.SQLTransaction;
import elemental2.core.Function;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Database{
@JsFunction
public interface ChangeVersionCallbackFn{
void onInvoke(SQLTransaction p0);
}
@JsFunction
public interface ChangeVersionErrorCallbackFn{
void onInvoke(SQLError p0);
}
@JsFunction
public interface ReadTransactionCallbackFn{
void onInvoke(SQLTransaction p0);
}
@JsFunction
public interface ReadTransactionErrorCallbackFn{
void onInvoke(SQLError p0);
}
@JsFunction
public interface TransactionCallbackFn{
void onInvoke(SQLTransaction p0);
}
@JsFunction
public interface TransactionErrorCallbackFn{
void onInvoke(SQLError p0);
}
public String version;
public native void changeVersion(String oldVersion,String newVersion,Database.ChangeVersionCallbackFn callback,Database.ChangeVersionErrorCallbackFn errorCallback,Function successCallback);
public native void readTransaction(Database.ReadTransactionCallbackFn callback,Database.ReadTransactionErrorCallbackFn errorCallback,Function Callback);
public native void readTransaction(Database.ReadTransactionCallbackFn callback,Database.ReadTransactionErrorCallbackFn errorCallback);
public native void readTransaction(Database.ReadTransactionCallbackFn callback);
public native void transaction(Database.TransactionCallbackFn callback,Database.TransactionErrorCallbackFn errorCallback,Function Callback);
public native void transaction(Database.TransactionCallbackFn callback,Database.TransactionErrorCallbackFn errorCallback);
public native void transaction(Database.TransactionCallbackFn callback);
}

package elemental2.dom;
import jsinterop.annotations.JsFunction;
import elemental2.dom.SQLTransaction;
import elemental2.dom.SQLResultSet;
@JsFunction
public interface SQLStatementCallback{
void onInvoke(SQLTransaction p0,SQLResultSet p1);
}

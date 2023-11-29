package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WorkerLocation{
@JsProperty
String getHash();
@JsProperty
String getHost();
@JsProperty
String getHostname();
@JsProperty
String getHref();
@JsProperty
String getOrigin();
@JsProperty
String getPathname();
@JsProperty
String getPort();
@JsProperty
String getProtocol();
@JsProperty
String getSearch();
@JsProperty
void setHash(String hash);
@JsProperty
void setHost(String host);
@JsProperty
void setHostname(String hostname);
@JsProperty
void setHref(String href);
@JsProperty
void setOrigin(String origin);
@JsProperty
void setPathname(String pathname);
@JsProperty
void setPort(String port);
@JsProperty
void setProtocol(String protocol);
@JsProperty
void setSearch(String search);
}

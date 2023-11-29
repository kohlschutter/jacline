package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SecurityPolicyViolationEventInit extends EventInit{
@JsOverlay
static SecurityPolicyViolationEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getBlockedURI();
@JsProperty
int getColumnNumber();
@JsProperty
String getDisposition();
@JsProperty
String getDocumentURI();
@JsProperty
String getEffectiveDirective();
@JsProperty
int getLineNumber();
@JsProperty
String getOriginalPolicy();
@JsProperty
String getReferrer();
@JsProperty
String getSample();
@JsProperty
String getSourceFile();
@JsProperty
int getStatusCode();
@JsProperty
String getViolatedDirective();
@JsProperty
void setBlockedURI(String blockedURI);
@JsProperty
void setColumnNumber(int columnNumber);
@JsProperty
void setDisposition(String disposition);
@JsProperty
void setDocumentURI(String documentURI);
@JsProperty
void setEffectiveDirective(String effectiveDirective);
@JsProperty
void setLineNumber(int lineNumber);
@JsProperty
void setOriginalPolicy(String originalPolicy);
@JsProperty
void setReferrer(String referrer);
@JsProperty
void setSample(String sample);
@JsProperty
void setSourceFile(String sourceFile);
@JsProperty
void setStatusCode(int statusCode);
@JsProperty
void setViolatedDirective(String violatedDirective);
}

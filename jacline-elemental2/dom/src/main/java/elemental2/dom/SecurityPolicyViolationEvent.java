package elemental2.dom;
import elemental2.dom.Event;
import elemental2.dom.SecurityPolicyViolationEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SecurityPolicyViolationEvent extends Event{
public String blockedURI;
public int columnNumber;
public String disposition;
public String documentURI;
public String effectiveDirective;
public int lineNumber;
public String originalPolicy;
public String referrer;
public String sample;
public String sourceFile;
public int statusCode;
public String violatedDirective;
public SecurityPolicyViolationEvent(String type,SecurityPolicyViolationEventInit securityPolicyViolationEventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public SecurityPolicyViolationEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}

package elemental2.webcrypto.webcrypto;
import elemental2.webcrypto.webcrypto.RsaOtherPrimesInfo;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,name = "webCrypto.JsonWebKey",namespace = JsPackage.GLOBAL)
public class JsonWebKey{
public String alg;
public String crv;
public String d;
public String dp;
public String dq;
public String e;
public boolean ext;
public String k;
public JsArray<String> key_ops;
public String kty;
public String n;
public JsArray<RsaOtherPrimesInfo> oth;
public String p;
public String q;
public String qi;
public String use;
public String x;
public String y;
}

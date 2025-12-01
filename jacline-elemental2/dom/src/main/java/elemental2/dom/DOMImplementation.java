package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DocumentType;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.HTMLDocument;
import elemental2.dom.Document;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMImplementation{
public native @Nullable Document createDocument(@Nullable String namespaceURI,String publicId,@Nullable DocumentType doctype);
public native @Nullable Document createDocument(@Nullable String namespaceURI,String publicId);
public native @Nullable DocumentType createDocumentType(String qualifiedName,String publicId,String systemId);
public native HTMLDocument createHTMLDocument();
public native HTMLDocument createHTMLDocument(String title);
public native boolean hasFeature(String feature,String version);
}

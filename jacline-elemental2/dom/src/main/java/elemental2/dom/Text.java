package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.CharacterData;
import elemental2.dom.Node;
import elemental2.dom.NodeList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Text extends CharacterData{
public String wholeText;
public Text(){}
public Text(String contents){}
public native NodeList<Node> getDestinationInsertionPoints();
public native @Nullable Text splitText(int offset);
}

package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.dom.FontFace;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FontFaceSetLoadEventInit{
@JsOverlay
static FontFaceSetLoadEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable JsArray<FontFace> getFontfaces();
@JsOverlay
default void setFontfaces(FontFace@Nullable [] fontfaces){
setFontfaces(Js.<@Nullable JsArray<FontFace>>uncheckedCast(fontfaces));
}
@JsProperty
void setFontfaces(@Nullable JsArray<FontFace> fontfaces);
}

package elemental2.svg;
import elemental2.svg.SVGUseElement;
import elemental2.dom.Event;
import elemental2.core.JsArray;
import elemental2.svg.SVGElementInstanceList;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.svg.SVGElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SVGElementInstance implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ChildNodesUnionType{
@JsOverlay
static SVGElementInstance.ChildNodesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<SVGElementInstance> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstanceList asSVGElementInstanceList(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isSVGElementInstanceList(){
return (Object)this instanceof SVGElementInstanceList;
}
}
@JsFunction
public interface OnabortFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnabortUnionType{
@JsOverlay
static SVGElementInstance.OnabortUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnabortFn asOnabortFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnabortFn(){
return (Object)this instanceof SVGElementInstance.OnabortFn;
}
}
@JsFunction
public interface OnbeforecopyFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnbeforecopyUnionType{
@JsOverlay
static SVGElementInstance.OnbeforecopyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnbeforecopyFn asOnbeforecopyFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnbeforecopyFn(){
return (Object)this instanceof SVGElementInstance.OnbeforecopyFn;
}
}
@JsFunction
public interface OnbeforecutFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnbeforecutUnionType{
@JsOverlay
static SVGElementInstance.OnbeforecutUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnbeforecutFn asOnbeforecutFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnbeforecutFn(){
return (Object)this instanceof SVGElementInstance.OnbeforecutFn;
}
}
@JsFunction
public interface OnbeforepasteFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnbeforepasteUnionType{
@JsOverlay
static SVGElementInstance.OnbeforepasteUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnbeforepasteFn asOnbeforepasteFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnbeforepasteFn(){
return (Object)this instanceof SVGElementInstance.OnbeforepasteFn;
}
}
@JsFunction
public interface OnblurFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnblurUnionType{
@JsOverlay
static SVGElementInstance.OnblurUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnblurFn asOnblurFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnblurFn(){
return (Object)this instanceof SVGElementInstance.OnblurFn;
}
}
@JsFunction
public interface OnchangeFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnchangeUnionType{
@JsOverlay
static SVGElementInstance.OnchangeUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnchangeFn asOnchangeFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnchangeFn(){
return (Object)this instanceof SVGElementInstance.OnchangeFn;
}
}
@JsFunction
public interface OnclickFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnclickUnionType{
@JsOverlay
static SVGElementInstance.OnclickUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnclickFn asOnclickFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnclickFn(){
return (Object)this instanceof SVGElementInstance.OnclickFn;
}
}
@JsFunction
public interface OncontextmenuFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OncontextmenuUnionType{
@JsOverlay
static SVGElementInstance.OncontextmenuUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OncontextmenuFn asOncontextmenuFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOncontextmenuFn(){
return (Object)this instanceof SVGElementInstance.OncontextmenuFn;
}
}
@JsFunction
public interface OncopyFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OncopyUnionType{
@JsOverlay
static SVGElementInstance.OncopyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OncopyFn asOncopyFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOncopyFn(){
return (Object)this instanceof SVGElementInstance.OncopyFn;
}
}
@JsFunction
public interface OncutFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OncutUnionType{
@JsOverlay
static SVGElementInstance.OncutUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OncutFn asOncutFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOncutFn(){
return (Object)this instanceof SVGElementInstance.OncutFn;
}
}
@JsFunction
public interface OndblclickFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndblclickUnionType{
@JsOverlay
static SVGElementInstance.OndblclickUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndblclickFn asOndblclickFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndblclickFn(){
return (Object)this instanceof SVGElementInstance.OndblclickFn;
}
}
@JsFunction
public interface OndragFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndragUnionType{
@JsOverlay
static SVGElementInstance.OndragUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndragFn asOndragFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndragFn(){
return (Object)this instanceof SVGElementInstance.OndragFn;
}
}
@JsFunction
public interface OndragendFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndragendUnionType{
@JsOverlay
static SVGElementInstance.OndragendUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndragendFn asOndragendFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndragendFn(){
return (Object)this instanceof SVGElementInstance.OndragendFn;
}
}
@JsFunction
public interface OndragenterFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndragenterUnionType{
@JsOverlay
static SVGElementInstance.OndragenterUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndragenterFn asOndragenterFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndragenterFn(){
return (Object)this instanceof SVGElementInstance.OndragenterFn;
}
}
@JsFunction
public interface OndragleaveFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndragleaveUnionType{
@JsOverlay
static SVGElementInstance.OndragleaveUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndragleaveFn asOndragleaveFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndragleaveFn(){
return (Object)this instanceof SVGElementInstance.OndragleaveFn;
}
}
@JsFunction
public interface OndragoverFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndragoverUnionType{
@JsOverlay
static SVGElementInstance.OndragoverUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndragoverFn asOndragoverFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndragoverFn(){
return (Object)this instanceof SVGElementInstance.OndragoverFn;
}
}
@JsFunction
public interface OndragstartFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndragstartUnionType{
@JsOverlay
static SVGElementInstance.OndragstartUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndragstartFn asOndragstartFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndragstartFn(){
return (Object)this instanceof SVGElementInstance.OndragstartFn;
}
}
@JsFunction
public interface OndropFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OndropUnionType{
@JsOverlay
static SVGElementInstance.OndropUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OndropFn asOndropFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOndropFn(){
return (Object)this instanceof SVGElementInstance.OndropFn;
}
}
@JsFunction
public interface OnerrorFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnerrorUnionType{
@JsOverlay
static SVGElementInstance.OnerrorUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnerrorFn asOnerrorFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnerrorFn(){
return (Object)this instanceof SVGElementInstance.OnerrorFn;
}
}
@JsFunction
public interface OnfocusFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnfocusUnionType{
@JsOverlay
static SVGElementInstance.OnfocusUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnfocusFn asOnfocusFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnfocusFn(){
return (Object)this instanceof SVGElementInstance.OnfocusFn;
}
}
@JsFunction
public interface OninputFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OninputUnionType{
@JsOverlay
static SVGElementInstance.OninputUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OninputFn asOninputFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOninputFn(){
return (Object)this instanceof SVGElementInstance.OninputFn;
}
}
@JsFunction
public interface OnkeydownFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnkeydownUnionType{
@JsOverlay
static SVGElementInstance.OnkeydownUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnkeydownFn asOnkeydownFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnkeydownFn(){
return (Object)this instanceof SVGElementInstance.OnkeydownFn;
}
}
@JsFunction
public interface OnkeypressFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnkeypressUnionType{
@JsOverlay
static SVGElementInstance.OnkeypressUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnkeypressFn asOnkeypressFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnkeypressFn(){
return (Object)this instanceof SVGElementInstance.OnkeypressFn;
}
}
@JsFunction
public interface OnkeyupFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnkeyupUnionType{
@JsOverlay
static SVGElementInstance.OnkeyupUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnkeyupFn asOnkeyupFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnkeyupFn(){
return (Object)this instanceof SVGElementInstance.OnkeyupFn;
}
}
@JsFunction
public interface OnloadFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnloadUnionType{
@JsOverlay
static SVGElementInstance.OnloadUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnloadFn asOnloadFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnloadFn(){
return (Object)this instanceof SVGElementInstance.OnloadFn;
}
}
@JsFunction
public interface OnmousedownFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnmousedownUnionType{
@JsOverlay
static SVGElementInstance.OnmousedownUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnmousedownFn asOnmousedownFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnmousedownFn(){
return (Object)this instanceof SVGElementInstance.OnmousedownFn;
}
}
@JsFunction
public interface OnmousemoveFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnmousemoveUnionType{
@JsOverlay
static SVGElementInstance.OnmousemoveUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnmousemoveFn asOnmousemoveFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnmousemoveFn(){
return (Object)this instanceof SVGElementInstance.OnmousemoveFn;
}
}
@JsFunction
public interface OnmouseoutFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnmouseoutUnionType{
@JsOverlay
static SVGElementInstance.OnmouseoutUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnmouseoutFn asOnmouseoutFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnmouseoutFn(){
return (Object)this instanceof SVGElementInstance.OnmouseoutFn;
}
}
@JsFunction
public interface OnmouseoverFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnmouseoverUnionType{
@JsOverlay
static SVGElementInstance.OnmouseoverUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnmouseoverFn asOnmouseoverFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnmouseoverFn(){
return (Object)this instanceof SVGElementInstance.OnmouseoverFn;
}
}
@JsFunction
public interface OnmouseupFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnmouseupUnionType{
@JsOverlay
static SVGElementInstance.OnmouseupUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnmouseupFn asOnmouseupFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnmouseupFn(){
return (Object)this instanceof SVGElementInstance.OnmouseupFn;
}
}
@JsFunction
public interface OnmousewheelFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnmousewheelUnionType{
@JsOverlay
static SVGElementInstance.OnmousewheelUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnmousewheelFn asOnmousewheelFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnmousewheelFn(){
return (Object)this instanceof SVGElementInstance.OnmousewheelFn;
}
}
@JsFunction
public interface OnpasteFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnpasteUnionType{
@JsOverlay
static SVGElementInstance.OnpasteUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnpasteFn asOnpasteFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnpasteFn(){
return (Object)this instanceof SVGElementInstance.OnpasteFn;
}
}
@JsFunction
public interface OnresetFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnresetUnionType{
@JsOverlay
static SVGElementInstance.OnresetUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnresetFn asOnresetFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnresetFn(){
return (Object)this instanceof SVGElementInstance.OnresetFn;
}
}
@JsFunction
public interface OnresizeFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnresizeUnionType{
@JsOverlay
static SVGElementInstance.OnresizeUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnresizeFn asOnresizeFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnresizeFn(){
return (Object)this instanceof SVGElementInstance.OnresizeFn;
}
}
@JsFunction
public interface OnscrollFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnscrollUnionType{
@JsOverlay
static SVGElementInstance.OnscrollUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnscrollFn asOnscrollFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnscrollFn(){
return (Object)this instanceof SVGElementInstance.OnscrollFn;
}
}
@JsFunction
public interface OnsearchFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnsearchUnionType{
@JsOverlay
static SVGElementInstance.OnsearchUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnsearchFn asOnsearchFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnsearchFn(){
return (Object)this instanceof SVGElementInstance.OnsearchFn;
}
}
@JsFunction
public interface OnselectFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnselectUnionType{
@JsOverlay
static SVGElementInstance.OnselectUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnselectFn asOnselectFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnselectFn(){
return (Object)this instanceof SVGElementInstance.OnselectFn;
}
}
@JsFunction
public interface OnselectstartFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnselectstartUnionType{
@JsOverlay
static SVGElementInstance.OnselectstartUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnselectstartFn asOnselectstartFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnselectstartFn(){
return (Object)this instanceof SVGElementInstance.OnselectstartFn;
}
}
@JsFunction
public interface OnsubmitFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnsubmitUnionType{
@JsOverlay
static SVGElementInstance.OnsubmitUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnsubmitFn asOnsubmitFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnsubmitFn(){
return (Object)this instanceof SVGElementInstance.OnsubmitFn;
}
}
@JsFunction
public interface OnunloadFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OnunloadUnionType{
@JsOverlay
static SVGElementInstance.OnunloadUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default SVGElementInstance.OnunloadFn asOnunloadFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOnunloadFn(){
return (Object)this instanceof SVGElementInstance.OnunloadFn;
}
}
public SVGElementInstance.ChildNodesUnionType childNodes;
public SVGElement correspondingElement;
public SVGUseElement correspondingUseElement;
public SVGElementInstance firstChild;
public SVGElementInstance lastChild;
public SVGElementInstance nextSibling;
public SVGElementInstance.OnabortUnionType onabort;
public SVGElementInstance.OnbeforecopyUnionType onbeforecopy;
public SVGElementInstance.OnbeforecutUnionType onbeforecut;
public SVGElementInstance.OnbeforepasteUnionType onbeforepaste;
public SVGElementInstance.OnblurUnionType onblur;
public SVGElementInstance.OnchangeUnionType onchange;
public SVGElementInstance.OnclickUnionType onclick;
public SVGElementInstance.OncontextmenuUnionType oncontextmenu;
public SVGElementInstance.OncopyUnionType oncopy;
public SVGElementInstance.OncutUnionType oncut;
public SVGElementInstance.OndblclickUnionType ondblclick;
public SVGElementInstance.OndragUnionType ondrag;
public SVGElementInstance.OndragendUnionType ondragend;
public SVGElementInstance.OndragenterUnionType ondragenter;
public SVGElementInstance.OndragleaveUnionType ondragleave;
public SVGElementInstance.OndragoverUnionType ondragover;
public SVGElementInstance.OndragstartUnionType ondragstart;
public SVGElementInstance.OndropUnionType ondrop;
public SVGElementInstance.OnerrorUnionType onerror;
public SVGElementInstance.OnfocusUnionType onfocus;
public SVGElementInstance.OninputUnionType oninput;
public SVGElementInstance.OnkeydownUnionType onkeydown;
public SVGElementInstance.OnkeypressUnionType onkeypress;
public SVGElementInstance.OnkeyupUnionType onkeyup;
public SVGElementInstance.OnloadUnionType onload;
public SVGElementInstance.OnmousedownUnionType onmousedown;
public SVGElementInstance.OnmousemoveUnionType onmousemove;
public SVGElementInstance.OnmouseoutUnionType onmouseout;
public SVGElementInstance.OnmouseoverUnionType onmouseover;
public SVGElementInstance.OnmouseupUnionType onmouseup;
public SVGElementInstance.OnmousewheelUnionType onmousewheel;
public SVGElementInstance.OnpasteUnionType onpaste;
public SVGElementInstance.OnresetUnionType onreset;
public SVGElementInstance.OnresizeUnionType onresize;
public SVGElementInstance.OnscrollUnionType onscroll;
public SVGElementInstance.OnsearchUnionType onsearch;
public SVGElementInstance.OnselectUnionType onselect;
public SVGElementInstance.OnselectstartUnionType onselectstart;
public SVGElementInstance.OnsubmitUnionType onsubmit;
public SVGElementInstance.OnunloadUnionType onunload;
public SVGElementInstance parentNode;
public SVGElementInstance previousSibling;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType useCapture);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event event);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType useCapture);
public native void removeEventListener(String type,EventListener listener);
}

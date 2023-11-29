package elemental2.dom;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PerformanceNavigation{
@JsOverlay
public static final double TYPE_BACK_FORWARD=PerformanceNavigation__Constants.TYPE_BACK_FORWARD;
@JsOverlay
public static final double TYPE_NAVIGATE=PerformanceNavigation__Constants.TYPE_NAVIGATE;
@JsOverlay
public static final double TYPE_RELOAD=PerformanceNavigation__Constants.TYPE_RELOAD;
@JsOverlay
public static final double TYPE_RESERVED=PerformanceNavigation__Constants.TYPE_RESERVED;
public double redirectCount;
public double type;
}

package elemental2.webgl;
import elemental2.dom.HTMLVideoElement;
import elemental2.webgl.WebGLShader;
import java.lang.Double;
import elemental2.webgl.WebGLUniformLocation;
import elemental2.webgl.WebGLFramebuffer;
import elemental2.webgl.WebGLActiveInfo;
import elemental2.dom.HTMLCanvasElement;
import elemental2.webgl.WebGLContextAttributes;
import elemental2.webgl.WebGLTexture;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import java.lang.Boolean;
import elemental2.webgl.WebGLProgram;
import java.lang.String;
import elemental2.webgl.WebGLBuffer;
import elemental2.dom.ImageData;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
import elemental2.dom.OffscreenCanvas;
import elemental2.core.Float32Array;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.dom.ImageBitmap;
import elemental2.webgl.WebGLShaderPrecisionFormat;
import elemental2.webgl.WebGLRenderbuffer;
import jsinterop.annotations.JsOverlay;
import elemental2.core.Int32Array;
import java.lang.Object;
import elemental2.dom.HTMLImageElement;
import elemental2.webgl.WebGLObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WebGLRenderingContext{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface BufferDataDataUnionType{
@JsOverlay
static WebGLRenderingContext.BufferDataDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface BufferSubDataDataUnionType{
@JsOverlay
static WebGLRenderingContext.BufferSubDataDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PixelStoreiParamUnionType{
@JsOverlay
static WebGLRenderingContext.PixelStoreiParamUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface TexImage2DImgUnionType{
@JsOverlay
static WebGLRenderingContext.TexImage2DImgUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default HTMLCanvasElement asHTMLCanvasElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLImageElement asHTMLImageElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLVideoElement asHTMLVideoElement(){
return Js.cast(this);
}
@JsOverlay
default ImageBitmap asImageBitmap(){
return Js.cast(this);
}
@JsOverlay
default ImageData asImageData(){
return Js.cast(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default OffscreenCanvas asOffscreenCanvas(){
return Js.cast(this);
}
@JsOverlay
default boolean isHTMLCanvasElement(){
return (Object)this instanceof HTMLCanvasElement;
}
@JsOverlay
default boolean isHTMLImageElement(){
return (Object)this instanceof HTMLImageElement;
}
@JsOverlay
default boolean isHTMLVideoElement(){
return (Object)this instanceof HTMLVideoElement;
}
@JsOverlay
default boolean isImageData(){
return (Object)this instanceof ImageData;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isOffscreenCanvas(){
return (Object)this instanceof OffscreenCanvas;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface TexSubImage2DDataUnionType{
@JsOverlay
static WebGLRenderingContext.TexSubImage2DDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default HTMLCanvasElement asHTMLCanvasElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLImageElement asHTMLImageElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLVideoElement asHTMLVideoElement(){
return Js.cast(this);
}
@JsOverlay
default ImageBitmap asImageBitmap(){
return Js.cast(this);
}
@JsOverlay
default ImageData asImageData(){
return Js.cast(this);
}
@JsOverlay
default OffscreenCanvas asOffscreenCanvas(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isHTMLCanvasElement(){
return (Object)this instanceof HTMLCanvasElement;
}
@JsOverlay
default boolean isHTMLImageElement(){
return (Object)this instanceof HTMLImageElement;
}
@JsOverlay
default boolean isHTMLVideoElement(){
return (Object)this instanceof HTMLVideoElement;
}
@JsOverlay
default boolean isImageData(){
return (Object)this instanceof ImageData;
}
@JsOverlay
default boolean isOffscreenCanvas(){
return (Object)this instanceof OffscreenCanvas;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform1fvValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform1fvValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform1iValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform1iValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform1ivValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform1ivValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Int32Array asInt32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isInt32Array(){
return (Object)this instanceof Int32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform2fvValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform2fvValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform2iValue1UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform2iValue1UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform2iValue2UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform2iValue2UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform2ivValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform2ivValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Int32Array asInt32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isInt32Array(){
return (Object)this instanceof Int32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform3fvValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform3fvValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform3iValue1UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform3iValue1UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform3iValue2UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform3iValue2UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform3iValue3UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform3iValue3UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform3ivValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform3ivValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Int32Array asInt32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isInt32Array(){
return (Object)this instanceof Int32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform4fvValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform4fvValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform4iValue1UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform4iValue1UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform4iValue2UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform4iValue2UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform4iValue3UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform4iValue3UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform4iValue4UnionType{
@JsOverlay
static WebGLRenderingContext.Uniform4iValue4UnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface Uniform4ivValueUnionType{
@JsOverlay
static WebGLRenderingContext.Uniform4ivValueUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Int32Array asInt32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isInt32Array(){
return (Object)this instanceof Int32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UniformMatrix2fvDataUnionType{
@JsOverlay
static WebGLRenderingContext.UniformMatrix2fvDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UniformMatrix3fvDataUnionType{
@JsOverlay
static WebGLRenderingContext.UniformMatrix3fvDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UniformMatrix4fvDataUnionType{
@JsOverlay
static WebGLRenderingContext.UniformMatrix4fvDataUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface VertexAttrib1fvValuesUnionType{
@JsOverlay
static WebGLRenderingContext.VertexAttrib1fvValuesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface VertexAttrib2fvValuesUnionType{
@JsOverlay
static WebGLRenderingContext.VertexAttrib2fvValuesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface VertexAttrib3fvValuesUnionType{
@JsOverlay
static WebGLRenderingContext.VertexAttrib3fvValuesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface VertexAttrib4fvValuesUnionType{
@JsOverlay
static WebGLRenderingContext.VertexAttrib4fvValuesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Float32Array asFloat32Array(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Double> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default boolean isFloat32Array(){
return (Object)this instanceof Float32Array;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsOverlay
public static final int ACTIVE_ATTRIBUTES=WebGLRenderingContext__Constants.ACTIVE_ATTRIBUTES;
@JsOverlay
public static final int ACTIVE_TEXTURE=WebGLRenderingContext__Constants.ACTIVE_TEXTURE;
@JsOverlay
public static final int ACTIVE_UNIFORMS=WebGLRenderingContext__Constants.ACTIVE_UNIFORMS;
@JsOverlay
public static final int ALIASED_LINE_WIDTH_RANGE=WebGLRenderingContext__Constants.ALIASED_LINE_WIDTH_RANGE;
@JsOverlay
public static final int ALIASED_POINT_SIZE_RANGE=WebGLRenderingContext__Constants.ALIASED_POINT_SIZE_RANGE;
@JsOverlay
public static final int ALPHA=WebGLRenderingContext__Constants.ALPHA;
@JsOverlay
public static final int ALPHA_BITS=WebGLRenderingContext__Constants.ALPHA_BITS;
@JsOverlay
public static final int ALWAYS=WebGLRenderingContext__Constants.ALWAYS;
@JsOverlay
public static final int ARRAY_BUFFER=WebGLRenderingContext__Constants.ARRAY_BUFFER;
@JsOverlay
public static final int ARRAY_BUFFER_BINDING=WebGLRenderingContext__Constants.ARRAY_BUFFER_BINDING;
@JsOverlay
public static final int ATTACHED_SHADERS=WebGLRenderingContext__Constants.ATTACHED_SHADERS;
@JsOverlay
public static final int BACK=WebGLRenderingContext__Constants.BACK;
@JsOverlay
public static final int BLEND=WebGLRenderingContext__Constants.BLEND;
@JsOverlay
public static final int BLEND_COLOR=WebGLRenderingContext__Constants.BLEND_COLOR;
@JsOverlay
public static final int BLEND_DST_ALPHA=WebGLRenderingContext__Constants.BLEND_DST_ALPHA;
@JsOverlay
public static final int BLEND_DST_RGB=WebGLRenderingContext__Constants.BLEND_DST_RGB;
@JsOverlay
public static final int BLEND_EQUATION=WebGLRenderingContext__Constants.BLEND_EQUATION;
@JsOverlay
public static final int BLEND_EQUATION_ALPHA=WebGLRenderingContext__Constants.BLEND_EQUATION_ALPHA;
@JsOverlay
public static final int BLEND_EQUATION_RGB=WebGLRenderingContext__Constants.BLEND_EQUATION_RGB;
@JsOverlay
public static final int BLEND_SRC_ALPHA=WebGLRenderingContext__Constants.BLEND_SRC_ALPHA;
@JsOverlay
public static final int BLEND_SRC_RGB=WebGLRenderingContext__Constants.BLEND_SRC_RGB;
@JsOverlay
public static final int BLUE_BITS=WebGLRenderingContext__Constants.BLUE_BITS;
@JsOverlay
public static final int BOOL=WebGLRenderingContext__Constants.BOOL;
@JsOverlay
public static final int BOOL_VEC2=WebGLRenderingContext__Constants.BOOL_VEC2;
@JsOverlay
public static final int BOOL_VEC3=WebGLRenderingContext__Constants.BOOL_VEC3;
@JsOverlay
public static final int BOOL_VEC4=WebGLRenderingContext__Constants.BOOL_VEC4;
@JsOverlay
public static final int BROWSER_DEFAULT_WEBGL=WebGLRenderingContext__Constants.BROWSER_DEFAULT_WEBGL;
@JsOverlay
public static final int BUFFER_SIZE=WebGLRenderingContext__Constants.BUFFER_SIZE;
@JsOverlay
public static final int BUFFER_USAGE=WebGLRenderingContext__Constants.BUFFER_USAGE;
@JsOverlay
public static final int BYTE=WebGLRenderingContext__Constants.BYTE;
@JsOverlay
public static final int CCW=WebGLRenderingContext__Constants.CCW;
@JsOverlay
public static final int CLAMP_TO_EDGE=WebGLRenderingContext__Constants.CLAMP_TO_EDGE;
@JsOverlay
public static final int COLOR_ATTACHMENT0=WebGLRenderingContext__Constants.COLOR_ATTACHMENT0;
@JsOverlay
public static final int COLOR_BUFFER_BIT=WebGLRenderingContext__Constants.COLOR_BUFFER_BIT;
@JsOverlay
public static final int COLOR_CLEAR_VALUE=WebGLRenderingContext__Constants.COLOR_CLEAR_VALUE;
@JsOverlay
public static final int COLOR_WRITEMASK=WebGLRenderingContext__Constants.COLOR_WRITEMASK;
@JsOverlay
public static final int COMPILE_STATUS=WebGLRenderingContext__Constants.COMPILE_STATUS;
@JsOverlay
public static final int COMPRESSED_TEXTURE_FORMATS=WebGLRenderingContext__Constants.COMPRESSED_TEXTURE_FORMATS;
@JsOverlay
public static final int CONSTANT_ALPHA=WebGLRenderingContext__Constants.CONSTANT_ALPHA;
@JsOverlay
public static final int CONSTANT_COLOR=WebGLRenderingContext__Constants.CONSTANT_COLOR;
@JsOverlay
public static final int CONTEXT_LOST_WEBGL=WebGLRenderingContext__Constants.CONTEXT_LOST_WEBGL;
@JsOverlay
public static final int CULL_FACE=WebGLRenderingContext__Constants.CULL_FACE;
@JsOverlay
public static final int CULL_FACE_MODE=WebGLRenderingContext__Constants.CULL_FACE_MODE;
@JsOverlay
public static final int CURRENT_PROGRAM=WebGLRenderingContext__Constants.CURRENT_PROGRAM;
@JsOverlay
public static final int CURRENT_VERTEX_ATTRIB=WebGLRenderingContext__Constants.CURRENT_VERTEX_ATTRIB;
@JsOverlay
public static final int CW=WebGLRenderingContext__Constants.CW;
@JsOverlay
public static final int DECR=WebGLRenderingContext__Constants.DECR;
@JsOverlay
public static final int DECR_WRAP=WebGLRenderingContext__Constants.DECR_WRAP;
@JsOverlay
public static final int DELETE_STATUS=WebGLRenderingContext__Constants.DELETE_STATUS;
@JsOverlay
public static final int DEPTH_ATTACHMENT=WebGLRenderingContext__Constants.DEPTH_ATTACHMENT;
@JsOverlay
public static final int DEPTH_BITS=WebGLRenderingContext__Constants.DEPTH_BITS;
@JsOverlay
public static final int DEPTH_BUFFER_BIT=WebGLRenderingContext__Constants.DEPTH_BUFFER_BIT;
@JsOverlay
public static final int DEPTH_CLEAR_VALUE=WebGLRenderingContext__Constants.DEPTH_CLEAR_VALUE;
@JsOverlay
public static final int DEPTH_COMPONENT=WebGLRenderingContext__Constants.DEPTH_COMPONENT;
@JsOverlay
public static final int DEPTH_COMPONENT16=WebGLRenderingContext__Constants.DEPTH_COMPONENT16;
@JsOverlay
public static final int DEPTH_FUNC=WebGLRenderingContext__Constants.DEPTH_FUNC;
@JsOverlay
public static final int DEPTH_RANGE=WebGLRenderingContext__Constants.DEPTH_RANGE;
@JsOverlay
public static final int DEPTH_STENCIL=WebGLRenderingContext__Constants.DEPTH_STENCIL;
@JsOverlay
public static final int DEPTH_STENCIL_ATTACHMENT=WebGLRenderingContext__Constants.DEPTH_STENCIL_ATTACHMENT;
@JsOverlay
public static final int DEPTH_TEST=WebGLRenderingContext__Constants.DEPTH_TEST;
@JsOverlay
public static final int DEPTH_WRITEMASK=WebGLRenderingContext__Constants.DEPTH_WRITEMASK;
@JsOverlay
public static final int DITHER=WebGLRenderingContext__Constants.DITHER;
@JsOverlay
public static final int DONT_CARE=WebGLRenderingContext__Constants.DONT_CARE;
@JsOverlay
public static final int DST_ALPHA=WebGLRenderingContext__Constants.DST_ALPHA;
@JsOverlay
public static final int DST_COLOR=WebGLRenderingContext__Constants.DST_COLOR;
@JsOverlay
public static final int DYNAMIC_DRAW=WebGLRenderingContext__Constants.DYNAMIC_DRAW;
@JsOverlay
public static final int ELEMENT_ARRAY_BUFFER=WebGLRenderingContext__Constants.ELEMENT_ARRAY_BUFFER;
@JsOverlay
public static final int ELEMENT_ARRAY_BUFFER_BINDING=WebGLRenderingContext__Constants.ELEMENT_ARRAY_BUFFER_BINDING;
@JsOverlay
public static final int EQUAL=WebGLRenderingContext__Constants.EQUAL;
@JsOverlay
public static final int FASTEST=WebGLRenderingContext__Constants.FASTEST;
@JsOverlay
public static final int FLOAT=WebGLRenderingContext__Constants.FLOAT;
@JsOverlay
public static final int FLOAT_MAT2=WebGLRenderingContext__Constants.FLOAT_MAT2;
@JsOverlay
public static final int FLOAT_MAT3=WebGLRenderingContext__Constants.FLOAT_MAT3;
@JsOverlay
public static final int FLOAT_MAT4=WebGLRenderingContext__Constants.FLOAT_MAT4;
@JsOverlay
public static final int FLOAT_VEC2=WebGLRenderingContext__Constants.FLOAT_VEC2;
@JsOverlay
public static final int FLOAT_VEC3=WebGLRenderingContext__Constants.FLOAT_VEC3;
@JsOverlay
public static final int FLOAT_VEC4=WebGLRenderingContext__Constants.FLOAT_VEC4;
@JsOverlay
public static final int FRAGMENT_SHADER=WebGLRenderingContext__Constants.FRAGMENT_SHADER;
@JsOverlay
public static final int FRAMEBUFFER=WebGLRenderingContext__Constants.FRAMEBUFFER;
@JsOverlay
public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME=WebGLRenderingContext__Constants.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME;
@JsOverlay
public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE=WebGLRenderingContext__Constants.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE;
@JsOverlay
public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE=WebGLRenderingContext__Constants.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE;
@JsOverlay
public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL=WebGLRenderingContext__Constants.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL;
@JsOverlay
public static final int FRAMEBUFFER_BINDING=WebGLRenderingContext__Constants.FRAMEBUFFER_BINDING;
@JsOverlay
public static final int FRAMEBUFFER_COMPLETE=WebGLRenderingContext__Constants.FRAMEBUFFER_COMPLETE;
@JsOverlay
public static final int FRAMEBUFFER_INCOMPLETE_ATTACHMENT=WebGLRenderingContext__Constants.FRAMEBUFFER_INCOMPLETE_ATTACHMENT;
@JsOverlay
public static final int FRAMEBUFFER_INCOMPLETE_DIMENSIONS=WebGLRenderingContext__Constants.FRAMEBUFFER_INCOMPLETE_DIMENSIONS;
@JsOverlay
public static final int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT=WebGLRenderingContext__Constants.FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT;
@JsOverlay
public static final int FRAMEBUFFER_UNSUPPORTED=WebGLRenderingContext__Constants.FRAMEBUFFER_UNSUPPORTED;
@JsOverlay
public static final int FRONT=WebGLRenderingContext__Constants.FRONT;
@JsOverlay
public static final int FRONT_AND_BACK=WebGLRenderingContext__Constants.FRONT_AND_BACK;
@JsOverlay
public static final int FRONT_FACE=WebGLRenderingContext__Constants.FRONT_FACE;
@JsOverlay
public static final int FUNC_ADD=WebGLRenderingContext__Constants.FUNC_ADD;
@JsOverlay
public static final int FUNC_REVERSE_SUBTRACT=WebGLRenderingContext__Constants.FUNC_REVERSE_SUBTRACT;
@JsOverlay
public static final int FUNC_SUBTRACT=WebGLRenderingContext__Constants.FUNC_SUBTRACT;
@JsOverlay
public static final int GENERATE_MIPMAP_HINT=WebGLRenderingContext__Constants.GENERATE_MIPMAP_HINT;
@JsOverlay
public static final int GEQUAL=WebGLRenderingContext__Constants.GEQUAL;
@JsOverlay
public static final int GREATER=WebGLRenderingContext__Constants.GREATER;
@JsOverlay
public static final int GREEN_BITS=WebGLRenderingContext__Constants.GREEN_BITS;
@JsOverlay
public static final int HIGH_FLOAT=WebGLRenderingContext__Constants.HIGH_FLOAT;
@JsOverlay
public static final int HIGH_INT=WebGLRenderingContext__Constants.HIGH_INT;
@JsOverlay
public static final int IMPLEMENTATION_COLOR_READ_FORMAT=WebGLRenderingContext__Constants.IMPLEMENTATION_COLOR_READ_FORMAT;
@JsOverlay
public static final int IMPLEMENTATION_COLOR_READ_TYPE=WebGLRenderingContext__Constants.IMPLEMENTATION_COLOR_READ_TYPE;
@JsOverlay
public static final int INCR=WebGLRenderingContext__Constants.INCR;
@JsOverlay
public static final int INCR_WRAP=WebGLRenderingContext__Constants.INCR_WRAP;
@JsOverlay
public static final int INT=WebGLRenderingContext__Constants.INT;
@JsOverlay
public static final int INT_VEC2=WebGLRenderingContext__Constants.INT_VEC2;
@JsOverlay
public static final int INT_VEC3=WebGLRenderingContext__Constants.INT_VEC3;
@JsOverlay
public static final int INT_VEC4=WebGLRenderingContext__Constants.INT_VEC4;
@JsOverlay
public static final int INVALID_ENUM=WebGLRenderingContext__Constants.INVALID_ENUM;
@JsOverlay
public static final int INVALID_FRAMEBUFFER_OPERATION=WebGLRenderingContext__Constants.INVALID_FRAMEBUFFER_OPERATION;
@JsOverlay
public static final int INVALID_OPERATION=WebGLRenderingContext__Constants.INVALID_OPERATION;
@JsOverlay
public static final int INVALID_VALUE=WebGLRenderingContext__Constants.INVALID_VALUE;
@JsOverlay
public static final int INVERT=WebGLRenderingContext__Constants.INVERT;
@JsOverlay
public static final int KEEP=WebGLRenderingContext__Constants.KEEP;
@JsOverlay
public static final int LEQUAL=WebGLRenderingContext__Constants.LEQUAL;
@JsOverlay
public static final int LESS=WebGLRenderingContext__Constants.LESS;
@JsOverlay
public static final int LINEAR=WebGLRenderingContext__Constants.LINEAR;
@JsOverlay
public static final int LINEAR_MIPMAP_LINEAR=WebGLRenderingContext__Constants.LINEAR_MIPMAP_LINEAR;
@JsOverlay
public static final int LINEAR_MIPMAP_NEAREST=WebGLRenderingContext__Constants.LINEAR_MIPMAP_NEAREST;
@JsOverlay
public static final int LINES=WebGLRenderingContext__Constants.LINES;
@JsOverlay
public static final int LINE_LOOP=WebGLRenderingContext__Constants.LINE_LOOP;
@JsOverlay
public static final int LINE_STRIP=WebGLRenderingContext__Constants.LINE_STRIP;
@JsOverlay
public static final int LINE_WIDTH=WebGLRenderingContext__Constants.LINE_WIDTH;
@JsOverlay
public static final int LINK_STATUS=WebGLRenderingContext__Constants.LINK_STATUS;
@JsOverlay
public static final int LOW_FLOAT=WebGLRenderingContext__Constants.LOW_FLOAT;
@JsOverlay
public static final int LOW_INT=WebGLRenderingContext__Constants.LOW_INT;
@JsOverlay
public static final int LUMINANCE=WebGLRenderingContext__Constants.LUMINANCE;
@JsOverlay
public static final int LUMINANCE_ALPHA=WebGLRenderingContext__Constants.LUMINANCE_ALPHA;
@JsOverlay
public static final int MAX_COMBINED_TEXTURE_IMAGE_UNITS=WebGLRenderingContext__Constants.MAX_COMBINED_TEXTURE_IMAGE_UNITS;
@JsOverlay
public static final int MAX_CUBE_MAP_TEXTURE_SIZE=WebGLRenderingContext__Constants.MAX_CUBE_MAP_TEXTURE_SIZE;
@JsOverlay
public static final int MAX_FRAGMENT_UNIFORM_VECTORS=WebGLRenderingContext__Constants.MAX_FRAGMENT_UNIFORM_VECTORS;
@JsOverlay
public static final int MAX_RENDERBUFFER_SIZE=WebGLRenderingContext__Constants.MAX_RENDERBUFFER_SIZE;
@JsOverlay
public static final int MAX_TEXTURE_IMAGE_UNITS=WebGLRenderingContext__Constants.MAX_TEXTURE_IMAGE_UNITS;
@JsOverlay
public static final int MAX_TEXTURE_SIZE=WebGLRenderingContext__Constants.MAX_TEXTURE_SIZE;
@JsOverlay
public static final int MAX_VARYING_VECTORS=WebGLRenderingContext__Constants.MAX_VARYING_VECTORS;
@JsOverlay
public static final int MAX_VERTEX_ATTRIBS=WebGLRenderingContext__Constants.MAX_VERTEX_ATTRIBS;
@JsOverlay
public static final int MAX_VERTEX_TEXTURE_IMAGE_UNITS=WebGLRenderingContext__Constants.MAX_VERTEX_TEXTURE_IMAGE_UNITS;
@JsOverlay
public static final int MAX_VERTEX_UNIFORM_VECTORS=WebGLRenderingContext__Constants.MAX_VERTEX_UNIFORM_VECTORS;
@JsOverlay
public static final int MAX_VIEWPORT_DIMS=WebGLRenderingContext__Constants.MAX_VIEWPORT_DIMS;
@JsOverlay
public static final int MEDIUM_FLOAT=WebGLRenderingContext__Constants.MEDIUM_FLOAT;
@JsOverlay
public static final int MEDIUM_INT=WebGLRenderingContext__Constants.MEDIUM_INT;
@JsOverlay
public static final int MIRRORED_REPEAT=WebGLRenderingContext__Constants.MIRRORED_REPEAT;
@JsOverlay
public static final int NEAREST=WebGLRenderingContext__Constants.NEAREST;
@JsOverlay
public static final int NEAREST_MIPMAP_LINEAR=WebGLRenderingContext__Constants.NEAREST_MIPMAP_LINEAR;
@JsOverlay
public static final int NEAREST_MIPMAP_NEAREST=WebGLRenderingContext__Constants.NEAREST_MIPMAP_NEAREST;
@JsOverlay
public static final int NEVER=WebGLRenderingContext__Constants.NEVER;
@JsOverlay
public static final int NICEST=WebGLRenderingContext__Constants.NICEST;
@JsOverlay
public static final int NONE=WebGLRenderingContext__Constants.NONE;
@JsOverlay
public static final int NOTEQUAL=WebGLRenderingContext__Constants.NOTEQUAL;
@JsOverlay
public static final int NO_ERROR=WebGLRenderingContext__Constants.NO_ERROR;
@JsOverlay
public static final int ONE=WebGLRenderingContext__Constants.ONE;
@JsOverlay
public static final int ONE_MINUS_CONSTANT_ALPHA=WebGLRenderingContext__Constants.ONE_MINUS_CONSTANT_ALPHA;
@JsOverlay
public static final int ONE_MINUS_CONSTANT_COLOR=WebGLRenderingContext__Constants.ONE_MINUS_CONSTANT_COLOR;
@JsOverlay
public static final int ONE_MINUS_DST_ALPHA=WebGLRenderingContext__Constants.ONE_MINUS_DST_ALPHA;
@JsOverlay
public static final int ONE_MINUS_DST_COLOR=WebGLRenderingContext__Constants.ONE_MINUS_DST_COLOR;
@JsOverlay
public static final int ONE_MINUS_SRC_ALPHA=WebGLRenderingContext__Constants.ONE_MINUS_SRC_ALPHA;
@JsOverlay
public static final int ONE_MINUS_SRC_COLOR=WebGLRenderingContext__Constants.ONE_MINUS_SRC_COLOR;
@JsOverlay
public static final int OUT_OF_MEMORY=WebGLRenderingContext__Constants.OUT_OF_MEMORY;
@JsOverlay
public static final int PACK_ALIGNMENT=WebGLRenderingContext__Constants.PACK_ALIGNMENT;
@JsOverlay
public static final int POINTS=WebGLRenderingContext__Constants.POINTS;
@JsOverlay
public static final int POLYGON_OFFSET_FACTOR=WebGLRenderingContext__Constants.POLYGON_OFFSET_FACTOR;
@JsOverlay
public static final int POLYGON_OFFSET_FILL=WebGLRenderingContext__Constants.POLYGON_OFFSET_FILL;
@JsOverlay
public static final int POLYGON_OFFSET_UNITS=WebGLRenderingContext__Constants.POLYGON_OFFSET_UNITS;
@JsOverlay
public static final int RED_BITS=WebGLRenderingContext__Constants.RED_BITS;
@JsOverlay
public static final int RENDERBUFFER=WebGLRenderingContext__Constants.RENDERBUFFER;
@JsOverlay
public static final int RENDERBUFFER_ALPHA_SIZE=WebGLRenderingContext__Constants.RENDERBUFFER_ALPHA_SIZE;
@JsOverlay
public static final int RENDERBUFFER_BINDING=WebGLRenderingContext__Constants.RENDERBUFFER_BINDING;
@JsOverlay
public static final int RENDERBUFFER_BLUE_SIZE=WebGLRenderingContext__Constants.RENDERBUFFER_BLUE_SIZE;
@JsOverlay
public static final int RENDERBUFFER_DEPTH_SIZE=WebGLRenderingContext__Constants.RENDERBUFFER_DEPTH_SIZE;
@JsOverlay
public static final int RENDERBUFFER_GREEN_SIZE=WebGLRenderingContext__Constants.RENDERBUFFER_GREEN_SIZE;
@JsOverlay
public static final int RENDERBUFFER_HEIGHT=WebGLRenderingContext__Constants.RENDERBUFFER_HEIGHT;
@JsOverlay
public static final int RENDERBUFFER_INTERNAL_FORMAT=WebGLRenderingContext__Constants.RENDERBUFFER_INTERNAL_FORMAT;
@JsOverlay
public static final int RENDERBUFFER_RED_SIZE=WebGLRenderingContext__Constants.RENDERBUFFER_RED_SIZE;
@JsOverlay
public static final int RENDERBUFFER_STENCIL_SIZE=WebGLRenderingContext__Constants.RENDERBUFFER_STENCIL_SIZE;
@JsOverlay
public static final int RENDERBUFFER_WIDTH=WebGLRenderingContext__Constants.RENDERBUFFER_WIDTH;
@JsOverlay
public static final int RENDERER=WebGLRenderingContext__Constants.RENDERER;
@JsOverlay
public static final int REPEAT=WebGLRenderingContext__Constants.REPEAT;
@JsOverlay
public static final int REPLACE=WebGLRenderingContext__Constants.REPLACE;
@JsOverlay
public static final int RGB=WebGLRenderingContext__Constants.RGB;
@JsOverlay
public static final int RGB565=WebGLRenderingContext__Constants.RGB565;
@JsOverlay
public static final int RGB5_A1=WebGLRenderingContext__Constants.RGB5_A1;
@JsOverlay
public static final int RGBA=WebGLRenderingContext__Constants.RGBA;
@JsOverlay
public static final int RGBA4=WebGLRenderingContext__Constants.RGBA4;
@JsOverlay
public static final int SAMPLER_2D=WebGLRenderingContext__Constants.SAMPLER_2D;
@JsOverlay
public static final int SAMPLER_CUBE=WebGLRenderingContext__Constants.SAMPLER_CUBE;
@JsOverlay
public static final int SAMPLES=WebGLRenderingContext__Constants.SAMPLES;
@JsOverlay
public static final int SAMPLE_ALPHA_TO_COVERAGE=WebGLRenderingContext__Constants.SAMPLE_ALPHA_TO_COVERAGE;
@JsOverlay
public static final int SAMPLE_BUFFERS=WebGLRenderingContext__Constants.SAMPLE_BUFFERS;
@JsOverlay
public static final int SAMPLE_COVERAGE=WebGLRenderingContext__Constants.SAMPLE_COVERAGE;
@JsOverlay
public static final int SAMPLE_COVERAGE_INVERT=WebGLRenderingContext__Constants.SAMPLE_COVERAGE_INVERT;
@JsOverlay
public static final int SAMPLE_COVERAGE_VALUE=WebGLRenderingContext__Constants.SAMPLE_COVERAGE_VALUE;
@JsOverlay
public static final int SCISSOR_BOX=WebGLRenderingContext__Constants.SCISSOR_BOX;
@JsOverlay
public static final int SCISSOR_TEST=WebGLRenderingContext__Constants.SCISSOR_TEST;
@JsOverlay
public static final int SHADER_TYPE=WebGLRenderingContext__Constants.SHADER_TYPE;
@JsOverlay
public static final int SHADING_LANGUAGE_VERSION=WebGLRenderingContext__Constants.SHADING_LANGUAGE_VERSION;
@JsOverlay
public static final int SHORT=WebGLRenderingContext__Constants.SHORT;
@JsOverlay
public static final int SRC_ALPHA=WebGLRenderingContext__Constants.SRC_ALPHA;
@JsOverlay
public static final int SRC_ALPHA_SATURATE=WebGLRenderingContext__Constants.SRC_ALPHA_SATURATE;
@JsOverlay
public static final int SRC_COLOR=WebGLRenderingContext__Constants.SRC_COLOR;
@JsOverlay
public static final int STATIC_DRAW=WebGLRenderingContext__Constants.STATIC_DRAW;
@JsOverlay
public static final int STENCIL_ATTACHMENT=WebGLRenderingContext__Constants.STENCIL_ATTACHMENT;
@JsOverlay
public static final int STENCIL_BACK_FAIL=WebGLRenderingContext__Constants.STENCIL_BACK_FAIL;
@JsOverlay
public static final int STENCIL_BACK_FUNC=WebGLRenderingContext__Constants.STENCIL_BACK_FUNC;
@JsOverlay
public static final int STENCIL_BACK_PASS_DEPTH_FAIL=WebGLRenderingContext__Constants.STENCIL_BACK_PASS_DEPTH_FAIL;
@JsOverlay
public static final int STENCIL_BACK_PASS_DEPTH_PASS=WebGLRenderingContext__Constants.STENCIL_BACK_PASS_DEPTH_PASS;
@JsOverlay
public static final int STENCIL_BACK_REF=WebGLRenderingContext__Constants.STENCIL_BACK_REF;
@JsOverlay
public static final int STENCIL_BACK_VALUE_MASK=WebGLRenderingContext__Constants.STENCIL_BACK_VALUE_MASK;
@JsOverlay
public static final int STENCIL_BACK_WRITEMASK=WebGLRenderingContext__Constants.STENCIL_BACK_WRITEMASK;
@JsOverlay
public static final int STENCIL_BITS=WebGLRenderingContext__Constants.STENCIL_BITS;
@JsOverlay
public static final int STENCIL_BUFFER_BIT=WebGLRenderingContext__Constants.STENCIL_BUFFER_BIT;
@JsOverlay
public static final int STENCIL_CLEAR_VALUE=WebGLRenderingContext__Constants.STENCIL_CLEAR_VALUE;
@JsOverlay
public static final int STENCIL_FAIL=WebGLRenderingContext__Constants.STENCIL_FAIL;
@JsOverlay
public static final int STENCIL_FUNC=WebGLRenderingContext__Constants.STENCIL_FUNC;
@JsOverlay
public static final double STENCIL_INDEX=WebGLRenderingContext__Constants.STENCIL_INDEX;
@JsOverlay
public static final int STENCIL_INDEX8=WebGLRenderingContext__Constants.STENCIL_INDEX8;
@JsOverlay
public static final int STENCIL_PASS_DEPTH_FAIL=WebGLRenderingContext__Constants.STENCIL_PASS_DEPTH_FAIL;
@JsOverlay
public static final int STENCIL_PASS_DEPTH_PASS=WebGLRenderingContext__Constants.STENCIL_PASS_DEPTH_PASS;
@JsOverlay
public static final int STENCIL_REF=WebGLRenderingContext__Constants.STENCIL_REF;
@JsOverlay
public static final int STENCIL_TEST=WebGLRenderingContext__Constants.STENCIL_TEST;
@JsOverlay
public static final int STENCIL_VALUE_MASK=WebGLRenderingContext__Constants.STENCIL_VALUE_MASK;
@JsOverlay
public static final int STENCIL_WRITEMASK=WebGLRenderingContext__Constants.STENCIL_WRITEMASK;
@JsOverlay
public static final int STREAM_DRAW=WebGLRenderingContext__Constants.STREAM_DRAW;
@JsOverlay
public static final int SUBPIXEL_BITS=WebGLRenderingContext__Constants.SUBPIXEL_BITS;
@JsOverlay
public static final int TEXTURE=WebGLRenderingContext__Constants.TEXTURE;
@JsOverlay
public static final int TEXTURE0=WebGLRenderingContext__Constants.TEXTURE0;
@JsOverlay
public static final int TEXTURE1=WebGLRenderingContext__Constants.TEXTURE1;
@JsOverlay
public static final int TEXTURE10=WebGLRenderingContext__Constants.TEXTURE10;
@JsOverlay
public static final int TEXTURE11=WebGLRenderingContext__Constants.TEXTURE11;
@JsOverlay
public static final int TEXTURE12=WebGLRenderingContext__Constants.TEXTURE12;
@JsOverlay
public static final int TEXTURE13=WebGLRenderingContext__Constants.TEXTURE13;
@JsOverlay
public static final int TEXTURE14=WebGLRenderingContext__Constants.TEXTURE14;
@JsOverlay
public static final int TEXTURE15=WebGLRenderingContext__Constants.TEXTURE15;
@JsOverlay
public static final int TEXTURE16=WebGLRenderingContext__Constants.TEXTURE16;
@JsOverlay
public static final int TEXTURE17=WebGLRenderingContext__Constants.TEXTURE17;
@JsOverlay
public static final int TEXTURE18=WebGLRenderingContext__Constants.TEXTURE18;
@JsOverlay
public static final int TEXTURE19=WebGLRenderingContext__Constants.TEXTURE19;
@JsOverlay
public static final int TEXTURE2=WebGLRenderingContext__Constants.TEXTURE2;
@JsOverlay
public static final int TEXTURE20=WebGLRenderingContext__Constants.TEXTURE20;
@JsOverlay
public static final int TEXTURE21=WebGLRenderingContext__Constants.TEXTURE21;
@JsOverlay
public static final int TEXTURE22=WebGLRenderingContext__Constants.TEXTURE22;
@JsOverlay
public static final int TEXTURE23=WebGLRenderingContext__Constants.TEXTURE23;
@JsOverlay
public static final int TEXTURE24=WebGLRenderingContext__Constants.TEXTURE24;
@JsOverlay
public static final int TEXTURE25=WebGLRenderingContext__Constants.TEXTURE25;
@JsOverlay
public static final int TEXTURE26=WebGLRenderingContext__Constants.TEXTURE26;
@JsOverlay
public static final int TEXTURE27=WebGLRenderingContext__Constants.TEXTURE27;
@JsOverlay
public static final int TEXTURE28=WebGLRenderingContext__Constants.TEXTURE28;
@JsOverlay
public static final int TEXTURE29=WebGLRenderingContext__Constants.TEXTURE29;
@JsOverlay
public static final int TEXTURE3=WebGLRenderingContext__Constants.TEXTURE3;
@JsOverlay
public static final int TEXTURE30=WebGLRenderingContext__Constants.TEXTURE30;
@JsOverlay
public static final int TEXTURE31=WebGLRenderingContext__Constants.TEXTURE31;
@JsOverlay
public static final int TEXTURE4=WebGLRenderingContext__Constants.TEXTURE4;
@JsOverlay
public static final int TEXTURE5=WebGLRenderingContext__Constants.TEXTURE5;
@JsOverlay
public static final int TEXTURE6=WebGLRenderingContext__Constants.TEXTURE6;
@JsOverlay
public static final int TEXTURE7=WebGLRenderingContext__Constants.TEXTURE7;
@JsOverlay
public static final int TEXTURE8=WebGLRenderingContext__Constants.TEXTURE8;
@JsOverlay
public static final int TEXTURE9=WebGLRenderingContext__Constants.TEXTURE9;
@JsOverlay
public static final int TEXTURE_2D=WebGLRenderingContext__Constants.TEXTURE_2D;
@JsOverlay
public static final int TEXTURE_BINDING_2D=WebGLRenderingContext__Constants.TEXTURE_BINDING_2D;
@JsOverlay
public static final int TEXTURE_BINDING_CUBE_MAP=WebGLRenderingContext__Constants.TEXTURE_BINDING_CUBE_MAP;
@JsOverlay
public static final int TEXTURE_CUBE_MAP=WebGLRenderingContext__Constants.TEXTURE_CUBE_MAP;
@JsOverlay
public static final int TEXTURE_CUBE_MAP_NEGATIVE_X=WebGLRenderingContext__Constants.TEXTURE_CUBE_MAP_NEGATIVE_X;
@JsOverlay
public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y=WebGLRenderingContext__Constants.TEXTURE_CUBE_MAP_NEGATIVE_Y;
@JsOverlay
public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z=WebGLRenderingContext__Constants.TEXTURE_CUBE_MAP_NEGATIVE_Z;
@JsOverlay
public static final int TEXTURE_CUBE_MAP_POSITIVE_X=WebGLRenderingContext__Constants.TEXTURE_CUBE_MAP_POSITIVE_X;
@JsOverlay
public static final int TEXTURE_CUBE_MAP_POSITIVE_Y=WebGLRenderingContext__Constants.TEXTURE_CUBE_MAP_POSITIVE_Y;
@JsOverlay
public static final int TEXTURE_CUBE_MAP_POSITIVE_Z=WebGLRenderingContext__Constants.TEXTURE_CUBE_MAP_POSITIVE_Z;
@JsOverlay
public static final int TEXTURE_MAG_FILTER=WebGLRenderingContext__Constants.TEXTURE_MAG_FILTER;
@JsOverlay
public static final int TEXTURE_MIN_FILTER=WebGLRenderingContext__Constants.TEXTURE_MIN_FILTER;
@JsOverlay
public static final int TEXTURE_WRAP_S=WebGLRenderingContext__Constants.TEXTURE_WRAP_S;
@JsOverlay
public static final int TEXTURE_WRAP_T=WebGLRenderingContext__Constants.TEXTURE_WRAP_T;
@JsOverlay
public static final int TRIANGLES=WebGLRenderingContext__Constants.TRIANGLES;
@JsOverlay
public static final int TRIANGLE_FAN=WebGLRenderingContext__Constants.TRIANGLE_FAN;
@JsOverlay
public static final int TRIANGLE_STRIP=WebGLRenderingContext__Constants.TRIANGLE_STRIP;
@JsOverlay
public static final int UNPACK_ALIGNMENT=WebGLRenderingContext__Constants.UNPACK_ALIGNMENT;
@JsOverlay
public static final int UNPACK_COLORSPACE_CONVERSION_WEBGL=WebGLRenderingContext__Constants.UNPACK_COLORSPACE_CONVERSION_WEBGL;
@JsOverlay
public static final int UNPACK_FLIP_Y_WEBGL=WebGLRenderingContext__Constants.UNPACK_FLIP_Y_WEBGL;
@JsOverlay
public static final int UNPACK_PREMULTIPLY_ALPHA_WEBGL=WebGLRenderingContext__Constants.UNPACK_PREMULTIPLY_ALPHA_WEBGL;
@JsOverlay
public static final int UNSIGNED_BYTE=WebGLRenderingContext__Constants.UNSIGNED_BYTE;
@JsOverlay
public static final int UNSIGNED_INT=WebGLRenderingContext__Constants.UNSIGNED_INT;
@JsOverlay
public static final int UNSIGNED_SHORT=WebGLRenderingContext__Constants.UNSIGNED_SHORT;
@JsOverlay
public static final int UNSIGNED_SHORT_4_4_4_4=WebGLRenderingContext__Constants.UNSIGNED_SHORT_4_4_4_4;
@JsOverlay
public static final int UNSIGNED_SHORT_5_5_5_1=WebGLRenderingContext__Constants.UNSIGNED_SHORT_5_5_5_1;
@JsOverlay
public static final int UNSIGNED_SHORT_5_6_5=WebGLRenderingContext__Constants.UNSIGNED_SHORT_5_6_5;
@JsOverlay
public static final int VALIDATE_STATUS=WebGLRenderingContext__Constants.VALIDATE_STATUS;
@JsOverlay
public static final int VENDOR=WebGLRenderingContext__Constants.VENDOR;
@JsOverlay
public static final int VERSION=WebGLRenderingContext__Constants.VERSION;
@JsOverlay
public static final int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING=WebGLRenderingContext__Constants.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
@JsOverlay
public static final int VERTEX_ATTRIB_ARRAY_ENABLED=WebGLRenderingContext__Constants.VERTEX_ATTRIB_ARRAY_ENABLED;
@JsOverlay
public static final int VERTEX_ATTRIB_ARRAY_NORMALIZED=WebGLRenderingContext__Constants.VERTEX_ATTRIB_ARRAY_NORMALIZED;
@JsOverlay
public static final int VERTEX_ATTRIB_ARRAY_POINTER=WebGLRenderingContext__Constants.VERTEX_ATTRIB_ARRAY_POINTER;
@JsOverlay
public static final int VERTEX_ATTRIB_ARRAY_SIZE=WebGLRenderingContext__Constants.VERTEX_ATTRIB_ARRAY_SIZE;
@JsOverlay
public static final int VERTEX_ATTRIB_ARRAY_STRIDE=WebGLRenderingContext__Constants.VERTEX_ATTRIB_ARRAY_STRIDE;
@JsOverlay
public static final int VERTEX_ATTRIB_ARRAY_TYPE=WebGLRenderingContext__Constants.VERTEX_ATTRIB_ARRAY_TYPE;
@JsOverlay
public static final int VERTEX_SHADER=WebGLRenderingContext__Constants.VERTEX_SHADER;
@JsOverlay
public static final int VIEWPORT=WebGLRenderingContext__Constants.VIEWPORT;
@JsOverlay
public static final int ZERO=WebGLRenderingContext__Constants.ZERO;
public HTMLCanvasElement canvas;
public int drawingBufferHeight;
public int drawingBufferWidth;
public native void activeTexture(int texture);
public native void attachShader(WebGLProgram program,WebGLShader shader);
public native void bindAttribLocation(WebGLProgram program,int index,String name);
public native void bindBuffer(int target,WebGLBuffer buffer);
public native void bindFramebuffer(int target,WebGLFramebuffer buffer);
public native void bindRenderbuffer(int target,WebGLRenderbuffer buffer);
public native void bindTexture(int target,WebGLTexture texture);
public native void blendColor(double red,double green,double blue,double alpha);
public native void blendEquation(int mode);
public native void blendEquationSeparate(int modeRGB,int modeAlpha);
public native void blendFunc(int sfactor,int dfactor);
public native void blendFuncSeparate(int srcRGB,int dstRGB,int srcAlpha,int dstAlpha);
@JsOverlay
public final void bufferData(int target,ArrayBuffer data,int usage){
bufferData(target,Js.<WebGLRenderingContext.BufferDataDataUnionType>uncheckedCast(data),usage);
}
@JsOverlay
public final void bufferData(int target,ArrayBufferView data,int usage){
bufferData(target,Js.<WebGLRenderingContext.BufferDataDataUnionType>uncheckedCast(data),usage);
}
public native void bufferData(int target,WebGLRenderingContext.BufferDataDataUnionType data,int usage);
@JsOverlay
public final void bufferData(int target,double data,int usage){
bufferData(target,Js.<WebGLRenderingContext.BufferDataDataUnionType>uncheckedCast(data),usage);
}
@JsOverlay
public final void bufferSubData(int target,double offset,ArrayBuffer data){
bufferSubData(target,offset,Js.<WebGLRenderingContext.BufferSubDataDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void bufferSubData(int target,double offset,ArrayBufferView data){
bufferSubData(target,offset,Js.<WebGLRenderingContext.BufferSubDataDataUnionType>uncheckedCast(data));
}
public native void bufferSubData(int target,double offset,WebGLRenderingContext.BufferSubDataDataUnionType data);
public native int checkFramebufferStatus(int target);
public native void clear(int mask);
public native void clearColor(double red,double green,double blue,double alpha);
public native void clearDepth(double depth);
public native void clearStencil(int s);
public native void colorMask(boolean red,boolean green,boolean blue,boolean alpha);
public native void compileShader(WebGLShader shader);
public native void compressedTexImage2D(int target,int level,int internalformat,int width,int height,int border,ArrayBufferView data);
public native void compressedTexSubImage2D(int target,int level,int xoffset,int yoffset,int width,int height,int format,ArrayBufferView data);
public native void copyTexImage2D(int target,int level,int format,int x,int y,int width,int height,int border);
public native void copyTexSubImage2D(int target,int level,int xoffset,int yoffset,int x,int y,int width,int height);
public native WebGLBuffer createBuffer();
public native WebGLFramebuffer createFramebuffer();
public native WebGLProgram createProgram();
public native WebGLRenderbuffer createRenderbuffer();
public native WebGLShader createShader(int type);
public native WebGLTexture createTexture();
public native void cullFace(int mode);
public native void deleteBuffer(WebGLBuffer buffer);
public native void deleteFramebuffer(WebGLFramebuffer buffer);
public native void deleteProgram(WebGLProgram program);
public native void deleteRenderbuffer(WebGLRenderbuffer buffer);
public native void deleteShader(WebGLShader shader);
public native void deleteTexture(WebGLTexture texture);
public native void depthFunc(int func);
public native void depthMask(boolean flag);
public native void depthRange(double nearVal,double farVal);
public native void detachShader(WebGLProgram program,WebGLShader shader);
public native void disable(int flags);
public native void disableVertexAttribArray(int index);
public native void drawArrays(int mode,int first,int count);
public native void drawElements(int mode,int count,int type,double offset);
public native void enable(int cap);
public native void enableVertexAttribArray(int index);
public native Object finish();
public native Object flush();
public native void framebufferRenderbuffer(int target,int attachment,int renderbuffertarget,WebGLRenderbuffer renderbuffer);
public native void framebufferTexture2D(int target,int attachment,int textarget,WebGLTexture texture,int level);
public native void frontFace(int mode);
public native void generateMipmap(int target);
public native WebGLActiveInfo getActiveAttrib(WebGLProgram program,int index);
public native WebGLActiveInfo getActiveUniform(WebGLProgram program,int index);
public native JsArray<WebGLShader> getAttachedShaders(WebGLProgram program);
public native int getAttribLocation(WebGLProgram program,String name);
public native Object getBufferParameter(int target,int pname);
public native WebGLContextAttributes getContextAttributes();
public native int getError();
public native JsObject getExtension(String name);
public native Object getFramebufferAttachmentParameter(int target,int attachment,int pname);
public native Object getParameter(int pname);
public native String getProgramInfoLog(WebGLProgram program);
public native Object getProgramParameter(WebGLProgram program,int pname);
public native Object getRenderbufferParameter(int target,int pname);
public native String getShaderInfoLog(WebGLShader shader);
public native Object getShaderParameter(WebGLShader shader,int pname);
public native WebGLShaderPrecisionFormat getShaderPrecisionFormat(int shadertype,int precisiontype);
public native String getShaderSource(WebGLShader shader);
public native JsArray<String> getSupportedExtensions();
public native Object getTexParameter(int target,int pname);
public native Object getUniform(WebGLProgram program,WebGLUniformLocation location);
public native WebGLUniformLocation getUniformLocation(WebGLProgram program,String name);
public native Object getVertexAttrib(int index,int pname);
public native double getVertexAttribOffset(int index,int pname);
public native void hint(int target,int mode);
public native boolean isBuffer(WebGLObject buffer);
public native boolean isContextLost();
public native boolean isEnabled(int cap);
public native boolean isFramebuffer(WebGLObject framebuffer);
public native boolean isProgram(WebGLObject program);
public native boolean isRenderbuffer(WebGLObject renderbuffer);
public native boolean isShader(WebGLObject shader);
public native boolean isTexture(WebGLObject texture);
public native void lineWidth(double width);
public native void linkProgram(WebGLProgram program);
public native void pixelStorei(int pname,WebGLRenderingContext.PixelStoreiParamUnionType param);
@JsOverlay
public final void pixelStorei(int pname,boolean param){
pixelStorei(pname,Js.<WebGLRenderingContext.PixelStoreiParamUnionType>uncheckedCast(param));
}
@JsOverlay
public final void pixelStorei(int pname,int param){
pixelStorei(pname,Js.<WebGLRenderingContext.PixelStoreiParamUnionType>uncheckedCast(param));
}
public native void polygonOffset(double factor,double units);
public native void readPixels(int x,int y,int width,int height,int format,int type,ArrayBufferView pixels);
public native void renderbufferStorage(int target,int internalformat,int width,int height);
public native void sampleCoverage(double coverage,boolean invert);
public native void scissor(int x,int y,int width,int height);
public native void shaderSource(WebGLShader shader,String source);
public native void stencilFunc(int func,int ref,int mask);
public native void stencilFuncSeparate(int face,int func,int ref,int mask);
public native void stencilMask(int mask);
public native void stencilMaskSeparate(int face,int mask);
public native void stencilOp(int fail,int zfail,int zpass);
public native void stencilOpSeparate(int face,int fail,int zfail,int zpass);
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLCanvasElement img,int format0,int type0,ArrayBufferView pixels){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0,pixels);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLCanvasElement img,int format0,int type0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLCanvasElement img,int format0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLCanvasElement img){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img));
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLImageElement img,int format0,int type0,ArrayBufferView pixels){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0,pixels);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLImageElement img,int format0,int type0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLImageElement img,int format0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLImageElement img){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img));
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLVideoElement img,int format0,int type0,ArrayBufferView pixels){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0,pixels);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLVideoElement img,int format0,int type0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLVideoElement img,int format0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,HTMLVideoElement img){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img));
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageBitmap img,int format0,int type0,ArrayBufferView pixels){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0,pixels);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageBitmap img,int format0,int type0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageBitmap img,int format0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageBitmap img){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img));
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageData img,int format0,int type0,ArrayBufferView pixels){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0,pixels);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageData img,int format0,int type0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageData img,int format0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,ImageData img){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img));
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,OffscreenCanvas img,int format0,int type0,ArrayBufferView pixels){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0,pixels);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,OffscreenCanvas img,int format0,int type0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,OffscreenCanvas img,int format0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,OffscreenCanvas img){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img));
}
public native void texImage2D(int target,int level,int internalformat,int format,int type,WebGLRenderingContext.TexImage2DImgUnionType img,int format0,int type0,ArrayBufferView pixels);
public native void texImage2D(int target,int level,int internalformat,int format,int type,WebGLRenderingContext.TexImage2DImgUnionType img,int format0,int type0);
public native void texImage2D(int target,int level,int internalformat,int format,int type,WebGLRenderingContext.TexImage2DImgUnionType img,int format0);
public native void texImage2D(int target,int level,int internalformat,int format,int type,WebGLRenderingContext.TexImage2DImgUnionType img);
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,int img,int format0,int type0,ArrayBufferView pixels){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0,pixels);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,int img,int format0,int type0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0,type0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,int img,int format0){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img),format0);
}
@JsOverlay
public final void texImage2D(int target,int level,int internalformat,int format,int type,int img){
texImage2D(target,level,internalformat,format,type,Js.<WebGLRenderingContext.TexImage2DImgUnionType>uncheckedCast(img));
}
public native void texParameterf(int target,int pname,double param);
public native void texParameteri(int target,int pname,int param);
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLCanvasElement data,int type0,ArrayBufferView pixels){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0,pixels);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLCanvasElement data,int type0){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLCanvasElement data){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLImageElement data,int type0,ArrayBufferView pixels){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0,pixels);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLImageElement data,int type0){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLImageElement data){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLVideoElement data,int type0,ArrayBufferView pixels){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0,pixels);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLVideoElement data,int type0){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,HTMLVideoElement data){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,ImageBitmap data,int type0,ArrayBufferView pixels){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0,pixels);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,ImageBitmap data,int type0){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,ImageBitmap data){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,ImageData data,int type0,ArrayBufferView pixels){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0,pixels);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,ImageData data,int type0){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,ImageData data){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,OffscreenCanvas data,int type0,ArrayBufferView pixels){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0,pixels);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,OffscreenCanvas data,int type0){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,OffscreenCanvas data){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data));
}
public native void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,WebGLRenderingContext.TexSubImage2DDataUnionType data,int type0,ArrayBufferView pixels);
public native void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,WebGLRenderingContext.TexSubImage2DDataUnionType data,int type0);
public native void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,WebGLRenderingContext.TexSubImage2DDataUnionType data);
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,double data,int type0,ArrayBufferView pixels){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0,pixels);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,double data,int type0){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data),type0);
}
@JsOverlay
public final void texSubImage2D(int target,int level,int xoffset,int yoffset,int format,int type,double data){
texSubImage2D(target,level,xoffset,yoffset,format,type,Js.<WebGLRenderingContext.TexSubImage2DDataUnionType>uncheckedCast(data));
}
public native void uniform1f(WebGLUniformLocation location,double value);
@JsOverlay
public final void uniform1fv(WebGLUniformLocation location,Float32Array value){
uniform1fv(location,Js.<WebGLRenderingContext.Uniform1fvValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform1fv(WebGLUniformLocation location,JsArray<Double> value){
uniform1fv(location,Js.<WebGLRenderingContext.Uniform1fvValueUnionType>uncheckedCast(value));
}
public native void uniform1fv(WebGLUniformLocation location,WebGLRenderingContext.Uniform1fvValueUnionType value);
@JsOverlay
public final void uniform1fv(WebGLUniformLocation location,double[] value){
uniform1fv(location,Js.<JsArray<Double>>uncheckedCast(value));
}
public native void uniform1i(WebGLUniformLocation location,WebGLRenderingContext.Uniform1iValueUnionType value);
@JsOverlay
public final void uniform1i(WebGLUniformLocation location,boolean value){
uniform1i(location,Js.<WebGLRenderingContext.Uniform1iValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform1i(WebGLUniformLocation location,int value){
uniform1i(location,Js.<WebGLRenderingContext.Uniform1iValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform1iv(WebGLUniformLocation location,Int32Array value){
uniform1iv(location,Js.<WebGLRenderingContext.Uniform1ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform1iv(WebGLUniformLocation location,JsArray<Object> value){
uniform1iv(location,Js.<WebGLRenderingContext.Uniform1ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform1iv(WebGLUniformLocation location,Object[] value){
uniform1iv(location,Js.<JsArray<Object>>uncheckedCast(value));
}
public native void uniform1iv(WebGLUniformLocation location,WebGLRenderingContext.Uniform1ivValueUnionType value);
public native void uniform2f(WebGLUniformLocation location,double value1,double value2);
@JsOverlay
public final void uniform2fv(WebGLUniformLocation location,Float32Array value){
uniform2fv(location,Js.<WebGLRenderingContext.Uniform2fvValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform2fv(WebGLUniformLocation location,JsArray<Double> value){
uniform2fv(location,Js.<WebGLRenderingContext.Uniform2fvValueUnionType>uncheckedCast(value));
}
public native void uniform2fv(WebGLUniformLocation location,WebGLRenderingContext.Uniform2fvValueUnionType value);
@JsOverlay
public final void uniform2fv(WebGLUniformLocation location,double[] value){
uniform2fv(location,Js.<JsArray<Double>>uncheckedCast(value));
}
public native void uniform2i(WebGLUniformLocation location,WebGLRenderingContext.Uniform2iValue1UnionType value1,WebGLRenderingContext.Uniform2iValue2UnionType value2);
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,WebGLRenderingContext.Uniform2iValue1UnionType value1,boolean value2){
uniform2i(location,value1,Js.<WebGLRenderingContext.Uniform2iValue2UnionType>uncheckedCast(value2));
}
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,WebGLRenderingContext.Uniform2iValue1UnionType value1,int value2){
uniform2i(location,value1,Js.<WebGLRenderingContext.Uniform2iValue2UnionType>uncheckedCast(value2));
}
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform2iValue2UnionType value2){
uniform2i(location,Js.<WebGLRenderingContext.Uniform2iValue1UnionType>uncheckedCast(value1),value2);
}
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,boolean value1,boolean value2){
uniform2i(location,Js.<WebGLRenderingContext.Uniform2iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform2iValue2UnionType>uncheckedCast(value2));
}
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,boolean value1,int value2){
uniform2i(location,Js.<WebGLRenderingContext.Uniform2iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform2iValue2UnionType>uncheckedCast(value2));
}
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform2iValue2UnionType value2){
uniform2i(location,Js.<WebGLRenderingContext.Uniform2iValue1UnionType>uncheckedCast(value1),value2);
}
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,int value1,boolean value2){
uniform2i(location,Js.<WebGLRenderingContext.Uniform2iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform2iValue2UnionType>uncheckedCast(value2));
}
@JsOverlay
public final void uniform2i(WebGLUniformLocation location,int value1,int value2){
uniform2i(location,Js.<WebGLRenderingContext.Uniform2iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform2iValue2UnionType>uncheckedCast(value2));
}
@JsOverlay
public final void uniform2iv(WebGLUniformLocation location,Int32Array value){
uniform2iv(location,Js.<WebGLRenderingContext.Uniform2ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform2iv(WebGLUniformLocation location,JsArray<Object> value){
uniform2iv(location,Js.<WebGLRenderingContext.Uniform2ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform2iv(WebGLUniformLocation location,Object[] value){
uniform2iv(location,Js.<JsArray<Object>>uncheckedCast(value));
}
public native void uniform2iv(WebGLUniformLocation location,WebGLRenderingContext.Uniform2ivValueUnionType value);
public native void uniform3f(WebGLUniformLocation location,double value1,double value2,double value3);
@JsOverlay
public final void uniform3fv(WebGLUniformLocation location,Float32Array value){
uniform3fv(location,Js.<WebGLRenderingContext.Uniform3fvValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform3fv(WebGLUniformLocation location,JsArray<Double> value){
uniform3fv(location,Js.<WebGLRenderingContext.Uniform3fvValueUnionType>uncheckedCast(value));
}
public native void uniform3fv(WebGLUniformLocation location,WebGLRenderingContext.Uniform3fvValueUnionType value);
@JsOverlay
public final void uniform3fv(WebGLUniformLocation location,double[] value){
uniform3fv(location,Js.<JsArray<Double>>uncheckedCast(value));
}
public native void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,WebGLRenderingContext.Uniform3iValue3UnionType value3);
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,boolean value3){
uniform3i(location,value1,value2,Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,int value3){
uniform3i(location,value1,value2,Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,boolean value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,value1,Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,boolean value2,boolean value3){
uniform3i(location,value1,Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,boolean value2,int value3){
uniform3i(location,value1,Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,int value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,value1,Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,int value2,boolean value3){
uniform3i(location,value1,Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,WebGLRenderingContext.Uniform3iValue1UnionType value1,int value2,int value3){
uniform3i(location,value1,Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),value2,value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,boolean value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,int value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,boolean value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,boolean value2,boolean value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,boolean value2,int value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,int value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,int value2,boolean value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,boolean value1,int value2,int value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),value2,value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,boolean value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform3iValue2UnionType value2,int value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,boolean value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,boolean value2,boolean value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,boolean value2,int value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,int value2,WebGLRenderingContext.Uniform3iValue3UnionType value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),value3);
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,int value2,boolean value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3i(WebGLUniformLocation location,int value1,int value2,int value3){
uniform3i(location,Js.<WebGLRenderingContext.Uniform3iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform3iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform3iValue3UnionType>uncheckedCast(value3));
}
@JsOverlay
public final void uniform3iv(WebGLUniformLocation location,Int32Array value){
uniform3iv(location,Js.<WebGLRenderingContext.Uniform3ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform3iv(WebGLUniformLocation location,JsArray<Object> value){
uniform3iv(location,Js.<WebGLRenderingContext.Uniform3ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform3iv(WebGLUniformLocation location,Object[] value){
uniform3iv(location,Js.<JsArray<Object>>uncheckedCast(value));
}
public native void uniform3iv(WebGLUniformLocation location,WebGLRenderingContext.Uniform3ivValueUnionType value);
public native void uniform4f(WebGLUniformLocation location,double value1,double value2,double value3,double value4);
@JsOverlay
public final void uniform4fv(WebGLUniformLocation location,Float32Array value){
uniform4fv(location,Js.<WebGLRenderingContext.Uniform4fvValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform4fv(WebGLUniformLocation location,JsArray<Double> value){
uniform4fv(location,Js.<WebGLRenderingContext.Uniform4fvValueUnionType>uncheckedCast(value));
}
public native void uniform4fv(WebGLUniformLocation location,WebGLRenderingContext.Uniform4fvValueUnionType value);
@JsOverlay
public final void uniform4fv(WebGLUniformLocation location,double[] value){
uniform4fv(location,Js.<JsArray<Double>>uncheckedCast(value));
}
public native void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4);
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,value1,value2,value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,value1,value2,value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,boolean value4){
uniform4i(location,value1,value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,int value4){
uniform4i(location,value1,value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,boolean value4){
uniform4i(location,value1,value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,int value4){
uniform4i(location,value1,value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,boolean value3,boolean value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,boolean value3,int value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,int value3,boolean value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,boolean value2,int value3,int value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,boolean value3,boolean value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,boolean value3,int value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,int value3,boolean value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,WebGLRenderingContext.Uniform4iValue1UnionType value1,int value2,int value3,int value4){
uniform4i(location,value1,Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,boolean value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,boolean value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,int value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,boolean value2,int value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,boolean value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,boolean value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,int value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,boolean value1,int value2,int value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,boolean value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,WebGLRenderingContext.Uniform4iValue2UnionType value2,int value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),value2,Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,boolean value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,boolean value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,int value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,boolean value2,int value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,WebGLRenderingContext.Uniform4iValue3UnionType value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),value3,Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,boolean value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,boolean value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,boolean value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,int value3,WebGLRenderingContext.Uniform4iValue4UnionType value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),value4);
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,int value3,boolean value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4i(WebGLUniformLocation location,int value1,int value2,int value3,int value4){
uniform4i(location,Js.<WebGLRenderingContext.Uniform4iValue1UnionType>uncheckedCast(value1),Js.<WebGLRenderingContext.Uniform4iValue2UnionType>uncheckedCast(value2),Js.<WebGLRenderingContext.Uniform4iValue3UnionType>uncheckedCast(value3),Js.<WebGLRenderingContext.Uniform4iValue4UnionType>uncheckedCast(value4));
}
@JsOverlay
public final void uniform4iv(WebGLUniformLocation location,Int32Array value){
uniform4iv(location,Js.<WebGLRenderingContext.Uniform4ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform4iv(WebGLUniformLocation location,JsArray<Object> value){
uniform4iv(location,Js.<WebGLRenderingContext.Uniform4ivValueUnionType>uncheckedCast(value));
}
@JsOverlay
public final void uniform4iv(WebGLUniformLocation location,Object[] value){
uniform4iv(location,Js.<JsArray<Object>>uncheckedCast(value));
}
public native void uniform4iv(WebGLUniformLocation location,WebGLRenderingContext.Uniform4ivValueUnionType value);
@JsOverlay
public final void uniformMatrix2fv(WebGLUniformLocation location,boolean transpose,Float32Array data){
uniformMatrix2fv(location,transpose,Js.<WebGLRenderingContext.UniformMatrix2fvDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void uniformMatrix2fv(WebGLUniformLocation location,boolean transpose,JsArray<Double> data){
uniformMatrix2fv(location,transpose,Js.<WebGLRenderingContext.UniformMatrix2fvDataUnionType>uncheckedCast(data));
}
public native void uniformMatrix2fv(WebGLUniformLocation location,boolean transpose,WebGLRenderingContext.UniformMatrix2fvDataUnionType data);
@JsOverlay
public final void uniformMatrix2fv(WebGLUniformLocation location,boolean transpose,double[] data){
uniformMatrix2fv(location,transpose,Js.<JsArray<Double>>uncheckedCast(data));
}
@JsOverlay
public final void uniformMatrix3fv(WebGLUniformLocation location,boolean transpose,Float32Array data){
uniformMatrix3fv(location,transpose,Js.<WebGLRenderingContext.UniformMatrix3fvDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void uniformMatrix3fv(WebGLUniformLocation location,boolean transpose,JsArray<Double> data){
uniformMatrix3fv(location,transpose,Js.<WebGLRenderingContext.UniformMatrix3fvDataUnionType>uncheckedCast(data));
}
public native void uniformMatrix3fv(WebGLUniformLocation location,boolean transpose,WebGLRenderingContext.UniformMatrix3fvDataUnionType data);
@JsOverlay
public final void uniformMatrix3fv(WebGLUniformLocation location,boolean transpose,double[] data){
uniformMatrix3fv(location,transpose,Js.<JsArray<Double>>uncheckedCast(data));
}
@JsOverlay
public final void uniformMatrix4fv(WebGLUniformLocation location,boolean transpose,Float32Array data){
uniformMatrix4fv(location,transpose,Js.<WebGLRenderingContext.UniformMatrix4fvDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void uniformMatrix4fv(WebGLUniformLocation location,boolean transpose,JsArray<Double> data){
uniformMatrix4fv(location,transpose,Js.<WebGLRenderingContext.UniformMatrix4fvDataUnionType>uncheckedCast(data));
}
public native void uniformMatrix4fv(WebGLUniformLocation location,boolean transpose,WebGLRenderingContext.UniformMatrix4fvDataUnionType data);
@JsOverlay
public final void uniformMatrix4fv(WebGLUniformLocation location,boolean transpose,double[] data){
uniformMatrix4fv(location,transpose,Js.<JsArray<Double>>uncheckedCast(data));
}
public native void useProgram(WebGLProgram program);
public native void validateProgram(WebGLProgram program);
public native void vertexAttrib1f(int indx,double x);
@JsOverlay
public final void vertexAttrib1fv(int indx,Float32Array values){
vertexAttrib1fv(indx,Js.<WebGLRenderingContext.VertexAttrib1fvValuesUnionType>uncheckedCast(values));
}
@JsOverlay
public final void vertexAttrib1fv(int indx,JsArray<Double> values){
vertexAttrib1fv(indx,Js.<WebGLRenderingContext.VertexAttrib1fvValuesUnionType>uncheckedCast(values));
}
public native void vertexAttrib1fv(int indx,WebGLRenderingContext.VertexAttrib1fvValuesUnionType values);
@JsOverlay
public final void vertexAttrib1fv(int indx,double[] values){
vertexAttrib1fv(indx,Js.<JsArray<Double>>uncheckedCast(values));
}
public native void vertexAttrib2f(int indx,double x,double y);
@JsOverlay
public final void vertexAttrib2fv(int indx,Float32Array values){
vertexAttrib2fv(indx,Js.<WebGLRenderingContext.VertexAttrib2fvValuesUnionType>uncheckedCast(values));
}
@JsOverlay
public final void vertexAttrib2fv(int indx,JsArray<Double> values){
vertexAttrib2fv(indx,Js.<WebGLRenderingContext.VertexAttrib2fvValuesUnionType>uncheckedCast(values));
}
public native void vertexAttrib2fv(int indx,WebGLRenderingContext.VertexAttrib2fvValuesUnionType values);
@JsOverlay
public final void vertexAttrib2fv(int indx,double[] values){
vertexAttrib2fv(indx,Js.<JsArray<Double>>uncheckedCast(values));
}
public native void vertexAttrib3f(int indx,double x,double y,double z);
@JsOverlay
public final void vertexAttrib3fv(int indx,Float32Array values){
vertexAttrib3fv(indx,Js.<WebGLRenderingContext.VertexAttrib3fvValuesUnionType>uncheckedCast(values));
}
@JsOverlay
public final void vertexAttrib3fv(int indx,JsArray<Double> values){
vertexAttrib3fv(indx,Js.<WebGLRenderingContext.VertexAttrib3fvValuesUnionType>uncheckedCast(values));
}
public native void vertexAttrib3fv(int indx,WebGLRenderingContext.VertexAttrib3fvValuesUnionType values);
@JsOverlay
public final void vertexAttrib3fv(int indx,double[] values){
vertexAttrib3fv(indx,Js.<JsArray<Double>>uncheckedCast(values));
}
public native void vertexAttrib4f(int indx,double x,double y,double z,double w);
@JsOverlay
public final void vertexAttrib4fv(int indx,Float32Array values){
vertexAttrib4fv(indx,Js.<WebGLRenderingContext.VertexAttrib4fvValuesUnionType>uncheckedCast(values));
}
@JsOverlay
public final void vertexAttrib4fv(int indx,JsArray<Double> values){
vertexAttrib4fv(indx,Js.<WebGLRenderingContext.VertexAttrib4fvValuesUnionType>uncheckedCast(values));
}
public native void vertexAttrib4fv(int indx,WebGLRenderingContext.VertexAttrib4fvValuesUnionType values);
@JsOverlay
public final void vertexAttrib4fv(int indx,double[] values){
vertexAttrib4fv(indx,Js.<JsArray<Double>>uncheckedCast(values));
}
public native void vertexAttribPointer(int indx,int size,int type,boolean normalized,int stride,double offset);
public native void viewport(int x,int y,int width,int height);
}

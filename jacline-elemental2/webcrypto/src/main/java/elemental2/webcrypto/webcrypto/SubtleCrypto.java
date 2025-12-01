package elemental2.webcrypto.webcrypto;
import org.jspecify.annotations.Nullable;
import elemental2.webcrypto.webcrypto.JsonWebKey;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.webcrypto.CryptoKey;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import elemental2.webcrypto.CryptoKeyPair;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import elemental2.webcrypto.webcrypto.Algorithm;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "webCrypto.SubtleCrypto",namespace = JsPackage.GLOBAL)
public class SubtleCrypto{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DecryptAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.DecryptAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DecryptDataUnionType{
@JsOverlay
static SubtleCrypto.DecryptDataUnionType of(Object o){
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
public interface DeriveBitsAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.DeriveBitsAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DeriveKeyAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.DeriveKeyAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DeriveKeyDerivedKeyAlgoUnionType{
@JsOverlay
static SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DeriveKeyPromiseTypeParameterUnionType{
@JsOverlay
static SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default CryptoKey asCryptoKey(){
return Js.cast(this);
}
@JsOverlay
default CryptoKeyPair asCryptoKeyPair(){
return Js.cast(this);
}
@JsOverlay
default boolean isCryptoKey(){
return (Object)this instanceof CryptoKey;
}
@JsOverlay
default boolean isCryptoKeyPair(){
return (Object)this instanceof CryptoKeyPair;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DigestAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.DigestAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DigestDataUnionType{
@JsOverlay
static SubtleCrypto.DigestDataUnionType of(Object o){
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
public interface EncryptAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.EncryptAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EncryptDataUnionType{
@JsOverlay
static SubtleCrypto.EncryptDataUnionType of(Object o){
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
public interface ExportKeyPromiseTypeParameterUnionType{
@JsOverlay
static SubtleCrypto.ExportKeyPromiseTypeParameterUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default JsonWebKey asJsonWebKey(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isJsonWebKey(){
return (Object)this instanceof JsonWebKey;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GenerateKeyAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.@Nullable GenerateKeyAlgorithmUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GenerateKeyPromiseTypeParameterUnionType{
@JsOverlay
static SubtleCrypto.GenerateKeyPromiseTypeParameterUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default CryptoKey asCryptoKey(){
return Js.cast(this);
}
@JsOverlay
default CryptoKeyPair asCryptoKeyPair(){
return Js.cast(this);
}
@JsOverlay
default boolean isCryptoKey(){
return (Object)this instanceof CryptoKey;
}
@JsOverlay
default boolean isCryptoKeyPair(){
return (Object)this instanceof CryptoKeyPair;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ImportKeyAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default @Nullable String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ImportKeyKeyDataUnionType{
@JsOverlay
static SubtleCrypto.ImportKeyKeyDataUnionType of(Object o){
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
default JsonWebKey asJsonWebKey(){
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
@JsOverlay
default boolean isJsonWebKey(){
return (Object)this instanceof JsonWebKey;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SignAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.SignAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SignDataUnionType{
@JsOverlay
static SubtleCrypto.SignDataUnionType of(Object o){
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
public interface UnwrapKeyUnwrapAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UnwrapKeyUnwrappedKeyAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UnwrapKeyWrappedKeyUnionType{
@JsOverlay
static SubtleCrypto.UnwrapKeyWrappedKeyUnionType of(Object o){
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
public interface VerifyAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.VerifyAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface VerifyDataUnionType{
@JsOverlay
static SubtleCrypto.VerifyDataUnionType of(Object o){
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
public interface VerifySignatureUnionType{
@JsOverlay
static SubtleCrypto.VerifySignatureUnionType of(Object o){
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
public interface WrapKeyWrapAlgorithmUnionType{
@JsOverlay
static SubtleCrypto.WrapKeyWrapAlgorithmUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Algorithm asAlgorithm(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsOverlay
public final Promise<ArrayBuffer> decrypt(Algorithm algorithm,CryptoKey key,ArrayBuffer data){
return decrypt(Js.<SubtleCrypto.DecryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.DecryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> decrypt(Algorithm algorithm,CryptoKey key,ArrayBufferView data){
return decrypt(Js.<SubtleCrypto.DecryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.DecryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> decrypt(Algorithm algorithm,CryptoKey key,SubtleCrypto.DecryptDataUnionType data){
return decrypt(Js.<SubtleCrypto.DecryptAlgorithmUnionType>uncheckedCast(algorithm),key,data);
}
@JsOverlay
public final Promise<ArrayBuffer> decrypt(SubtleCrypto.DecryptAlgorithmUnionType algorithm,CryptoKey key,ArrayBuffer data){
return decrypt(algorithm,key,Js.<SubtleCrypto.DecryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> decrypt(SubtleCrypto.DecryptAlgorithmUnionType algorithm,CryptoKey key,ArrayBufferView data){
return decrypt(algorithm,key,Js.<SubtleCrypto.DecryptDataUnionType>uncheckedCast(data));
}
public native Promise<ArrayBuffer> decrypt(SubtleCrypto.DecryptAlgorithmUnionType algorithm,CryptoKey key,SubtleCrypto.DecryptDataUnionType data);
@JsOverlay
public final Promise<ArrayBuffer> decrypt(String algorithm,CryptoKey key,ArrayBuffer data){
return decrypt(Js.<SubtleCrypto.DecryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.DecryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> decrypt(String algorithm,CryptoKey key,ArrayBufferView data){
return decrypt(Js.<SubtleCrypto.DecryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.DecryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> decrypt(String algorithm,CryptoKey key,SubtleCrypto.DecryptDataUnionType data){
return decrypt(Js.<SubtleCrypto.DecryptAlgorithmUnionType>uncheckedCast(algorithm),key,data);
}
@JsOverlay
public final Promise<ArrayBuffer> deriveBits(Algorithm algorithm,CryptoKey baseKey,double length){
return deriveBits(Js.<SubtleCrypto.DeriveBitsAlgorithmUnionType>uncheckedCast(algorithm),baseKey,length);
}
public native Promise<ArrayBuffer> deriveBits(SubtleCrypto.DeriveBitsAlgorithmUnionType algorithm,CryptoKey baseKey,double length);
@JsOverlay
public final Promise<ArrayBuffer> deriveBits(String algorithm,CryptoKey baseKey,double length){
return deriveBits(Js.<SubtleCrypto.DeriveBitsAlgorithmUnionType>uncheckedCast(algorithm),baseKey,length);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(Algorithm algorithm,CryptoKey baseKey,Algorithm derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(Js.<SubtleCrypto.DeriveKeyAlgorithmUnionType>uncheckedCast(algorithm),baseKey,Js.<SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType>uncheckedCast(derivedKeyAlgo),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(Algorithm algorithm,CryptoKey baseKey,Algorithm derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(Algorithm algorithm,CryptoKey baseKey,SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(Js.<SubtleCrypto.DeriveKeyAlgorithmUnionType>uncheckedCast(algorithm),baseKey,derivedKeyAlgo,extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(Algorithm algorithm,CryptoKey baseKey,SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(Algorithm algorithm,CryptoKey baseKey,String derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(Js.<SubtleCrypto.DeriveKeyAlgorithmUnionType>uncheckedCast(algorithm),baseKey,Js.<SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType>uncheckedCast(derivedKeyAlgo),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(Algorithm algorithm,CryptoKey baseKey,String derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(SubtleCrypto.DeriveKeyAlgorithmUnionType algorithm,CryptoKey baseKey,Algorithm derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(algorithm,baseKey,Js.<SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType>uncheckedCast(derivedKeyAlgo),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(SubtleCrypto.DeriveKeyAlgorithmUnionType algorithm,CryptoKey baseKey,Algorithm derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
public native Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(SubtleCrypto.DeriveKeyAlgorithmUnionType algorithm,CryptoKey baseKey,SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages);
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(SubtleCrypto.DeriveKeyAlgorithmUnionType algorithm,CryptoKey baseKey,SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(SubtleCrypto.DeriveKeyAlgorithmUnionType algorithm,CryptoKey baseKey,String derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(algorithm,baseKey,Js.<SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType>uncheckedCast(derivedKeyAlgo),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(SubtleCrypto.DeriveKeyAlgorithmUnionType algorithm,CryptoKey baseKey,String derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(String algorithm,CryptoKey baseKey,Algorithm derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(Js.<SubtleCrypto.DeriveKeyAlgorithmUnionType>uncheckedCast(algorithm),baseKey,Js.<SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType>uncheckedCast(derivedKeyAlgo),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(String algorithm,CryptoKey baseKey,Algorithm derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(String algorithm,CryptoKey baseKey,SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(Js.<SubtleCrypto.DeriveKeyAlgorithmUnionType>uncheckedCast(algorithm),baseKey,derivedKeyAlgo,extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(String algorithm,CryptoKey baseKey,SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(String algorithm,CryptoKey baseKey,String derivedKeyAlgo,boolean extractable,JsArray<String> keyUsages){
return deriveKey(Js.<SubtleCrypto.DeriveKeyAlgorithmUnionType>uncheckedCast(algorithm),baseKey,Js.<SubtleCrypto.DeriveKeyDerivedKeyAlgoUnionType>uncheckedCast(derivedKeyAlgo),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.DeriveKeyPromiseTypeParameterUnionType> deriveKey(String algorithm,CryptoKey baseKey,String derivedKeyAlgo,boolean extractable,String[] keyUsages){
return deriveKey(algorithm,baseKey,derivedKeyAlgo,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<ArrayBuffer> digest(Algorithm algorithm,ArrayBuffer data){
return digest(Js.<SubtleCrypto.DigestAlgorithmUnionType>uncheckedCast(algorithm),Js.<SubtleCrypto.DigestDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> digest(Algorithm algorithm,ArrayBufferView data){
return digest(Js.<SubtleCrypto.DigestAlgorithmUnionType>uncheckedCast(algorithm),Js.<SubtleCrypto.DigestDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> digest(Algorithm algorithm,SubtleCrypto.DigestDataUnionType data){
return digest(Js.<SubtleCrypto.DigestAlgorithmUnionType>uncheckedCast(algorithm),data);
}
@JsOverlay
public final Promise<ArrayBuffer> digest(SubtleCrypto.DigestAlgorithmUnionType algorithm,ArrayBuffer data){
return digest(algorithm,Js.<SubtleCrypto.DigestDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> digest(SubtleCrypto.DigestAlgorithmUnionType algorithm,ArrayBufferView data){
return digest(algorithm,Js.<SubtleCrypto.DigestDataUnionType>uncheckedCast(data));
}
public native Promise<ArrayBuffer> digest(SubtleCrypto.DigestAlgorithmUnionType algorithm,SubtleCrypto.DigestDataUnionType data);
@JsOverlay
public final Promise<ArrayBuffer> digest(String algorithm,ArrayBuffer data){
return digest(Js.<SubtleCrypto.DigestAlgorithmUnionType>uncheckedCast(algorithm),Js.<SubtleCrypto.DigestDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> digest(String algorithm,ArrayBufferView data){
return digest(Js.<SubtleCrypto.DigestAlgorithmUnionType>uncheckedCast(algorithm),Js.<SubtleCrypto.DigestDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> digest(String algorithm,SubtleCrypto.DigestDataUnionType data){
return digest(Js.<SubtleCrypto.DigestAlgorithmUnionType>uncheckedCast(algorithm),data);
}
@JsOverlay
public final Promise<ArrayBuffer> encrypt(Algorithm algorithm,CryptoKey key,ArrayBuffer data){
return encrypt(Js.<SubtleCrypto.EncryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.EncryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> encrypt(Algorithm algorithm,CryptoKey key,ArrayBufferView data){
return encrypt(Js.<SubtleCrypto.EncryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.EncryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> encrypt(Algorithm algorithm,CryptoKey key,SubtleCrypto.EncryptDataUnionType data){
return encrypt(Js.<SubtleCrypto.EncryptAlgorithmUnionType>uncheckedCast(algorithm),key,data);
}
@JsOverlay
public final Promise<ArrayBuffer> encrypt(SubtleCrypto.EncryptAlgorithmUnionType algorithm,CryptoKey key,ArrayBuffer data){
return encrypt(algorithm,key,Js.<SubtleCrypto.EncryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> encrypt(SubtleCrypto.EncryptAlgorithmUnionType algorithm,CryptoKey key,ArrayBufferView data){
return encrypt(algorithm,key,Js.<SubtleCrypto.EncryptDataUnionType>uncheckedCast(data));
}
public native Promise<ArrayBuffer> encrypt(SubtleCrypto.EncryptAlgorithmUnionType algorithm,CryptoKey key,SubtleCrypto.EncryptDataUnionType data);
@JsOverlay
public final Promise<ArrayBuffer> encrypt(String algorithm,CryptoKey key,ArrayBuffer data){
return encrypt(Js.<SubtleCrypto.EncryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.EncryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> encrypt(String algorithm,CryptoKey key,ArrayBufferView data){
return encrypt(Js.<SubtleCrypto.EncryptAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.EncryptDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> encrypt(String algorithm,CryptoKey key,SubtleCrypto.EncryptDataUnionType data){
return encrypt(Js.<SubtleCrypto.EncryptAlgorithmUnionType>uncheckedCast(algorithm),key,data);
}
public native Promise<SubtleCrypto.ExportKeyPromiseTypeParameterUnionType> exportKey(String format,CryptoKey key);
@JsOverlay
public final Promise<SubtleCrypto.GenerateKeyPromiseTypeParameterUnionType> generateKey(Algorithm algorithm,boolean extractable,JsArray<String> keyUsages){
return generateKey(Js.<SubtleCrypto.@Nullable GenerateKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.GenerateKeyPromiseTypeParameterUnionType> generateKey(Algorithm algorithm,boolean extractable,String[] keyUsages){
return generateKey(algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
public native Promise<SubtleCrypto.GenerateKeyPromiseTypeParameterUnionType> generateKey(SubtleCrypto.@Nullable GenerateKeyAlgorithmUnionType algorithm,boolean extractable,JsArray<String> keyUsages);
@JsOverlay
public final Promise<SubtleCrypto.GenerateKeyPromiseTypeParameterUnionType> generateKey(SubtleCrypto.@Nullable GenerateKeyAlgorithmUnionType algorithm,boolean extractable,String[] keyUsages){
return generateKey(algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<SubtleCrypto.GenerateKeyPromiseTypeParameterUnionType> generateKey(String algorithm,boolean extractable,JsArray<String> keyUsages){
return generateKey(Js.<SubtleCrypto.@Nullable GenerateKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<SubtleCrypto.GenerateKeyPromiseTypeParameterUnionType> generateKey(String algorithm,boolean extractable,String[] keyUsages){
return generateKey(algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBuffer keyData,Algorithm algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBuffer keyData,Algorithm algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBuffer keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),algorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBuffer keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBuffer keyData,String algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBuffer keyData,String algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBufferView keyData,Algorithm algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBufferView keyData,Algorithm algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBufferView keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),algorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBufferView keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBufferView keyData,String algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,ArrayBufferView keyData,String algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,SubtleCrypto.ImportKeyKeyDataUnionType keyData,Algorithm algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,keyData,Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,SubtleCrypto.ImportKeyKeyDataUnionType keyData,Algorithm algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
public native Promise<CryptoKey> importKey(String format,SubtleCrypto.ImportKeyKeyDataUnionType keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,JsArray<String> keyUsages);
@JsOverlay
public final Promise<CryptoKey> importKey(String format,SubtleCrypto.ImportKeyKeyDataUnionType keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,SubtleCrypto.ImportKeyKeyDataUnionType keyData,String algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,keyData,Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,SubtleCrypto.ImportKeyKeyDataUnionType keyData,String algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,JsonWebKey keyData,Algorithm algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,JsonWebKey keyData,Algorithm algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,JsonWebKey keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),algorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,JsonWebKey keyData,SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,JsonWebKey keyData,String algorithm,boolean extractable,JsArray<String> keyUsages){
return importKey(format,Js.<SubtleCrypto.ImportKeyKeyDataUnionType>uncheckedCast(keyData),Js.<SubtleCrypto.@Nullable ImportKeyAlgorithmUnionType>uncheckedCast(algorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> importKey(String format,JsonWebKey keyData,String algorithm,boolean extractable,String[] keyUsages){
return importKey(format,keyData,algorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<ArrayBuffer> sign(Algorithm algorithm,CryptoKey key,ArrayBuffer data){
return sign(Js.<SubtleCrypto.SignAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.SignDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> sign(Algorithm algorithm,CryptoKey key,ArrayBufferView data){
return sign(Js.<SubtleCrypto.SignAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.SignDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> sign(Algorithm algorithm,CryptoKey key,SubtleCrypto.SignDataUnionType data){
return sign(Js.<SubtleCrypto.SignAlgorithmUnionType>uncheckedCast(algorithm),key,data);
}
@JsOverlay
public final Promise<ArrayBuffer> sign(SubtleCrypto.SignAlgorithmUnionType algorithm,CryptoKey key,ArrayBuffer data){
return sign(algorithm,key,Js.<SubtleCrypto.SignDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> sign(SubtleCrypto.SignAlgorithmUnionType algorithm,CryptoKey key,ArrayBufferView data){
return sign(algorithm,key,Js.<SubtleCrypto.SignDataUnionType>uncheckedCast(data));
}
public native Promise<ArrayBuffer> sign(SubtleCrypto.SignAlgorithmUnionType algorithm,CryptoKey key,SubtleCrypto.SignDataUnionType data);
@JsOverlay
public final Promise<ArrayBuffer> sign(String algorithm,CryptoKey key,ArrayBuffer data){
return sign(Js.<SubtleCrypto.SignAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.SignDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> sign(String algorithm,CryptoKey key,ArrayBufferView data){
return sign(Js.<SubtleCrypto.SignAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.SignDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<ArrayBuffer> sign(String algorithm,CryptoKey key,SubtleCrypto.SignDataUnionType data){
return sign(Js.<SubtleCrypto.SignAlgorithmUnionType>uncheckedCast(algorithm),key,data);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,unwrapAlgorithm,Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,unwrapAlgorithm,Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBuffer wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,unwrapAlgorithm,Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,unwrapAlgorithm,Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,Js.<SubtleCrypto.UnwrapKeyWrappedKeyUnionType>uncheckedCast(wrappedKey),unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,ArrayBufferView wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,Algorithm unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,Js.<SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType>uncheckedCast(unwrapAlgorithm),unwrappedKeyAlgorithm,extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,String unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,Algorithm unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,Js.<SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType>uncheckedCast(unwrappedKeyAlgorithm),extractable,keyUsages);
}
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,String unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
public native Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,JsArray<String> keyUsages);
@JsOverlay
public final Promise<CryptoKey> unwrapKey(String format,SubtleCrypto.UnwrapKeyWrappedKeyUnionType wrappedKey,CryptoKey unwrappingKey,SubtleCrypto.UnwrapKeyUnwrapAlgorithmUnionType unwrapAlgorithm,SubtleCrypto.UnwrapKeyUnwrappedKeyAlgorithmUnionType unwrappedKeyAlgorithm,boolean extractable,String[] keyUsages){
return unwrapKey(format,wrappedKey,unwrappingKey,unwrapAlgorithm,unwrappedKeyAlgorithm,extractable,Js.<JsArray<String>>uncheckedCast(keyUsages));
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,ArrayBuffer signature,ArrayBuffer data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,ArrayBuffer signature,ArrayBufferView data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,ArrayBuffer signature,SubtleCrypto.VerifyDataUnionType data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),data);
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,ArrayBufferView signature,ArrayBuffer data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,ArrayBufferView signature,ArrayBufferView data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,ArrayBufferView signature,SubtleCrypto.VerifyDataUnionType data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),data);
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,ArrayBuffer data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,signature,Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,ArrayBufferView data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,signature,Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(Algorithm algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,SubtleCrypto.VerifyDataUnionType data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,signature,data);
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,ArrayBuffer signature,ArrayBuffer data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,ArrayBuffer signature,ArrayBufferView data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,ArrayBuffer signature,SubtleCrypto.VerifyDataUnionType data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),data);
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,ArrayBufferView signature,ArrayBuffer data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,ArrayBufferView signature,ArrayBufferView data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,ArrayBufferView signature,SubtleCrypto.VerifyDataUnionType data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),data);
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,ArrayBuffer data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,signature,Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,ArrayBufferView data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,signature,Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(String algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,SubtleCrypto.VerifyDataUnionType data){
return verify(Js.<SubtleCrypto.VerifyAlgorithmUnionType>uncheckedCast(algorithm),key,signature,data);
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,ArrayBuffer signature,ArrayBuffer data){
return verify(algorithm,key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,ArrayBuffer signature,ArrayBufferView data){
return verify(algorithm,key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,ArrayBuffer signature,SubtleCrypto.VerifyDataUnionType data){
return verify(algorithm,key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),data);
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,ArrayBufferView signature,ArrayBuffer data){
return verify(algorithm,key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,ArrayBufferView signature,ArrayBufferView data){
return verify(algorithm,key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,ArrayBufferView signature,SubtleCrypto.VerifyDataUnionType data){
return verify(algorithm,key,Js.<SubtleCrypto.VerifySignatureUnionType>uncheckedCast(signature),data);
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,ArrayBuffer data){
return verify(algorithm,key,signature,Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,ArrayBufferView data){
return verify(algorithm,key,signature,Js.<SubtleCrypto.VerifyDataUnionType>uncheckedCast(data));
}
public native Promise<Boolean> verify(SubtleCrypto.VerifyAlgorithmUnionType algorithm,CryptoKey key,SubtleCrypto.VerifySignatureUnionType signature,SubtleCrypto.VerifyDataUnionType data);
@JsOverlay
public final Promise<ArrayBuffer> wrapKey(String format,CryptoKey key,CryptoKey wrappingKey,Algorithm wrapAlgorithm){
return wrapKey(format,key,wrappingKey,Js.<SubtleCrypto.WrapKeyWrapAlgorithmUnionType>uncheckedCast(wrapAlgorithm));
}
@JsOverlay
public final Promise<ArrayBuffer> wrapKey(String format,CryptoKey key,CryptoKey wrappingKey,String wrapAlgorithm){
return wrapKey(format,key,wrappingKey,Js.<SubtleCrypto.WrapKeyWrapAlgorithmUnionType>uncheckedCast(wrapAlgorithm));
}
public native Promise<ArrayBuffer> wrapKey(String format,CryptoKey key,CryptoKey wrappingKey,SubtleCrypto.WrapKeyWrapAlgorithmUnionType wrapAlgorithm);
}

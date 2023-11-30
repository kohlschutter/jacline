goog.module('java.lang.invoke.StringConcatFactory$impl');

const j_l_Object = goog.require('java.lang.Object$impl');
const $Util = goog.require('nativebootstrap.Util$impl');

/**
 * @final
 */
class StringConcatFactory extends j_l_Object {
 /** @protected @nodts */
 constructor() {
  super();
 }
 /** @nodts @return {!StringConcatFactory} */
 static $create__() {
  StringConcatFactory.$clinit();
  let $instance = new StringConcatFactory();
  $instance.$ctor__java_lang_invoke_StringConcatFactory__void();
  return $instance;
 }
 /** @nodts */
 $ctor__java_lang_invoke_StringConcatFactory__void() {
  this.$ctor__java_lang_Object__void();
 }
 /** @nodts */
 static $clinit() {
  StringConcatFactory.$clinit = () =>{};
  StringConcatFactory.$loadModules();
  j_l_Object.$clinit();
 }
 /** @nodts @return {boolean} */
 static $isInstance(/** ? */ instance) {
  return instance instanceof StringConcatFactory;
 }
 
 /** @nodts */
 static $loadModules() {}
}
$Util.$setClassMetadata(StringConcatFactory, 'java.lang.invoke.StringConcatFactory');

exports = StringConcatFactory;

//# sourceMappingURL=StringConcatFactory.js.map

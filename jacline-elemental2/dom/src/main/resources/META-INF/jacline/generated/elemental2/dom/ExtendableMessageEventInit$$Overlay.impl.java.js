goog.module('elemental2.dom.ExtendableMessageEventInit.$Overlay$impl');

let Js = goog.forwardDeclare('jsinterop.base.Js$impl');
let JsPropertyMap_$Overlay = goog.forwardDeclare('jsinterop.base.JsPropertyMap.$Overlay$impl');

/** @nodts */
class $Overlay {
 /** @nodts @return {ExtendableMessageEventInit} */
 static m_create__elemental2_dom_ExtendableMessageEventInit() {
  $Overlay.$clinit();
  return /**@type {ExtendableMessageEventInit}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(/**@type {Object<string, *>}*/ (JsPropertyMap_$Overlay.m_of__jsinterop_base_JsPropertyMap())));
 }
 /** @nodts @template T */
 static m_setPorts__$devirt__elemental2_dom_ExtendableMessageEventInit__arrayOf_elemental2_dom_MessagePort__void(/** !ExtendableMessageEventInit<T> */ $thisArg, /** Array<MessagePort> */ ports) {
  $Overlay.$clinit();
  $thisArg.ports = /**@type {Array<MessagePort>}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(ports));
 }
 /** @nodts @template T */
 static m_setSource__$devirt__elemental2_dom_ExtendableMessageEventInit__elemental2_dom_MessagePort__void(/** !ExtendableMessageEventInit<T> */ $thisArg, /** MessagePort */ source) {
  $Overlay.$clinit();
  $thisArg.source = /**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source));
 }
 /** @nodts @template T */
 static m_setSource__$devirt__elemental2_dom_ExtendableMessageEventInit__elemental2_dom_ServiceWorker__void(/** !ExtendableMessageEventInit<T> */ $thisArg, /** ServiceWorker */ source) {
  $Overlay.$clinit();
  $thisArg.source = /**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source));
 }
 /** @nodts @template T */
 static m_setSource__$devirt__elemental2_dom_ExtendableMessageEventInit__elemental2_dom_ServiceWorkerClient__void(/** !ExtendableMessageEventInit<T> */ $thisArg, /** ServiceWorkerClient */ source) {
  $Overlay.$clinit();
  $thisArg.source = /**@type {?}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(source));
 }
 /** @nodts */
 static $clinit() {
  $Overlay.$clinit = () =>{};
  $Overlay.$loadModules();
 }
 
 /** @nodts */
 static $loadModules() {
  Js = goog.module.get('jsinterop.base.Js$impl');
  JsPropertyMap_$Overlay = goog.module.get('jsinterop.base.JsPropertyMap.$Overlay$impl');
 }
}

exports = $Overlay;

//# sourceMappingURL=ExtendableMessageEventInit$$Overlay.js.map

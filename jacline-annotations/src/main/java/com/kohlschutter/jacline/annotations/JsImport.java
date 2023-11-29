package com.kohlschutter.jacline.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares that the annotated interface has an implementation that is supplied by some external
 * JavaScript code.
 * 
 * @author Christian Kohlschütter
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface JsImport {
}

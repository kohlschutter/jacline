package com.kohlschutter.jacline.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares that a method of a type that is marked with {@code @JsType(isNative=true)} as being
 * provided with a default implementation for vanilla Java, whereas the JavaScript-specific
 * implementation is provided separately in some JavaScript file.
 * 
 * @author Christian Kohlschütter
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface JsImplementationProvidedSeparately {
}

package java.lang.invoke;

public abstract class MethodHandle  {

    /**
     * Internal marker interface which distinguishes (to the Java compiler)
     * those methods which are <a href="MethodHandle.html#sigpoly">signature polymorphic</a>.
     */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @interface PolymorphicSignature { }
}
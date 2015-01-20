package net.jcip.examples;

public @interface GuardedBy {
    String value() default "";
}

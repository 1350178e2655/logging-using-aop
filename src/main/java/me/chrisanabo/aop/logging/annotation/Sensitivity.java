package me.chrisanabo.aop.logging.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Sensitivity {

    String name() default "";

    boolean mask() default false;

    String jsonPattern() default "";

    String toStringPattern() default "";

    String inlinePattern() default "";

}
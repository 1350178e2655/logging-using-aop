package me.chrisanabo.aop.logging.annotation;

import me.chrisanabo.aop.logging.pojo.SimplePojo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestAnnotation {

    @Log
    public static void main(String[] args) throws NoSuchMethodException {

        TestAnnotation.testLog("A","B","C");

    }

    @Log
    public static void testLog(String a, String b, String c){
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setName("chris anabo");

        System.out.println(    simplePojo.getName() );
    }


    public void test1() throws NoSuchMethodException {

        SimplePojo simplePojo = new SimplePojo();

        Class<SimplePojo> clazz = SimplePojo.class;


        Method method = clazz.getMethod("getName");
        boolean isMethodAnnotationPresent =
                method.isAnnotationPresent(Sensitivity.class);

        Annotation simplePojoAnnotation = method.getAnnotation(Sensitivity.class);

        Sensitivity sensitivity = (Sensitivity)simplePojoAnnotation;

        System.out.println("Sensitivity Name: " + sensitivity.name());
        System.out.println("Sensitivity Mask: " + sensitivity.mask());


    }
    /*


            Class<MyAnnotatedType> clazz = anInstance.getClass();
            // or: Class<MyAnnotatedType> clazz = MyAnnotatedType.class;

            // Target: Package
            boolean isTypeAnnotationPresent =
            clazz.getPackage().isAnnotationPresent(MyAnnotation.class);

            // Target: Type
            boolean isTypeAnnotationPresent =
            clazz.isAnnotationPresent(MyAnnotation.class);

            // Target: Method
            Method method = clazz.getMethod("myMethod");
            boolean isMethodAnnotationPresent =
            method.isAnnotationPresent(MyAnnotation.class);

            // Target: Field
            Field field = clazz.getField("myField");
            boolean isFieldAnnotationPresent =
            field.isAnnotationPresent(MyAnnotation.class);


     */
}

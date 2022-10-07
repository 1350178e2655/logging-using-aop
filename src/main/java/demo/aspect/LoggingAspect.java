package demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){

        System.out.println(jp.getSignature());
        System.out.println("arguments:" +jp.getArgs()[0]);

        System.out.println("Before loggers");
    }


    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }

    @AfterReturning("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){
        System.out.println("afterReturningPointCut");
    }

    @AfterReturning(  pointcut = "execution(* demo.ShoppingCart.quantity(..))", returning = "retVal")
    public void afterReturning(Object retVal) throws Throwable{
        System.out.println("After returning:" + retVal);
    }


}



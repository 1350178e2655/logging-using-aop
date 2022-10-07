package demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticationPointcut(){
        System.out.println("Authentication Pointcut");
    }

    @Pointcut("within(demo..*)")
    public void authorizationPointcut(){
        System.out.println("Authorization Pointcut");
    }

    @Before("authenticationPointcut() && authorizationPointcut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }

}

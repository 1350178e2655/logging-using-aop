package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){ //String customerId
        //Logging  -> Aspect
        //authetication & authorization -> Aspect
        //sanitize the data -> Aspect
        System.out.println("checkout method:" + status );//customerId
    }

    public int quantity(){

        return 2;
    }
}

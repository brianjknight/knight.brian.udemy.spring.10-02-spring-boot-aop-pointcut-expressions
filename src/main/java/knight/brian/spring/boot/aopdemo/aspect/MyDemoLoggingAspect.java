package knight.brian.spring.boot.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // Match Any class addAccount()
    //@Before("execution(public void addAccount())")

    // Match declared class addAccount()
    //@Before("execution(public void knight.brian.spring.boot.aopdemo.dao.AccountDAO.addAccount())")

    // Match Any method starting with add
    //@Before("execution(public void add*())")

    // Match Return Type (modifier is optional)
    // @Before("execution(* add*())")

    // Match param declared type
    @Before("execution(* add*(knight.brian.spring.boot.aopdemo.Account))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before on addAccount()");
    }

}

package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))") // поинткат для всех методов и всех прометров от 0 и т.д. //2.6.2
//    private void allMethodsFromLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())") //2.6.2
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromLibrary() && !returnMagazineFromUniLibrary()") //2.6.2
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()") //2.6.2
//    public void beforeAllMethodsExceptReturnMagazine (){
//        System.out.println("beforeAllMethodsExceptReturnMagazine: Log #10 ");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())") //2.6.1
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())") //2.6.1
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()") //2.6.1
//    private void allGetAndReturnMethodsFromUniLibrary(){
//
//    }
//
//    @Before("allGetMethodsFromUniLibrary()") //2.6.1
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()") //2.6.1
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()") //2.6.1
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }


//    @Pointcut("execution(* get*())") // 2.5
//    private void allGetMethods(){}

    @Before("aop.aspects.MyPointcuts.allGetMethods()") // 2.5
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: logging attempts to" +
                " trying to take a book or magazine");
    }

//    @Before("allGetMethods()") // 2.5
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: checking the rights to receive a book or magazine");
//    }

//    @Before(public void beforeGetBookAdvice(){  //2.4
////        System.out.println("beforeGetBookAdvice: trying to take a book");
////    }"execution(public void getBook(aop.Book, ..))") //pointcut .. -> две точки означают 0 или более любых типов пораметров.
//

//    @Before("execution(public void aop.UniLibrary.getBook())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to take a book");

//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to take a book");
//    }

//    @Before("execution(public void *(*))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to take a book");
//    }

//    @Before("execution(public void *(..))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to take a book");
//    }

//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to take a book");
//    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to return a book");
//    }
}

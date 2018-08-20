package org.spring.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.spring.example.aop.model.Circle;

@Aspect
public class LoggingAspect {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	//@Before("execution(public String getName())") //executed for every method with this signature.
	//@Before("execution(public String org.spring.example.aop.model.Circle.getName())") //executes specific method
	//org.spring.example.aop.model.*.get*() //for specific package
	//wildcards
	//@Before("execution(public String get*())") //executes for all getter methods with this signature
	//@Before("execution(public * get*(*))") // ignores return type //for any argument
	//@Before("execution(public * get*(..))") //for arg or no arg method
	//@Before("allGetters() && allCircleMethods()")
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinpoint) {
		//System.out.println("Aspect is executed, get method called");
		//System.out.println(joinpoint.toString());
		//Circle circle = (Circle)joinpoint.getTarget(); you can get circle object
		//System.out.println(joinpoint.getTarget());
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters() {
	}
	
	
	@Before("args(String)")
	public void stringArgumentMethod() {
		System.out.println("A method with string argument get called");
	}
	
	
	
	//@Before("args(name)")
	//@After("args(name)") // no matter method executed successfully or not
	//@AfterReturning("args(name)") //only if target method executed successfully we can get return object here
	
	@AfterThrowing(pointcut="args(name)", throwing="exception") // we can get exception object here
	public void stringArgumentMethod(String name, Exception exception) {
		System.out.println("A method with string argument get called. argument value is :"+name);
		System.out.println(exception.toString);
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnValue") 
	public void stringArgumentMethod(String name, String returnValue) {
		System.out.println("A method with string argument get called. argument value is :"+name);
		System.out.println("it returns String :"+returnValue);
	}
	
	
	
	//@Pointcut("within(org.spring.example.aop.model.*)") // all classes in model package
	//@Pointcut("within(org.spring.example.aop.model..*)") // to all classe and subpackages in this package
	
	@Pointcut("within(org.spring.example.aop.model.Circle)")
	public void allCircleMethods(){}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice");
	}
	
	
	
	
	@Around("allGetters()")
	public Object myAroundAdviceWithReturnType(ProceedingJoinPoint proceedingJoinpoint) {
		Object returnValue = null;
		
		try {
			//before execution of method
			System.out.println("Before Advice");
			//target method call
			returnValue = proceedingJoinpoint.proceed();
			//after execution of method
			System.out.println("After Advice");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("catch block ");
		}
		System.out.println("finally");
		return returnValue;
		
	}
	
	@Around("@annotation(org.spring.example.aop.aspect.Logging)")
	public void myAroundAdviceWithCustomAdviceAnnotation(ProceedingJoinPoint proceedingJoinpoint) {
		
		
		try {
			//before execution of method
			System.out.println("Before Advice");
			//target method call
			proceedingJoinpoint.proceed();
			//after execution of method
			System.out.println("After Advice");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("catch block ");
		}
		System.out.println("finally");
		
	}
	
	@Around("allGetters()")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinpoint) {
		//before execution of method
		//target method call
		try {
			System.out.println("Before Advice");
			proceedingJoinpoint.proceed();
			System.out.println("After Advice");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("catch block ");
		}
		System.out.println("finally");
		//after execution of method
	}
	
	*/
}
 
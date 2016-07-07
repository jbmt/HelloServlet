package spring.mistery.aop;

import java.lang.reflect.Proxy;

import spring.mistery.service.IExampleService;
import spring.mistery.service.impl.ExampleServiceImpl;

public class AopMain {

	public static void main(String[] args) {
		 IExampleService service = (IExampleService) AOPFactory
		 .getAOPProxyedObject("spring.mistery.service.impl.ExampleServiceImpl");
		 service.say();
//		MyHandler handler = new MyHandler();
//		IExampleService service = (IExampleService) Proxy.newProxyInstance(
//				ExampleServiceImpl.class.getClassLoader(),
//				ExampleServiceImpl.class.getInterfaces(), handler);
//		;
//		service.say();

	}

}

package spring.mistery;

import java.lang.reflect.Method;


public class PolyMain {
	public static void main(String[] args){
		Bean bean = new Bean();
		SubBean subBean = new SubBean();
		bean.sayName();
		subBean.sayName();
		for(Method m : subBean.getClass().getDeclaredMethods()){
			System.out.println(m);
		}
	}
}

package spring.mistery;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectMain {

	public static void main(String[] args) {
//		changePrivate();
		getAppClassLoader();
//		getAppClassLoader2();
	}

	private static void getAppClassLoader2() {
		Class AppClassLoaderClass = null;
		try {
			AppClassLoaderClass = Class.forName("sun.misc.Launcher$ExtClassLoader");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] methods = AppClassLoaderClass.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m.getName());
		}
	}

	private static void getAppClassLoader(){
		Class launcherClass = sun.misc.Launcher.class;
		Class[] declaredClasses = launcherClass.getDeclaredClasses();
		Class AppClassLoaderClass = null;
		for(Class c : declaredClasses){
			System.out.println(c.getName());
			if("sun.misc.Launcher$ExtClassLoader".equals(c.getName())){
				AppClassLoaderClass = c;
			}
		}

		Field[] fields = AppClassLoaderClass.getDeclaredFields();
		Method[] methods = AppClassLoaderClass.getDeclaredMethods();
		for(Field f : fields){
			System.out.println(f.getName());
		}
		try {
			Constructor[] cons = AppClassLoaderClass.getConstructors();
			for(Constructor c : cons){
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void changePrivate() {
		Bean bean = new Bean();
		bean.say();
		
		Class<? extends Object> beanClass = Bean.class;
		Field[] beanFields = beanClass.getDeclaredFields();
		
		for(Field f : beanFields){
			System.out.println(f.getName());
			if("changeme".equals(f.getName())){
				try {
					f.setAccessible(true);
					f.set(bean, "u're changed!");
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		bean.say();
	}

}

package spring.mistery;

public class ClassloaderMain {

	public static void main(String[] args) throws Exception{
		MisteryClassLoader mcl = new MisteryClassLoader();
		ClassLoader cl = ClassloaderMain.class.getClassLoader();
		sun.misc.Launcher.class.getClassLoader();
//		sun.misc.Launcher.AppClassLoader l;
		System.out.println(cl);
	}
}

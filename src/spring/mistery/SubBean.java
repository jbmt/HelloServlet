package spring.mistery;

public class SubBean extends Bean {
	public void set(int i){
		System.out.println("int"+i);
	}
	public void set(Integer i){
		System.out.println("Integer"+i);
	}
}

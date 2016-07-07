package spring.mistery;

import spring.mistery.annotation.ScanedAnnotation;

@ScanedAnnotation
public class Bean {
	private String changeme;
	
	public void say(){
		System.out.println(changeme);
	}
	
	public void sayName(){
		System.out.println(this.getClass().getName());
	}
}

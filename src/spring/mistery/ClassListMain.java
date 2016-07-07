package spring.mistery;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

public class ClassListMain {

	public static void main(String[] args) throws Exception {
		ClassPathScanningCandidateComponentProvider p;
		Enumeration<URL> roots = ClassListMain.class.getClassLoader().getResources("");
		URL url = null;
		while(roots.hasMoreElements()){
			url = roots.nextElement();
			System.out.println();
		}
		File root = new File(url.getPath());
	}

}

package spring.mistery;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import spring.mistery.annotation.ScanedAnnotation;

public class ClassScanMain {

	public static void main(String[] args) {
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(
				false);

		scanner.addIncludeFilter(new AnnotationTypeFilter(
				ScanedAnnotation.class));

		for (BeanDefinition bd : scanner.findCandidateComponents("spring.mistery")) {
			System.out.println(bd);
		}
	}
}

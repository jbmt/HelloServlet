package spring.mistery.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.mistery.service.IExampleService;

@Component(value="abc")
@Transactional
public class ExampleServiceImpl implements IExampleService {

	private String changeme;
	
	public void say(){
		System.out.println(changeme);
	}
}

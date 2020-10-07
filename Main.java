package com.ioc;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
class keys{
	public void run(Engine key) {
		key.start();
	}
}

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Engine key =  (Engine)ac.getBean("engine");
		new keys().run(key);
	}
}

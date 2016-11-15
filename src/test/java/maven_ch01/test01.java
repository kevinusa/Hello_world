package maven_ch01;

import static org.junit.Assert.assertEquals;

import com.ch01.HelloMaven;

public class test01 {
	public void sayHello() {
		String str = "maven";
		HelloMaven helloW = new HelloMaven();
		String res = helloW.hello(str);
		assertEquals("hellomaven", res);
	}
}

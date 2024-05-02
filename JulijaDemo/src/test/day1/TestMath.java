package test.day1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.OrderWith;

import code.day1.MyMath;

public class TestMath {
	private MyMath math;//attribute
	
	//@BeforeClass 
	//1.make this method as static
	//2.this code will only execute for 1 single time
	//3.use this to set up environment 
	@BeforeClass
	public static void executeBeforeClass() {
		System.out.println("the part execute before class initialize");
	}

	//@Before will make this method execute before every test case
	@Before
	public void executeBefore() {
		System.out.println("the part execute before every case");
		math = new MyMath();
	}
	
	@Test
	public void testAdd() {
		//instantiate
//		MyMath math = new MyMath();
		math.add(3, 5);
		System.out.println("add1");
	}
	
	@Test
	@Ignore
	public void testAdd2() {
//		MyMath math = new MyMath();
//		math.add2(3, 5);
		Assert.assertEquals(8, math.add2(3, 5));
		System.out.println("add2");
	}
	
	@Test
	public void testDivide() {
		Assert.assertEquals(101, math.divide(100, 10));
	}
	
}

















package Test;



import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo2
{
	@Test
	void test()
	{
		Assert.assertTrue(true);	

	}
	@Test
	void test1()
	{
		Assert.assertTrue(false);
	}
	@Test
	void test2()
	{
		Assert.assertEquals("test","test");
	}
	@Test
	void test3()
	{
		Assert.assertEquals("test","test2");
	}
	@Test
	void test4()
	{
		Assert.assertTrue(false,"IamFalse");
	}
	@Test
	void test5()
	{
		Assert.assertFalse(false,"I_am_False");
	}
	@Test
	void test6()
	{
		Assert.assertNotEquals("test","test1");
	}
}
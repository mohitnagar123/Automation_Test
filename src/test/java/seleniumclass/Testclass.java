package seleniumclass;

import org.testng.annotations.*;

public class Testclass {
	
@Test
	public void test()
	{System.out.println("Hello");
}

@BeforeTest
public void testbefore()
{System.out.println("Hello Before");
}

@AfterTest
public void testafter()
{System.out.println("Hello After");
}

}

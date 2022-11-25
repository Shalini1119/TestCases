package TestScenarios;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TestAsserts {
	public class ArrayEqualityAssertTest {

		  @Test
		  public void arrayAssertEquals() {
		    assertEquals(
		        new int[] {42},
		        new int[] {42},
		        "arrays of primitives are compared by value in assertEquals");
		  }

		  @Test(expectedExceptions = AssertionError.class)
		  public void arrayAssertNotEquals() {
		    assertNotEquals(
		        new int[] {42},
		        new int[] {42},
		        "arrays of primitives are compared by value in assertNotEquals");
		  }
	 @Test
	  public void arrayInsideArrayAssertEquals() {
	    int[][] array = new int[][] {new int[] {42}};
	    int[][] arrayCopy = new int[][] {new int[] {42}};
	    assertEquals(array, arrayCopy, "arrays inside arrays are compared by value in assertEquals");
	    
	  }
	 
	
	 
	 @Test(expectedExceptions = AssertionError.class)
	  public void arrayInsideIterableAssertEquals() {
	    Iterable<int[]> iterable = Arrays.asList(new int[] {42});
	    Iterable<int[]> iterableCopy = Arrays.asList(new int[] {42});
	    assertEquals(
	        iterable,
	        iterableCopy,
	        "arrays inside Iterables are compared by reference in assertEquals");
	  }

}
}
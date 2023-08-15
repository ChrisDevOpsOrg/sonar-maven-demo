package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testAdd() throws Exception {
    assertEquals(Foo.div(10, 5), 2);
  }

  @Test
  public void testDivide() {
    int a = 56; int b = 10; 
    double expectedResult = 5.6; 
    double result = Foo.div(a, b);
    Assert.assertEquals(expectedResult, result,0.00005); 
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testDivideByZero() { 
    int a = 15; int b = 0;
      Foo.div(a, b);
    } 
}

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
    assertEquals(Foo.div(56, 10), 5.6);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testDivideByZero() { 
    assertEquals(Foo.div(30, 0));
  }
}

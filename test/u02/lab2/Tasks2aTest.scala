package u02.lab2

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.lab2.Tasks2a._

class Tasks2aTest {

  @Test
  def testEven(){
    assertEquals("even", parity(10))
    assertFalse(parityMethod(10) == "odd")
  }


  @Test
  def testOdd(){
    assertEquals("odd", parity(3))
    assertTrue(parityMethod(9) == "odd")
  }

  @Test
  def testEmpty(){
    assertTrue(empty(""))
    assertFalse(empty("test"))
    assertTrue(emptyLambda(""))
    assertFalse(emptyLambda("test"))
  }

  @Test
  def testNotEmpty(){
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("a"))
  }

  @Test
  def testNotEmptyMethods(){
    assertFalse(notEmptyMethod(""))
    assertTrue(notEmptyMethod("b"))
  }

  @Test
  def testNegGenericMethods(){
    assertTrue(greaterThanZero(10))
    assertFalse(greaterThanZero(-5))
    assertTrue(negGenericMethod(greaterThanZero)(-5))
    assertFalse(negGenericMethod(greaterThanZero)(10))
  }
}

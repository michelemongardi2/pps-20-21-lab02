package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.Tasks2a.{empty, emptyLambda, notEmpty, notEmptyMethod, parity, parityMethod}

class TasksTest {

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

}

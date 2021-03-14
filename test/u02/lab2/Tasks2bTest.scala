package u02.lab2

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.lab2.Tasks2b._

class Tasks2bTest {

  @Test
  def testP1Curried(): Unit ={
    assertTrue(p1(3)(4)(5))
    assertFalse(p1(3)(2)(1))
  }

  @Test
  def testP2NotCurried(): Unit ={
    assertTrue(p2(1,2,3))
    assertFalse(p2(3,1,2))
  }

  @Test
  def testP3Curried(): Unit ={
    assertTrue(p3(5)(6)(7))
    assertFalse(p3(8)(5)(3))
  }

  @Test
  def testP4NotCurried(): Unit ={
    assertTrue(p4(7,8,9))
    assertFalse(p4(9,7,8))
  }

  @Test
  def testCompose(): Unit ={
    assertEquals(9, compose(_-1,_*2)(5))
    assertEquals(15, compose(_*3, _-5)(10))
  }

  @Test
  def testComposeGen(): Unit ={
    def hello(s:String) : String = "Hello " + s
    def howAreU(str:String): String = str + ", how are you?"

    assertEquals("Hello Michele, how are you?", composeGen(hello,howAreU)("Michele"))
  }
}

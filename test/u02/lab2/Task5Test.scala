package u02.lab2

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.lab2.Task5.Option._

class Task5Test {

  @Test
  def testFilter(): Unit ={
    val some: Some[Int] = Some(5)
    assertEquals(Some[Int](5), filter(some)(_>2))
    assertEquals(None(), filter(Some(5))(_>8))
  }

  @Test
  def testMap(): Unit ={
    assertEquals(Some[Boolean](true), map(Some(5))(_>2))
    assertEquals(Some[Boolean](false), map(Some(1))(_>2))
  }

  @Test
  def testMap2(): Unit ={
    val sum:(Int, Int) => Int = (x:Int,y:Int) => x+y
    val helloWorld:(String, String) => String = (s:String, str:String) => s + " " + str
    assertEquals(Some[Int](11), map2(Some(5),Some(6))(sum))
    assertEquals(Some[String]("Hello World!"), map2(Some("Hello"),Some("World!"))(helloWorld))
    assertEquals(None(), map2(None(),Some(6))(sum))
    assertEquals(None(), map2(Some(5),None())(sum))
  }
}

package u02.lab2

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.lab2.Task4._

class Task4Test {

  @Test
  def testPerimeterRectangle(): Unit ={
    val rectangle:(Rectangle) = Rectangle(15.0, 10.0)
    assertEquals(60,perimeter(Rectangle(10.0, 20.0)))
    assertEquals(50, perimeter(rectangle))
  }

  @Test
  def testPerimeterCircle(): Unit ={
    val circle:(Circle) = Circle (8)
    assertEquals(31.41592653589793,perimeter(Circle(5.0)))
    assertEquals(50.26548245743669, perimeter(circle))
  }

  @Test
  def testPerimeterSquare(): Unit ={
    val square:(Square) = Square(4.0)
    assertEquals(20, perimeter(Square(5.0)))
    assertEquals(16 , perimeter(square))
  }

  @Test
  def testAreaRectangle(): Unit ={
    val rectangle:(Rectangle) = Rectangle(15.0, 10.0)
    assertEquals(200,area(Rectangle(10.0, 20.0)))
    assertEquals(150, area(rectangle))
  }

  @Test
  def testAreaCircle(): Unit ={
    val circle:(Circle) = Circle (8)
    assertEquals(78.53981633974483,area(Circle(5.0)))
    assertEquals(201.06192982974676, area(circle))
  }

  @Test
  def testAreaSquare(): Unit ={
    val square:(Square) = Square(4.0)
    assertEquals(25, area(Square(5.0)))
    assertEquals( 16, area(square))
  }
}

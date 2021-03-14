package u02.lab2

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.lab2.Task3._

class Task3Test {

  @Test
  def testFibonacci(): Unit ={
    assertEquals(0, fibonacci(0))
    assertEquals(1, fibonacci(1))
    assertEquals(1, fibonacci(2))
    assertEquals(2, fibonacci(3))
    assertEquals(3, fibonacci(4))
  }

  @Test
  def testFibonacciTail(): Unit ={
    assertEquals(0, fibonacciTail(0))
    assertEquals(1, fibonacciTail(1))
    assertEquals(1, fibonacciTail(2))
    assertEquals(2, fibonacciTail(3))
    assertEquals(3, fibonacciTail(4))
  }

}

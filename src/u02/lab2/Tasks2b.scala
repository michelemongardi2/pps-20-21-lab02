package u02.lab2

object Tasks2b {

  //Tasks 4
  val p1:(Int => Int => Int => Boolean) = (x:Int) => (y:Int) => (z:Int) => (x<=y && y<=z)
  val p2:(Int, Int, Int) => Boolean = (x:Int, y:Int, z:Int) => (x<=y && y<=z)
  def p3(x:Int)(y:Int)(z:Int):Boolean = (x<=y && y<=z)
  def p4(x:Int, y:Int, z:Int): Boolean = (x<=y && y<=z)

  //Task 5
  def compose(f: Int => Int, g:Int => Int): (Int => Int) = (x => f(g(x)))

  //generic version of compose
  def composeGen[A](f: A => A, g:A => A): (A => A) = (x => f(g(x)))


}

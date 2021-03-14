package u02.lab2

object Tasks2a {

  //Task 3.a
  val parity: Int => String = {
    case x if (x % 2 == 0) => "even"
    case _ => "odd"
  }

  def parityMethod(x: Int): String = x match {
    case x if (x % 2 == 0) => "even"
    case _ => "odd"
  }


  val empty: (String) => Boolean = {
    case str if (str == "") => true
    case _ => false
  }

  //Task 3.b
  val emptyLambda: (String) => (Boolean) = (s: String) => (s == "")
  val neg: (String => Boolean) => (String => Boolean) = f => !f(_)
  val notEmpty: String => Boolean = neg(emptyLambda)

  def emptyMethod(s: String): Boolean = (s == "")

  def negMethod(f: (String => Boolean)): (String => Boolean) = !f(_)

  //def negMethod(f:(String => Boolean)): (String => Boolean) = (s:String) => !f(s)
  def notEmptyMethod: String => Boolean = negMethod(emptyMethod)

  //Task 3.c
  def greaterThanZero(n: Int): Boolean = n match {
    case n if (n > 0) => true
    case _ => false
  }

  def negGenericMethod[A](f: A => Boolean): (A => Boolean) = !f(_)
}

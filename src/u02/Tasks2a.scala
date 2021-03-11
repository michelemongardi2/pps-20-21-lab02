package u02

object Tasks2a {

  val parity: Int => String = {
    case x if (x % 2 == 0) => "even"
    case _ => "odd"
  }

  def parityMethod(x:Int): String = x match{
    case x if (x % 2 == 0) => "even"
    case _ => "odd"
  }


  val empty: (String) => Boolean = {
    case str if (str == "") => true
    case _ => false
  }

  val emptyLambda: (String) => (Boolean) = (s:String) => (s == "")
  val neg: (String => Boolean) => (String => Boolean) = f => !f(_)
  val notEmpty: String => Boolean = neg(emptyLambda)

  def emptyMethod(s:String): Boolean = (s == "")
  def negMethod(f:(String => Boolean)):(String => Boolean) = !f(_)
  //def negMethod(f:(String => Boolean)): (String => Boolean) = (s:String) => !f(s)
  def notEmptyMethod: String => Boolean = negMethod(emptyMethod)

  def greaterThanZero(n:Int): Boolean = n match {
    case n if(n>0) => true
    case _ => false
  }

  def negGenericMethod[A](f:A => Boolean) : (A => Boolean) = !f(_)

}

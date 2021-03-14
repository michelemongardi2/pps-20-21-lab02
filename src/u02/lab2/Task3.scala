package u02.lab2

object Task3 {

  def fibonacci(n:Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n-1) + fibonacci(n-2)
  }

  def fibonacciTail(n:Int):Int = {
    @annotation.tailrec
    def _fibo(n:Int, accumulator0: Int,  accumulator1: Int): Int = n match {
      case 0 => accumulator0
      case 1 => accumulator1
      case _ => _fibo(n-1, accumulator1, accumulator0+accumulator1)
    }
    _fibo(n,0,1)
  }

}

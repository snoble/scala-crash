package crash

object Crash {
  def lambdaList(lst: List[Int]): List[Int] = lst.collect { case n if n > 0 => n }
}

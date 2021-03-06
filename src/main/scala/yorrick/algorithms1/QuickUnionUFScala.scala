package yorrick.algorithms1

class QuickUnionUFScala(override val size: Int) extends Quick{
  private def root(i: Int): Int = {
    var element = i
    while (element != ids(element)) {
      element = ids(element)
    }

    return element
  }
  
  def connected(p: Int, q: Int): Boolean = root(p) == root(q)
  
  def union(p: Int, q: Int): Unit = {
    val proot = root(p)
    val qroot = root(q)
    
    ids(proot) = qroot
  }
}

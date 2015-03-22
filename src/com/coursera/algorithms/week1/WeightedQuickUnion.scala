/**
 *
 */
package com.coursera.algorithms.week1

/**
 * @author kevin
 *
 */
object WeightedQuickUnion {

  val id_list = Array.range(0, 10)
  val size_list = Array.fill(10)(1)

  private def root(i: Int): Int = {
    var j = i;
    while (j != id_list(j)) j = id_list(j)
    j
  }

  def connected(p: Int, q: Int): Boolean = {
    root(p) == root(q)
  }

  def union(p: Int, q: Int): Unit = {
    val i = root(p)
    val j = root(q)
    if (i != j) {
      if (size_list(i) < size_list(j)) {
        id_list(i) = j
        size_list(j) += size_list(i)
      } else {
        id_list(j) = i
        size_list(i) += size_list(j)
      }
    }
  }
}
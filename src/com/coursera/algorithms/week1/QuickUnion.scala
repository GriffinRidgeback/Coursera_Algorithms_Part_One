/**
 *
 */
package com.coursera.algorithms.week1

/**
 * @author kevin
 *
 */
object QuickUnion {

  val id_list = Array.range(0, 10)

  private def root(i: Int): Int = {
    // i comes in as a val, needs to be a var so
    // that it can be re-assigned with correct index
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
    id_list(i) = j
  }
}
/**
 *
 */
package com.coursera.algorithms.week1

/**
 * @author kevin
 *
 */
object QuickFind {

  val id_list = Array.range(0, 10)

  def connected(p: Int, q: Int): Boolean = {
    id_list(p) == id_list(q)
  }

  def union(p: Int, q: Int): Unit = {

    val p_id = id_list(p)
    val q_id = id_list(q)

    for {
      i <- 0.to(id_list.length - 1)
      if id_list(i) == p_id
    } {
      id_list(i) = q_id
    }
  }
}
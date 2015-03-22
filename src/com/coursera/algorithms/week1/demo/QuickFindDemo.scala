package com.coursera.algorithms.week1.demo

import com.coursera.algorithms.week1.QuickFind

object QuickFindDemo extends App {

  println("QuickFind Demo")
  println("==============")
  
  QuickFind.union(4,3)
  println(QuickFind.id_list.toBuffer)
  
  QuickFind.union(3,8)
  println(QuickFind.id_list.toBuffer)
  
  QuickFind.union(6,5)
  println(QuickFind.id_list.toBuffer)
  
  QuickFind.union(9,4)
  println(QuickFind.id_list.toBuffer)
  
  QuickFind.union(2,1)
  println(QuickFind.id_list.toBuffer)
  
  QuickFind.union(5,0)
  println(QuickFind.id_list.toBuffer)
  
  QuickFind.union(7,2)
  println(QuickFind.id_list.toBuffer)
  
  QuickFind.union(6,1)
  println(QuickFind.id_list.toBuffer)
  
  println(QuickFind.connected(8,9))
  println(QuickFind.connected(5,4))
}
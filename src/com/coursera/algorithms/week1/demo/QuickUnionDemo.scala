package com.coursera.algorithms.week1.demo

import com.coursera.algorithms.week1.QuickUnion

object QuickUnionDemo extends App {
  
  println("QuickUnion Demo")
  println("===============")
  
  QuickUnion.union(4,3)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(3,8)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(6,5)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(9,4)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(2,1)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(5,0)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(7,2)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(6,1)
  println(QuickUnion.id_list.toBuffer)
  
  QuickUnion.union(7,3)
  println(QuickUnion.id_list.toBuffer)
  
  println(QuickUnion.connected(8,9))
  println(QuickUnion.connected(5,4))
}
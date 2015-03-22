package com.coursera.algorithms.week1.demo

import com.coursera.algorithms.week1.WeightedQuickUnion

object WeightedQuickUnionDemo extends App {
  
  println("WeightedQuickUnion Demo")
  println("=======================")
  
  WeightedQuickUnion.union(4,3)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(3,8)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(6,5)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(9,4)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(2,1)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(5,0)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(7,2)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(6,1)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  WeightedQuickUnion.union(7,3)
  println(WeightedQuickUnion.id_list.toBuffer)
  
  println(WeightedQuickUnion.connected(8,9))
  println(WeightedQuickUnion.connected(5,4))
}
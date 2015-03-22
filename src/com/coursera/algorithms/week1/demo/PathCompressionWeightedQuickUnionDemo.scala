package com.coursera.algorithms.week1.demo

import com.coursera.algorithms.week1.PathCompressionWeightedQuickUnion

object PathCompressionWeightedQuickUnionDemo extends App {
  
  println("PathCompressionWeightedQuickUnion Demo")
  println("======================================")
  
  PathCompressionWeightedQuickUnion.union(4,3)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(3,8)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(6,5)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(9,4)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(2,1)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(5,0)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(7,2)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(6,1)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  PathCompressionWeightedQuickUnion.union(7,3)
  println(PathCompressionWeightedQuickUnion.id_list.toBuffer)
  
  println(PathCompressionWeightedQuickUnion.connected(8,9))
  println(PathCompressionWeightedQuickUnion.connected(5,4))
}
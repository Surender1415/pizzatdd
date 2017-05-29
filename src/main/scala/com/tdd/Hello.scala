package com.tdd

/**
  * Created by surenderreddy on 29/05/2017.
  */
object Hello {
  def main(args: Array[String]): Unit = {
    val p = Person("abcd")
    println("Hello from " + p.name)
  }
}

package com.pizza

/**
  * Created by surenderreddy on 29/05/2017.
  */

import scala.collection.mutable.ArrayBuffer

class Pizza {

  private val toppings = new ArrayBuffer[Topping]
  private val basePizzaPrice = 6.00
  private val oneToppingPrice = 0.99

  def addTopping (t: Topping) { toppings += t}
  def removeTopping (t: Topping) { toppings -= t}
  def getToppings = toppings.toList

  def getPrice(numberOfToppings: Int): Double = {
    val pizzaPrice = basePizzaPrice + oneToppingPrice * numberOfToppings
    pizzaPrice
  }

  def boom { throw new Exception("Boom!") }
}

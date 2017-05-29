package com.pizza

/**
  * Created by surenderreddy on 29/05/2017.
  */
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class PizzaTests extends FunSuite with BeforeAndAfter {

  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }

  test("new pizza has zero toppings") {
    assert(pizza.getToppings.isEmpty)
  }

  test("adding one topping") {
    pizza.addTopping(Topping("green olives"))
    assert(pizza.getToppings.size === 1)
  }

  test("remove one topping"){
    pizza.addTopping(Topping("green olives"))
    pizza.removeTopping(Topping("green olives"))
    assert(pizza.getToppings.isEmpty)
  }

  // mark that you want a test here in the future
  test ("test pizza price for 1 topping") {
    val expectedPrice = pizza.getPrice(1)
    assert(expectedPrice == 6.99)
  }

  test ("test pizza price for 10 topping") {
    val expectedPrice = pizza.getPrice(10)
    assert(expectedPrice == 15.90)
  }

}
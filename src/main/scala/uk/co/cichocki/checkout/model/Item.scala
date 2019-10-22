package uk.co.cichocki.checkout.model

sealed trait HasPrice {
  def priceInPence(): Integer
}

//case class Item(priceInPence: Integer) extends HasPrice
//
//class Apple extends Item(60)
//
//class Orange extends Item(25)

object Item extends Enumeration {
  type Item = Value
  val APPLE, ORANGE = Value

  def maybeWithName(name: String): Option[Value] = values.find(_.toString == name.toUpperCase)
}

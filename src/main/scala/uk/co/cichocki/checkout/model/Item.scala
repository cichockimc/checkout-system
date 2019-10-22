package uk.co.cichocki.checkout.model

import uk.co.cichocki.checkout.model.Prices.{applePrice, orangePrice}

private case class ItemBase(override val priceInPence: Int) extends HasPrice

object Item extends Enumeration {
  type Item = Value
  val APPLE, ORANGE = Value

  def maybeWithName(name: String): Option[Value] = values.find(_.toString == name.toUpperCase)

  def toObject: HasPrice = this match {
    case APPLE => ItemBase(applePrice)
    case ORANGE => ItemBase(orangePrice)
  }
}

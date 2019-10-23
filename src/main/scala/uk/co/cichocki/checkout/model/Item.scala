package uk.co.cichocki.checkout.model

import uk.co.cichocki.checkout.model.Prices.{applePrice, orangePrice}

private case class ItemBase(override val priceInPence: Int) extends HasPrice

object Item extends Enumeration {
  type Item = Value
  val APPLE, ORANGE = Value

  /*
    standard 'withName' would suffice, just showing off I know what Either is
    on a serious note: it enables us to gather all offending values instead of applying fail fast stratego in StringToHasPriceMapper
   */
  def maybeWithName(name: String): Either[Value, String] = values.find(_.toString == name.toUpperCase)
    .map(Left(_))
    .getOrElse(Right(name))

  def toObject(item: Item): HasPrice = item match {
    case APPLE => ItemBase(applePrice)
    case ORANGE => ItemBase(orangePrice)
  }
}

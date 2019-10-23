package uk.co.cichocki.checkout.model

import uk.co.cichocki.checkout.model.Prices.{applePrice, orangePrice}

abstract class ItemBase(override val priceInPence: Int, val n: Int) extends HasPrice {
  protected def everyNthItemFree(list: List[HasPrice]) = {
    list.zipWithIndex.map { case (el, idx) => if ((idx + 1) % n == 0) 0 else el.priceInPence() }.sum
  }
}


class Apple extends ItemBase(applePrice, 2)

object Apple extends Apple {
  def buyOneGetOneFree(list: List[Apple]): Int = {
    everyNthItemFree(list)
  }
}

class Orange extends ItemBase(orangePrice, 3)

object Orange extends Orange {
  def threeForTwo(list: List[Orange]): Int = {
    everyNthItemFree(list)
  }
}


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
    case APPLE => new Apple
    case ORANGE => new Orange
  }
}

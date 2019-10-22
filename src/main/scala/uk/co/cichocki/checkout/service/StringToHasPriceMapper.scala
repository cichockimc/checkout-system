package uk.co.cichocki.checkout.service

import uk.co.cichocki.checkout.model.Item.{Item, maybeWithName}

class StringToHasPriceMapper {

  def map(names: List[String]): List[Item] = names.map(maybeWithName).map {
    case Left(correctValue) => correctValue
    case Right(wrongValue) => throw new IllegalArgumentException(wrongValue)
  }
}

object StringToHasPriceMapper extends StringToHasPriceMapper {

}

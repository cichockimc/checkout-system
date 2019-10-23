package uk.co.cichocki.checkout.service

import uk.co.cichocki.checkout.model.Item.{Item, maybeWithName}

class StringToHasPriceMapper {

  protected def handleErrors(errors: List[String]) = {
    // looks too imperative, might have done too much Java recently
    if (errors.nonEmpty) {
      throw new IllegalArgumentException(s"Illegal arguments(s): ${errors.mkString(",")}")
    }
  }

  def map(names: List[String]): List[Item] = {
    val eithersTuple: (List[Item], List[String]) = names.map(maybeWithName).partition(_.isLeft) match {
      case (lefts, rights) =>
        (lefts.map(_.left.get), rights.map(_.right.get))
    } // credit given when it's due https://stackoverflow.com/a/51345780
    handleErrors(eithersTuple._2)
    eithersTuple._1
  }
}

object StringToHasPriceMapper extends StringToHasPriceMapper {

}

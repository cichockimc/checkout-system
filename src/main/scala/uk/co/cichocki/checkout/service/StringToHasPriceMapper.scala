package uk.co.cichocki.checkout.service

import uk.co.cichocki.checkout.model.HasPrice

class StringToHasPriceMapper {

  def map(name: String): HasPrice = {
    ???
  }

  def map(names: List[String]): List[HasPrice] = ???
}

object StringToHasPriceMapper extends StringToHasPriceMapper {

}

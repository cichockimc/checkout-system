package uk.co.cichocki.checkout.service

import org.scalatest.FlatSpec
import uk.co.cichocki.checkout.model.Item.{APPLE, ORANGE}

// most of it is covered in ItemTest really
class StringToHasPriceMapperTest extends FlatSpec {

  behavior of "StringToHasPriceMapperTest"

  private val mapper = StringToHasPriceMapper

  it should "map list of values" in {
    val result = mapper.map(List("Apple", "Apple", "Orange", "Apple"))
    assert(result == List(APPLE, APPLE, ORANGE, APPLE))
  }

  it should "throw an exception if one or more arguments are not valid" in {
    val thrown = intercept[Exception] {
      mapper.map(List("What", "Apple", "is", "that"))
    }
    assert(thrown.isInstanceOf[IllegalArgumentException])
    assert(thrown.getMessage == "Illegal arguments(s): What,is,that")
  }
}

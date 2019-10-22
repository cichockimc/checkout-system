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

  it should "throw an exception if empty list" in {
    val thrown = intercept[Exception] {
    }
    assert(thrown.isInstanceOf[IllegalArgumentException])
  }

}

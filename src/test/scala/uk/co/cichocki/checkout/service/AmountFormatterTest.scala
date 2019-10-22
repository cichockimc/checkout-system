package uk.co.cichocki.checkout.service

import org.scalatest.FlatSpec

class AmountFormatterTest extends FlatSpec {

  behavior of "AmountFormatterTest"

  private val formatter = AmountFormatter

  it should "return string representation of amount in pounds" in {
    assert(formatter.format(1234) == "£12.34")
  }

  it should "throw exception if amount is negative" in {
    val thrown = intercept[Exception] {
      formatter.format(-10)
    }
    assert(thrown.isInstanceOf[IllegalArgumentException])
    assert(thrown.getMessage == "negative")
  }
}

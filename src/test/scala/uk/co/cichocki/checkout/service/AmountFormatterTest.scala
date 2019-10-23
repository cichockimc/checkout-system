package uk.co.cichocki.checkout.service

import org.scalatest.FlatSpec

class AmountFormatterTest extends FlatSpec {

  behavior of "AmountFormatterTest"

  private val formatter = AmountFormatter

  it should "return string representation of amount in pounds" in {
    val amount = 1234
    assert(formatter.format(amount) == "£12.34")
  }

  it should "throw exception if amount is negative" in {
    val thrown = intercept[Exception] {
      val amount = -10
      formatter.format(amount)
    }
    assert(thrown.isInstanceOf[IllegalArgumentException])
    assert(thrown.getMessage == "negative")
  }
}

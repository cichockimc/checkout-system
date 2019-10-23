package uk.co.cichocki.checkout.service

import org.scalatest.FlatSpec
import uk.co.cichocki.checkout.model.Item.{APPLE, ORANGE}

class TillTest extends FlatSpec {

  behavior of "TillTest"

  private val till = Till

  it should "calculateCost" in {
    assert(till.calculateCost(List(APPLE, APPLE, ORANGE, APPLE)) == 205)
  }

}

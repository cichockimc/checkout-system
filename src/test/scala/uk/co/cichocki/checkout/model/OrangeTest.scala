package uk.co.cichocki.checkout.model

import org.scalatest.FlatSpec

class OrangeTest extends FlatSpec {

  behavior of "OrangeTest"

  it should "threeForTwo - 6" in {
    assert(generateList(6) == 100)
  }

  it should "threeForTwo - 5" in {
    assert(generateList(5) == 100)
  }

  // okay, could be extracted to a base class, but maybe next time
  private def generateList(n: Int) = {
    Orange.threeForTwo(List.tabulate(n)(_ => new Orange))
  }
}

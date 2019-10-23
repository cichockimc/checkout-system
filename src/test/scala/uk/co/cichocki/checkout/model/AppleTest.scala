package uk.co.cichocki.checkout.model

import org.scalatest.FlatSpec

class AppleTest extends FlatSpec {

  behavior of "AppleTest"

  it should "buyOneGetOneFree even" in {
    assert(generateList(4) == 120)
  }

  it should "buyOneGetOneFree odd" in {
    assert(generateList(5) == 180)
  }

  private def generateList(n: Int) = {
    Apple.buyOneGetOneFree(List.tabulate(n)(_ => new Apple))
  }
}

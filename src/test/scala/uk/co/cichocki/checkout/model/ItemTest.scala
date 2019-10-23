package uk.co.cichocki.checkout.model

import org.scalatest.FlatSpec
import uk.co.cichocki.checkout.model.Item.{APPLE, ORANGE, maybeWithName}

class ItemTest extends FlatSpec {

  "Item maybeWithName" should "return correct value if recognised" in {
    assert(maybeWithName("Apple") == Left(APPLE))
    assert(maybeWithName("Orange") == Left(ORANGE))
  }

  "Item maybeWithName" should "return Right if incorrect name" in {
    assert(maybeWithName("something random").isRight)
  }

  "Item maybeWithName" should "be case insensitive" in {
    assert(maybeWithName("apple") == Left(APPLE))
    assert(maybeWithName("OraNGe") == Left(ORANGE))
  }
}

package uk.co.cichocki.checkout.model

import org.scalatest.FlatSpec
import uk.co.cichocki.checkout.model.Item.{APPLE, ORANGE, maybeWithName}

class ItemTest extends FlatSpec {

  "Item maybeWithName" should "return correct value if recognised" in {
    assert(maybeWithName("Apple").contains(APPLE))
    assert(maybeWithName("Orange").contains(ORANGE))
  }

  "Item maybeWithName" should "return None if incorrect name" in {
    assert(maybeWithName("something random").isEmpty)
  }

  "Item maybeWithName" should "be case insensitive" in {
    assert(maybeWithName("apple").contains(APPLE))
    assert(maybeWithName("OraNGe").contains(ORANGE))
  }
}

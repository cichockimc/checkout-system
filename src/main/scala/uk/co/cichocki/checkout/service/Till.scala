package uk.co.cichocki.checkout.service

import uk.co.cichocki.checkout.model.Item
import uk.co.cichocki.checkout.model.Item.Item

class Till {

  def calculateCost(items: List[Item]): Int = {
    items.map(Item.toObject).map(_.priceInPence()).sum
  }

}

object Till extends Till {

}

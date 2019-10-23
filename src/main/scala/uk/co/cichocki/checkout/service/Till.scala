package uk.co.cichocki.checkout.service

import uk.co.cichocki.checkout.model.Item.Item
import uk.co.cichocki.checkout.model.{Apple, Item, Orange}

class Till {

  def calculateCost(items: List[Item]): Int = {
    val tuple = items.map(Item.toObject).partition(_.isInstanceOf[Apple]) // we've got 2 types of items so partition is sufficient
    Apple.buyOneGetOneFree(tuple._1.map(_.asInstanceOf[Apple])) + Orange.threeForTwo(tuple._2.map(_.asInstanceOf[Orange]))
  }

}

object Till extends Till {

}

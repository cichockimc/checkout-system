package uk.co.cichocki.checkout.service

import uk.co.cichocki.checkout.model.HasPrice

class Till {

  def calculateCost(items: List[HasPrice]) = {
    100
  }

}

object Till extends Till {

}

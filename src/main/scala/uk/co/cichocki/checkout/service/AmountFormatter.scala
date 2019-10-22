package uk.co.cichocki.checkout.service

class AmountFormatter {

  def format(amount: Int): String = {
    if (amount < 0) throw new IllegalArgumentException("negative")
    ???
  }
}

object AmountFormatter extends AmountFormatter {

}

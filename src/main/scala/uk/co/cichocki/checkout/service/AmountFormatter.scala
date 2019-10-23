package uk.co.cichocki.checkout.service

class AmountFormatter {

  def format(amount: Int): String = {
    if (amount < 0) throw new IllegalArgumentException("negative")
    s"£${amount / 100.00}"
  }
}

object AmountFormatter extends AmountFormatter {

}

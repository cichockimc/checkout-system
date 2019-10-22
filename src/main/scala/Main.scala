import uk.co.cichocki.checkout.service.{AmountFormatter, StringToHasPriceMapper, Till}

// $COVERAGE-OFF$
/*
 * command line tool was not in scope of the task, hence it's excluded from scoverage and is just for demonstration purposes
 */
object Main extends App {
  val usage =
    """
    Usage: Main item1 item2 item3
  """

  val till = Till
  val mapper = StringToHasPriceMapper
  val formatter = AmountFormatter

  if (args.length == 0) print(usage)

  private val costInPence: Int = till.calculateCost(mapper.map(args.toList))

  println(s"Total cost is ${formatter.format(costInPence)}")
}

// $COVERAGE-ON$

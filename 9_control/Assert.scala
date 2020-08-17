object Assert extends App {
  var assertionEnabled = true

  def myAssert(predicate: () => Boolean) =
    if (assertionEnabled && !predicate())
      throw new AssertionError

  myAssert(() => 5 > 3)

  def byNameAssert(predicate: => Boolean) =
    if (assertionEnabled && !predicate)
      throw new AssertionError

  byNameAssert(5 > 3)
}

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName))
      yield file

  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(query))

  def filesContain(query: String) =
    filesMatching(query, _.contains(query))

  def filesMatch(query: String) =
    filesMatching(query, _.matches(query))

}

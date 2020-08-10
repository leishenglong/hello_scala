object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def filesEnding(query: String) =
    for (file <- filesHere; if (file.getName.endsWith(query)))
      yield file

  def filesContain(query: String) =
    for (file <- filesHere; if (file.getName.contains(query)))
      yield file

  def filesMatch(query: String) =
    for (file <- filesHere; if (file.getName.matches(query)))
      yield file
}

import java.io.File

val fileHere = (new File(".")).listFiles()

for (file <- fileHere if file.getName.endsWith(".scala"))
  print(file)

for (
  file <- fileHere
  if file.isFile
  if file.getName.endsWith(".scala")
) print(file)

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines.toList

def grep(pattern: String) =
  for (
    file <- fileHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) print(file + ": " + line.trim)

def grep2(pattern: String) =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } print(file + ": " + trimmed)

def scalaFiles =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
  } yield file
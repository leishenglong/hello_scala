package com.training.cats

import cats.effect.IO
import cats.syntax.all._
object CopyFile {

  import java.io._

  def transmit(origin: InputStream, destination: OutputStream, buffer: Array[Byte], acc: Long): IO[Long] =
    for {
      amount <- IO(origin.read(buffer, 0, buffer.size))
      count  <- if(amount > -1) IO(destination.write(buffer, 0, amount)) >> transmit(origin, destination, buffer, acc + amount)
      else IO.pure(acc) // End of read stream reached (by java.io.InputStream contract), nothing to write
    } yield count // Returns the actual amount of bytes transmitted

  def transfer(origin: InputStream, destination: OutputStream): IO[Long] =
    for {
      buffer <- IO(new Array[Byte](1024 * 10)) // Allocated only when the IO is evaluated
      total  <- transmit(origin, destination, buffer, 0L)
    } yield total

}

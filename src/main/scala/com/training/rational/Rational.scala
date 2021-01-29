package com.training.rational

class Rational(n: Int, d: Int) {
  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  override def toString = s"$numer/$denom"

  def this(n: Int) = this(n, 1)

  def add(that: Rational) = new Rational(numer * that.denom + denom * that.numer, denom * that.denom)
}


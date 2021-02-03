package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec


class PalindromeSpec extends AnyWordSpec with Matchers {

  "Palindrome Spec" should {

    "do not use lazy" in {
      def isPalindrome(x: String) = x == x.reverse
      def findFirstPalindrome(s: Seq[String]) = s find isPalindrome

      val words = List("This", "is", "anna", "able", "to", "get", "cake")
      findFirstPalindrome(words take 4) shouldEqual Some("anna")
    }

    "use lazy" in {
      def isPalindrome(x: String) = x == x.reverse
      def findFirstPalindrome(s: Seq[String]) = s find isPalindrome

      val words = List("This", "is", "anna", "able", "to", "get", "cake")
      findFirstPalindrome(words.view take 4) shouldEqual Some("anna")
    }

  }

}

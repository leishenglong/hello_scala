package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.xml._


class XmlSpec extends AnyWordSpec with Matchers {

  "XML Spec" should {
    "decode XML in a simple way" in {
      val xmlString =
        """
          |<location city="LA" region="New York">
          | <condition>hello</condition>
          |</location>""".stripMargin

      val xml = XML.loadString(xmlString)

      val city = xml \\ "location" \\ "@city"
      val region = xml \\ "location" \\ "@region"
      val temp = xml \\ "location" \\ "condition"

      temp.text shouldEqual "hello"

      city.toString shouldEqual "LA"
      region.toString shouldEqual "New York"
    }
  }

}

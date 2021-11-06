package com.training

import com.huaban.analysis.jieba.JiebaSegmenter
import scala.collection.JavaConverters._
import scala.io.Source

//https://github.com/fxsjy/jieba
object WordCount {

  val reg="\\u3002|\\uff1f|\\uff01|\\uff0c|\\u3001|\\uff1b|\\uff1a|\\u201c|\\u201d|\\u2018|\\u2019|\\uff08|\\uff09|\\u300a|\\u300b|\\u3008|\\u3009|\\u3010|\\u3011|\\u300e|\\u300f|\\u300c|\\u300d|\\ufe43|\\ufe44|\\u3014|\\u3015|\\u2026|\\u2014|\\uff5e|\\ufe4f|\\uffe5"

  def main(args: Array[String]): Unit = {

    val path = WordCount.getClass.getResource("/new.txt").getPath
    val linesList = Source.fromFile(path).getLines().toList

    val jieba = new JiebaSegmenter
    val wordNum=linesList.flatMap(l => l.split(reg)).flatMap(l => jieba.sentenceProcess(l).asScala).
//    val wordNum=linesList.flatMap(l => jieba.sentenceProcess(l).asScala).
      map((_,1)).groupBy(_._1).map(s=>(s._1,s._2.size)).toList.sortBy(_._2).reverse.slice(0,20)
    println(wordNum)
  }
}

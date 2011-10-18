package chap02.program01

object HelloTest {

  def main(args:Array[String]) {
    var testTarget = new Hello
    if(testTarget.getMessage() equals "Hello World!" ){
      println("getMessageTest1:OK")
    } else {
      println("getMessageTest1:NG")      
    }
  }
  
}
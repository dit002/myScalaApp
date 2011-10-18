package chap02.program01

/**
 *  コマンド実行する場合、Class宣言はせずにObjectで宣言する。
 */
object Main {
  
  /**
   * コマンド実行時に呼ばれる関数(javaのstatic void main(String[] args)と同意。
   * @param 実行時引数 
   */
  def main(args: Array[String]) {

    val hello = new Hello		//更新できない変数val
    println(hello.getMessage)	//getMessageを呼び出し、コンソールへ出力

    var hello2 = new Hello		//更新可能な変数var
    hello2.printMessage			//printMessageによるコンソール出力
    hello2 = new Hello			//varの更新
    hello2.printMessage			//printMessageによるコンソール出力２

  }
}
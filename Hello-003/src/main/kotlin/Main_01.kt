import java.lang.Exception
import java.util.*
// 사칙연산 Exception 처리
fun main() {
    val scan:Scanner=Scanner(System.`in`)
    while (true){
        print("첫번째 정수 입력 : ")
        val strNum1=scan.nextLine()
        val intNum1=try {
            Integer.valueOf(strNum1)
        }catch (e:Exception){
            println("정수로만 입력")
            continue
        }
        print("두번째 정수 입력 : ")
        val strNum2=scan.nextLine()
        val intNum2=try {
            Integer.valueOf(strNum1)
        }catch (e:Exception){
            println("정수로만 입력")
            continue
        }


    }

}
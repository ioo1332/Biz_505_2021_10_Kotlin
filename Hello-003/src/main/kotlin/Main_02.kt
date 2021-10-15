import java.lang.Exception
import java.util.*
// 사칙연산 Exception 처리(정수 입력,크기 비교)
val scan:Scanner=Scanner(System.`in`)
/**
 * (title:String="임의의") default 매개변수 선언
 * default 로 매개변수를 선언하면 함수를 호출할때
 * 값을 전달하지않아도 된다
 * 값이 전달되지않으면 default 설정된값이 매개변수에 전달된것과 같이 작동된다 *
 */
// return 오면 함수뒤에 리턴타입 설정
fun inputNum(title:String="임의의"):Int{
    while (true){
        print("$title 정수를 입력하세요 : ")
        val strNum:String=scan.nextLine()
        val intNum:Int=try {
            Integer.valueOf(strNum)
        }catch (e:Exception){
            println("$title 은 정수로만 입력 해주세요")
            continue
        }
        return intNum
    }
}

fun main() {
    while (true){
        val intNum1:Int=inputNum("첫번째")
        val intNum2:Int=inputNum("두번째")
        if(intNum1<intNum2){
            println("첫번째 정수값이 두번째 보다 커야합니다")
            continue
        }
        // 전에 있던 프로젝트에서 view 불러와서 사용
        view(intNum1,intNum2)
        println("계속할까요 Enter:계속 No:종료")
        val endStr=scan.nextLine()
        if(endStr.equals("No")) break
    }

}

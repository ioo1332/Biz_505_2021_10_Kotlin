import java.util.*

fun main() {

    var scan:Scanner= Scanner(System.`in`)
    println("반지름을 입력하세요(실수형) : ")
    var strInput=scan.nextLine()

    var radius:Int=Integer.valueOf(strInput)

    // 원의 둘레 : 반지름 * 2 * 파이
    // 원의 면적 : 반지름 * 반지름 * 파이

    // 구의 표면적 : 반지름 * 반지름 * 4 * 파이
    // 구의 부피 : 반지름 * 반지름 *반지름 * 파이 * (4/3)

    var pi=Math.PI

    //var r=strInput
}
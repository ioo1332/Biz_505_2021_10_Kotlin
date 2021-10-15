import java.util.*

fun main() {
    val scan: Scanner = Scanner(System.`in`)
    val star=scan.nextLine()
    val intNum:Int= Integer.valueOf(star)

    // 별 찍기
    for (num in 1..5){
        println("* ".repeat(num))
    }

    for (num in 1..5){
        for(s in 1..num){
            print("* ")
        }
        println()
    }

    // 역으로 별 찍기
    for (num in 1..5){
        for (num1 in 5 downTo num) {
            print("* ")
        }
        println()
    }







}
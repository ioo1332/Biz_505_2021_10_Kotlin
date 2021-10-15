import java.lang.Exception
import java.util.*
import kotlin.random.Random

fun main() {

    val rnd= Random(System.currentTimeMillis())
    val scan: Scanner = Scanner(System.`in`)
    print("10 ~ 100 정수 입력 : ")
    val strNum=scan.nextLine()
    val intNum:Int= Integer.valueOf(strNum)

    val array = arrayListOf<Int>()

    for (num in 1..intNum){}
    for (num in 0 until intNum){
        val rndNum=rnd.nextInt(100)+1
        array.add(rndNum)
    }

    val newArray1= arrayListOf<Int>()
    for(arr in array){
        newArray1.add(arr+2)
    }

    val newArray2=array.map { it +2 }

    println("원래배열 : $array")
    println("배열1 : $newArray1")
    println("배열2 : $newArray2")






}
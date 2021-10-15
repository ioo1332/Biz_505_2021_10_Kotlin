import java.util.*
// 함수 전달 사칙연산
fun main(args:Array<String>) {
    val scan:Scanner=Scanner(System.`in`)
    print("정수값을 입력하세요 : ")
    var strNum1 = scan.nextInt()
    print("정수값 한번더 입력하세요 : ")
    var strNum2 = scan.nextInt()

    var intNum1=Integer.valueOf(strNum1)
    var intNum2=Integer.valueOf(strNum2)

    view(intNum1,intNum2)


}
fun view(num1:Int,num2:Int){

    var sum=num1+num2
    var minus=num1+num2
    var times=num1*num2
    var div=num1/num2

    println("두수의 + $num1 + $num2 =${num1+num2}")
    println("두수의 - $num1 - $num2 = ${num1-num2}")
    println("두수의 * $num1 * $num2 = ${num1*num2}")
    println("두수의 / $num1 / $num2 = ${num1/num2}")
}
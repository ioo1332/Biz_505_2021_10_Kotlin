/**
 * 진입점 함수
 * kotlin 프로젝트의 시작점,시작하는 함수
 * run 을 실행했을때 자동으로 호출되어 실행되는 함수
 */
fun main() {
    /***
     * kotlin 에서 변수를 선언하기
     * java 에서 기본적으로 변수의 type 을 지정하여 선언을한다
     * type 지정하여 변수를 선언하는것이 익숙하지않아서
     * 많은 어려움을 겪는다
     *
     * kotlin 에서는 변수를 선언할때 어떤값을 저장할지 결정이 되면
     * type 을 지정하지않아도 자동으로 type 설정이 되는 형식으로 생성이 된다
     *
     * 변수를 선언하고 초기값을 저장하면 자동으로 type 이 지정된다
     */
    // 정수0을 사용하여 초기화 하였으므로 정수형 변수가 된다
    var num1=0
    // 문자열값을 사용하여 초기화하였으므로 문자열형 변수
    var str1="Korea"
    // true 값을 사용하여 초기화를 하였으므로 Boolean 형 변수
    var bYes=true
    // 정수 0L을 사용하여 초기화 : Long 형 변수
    var num2=0L
    // 실수 3.0 값을 사용하여 초기화:Double 형 변수
    var num3=3.0
    // float 실수 3.0 값을 사용하여 초기화 : Float 형 변수
    var num4=3.0F
    // 문자 A를 사용하여 초기화: Char 형 변수
    var char1='A'

    var num5:Int=0
    var num6:Long=0L
    var num7:Float=3.0F
    var num8:Double=3.0
    var bYes1:Boolean=true
    var str3:String="대한민국"

    // 기본적으로 Kotlin 변수는 null 값을 저장할수 없다
    // var str2=null

    // 정말 null값을 처리하고싶을경우 safe null 이라는 형식을 사용
    // 1. 표준문문법으로 변수를 선언한다 : type 을 강제 

}
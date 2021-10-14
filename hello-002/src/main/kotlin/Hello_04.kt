fun main() {
    var num1=10
    /**
     * 0부터 num1 까지 반복하면서 
     * 각 요소를 num 변수에 담아 내부로 전달
     */
    for(num in 0..num1){
        print("$num,")
    }
    println()
    for(num in 0..10){
        print ("$num,")
    }
    for(num in 0..(10-1)){
        print ("$num,")
    }
    // until 10 : 10미만까지
    for (num in 0 until 10){
        print ("$num,")
    }
    // 2씩 건너 뛰면서 
    for (num in 0..20 step 2){
        print("$num,")
    }
    // 20부터 거꾸로 0까지 2씩 감소하면서
    for (num in 20 downTo 0 step 2 ){
        print("$num,")
    }
    /**
     * 0부터 100까지 범위의 수중에서 3의 배수의 합을 계산하여
     * sum 변수에 담고 결과를 console 에 출력하시오
     */
    var sum=0
    for (num in 0..100 step 3){
        sum+=num
        print("3의 배수의 합 $sum")
    }
    // 범위를 지정 할수있음
    for(num in 0..100){
        if(num%3==0){
            sum+=num
        }
    }
}
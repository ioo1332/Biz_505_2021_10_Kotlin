fun main() {
    var numbers=Array(45,{index->index+1})
    viewList(numbers)
    println("=".repeat(50))
    // collection 에 담긴 데이터를 무작위로 섞어주는 함수  shuffle
    numbers.shuffle()
    viewList(numbers)

    // 0부터 5번까지 6개를 잘라서 복사하기
    var lottoNum=numbers.slice(0..5)
    println("=".repeat(50))
    println("오늘의 행운의 숫자")
    println("=".repeat(50))
    // 잘라내서 복사한 배열을 다시 정렬 하여 보여주기
    println(lottoNum.sorted())
    println("=".repeat(50))

}
fun viewList(numbers:Array<Int>){
    for ((index,num) in numbers.withIndex()){
        print("$num,")
        // 5개마다 끊어서 줄바꿈
        if((index+1)%5==0) println()
    }
}
import kotlin.random.Random
// 0 부터 100 까지 난수중 소수 찾기
fun main() {
    val rnd= Random(System.currentTimeMillis())
    val array= arrayListOf<Int>()

    //val primes = array.filter

    for(num in 0..100){
        val rndNum=rnd.nextInt(100)+1
        var index = 2
        while (index <= rndNum/2){
            if(rndNum % index == 0){
                break
            }
            index++
        }
        if(index >= rndNum / 2) {
            array.add(rndNum)
            continue
        }
        println("소수 : $rndNum ")
    }




}
fun main() {
    // key와 value를 쌍으로 갖는 데이터 타입
    var map1= mapOf(
        "name" to "홍길동",
        "tel" to "010-0000-0000",
        "addr" to "서울시",
    )
    println(map1["name"])
    for ((key,value)in map1){
        println("Key:$key,Value:$value")
    }

    // 가변형 map
    val map2 = mutableMapOf(
        "name" to "이몽룡",
        "tel" to "010-0000-0000",
        "addr" to "서울시",
    )
    println(map2)
    map2["tel"]="010-222-2222"
    println(map2)
}
package kiosk

class CustardMenu(name: String, price: Double, info: String) {
    val name: String
    val price: Double
    val info: String

    init {
        this.name = name
        this.price = price
        this.info = info
    }

    fun custardInfo() {
        val cnc_Shake = CustardMenu("Cookie&Cream Shake", 7.5, "부드러운 바닐라 커스터드와 바삭한 쿠키가 어우러진 쉐이크")
        val mint_cnc_Shake = CustardMenu("Mint Cookie&Cream shake", 7.5, "민트 향과 바닐라, 바삭한 쿠키가 어우러진 쉐이크")
        val classicShake = CustardMenu("Classic Hand-Spun Shake", 6.5, "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크")
        val cupAndCone = CustardMenu("Cup & Cones", 5.4, "매일 점포에서 신선하게 제조하는 진한 아이스크림")

        println("[ Custard MENU ]")
        println("1.${cnc_Shake.name.padEnd(18)}| ${cnc_Shake.price} | ${cnc_Shake.info}")
        println("2.${mint_cnc_Shake.name.padEnd(18)}| ${mint_cnc_Shake.price} | ${mint_cnc_Shake.info}")
        println("3.${classicShake.name.padEnd(18)}| ${classicShake.price} | ${classicShake.info}")
        println("4.${cupAndCone.name.padEnd(18)} | ${cupAndCone.price} | ${classicShake.info}")
    }
}
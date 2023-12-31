package kiosk

class BurgersMenu(name: String, price: Double, info: String) {
    val name: String
    val price: Double
    val info: String

    init {
        this.name = name
        this.price = price
        this.info = info
    }

    fun burgerInfo() {
//        val burgerList : List<BurgersMenu> = listOf<BurgersMenu>(shackBurger,smokeShack,shroomBurger,cheeseBurger,hamburger)
        val smokeShack = BurgersMenu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        val shackBurger = BurgersMenu("Shackburger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        val shroomBurger = BurgersMenu("Shroomburger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        val cheeseBurger = BurgersMenu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        val hamburger = BurgersMenu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")

        println("[ Burgers MENU ]")
        println("1.${shackBurger.name.padEnd(18)}| ${shackBurger.price} | ${shackBurger.info}")
        println("2.${smokeShack.name.padEnd(18)}| ${smokeShack.price} | ${smokeShack.info}")
        println("3.${shroomBurger.name.padEnd(18)}| ${shroomBurger.price} | ${shroomBurger.info}")
        println("4.${cheeseBurger.name.padEnd(18)}| ${cheeseBurger.price} | ${cheeseBurger.info}")
        println("5.${hamburger.name.padEnd(18)}| ${hamburger.price} | ${hamburger.info}")

        while(true){
            val burgerChoice = readln().toInt()
            when(burgerChoice){
                1 -> {
                    println("shake버거?")
                    println("1.구매 2.취소")
                    readln().toInt()
                    println("주문이 완료되었습니다.")
                }
                2 -> println("감사합니다.")
            }
        }
    }
}

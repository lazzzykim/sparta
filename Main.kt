package kiosk

import kotlin.system.exitProcess

fun main() {
    val mainMenu = MainMenu("", "")
    val orders = Orders("", "")
    val burgersMenu = BurgersMenu("", 0.0, "")
    val custardMenu = CustardMenu("", 0.0, "")

    println("메뉴를 선택해주세요.\n")
    var mainmenu1 = mainMenu.mainMenuInfo()
    var mainmenu2 = orders.ordersInfo()

    while (true) {
        val menuChoice = readln().toInt()
//        try {
//            val menuChoice = readln()?.toInt()
//        } catch (e: NumberFormatException) {
//            println("숫자만 입력해주세요.")
//        }
        when (menuChoice) {
            1 -> burgersMenu.burgerInfo()
            2 -> custardMenu.custardInfo()
            0 -> {
                println("안녕히 가세요.")
                exitProcess(0)
            }

            else -> {
                println("잘못 입력하셨습니다. 다시 시도해주세요.")
                mainmenu1 = mainMenu.mainMenuInfo()
                mainmenu2 = orders.ordersInfo()
            }
        }
    }
}




package kiosk

class MainMenu (title: String, info: String) {
    val title: String
    val info : String

    init {
        this.title = title
        this.info = info
    }

    fun mainMenuInfo() {
        val burgers = MainMenu("BurgersMenu","앵거스 비프 통살을 다져만든 버거")
        val frzCustard = MainMenu("Frozen Custard","매장에서 신선하게 만드는 아이스크림")
        val drinks = MainMenu("drinks","매장에서 직접 만드는 음료")
        val beer = MainMenu("Beer","뉴욕 브루클린 브루어리에서 양조한 맥주")
        val exit = MainMenu("종료","프로그램 종료")

        println("[ SHAKESHACK MENU ]")
        println("1.${burgers.title.padEnd(18)}| ${burgers.info}")
        println("2.${frzCustard.title.padEnd(18)}| ${frzCustard.info}")
        println("3.${drinks.title.padEnd(18)}| ${drinks.info}")
        println("4.${beer.title.padEnd(18)}| ${beer.info}")
        println("5.${exit.title.padEnd(16)}| ${exit.info}\n")
    }
}

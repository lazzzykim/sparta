package kiosk

class Orders(title: String, info: String) {
    val title: String
    val info: String

    init {
        this.title = title
        this.info = info
    }

    fun ordersInfo() {
        val orders = MainMenu("Order", "장바구니를 확인 후 주문합니다.")
        val Cancel = MainMenu("Cancel", "진행중인 주문을 취소합니다.")


        println("[ ORTHER MENU ]")
        println("5.${orders.title.padEnd(18)}| ${orders.info}")
        println("6.${Cancel.title.padEnd(18)}| ${Cancel.info}")
    }

}

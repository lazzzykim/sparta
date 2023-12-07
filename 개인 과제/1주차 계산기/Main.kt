package calculator

fun main() {
    val calculator = Calculator()
    println("연산 방식을 선택해주세요.")
    println("1 : 더하기, 2 : 빼기, 3 : 곱하기, 4 : 나누기")
    val method = readln().toInt()
    println("수를 입력해주세요.")
    val number1 = readln().toDouble()
    println("수를 입력해주세요.")
    val number2 = readln().toDouble()
    var answer = 0
    when (method) {
        1 -> println("계산결과 : ${calculator.add(AddOperation(), number1, number2)} 입니다.")


        2 -> println("계산결과 : ${calculator.substract(SubstractOperation(), number1, number2)} 입니다.")


        3 -> println("계산결과 : ${calculator.multiply(MultiplyOperation(), number1, number2)} 입니다.")


        4 -> println("계산결과 : ${calculator.divide(DivideOperation(), number1, number2)} 입니다.")


        else -> println("ERROR. 다시 시도하세요.")

    }
}
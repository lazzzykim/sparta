package calculator

class Calculator {
    fun add(addOperation: AddOperation, num1: Double, num2: Double): Double {
        return addOperation.operation(num1, num2)
    }

    fun substract(substractOperation: SubstractOperation, num1: Double, num2: Double): Double {
        return substractOperation.operation(num1, num2)
    }

    fun multiply(multiplyOperation: MultiplyOperation, num1: Double, num2: Double): Double {
        return multiplyOperation.operation(num1, num2)
    }

    fun divide(divideOperation: DivideOperation, num1: Double, num2: Double): Double {
        return divideOperation.operation(num1, num2)
    }
}
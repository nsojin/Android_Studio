package com.example.calculator

class SubstractOperation {
    fun operate(num1: Double, num2: Double): Double {

        var result: Double = 0.0

        result = num1 - num2
        println("${num1}과 ${num2}를 뺀 값은 ${num1 + num2}입니다.")

        return result
    }
}
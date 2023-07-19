package com.example.calculator

class Calculator {
    fun operate(num1:Int, num2:Int,op:String):Int{

        var result:Int =0

        if (op == "+"){
            result = num1 + num2
            println("${num1}과${num2}를 더한 값은 ${num1+num2}입니다.")
        }
        else if (op == "-"){
            result = num1 - num2
            println("${num1}과${num2}를 뺀 값은 ${num1-num2}입니다.")
        }
        else if (op == "*"){
            result = num1 * num2
            println("${num1}과${num2}를 곱한 값은 ${num1*num2}입니다.")
        }
        else if (op == "/"){
            result = num1 / num2
            println("${num1}과${num2}를 나눈 값은 ${num1/num2}입니다.")
        }
        else if (op == "%"){
            result = num1 % num2
            println("${num1}과${num2}의 나머지 연산 값은 ${num1%num2}입니다.")
        }
        else{
            println("다시 입력해 주세요.")
        }
        return result
    }
}
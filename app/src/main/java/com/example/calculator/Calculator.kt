package com.example.calculator

class Calculator {
    fun operate(num1:Double, num2:Double,op:String):Double{

        var add = AddOperation()
        var sub = SubstractOperation()
        var mul = MultiplyOperation()
        var div = DivideOperation()
        var result:Double = 0.0

        if (op == "+"){
            result = add.operate(num1,num2)
        }
        else if (op == "-"){
            result = sub.operate(num1,num2)
        }
        else if (op == "*"){
            result = mul.operate(num1,num2)
        }
        else if (op == "/"){
            result = div.operate(num1,num2)
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
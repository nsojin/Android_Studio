package com.example.calculator

class AddOperation {
    fun operate(num1:Double, num2:Double, num3:Double,op2:String ):Double{

        var result:Double = 0.0

        if(op2 == "+"){
            result = num1 + num2 +num3
            println("${num1}+${num2}+${num3}의 값은 ${num1+num2+num3}입니다.")
        }

        else if (op2 == "-"){
            result = num1 + num2 - num3
            println("${num1}+${num2}-${num3}의 값은 ${num1+num2-num3}입니다.")
        }

        else if (op2 == "*"){
            result = num2 * num3 + num1
            println("${num1}+${num2}*${num3}의 값은 ${num2*num3+num1}입니다.")
        }

        else if (op2 == "/"){
            result = num2 / num3 + num1
            println("${num1}+${num2}/${num3}의 값은 ${num2/num3+num1}입니다.")
        }
        else if (op2 == "%") {
            result = num2 % num3 + num1
            println("${num1}+${num2}%${num3}의 값은 ${num2 % num3 + num1}입니다.")
        }

        else{
            println("다시 입력해 주세요.")
        }


        return result
    }
}
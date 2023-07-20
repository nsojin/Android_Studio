package com.example.calculator

 fun main() {

     println("숫자를 입력해 주세요.")
     var num1 = readLine()!!.toDouble()
     println("연산을 입력해 주세요.(+,-,*,/)")
     var op1 = readLine()!!.toString()
     println("숫자를 입력해 주세요.")
     var num2 = readLine()!!.toDouble()
     println("연산을 입력해 주세요.(+,-,*,/)")
     var op2 = readLine()!!.toString()
     println("숫자를 입력해 주세요.")
     var num3 = readLine()!!.toDouble()

     var calc = Calculator()
     println("결과는 ${calc.operate(num1, num2, num3, op1, op2)}입니다.")

     }


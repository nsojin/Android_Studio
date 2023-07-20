package com.example.calculator

class Calculator {
    fun operate(num1:Double, num2:Double,num3:Double,op1:String, op2:String):Double{

        var add = AddOperation()
        var sub = SubstractOperation()
        var mul = MultiplyOperation()
        var div = DivideOperation()
        var rem = RemainderOperation()
        var result:Double = 0.0

        if (op1 == "+" ){
            result = add.operate(num1,num2,num3,op2)
        }
        else if (op1 == "-"){
            result = sub.operate(num1,num2,num3,op2)
        }
        else if (op1 == "*"){
            result = mul.operate(num1,num2,num3,op2)
        }
        else if (op1 == "/"){
            result = div.operate(num1,num2,num3,op2)
        }
        else if (op1 == "%"){
            result = rem.operate(num1,num2,num3,op2)
        }
        else{
            println("다시 입력해 주세요.")
        }
        return result
    }
}
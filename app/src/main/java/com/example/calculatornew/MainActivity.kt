package com.example.calculatornew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

    private lateinit var num1 : Button
    private lateinit var num2 : Button
    private lateinit var num3 : Button
    private lateinit var num4 : Button
    private lateinit var num5 : Button
    private lateinit var num6 : Button
    private lateinit var num7 : Button
    private lateinit var num8 : Button
    private lateinit var num9 : Button
    private lateinit var num0 : Button
    private lateinit var eql : Button
    private lateinit var clear : Button
    private lateinit var decimal: Button
    private lateinit var ans : TextView
    private lateinit var sum : Button
    private lateinit var sub : Button
    private lateinit var divide : Button
    private lateinit var multiply : Button
    private lateinit var finalAns : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ans = findViewById(R.id.textView)
        finalAns = findViewById(R.id.textView2)
        var number1:String = ""
        var number1final:Double = 0.0
        var final:String = ""
        num1 = findViewById(R.id.num1Btn)
        num1.setOnClickListener{
            number1 += "1"
            ans.text = number1
        }

        num2 = findViewById(R.id.num2Btn)
        num2.setOnClickListener{
            number1 += "2"
            ans.text = number1
        }

        num3 = findViewById(R.id.num3Btn)
        num3.setOnClickListener{
            number1 += "3"
            ans.text = number1
        }

        num4 = findViewById(R.id.num4Btn)
        num4.setOnClickListener{
            number1 += "4"
            ans.text = number1
        }

        num5 = findViewById(R.id.num5Btn)
        num5.setOnClickListener{
            number1 += "5"
            ans.text = number1
        }

        num6 = findViewById(R.id.num6Btn)
        num6.setOnClickListener{
            number1 += "6"
            ans.text = number1
        }

        num7 = findViewById(R.id.num7Btn)
        num7.setOnClickListener{
            number1 += "7"
            ans.text = number1
        }

        num8 = findViewById(R.id.num8Btn)
        num8.setOnClickListener{
            number1 += "8"
            ans.text = number1
        }

        num9 = findViewById(R.id.num9Btn)
        num9.setOnClickListener{
            number1 += "9"
            ans.text = number1
        }

        num0 = findViewById(R.id.num0Btn)
        num0.setOnClickListener{
            number1 += "0"
            ans.text = number1
        }

        decimal = findViewById(R.id.decimalBtn)
        decimal.setOnClickListener{
            number1 +="."
            ans.text = number1
        }

        clear = findViewById(R.id.clearBtn)
        clear.setOnClickListener{
            number1 = ""
            final = ""
            ans.text = number1
            finalAns.text = ""
        }

        sum = findViewById(R.id.sumBtn)
        sum.setOnClickListener{
            number1final= number1.toDouble()
            number1 += "+"
            ans.text = number1
            finalAns.text = ""
        }

        sub = findViewById(R.id.subBtn)
        sub.setOnClickListener{
            number1final= number1.toDouble()
            number1 += "-"
            ans.text = number1
            finalAns.text = ""
        }

        divide = findViewById(R.id.divideBtn)
        divide.setOnClickListener{
            number1final= number1.toDouble()
            number1 += "/"
            ans.text = number1
            finalAns.text = ""
        }

        multiply = findViewById(R.id.multiplyBtn)
        multiply.setOnClickListener{
            number1final= number1.toDouble()
            number1 += "*"
            ans.text = number1
            finalAns.text = ""
        }

        eql = findViewById(R.id.equalBtn)
        eql.setOnClickListener{
            final = gettingAnswer(number1 , number1final).toString()
            finalAns.text = final
            number1 = final

        }
    }

    private fun gettingAnswer(number: String, firstNum: Double) :Double {
        val length = number.length
        var id1:Int = 0
        var secondNum:Double = 0.0
        var answer:Double = 0.0

        if ("+" in number){
            id1 = number.indexOf("+")+1
            secondNum = number.substring(id1,length).toDouble()
            answer = firstNum + secondNum

        }
        else if ("*" in number){
            id1 = number.indexOf("*")+1
            secondNum = number.substring(id1,length).toDouble()
            answer = firstNum * secondNum
        }
        else if ("/" in number){
            id1 = number.indexOf("/")+1
            secondNum = number.substring(id1,length).toDouble()
            answer = firstNum / secondNum
        }
        else if ("-" in number){
            id1 = number.indexOf("-")+1
            secondNum = number.substring(id1,length).toDouble()
            answer = firstNum - secondNum
        }

        return answer
    }
}
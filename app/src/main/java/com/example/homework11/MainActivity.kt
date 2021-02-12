package com.example.homework11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Сделайте небольшую игру,в которой будут три LinearLayout в вертикальной ориентации.
//Пусть в каждом LinearLayout будет 3 View разных цветов.
//Сделайте лист рандомных цветов и пусть при нажатии на какое либо View изменяется ее цвет на рандомный цвет.
//По желанию:
//Создайте лист map, в котором ключом будет код цвета,а значением будет название цвета.
//Создайте TextView, который будет находится под Linear Layouts и пусть при каждом нажатии на View высвечивается название его цвета в этом TextView.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
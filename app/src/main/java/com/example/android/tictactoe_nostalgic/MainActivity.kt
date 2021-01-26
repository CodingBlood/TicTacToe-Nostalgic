package com.example.android.tictactoe_nostalgic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var turn : Int=1
    var game   = arrayOf(25,24,23,22,21,20,19,18,17)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var PLayerTurn : Int = 1

        reset.setOnClickListener{
            turn = 1
            game   = arrayOf(25,24,23,22,21,20,19,18,17)
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        imageView1.setOnClickListener(this)
        imageView2.setOnClickListener(this)
        imageView3.setOnClickListener(this)
        imageView4.setOnClickListener(this)
        imageView5.setOnClickListener(this)
        imageView6.setOnClickListener(this)
        imageView7.setOnClickListener(this)
        imageView8.setOnClickListener(this)
        imageView9.setOnClickListener(this)

    }


    override fun onClick(v: View?) {
        if(turn%2==0){
            v?.setBackgroundResource(R.drawable.x)
            textView1.text="Play Player I"
            chance(v?.id)
            turn++
//            2131296432--40
        }else{
            v?.setBackgroundResource(R.drawable.o)
            textView1.text="Play Player II"
            chance(v?.id)
            turn++
        }
    }

    private fun chance(id: Int?) {
        var btnno : Int? = (id?.rem(100))?.minus(32)
        if(turn%2 == 0){
            game[btnno!!]=1
        }else{
            game[btnno!!]=2
        }
        check()
    }

    private fun check() {
        if(game[0] == game [1] && game[1]==game[3]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }else if(game[3] == game [4] && game[4]==game[5]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }else if(game[6] == game [7] && game[7]==game[8]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }else if(game[0] == game [3] && game[3]==game[6]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }else if(game[1] == game [4] && game[4]==game[7]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }else if(game[2] == game [5] && game[5]==game[8]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }else if(game[0] == game [4] && game[4]==game[8]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }else if(game[2] == game [4] && game[4]==game[6]){
            if(turn%2==0){
                textView1.text="Player II Wins"
            }else{
                textView1.text="Player I Wins"
            }
        }
    }
}

//012
//345
//678
package com.appy.devprofile.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.appy.devprofile.Model.Player
import com.appy.devprofile.R
import com.appy.devprofile.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

//    var league = ""
//    var skill = ""
    lateinit var player : Player   // lateinit stands for declare now initialize later

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

//         league = intent.getStringExtra(EXTRA_LEAGUE)
         player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerClicked(view: View){

        ballerSkillBtn.isChecked = false
        player.skill = "Beginner"

    }
    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = " Baller"

    }
    fun onSkillFinishedClicked(view : View){
        if(player.skill!="") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this,"Please select a skill",Toast.LENGTH_SHORT).show()
        }
    }


}

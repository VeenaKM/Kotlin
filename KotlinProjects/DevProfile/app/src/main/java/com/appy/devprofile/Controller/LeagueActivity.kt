package com.appy.devprofile.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.appy.devprofile.Model.Player
import com.appy.devprofile.R
import com.appy.devprofile.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

//    var selectedLeague = ""
    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(view: View){

        womenLeagueBtn.isChecked = false
        coedLleagueBtn.isChecked = false

        player.league = "Mens"
//        selectedLeague = "Mens"

    }
    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLleagueBtn.isChecked = false
        player.league = "Womens"
//        selectedLeague = "Womens"
    }
    fun onCoEdClicked(view: View){
        womenLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "Co-ed"
//        selectedLeague = "Co-ed"
    }
    fun leagueNextClicked(view : View){
        if(player.league!="") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
}

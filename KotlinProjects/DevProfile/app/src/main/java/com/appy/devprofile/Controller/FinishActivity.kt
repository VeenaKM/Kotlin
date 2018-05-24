package com.appy.devprofile.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.appy.devprofile.Model.Player
import com.appy.devprofile.R
import com.appy.devprofile.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

//    var league = ""
//    var skill = ""
    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

//        league = intent.getStringExtra(EXTRA_LEAGUE)
//        skill = intent.getStringExtra(EXTRA_SKILL)
//        println(league)

        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        tvSearchLeague.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}

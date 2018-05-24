package com.appy.devprofile.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.appy.devprofile.Model.Player
import com.appy.devprofile.R
import com.appy.devprofile.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)


        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        tvSearchLeague.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}

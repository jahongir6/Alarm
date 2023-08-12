package com.example.alarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.util.Log

private const val TAG = "MyReceiver"

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive:a ")

        val uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALL)
        val mediaPlayer = MediaPlayer()
        mediaPlayer.setDataSource(context, uri)
        mediaPlayer.prepare()
        mediaPlayer.start()


        //context.startActivity(Intent(context,MainActivity::class.java))
    }
}
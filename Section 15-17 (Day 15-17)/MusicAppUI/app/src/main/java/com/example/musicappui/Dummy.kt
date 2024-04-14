package com.example.musicappui

import androidx.annotation.DrawableRes

class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_library_music_24, "Playlist"),
    Lib(R.drawable.baseline_person_add_alt_1_24,"Artists"),
    Lib(R.drawable.baseline_music_video_24,"Album"),
    Lib(R.drawable.ic_account,"Songs"),
    Lib(R.drawable.ic_subscribe,"Genre")
)
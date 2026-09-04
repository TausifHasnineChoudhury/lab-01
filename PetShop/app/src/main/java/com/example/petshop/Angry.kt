package com.example.petshop

class Angry(date: String): Mood(date) {
    override fun showMood(): String {
        return "Angry"
    }
}
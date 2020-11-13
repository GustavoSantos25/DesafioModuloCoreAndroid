package com.example.desafiomodulocoreandroid.domain

class Prato(val cod: Int, var nome : String, var img: Int) {
    override fun toString(): String {
        return "Prato(cod=$cod, nome=$nome, img=$img)"
    }
}
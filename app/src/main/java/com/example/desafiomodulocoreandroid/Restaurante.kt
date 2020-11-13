package com.example.desafiomodulocoreandroid

class Restaurante(val cod: Int, var nome: String, var endereco: String, var horarioFunc: String, var img: Int) {
    override fun toString(): String {
        return "Restaurante(nome=$cod, nome=$nome, endereço=$endereco, fechamento=$horarioFunc, img=$img)"
    }
}
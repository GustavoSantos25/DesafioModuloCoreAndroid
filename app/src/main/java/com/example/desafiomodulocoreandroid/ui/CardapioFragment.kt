package com.example.desafiomodulocoreandroid.ui

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafiomodulocoreandroid.R
import com.example.desafiomodulocoreandroid.adapters.CardapioAdapter
import com.example.desafiomodulocoreandroid.adapters.RestauranteAdapter
import com.example.desafiomodulocoreandroid.domain.Prato
import kotlinx.android.synthetic.main.fragment_cardapio.*
import kotlinx.android.synthetic.main.fragment_cardapio.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class CardapioFragment : Fragment(), CardapioAdapter.OnClickPratoListener{
    val TAG : String = "FragmentCardapio"
    var listPratos = getAllPratos()
    val adapter = CardapioAdapter(listPratos, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_cardapio, container, false)
        view.rvCardapio.adapter = adapter
        view.rvCardapio.layoutManager = GridLayoutManager(context, 2)
        view.rvCardapio.setHasFixedSize(true)
        view.btnVoltar.setOnClickListener {
            findNavController().navigate(R.id.action_cardapioFragment_to_homeFragment)
        }
        return view
    }

    fun getAllPratos() : ArrayList<Prato> = arrayListOf(
        Prato(1, "Salada com molho Gengibre", R.drawable.image4),
        Prato(2, "Salada com molho Gengibre", R.drawable.image4),
        Prato(3, "Salada com molho Gengibre", R.drawable.image4),
        Prato(4, "Salada com molho Gengibre", R.drawable.image4),
        Prato(5, "Salada com molho Gengibre", R.drawable.image4),
        Prato(6, "Salada com molho Gengibre", R.drawable.image4),
        Prato(7, "Salada com molho Gengibre", R.drawable.image4),
        Prato(8, "Salada com molho Gengibre", R.drawable.image4),
        Prato(9, "Salada com molho Gengibre", R.drawable.image4),
        Prato(10, "Salada com molho Gengibre", R.drawable.image4)
    )

    override fun onClickPrato(position: Int) {
        val prato = listPratos[position]
        when(prato.cod){
            1-> findNavController().navigate(R.id.action_cardapioFragment_to_pratoFragment)
            else -> Toast.makeText(context, prato.nome, Toast.LENGTH_SHORT).show()
        }
    }

}
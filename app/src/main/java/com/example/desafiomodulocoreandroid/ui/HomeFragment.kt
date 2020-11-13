package com.example.desafiomodulocoreandroid.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafiomodulocoreandroid.R
import com.example.desafiomodulocoreandroid.Restaurante
import com.example.desafiomodulocoreandroid.adapters.RestauranteAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment(), RestauranteAdapter.OnClickRestauranteListener {
    var listRest = getAllRests()
    val adapter = RestauranteAdapter(listRest, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_home, container, false)
        view.rvRestaurantes.adapter = adapter
        view.rvRestaurantes.layoutManager = LinearLayoutManager(context)
        view.rvRestaurantes.setHasFixedSize(true)
        return view
    }

    fun getAllRests() : ArrayList<Restaurante> = arrayListOf(
        Restaurante(1, "Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", R.drawable.image1),
        Restaurante(2, "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00", R.drawable.image4),
        Restaurante(3, "Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha às 00:00", R.drawable.image6),
        Restaurante(4, "Sí Señor!", "Alameda Jauaperi, 626 - Moema", "Fecha às 01:00", R.drawable.image3),
    )

    override fun onClickRestaurante(position: Int) {
        val nome = listRest[position].nome
        Toast.makeText(context, nome, Toast.LENGTH_SHORT).show()
    }


}
package com.example.desafiomodulocoreandroid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomodulocoreandroid.R
import com.example.desafiomodulocoreandroid.Restaurante
import org.w3c.dom.Text

class RestauranteAdapter(private val listRest : ArrayList<Restaurante>, val listener : OnClickRestauranteListener): RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestauranteAdapter.RestauranteViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_restaurantes, parent, false)
        return RestauranteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RestauranteAdapter.RestauranteViewHolder, position: Int) {
        var rest = listRest.get(position)
        holder.ivRestCard.setImageResource(rest.img)
        holder.tvNomeRest.text = rest.nome
        holder.tvFechamento.text = rest.horarioFunc
        holder.tvEndereco.text = rest.endereco
    }

    override fun getItemCount(): Int = listRest.size

    interface OnClickRestauranteListener{
        fun onClickRestaurante(position: Int)
    }

    inner class RestauranteViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var tvNomeRest: TextView = itemView.findViewById(R.id.tvNomeRestaurante)
        var tvFechamento: TextView = itemView.findViewById(R.id.tvHorario)
        var ivRestCard: ImageView = itemView.findViewById(R.id.ivImgRestCard)
        var tvEndereco : TextView = itemView.findViewById(R.id.tvEndereco)

        init{
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION)
                listener.onClickRestaurante(position)
        }
    }
}
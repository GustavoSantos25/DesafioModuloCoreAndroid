package com.example.desafiomodulocoreandroid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomodulocoreandroid.R
import com.example.desafiomodulocoreandroid.domain.Prato

class CardapioAdapter(private val listPratos : ArrayList<Prato>, val listener : OnClickPratoListener) : RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardapioAdapter.CardapioViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_cardapio, parent, false)
        return CardapioViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardapioAdapter.CardapioViewHolder, position: Int) {
        var prato = listPratos[position]
        holder.tvNomePrato.text = prato.nome
        holder.ivRestCard.setImageResource(prato.img)
    }

    override fun getItemCount(): Int = listPratos.size


    interface OnClickPratoListener{
        fun onClickPrato(position: Int)
    }


    inner class CardapioViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var tvNomePrato: TextView = itemView.findViewById(R.id.tvNomePrato)
        var ivRestCard: ImageView = itemView.findViewById(R.id.ivPrato)


        init{
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION)
                listener.onClickPrato(position)
        }
    }


}
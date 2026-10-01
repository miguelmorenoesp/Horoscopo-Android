package com.example.horoscopo


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HoroscopeAdapter(val items: List<Horoscope>) : RecyclerView.Adapter<HoroscopeViewHolder>() {
    // cual es la vista de cada elemento
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate( resource = R.layout.item_horoscope, root = parent, attachToRoot = false
            return HoroscopeViewHolder(view)

    }
    // cuales son los datos del elemento en X posicion
    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int)
     {
        val horoscope = items[position]
        holder.render(horoscope)

    }
    // cuantos elementos tengo que mostrar
    override fun getItemCount(): Int
    {
        return items.size
    }

}

class HoroscopeViewHolder(view : View) : RecyclerView.ViewHolder( itemView = view ) {
    val signImageView: ImageView = view.findViewById(R.id.signImageView)
    val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    val datesTextView: TextView = view.findViewById(R.id.datesTextView)

    fun render (horoscope: Horoscope)
    {
        nameTextView.setText(horoscope.name)
        datesTextView.setText(horoscope.dates)
        signImageView.setImageResource(horoscope.sign)

}

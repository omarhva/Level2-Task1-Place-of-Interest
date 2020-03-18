package com.example.placeofinterest1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_place.view.*

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */


public class PlaceAdapter(private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place: Place) {
            itemView.ivPlace.setImageResource(place.imageResId)
            itemView.tvPlace.text = place.name
        }
    }

    /**
     * Creates and returns a ViewHolder object, inflating the layout called item_place.
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    /**
     * get the size of the list
     */
    override fun getItemCount(): Int {
        return places.size
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     */

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(places[position])

    }


}
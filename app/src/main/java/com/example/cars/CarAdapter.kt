package com.example.cars

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.cars.databinding.ItemCarNameBinding

class CarAdapter(private val carList: ArrayList<String>):
    RecyclerView.Adapter<CarAdapter.CarHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        return CarHolder(ItemCarNameBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.bind(carList[position])
    }

    override fun getItemCount(): Int {
     return carList.size
    }

    inner class CarHolder(private val binding: ItemCarNameBinding):ViewHolder(binding.root) {
        fun bind(carName:String){
            binding.tvCarsName.text= carName
        }

    }
}
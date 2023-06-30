package com.example.cars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cars.databinding.FragmentCarBinding

class CarFragment : Fragment() {

        private lateinit var carList: ArrayList<String>
        private lateinit var binding: FragmentCarBinding
        private lateinit var carAdapter: CarAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentCarBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        carAdapter=CarAdapter(carList)
        binding.rvCarsName.adapter=carAdapter
    }

    private fun loadData() {
        carList=ArrayList()
        carList.add("Mercedes")
        carList.add("Toyota")
        carList.add("Honda")
        carList.add("Mustang")
        carList.add("Porsche")
        carList.add("BMW")
        carList.add("KIA")
        carList.add("Tesla")
        carList.add("Hyundai")
        carList.add("Honda accord")
        carList.add("Opel")
        carList.add("BMW X5")
        carList.add("Land Rover")
        carList.add("Toyota Avalon")
        carList.add("Mercedes ML")
        carList.add("Volkswagen")
        carList.add("lamborghini")
    }

}
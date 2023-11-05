package com.onurdemir.composefoodapp.repository

import androidx.lifecycle.MutableLiveData
import com.onurdemir.composefoodapp.entity.Yemekler

class YemeklerDaoRepository {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()

    init {
        yemeklerListesi = MutableLiveData()
    }

    fun yemekleriGetir():MutableLiveData<List<Yemekler>> {
        return yemeklerListesi
    }

    fun tumYemekleriAl() {

        val liste = mutableListOf<Yemekler>()

        val y1 = Yemekler(1,"Köfte","kofte",15)
        val y2 = Yemekler(2,"Ayran","ayran",2)
        val y3 = Yemekler(3,"Fanta","fanta",3)
        val y4 = Yemekler(1,"Makarna","makarna",14)

        liste.add(y1)
        liste.add(y2)
        liste.add(y3)
        liste.add(y4)

        yemeklerListesi.value = liste
    }
}
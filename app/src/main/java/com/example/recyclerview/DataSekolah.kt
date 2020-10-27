package com.example.recyclerview

object DataSekolah {
    private val namaSekolah = arrayOf(
                "SMKN 2 PURWAKARTA",
                "SMKN 3 LINGGABUANA PURWAKARTA",
                "SMKN 1 SUKATANI",
                "SMKN 3 SUKATANI",
                "SMKN DARANGDAN",
                "SMKN 1 PLERED",
                "SMKN 1 PURWAKARTA"
    )

    private val kecamatanSekolah = arrayOf(
                "Purwakarta",
                "Purwakarta",
                "Sukatani",
                "Sukatani",
                "Darangdan",
                "Plered",
                "BabakanCikao"
    )

    private val logoSekolah = intArrayOf(
        R.drawable.smkn2purwakarta,
        R.drawable.smkn3linggabuana,
        R.drawable.smkn1sukatani,
        R.drawable.smkn3sukatani,
        R.drawable.smkndarangdan,
        R.drawable.smkn1plered,
        R.drawable.smkn1purwakarta
    )

    val listData: ArrayList<Sekolah>
        get() {
            val listSekolah = arrayListOf<Sekolah>()
            for (position in namaSekolah.indices){
                val sekolah = Sekolah()
                sekolah.nama = namaSekolah[position]
                sekolah.kecamatan = kecamatanSekolah[position]
                sekolah.logo = logoSekolah[position]
                listSekolah.add(sekolah)
            }
            return listSekolah
        }

}
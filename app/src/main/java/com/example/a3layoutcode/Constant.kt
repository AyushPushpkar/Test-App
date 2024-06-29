package com.example.a3layoutcode

object Constant {
    private lateinit var datalist: ArrayList<RvModel>
    fun getData():ArrayList<RvModel>{
        datalist = ArrayList<RvModel>()
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.gwen, "Archer", "level 13"))
        datalist.add(RvModel(R.drawable.gwen, "Archer", "level 13"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.gwen, "Archer", "level 13"))
        datalist.add(RvModel(R.drawable.gwen, "Archer", "level 13"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))
        datalist.add(RvModel(R.drawable.spidey, "Barbarian", "level 15"))

        return datalist

    }
}
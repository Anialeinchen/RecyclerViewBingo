package com.example.anna.recyclerviewbingo.model

import android.annotation.SuppressLint
import android.content.Context
import com.example.anna.recyclerviewbingo.R

class Data(context: Context,
//TODO: bingo_item cannot be resolved, added SuppressLint
           @field:SuppressLint("ResourceType")
           val currentFeatureList: Array<String> = arrayOf("a","b","c")
)
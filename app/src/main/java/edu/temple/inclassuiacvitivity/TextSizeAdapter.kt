package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class TextSizeAdapter(private val context: Context, private val textSizes: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return textSizes.size
    }

    override fun getItem(position: Int): Any {
        return textSizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return if (convertView == null) {
            TextView(context)
        } else {
            convertView as TextView
        }.apply {
            text = textSizes[position].toString()
            textSize = 22f
        }

    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return (getView(position, convertView, parent) as TextView).apply {
            textSize = textSizes[position].toFloat()
        }
    }

}
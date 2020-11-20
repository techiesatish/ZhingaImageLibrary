package com.techiesatishk.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techiesatishk.R
import com.techiesatishk.data.model.ApiImage
import com.techiesatishk.imageloader.core.Zhinga
import kotlinx.android.synthetic.main.image_item_layout.view.*


class MainAdapter(private val mImageList: List<ApiImage.Data.Children>,var itemClickInterface: OnImageClickListener, val mContext: Context) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {
    val mGreedyImageLaoder = Zhinga.getInstance(mContext,2048) //Library to load images max cached size is 2 MB
     var itemClickListener: OnImageClickListener

    init {
     this.itemClickListener=itemClickInterface
    }


    override fun getItemCount(): Int = mImageList.size



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):DataViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.image_item_layout,parent,false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder:DataViewHolder, position: Int) {
        mGreedyImageLaoder.displayImage(mImageList.get(position).data.thumbnail, holder.imageView,R.drawable.ic_launcher_background)
        holder.imageView.setOnClickListener { //listner for click on image
            itemClickInterface.onImageClickListner(mImageList.get(position).data.thumbnail)
        }

    }


    class DataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageView = view.recycler_img
    }

    interface OnImageClickListener {
        fun onImageClickListner(mImageUrl:String)
    }


}
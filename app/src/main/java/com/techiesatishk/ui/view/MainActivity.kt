package com.techiesatishk.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.techiesatishk.R
import com.techiesatishk.ui.adapter.MainAdapter
import com.techiesatishk.ui.viewmodel.MainViewModel
import com.techiesatishk.utils.ApiStatus
import com.techiesatishk.utils.AppNavigator
import com.techiesatishk.utils.ViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainAdapter.OnImageClickListener {
    private lateinit var mViewModel: MainViewModel
    private lateinit var mAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel =  ViewModelProviders.of(this@MainActivity,ViewModelFactory() ).get(MainViewModel::class.java)
        initUI() //initialize UI in this method
        initObserver() ////initialize Observer in this method
    }

    private fun initUI() {
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.addItemDecoration(DividerItemDecoration(recycler.context, (recycler.layoutManager as LinearLayoutManager).orientation))



    }

    private fun initObserver() {

        mViewModel.getImagesList().observe(this, Observer {
            when (it.ApiStatus) {
                ApiStatus.LOADING -> {
                    pb_loading.visibility = View.VISIBLE
                    tv_message.visibility=View.VISIBLE
                    tv_message.text=getString(R.string.please_wait)
                    recycler.visibility = View.GONE
                }
                ApiStatus.SUCCESS -> {
                    pb_loading.visibility = View.GONE
                    tv_message.visibility=View.GONE
                    recycler.visibility = View.VISIBLE
                    mAdapter= MainAdapter(it.data!!,this,this)
                    recycler.adapter=mAdapter
                }
                ApiStatus.ERROR -> {
                    pb_loading.visibility = View.GONE
                    tv_message.visibility=View.VISIBLE
                    tv_message.text=it.message
                    recycler.visibility = View.GONE
                }

            }
        })

    }

    override fun onImageClickListner(mImageUrl: String) {
        AppNavigator.navigateToFullImageScreen(this,mImageUrl) //Navigating to next screen
    }

}




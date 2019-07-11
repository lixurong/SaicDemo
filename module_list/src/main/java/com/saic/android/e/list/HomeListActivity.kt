package com.saic.android.e.list

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.jaeger.library.StatusBarUtil
import com.saic.android.e.list.utils.SpaceItemDecoration
import com.saic.android.e.list.viewmodel.HomeListViewModel
import com.saic.android.e.module_list.R
import com.saic.android.e.module_list.databinding.HomeLayoutBinding

@Route(path = "/home/main")
class HomeListActivity : AppCompatActivity() {

    lateinit var dataBinding: HomeLayoutBinding
    lateinit var viewModel : HomeListViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTranslucent(this)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.home_layout)
        dataBinding.recycler.addItemDecoration(SpaceItemDecoration())

        viewModel = ViewModelProviders.of(this).get(HomeListViewModel::class.java)
        dataBinding.viewmodel = viewModel
    }
}
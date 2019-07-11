package com.saic.android.e.module_flexbox

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.google.android.flexbox.AlignItems
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager
import com.saic.android.e.module_flexbox.databinding.FlexboxRecyclerBinding
import com.saic.android.e.module_flexbox.viewmodel.FlexRecyclerViewModel

@Route(path="/flex/recycler")
class FlexboxRecyclerActivity : AppCompatActivity(){
    lateinit var binding : FlexboxRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.flexbox_recycler)
        binding.viewmodel = ViewModelProviders.of(this).get(FlexRecyclerViewModel::class.java)
        var layoutManager = binding.recyclerView.layoutManager as FlexboxLayoutManager
        layoutManager.flexDirection = FlexDirection.ROW
        layoutManager.flexWrap = FlexWrap.WRAP
        layoutManager.alignItems = AlignItems.BASELINE
    }

}
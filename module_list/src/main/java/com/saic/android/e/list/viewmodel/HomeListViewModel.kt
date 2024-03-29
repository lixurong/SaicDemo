package com.saic.android.e.list.viewmodel

import android.arch.lifecycle.ViewModel
import android.view.View
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.saic.android.e.list.model.HomeBean
import com.saic.android.e.list.model.HomeListModel
import com.saic.android.e.list.utils.HomeItemClickListener
import com.saic.android.e.module_list.BR
import com.saic.android.e.module_list.R
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
import me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass


class HomeListViewModel : ViewModel() {

    private var homeListModel: HomeListModel = HomeListModel()
    var adapter = BindingRecyclerViewAdapter<HomeBean>()
    var items = homeListModel.getDataList()

    var itemListener = object : HomeItemClickListener<HomeBean> {
        override fun onItemClick(item: HomeBean) {
//            item?.run {
//                whviewmodelen(style){
//                    0-> Log.i("ivy","这是item布局")
//                    else-> Log.i("ivy","这是头布局")
//                }
//            }
        }
    }

    var itemBinding = OnItemBindClass<HomeBean>().map(HomeBean::class.java) { itemBinding, position, item ->
        var itemRes = R.layout.home_item
        when (item.style) {
            1 -> itemRes = R.layout.home_item_1
        }
        itemBinding.clearExtras().set(BR.bean, itemRes)
                .bindExtra(BR.viewmodel, this)
                .bindExtra(BR.itemListener, itemListener)
    }

    fun goUcenter(view: View) {
        ARouter.getInstance().build("/ucenter/main")
                .withString("name", "默认名称")
                .navigation(view.context, object : NavCallback() {
                    override fun onArrival(postcard: Postcard?) {
                    }

                    override fun onInterrupt(postcard: Postcard?) {
                        ARouter.getInstance().build("/login/login")
                                .withString("path", postcard?.path)
                                .navigation()
                    }

                })
    }

    fun onClick() {
        ARouter.getInstance().build("/app/demo").navigation()
    }

}
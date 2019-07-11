package com.saic.android.e.list.model

import android.databinding.ObservableArrayList

class HomeListModel : IHomeListModel{

    override fun getDataList():ObservableArrayList<HomeBean>{
        var list = ObservableArrayList<HomeBean>()
        for (i in 0..10) {
            var bean = HomeBean("1")
            when (i) {
                0 -> {
                    bean.style = 1
                }
                1 -> {
                    bean.tags = "英语,Wifi,举牌"
                    bean.startPosition = "上海虹桥国际机场2号航站楼"
                    bean.endPosition = "建国路与马当路交叉口"
                    bean.time = "10:30"
                    bean.note = "比较着急，请按时到达，谢谢"
                    bean.type = "1"
                    bean.state = "预计到达"
                }
                2 -> {
                    bean.tags = "英语"
                    bean.startPosition = "上海虹桥国际机场2号航站楼"
                    bean.endPosition = "建国路与马当路交叉口"
                    bean.time = "10:30"
                    bean.note = "请师傅能快马加鞭，因为非常的紧急，这是我们一个大客户，所以需要司机会英语，务必好好服务，并且安全送达，谢谢！"
                    bean.type = "2"
                    bean.state = "开始服务"
                }
                3 -> {
                    bean.tags = ""
                    bean.startPosition = "上海虹桥国际机场2号航站楼"
                    bean.endPosition = "建国路与马当路交叉口"
                    bean.time = "9:30"
                    bean.type = "4"
                    bean.note = ""
                    bean.state = "开始服务"
                }
                6 -> {
                    bean.tags = "测试"
                    bean.startPosition = "上海虹桥国际机场2号航站楼"
                    bean.endPosition = "建国路与马当路交叉口"
                    bean.time = "9:30"
                    bean.type = "5"
                    bean.note = ""
                    bean.state = "开始服务"
                }
                else -> {
                    bean.tags = ""
                    bean.startPosition = "中海环宇荟"
                    bean.endPosition = "上海同济医院"
                    bean.time = "09:15"
                    bean.note = ""
                    bean.type = "3"
                    bean.state = "开始服务"
                }
            }
            list.add(bean)
        }
        return list
    }
}
package com.vslimit.kotlindemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.vslimit.kotlindemo.R
import com.vslimit.kotlindemo.activity.DemoActivity
import com.vslimit.kotlindemo.activity.MainActivity
import com.vslimit.kotlindemo.adapter.MainAdapter
import kotlinx.android.synthetic.main.fragment_main.*
import org.jetbrains.anko.info
import org.jetbrains.anko.support.v4.act
import org.jetbrains.anko.startActivity


/**
 * Created by vslimit on 16/2/24.
 */
class MainFragment() : BaseFragment() {
    override val layoutResourceId: Int = R.layout.fragment_main
    var adapter: MainAdapter? = null
    var items = arrayListOf("VOLLEY_FRAGMENT","RETROFIT_FRAGMENT")

    companion object {
        fun getInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutManager: LinearLayoutManager = LinearLayoutManager(act)
        demoRv.layoutManager = layoutManager
        adapter = MainAdapter(items) {
//            (act as MainActivity).switchContent(this, itemsMap[it]!!)
            act.startActivity<DemoActivity>(DemoActivity.NAME to it)
        }
        demoRv.adapter = adapter
        adapter!!.notifyDataSetChanged()
    }

    override fun onResume() {
        super.onResume()
        info("onResume")
    }

    override fun onStart() {
        super.onStart()
        info("onStart")
    }

    override fun onPause() {
        super.onPause()
        info("onPause")
    }

    override fun onStop() {
        super.onStop()
        info("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        info("onDestroy")
    }



}
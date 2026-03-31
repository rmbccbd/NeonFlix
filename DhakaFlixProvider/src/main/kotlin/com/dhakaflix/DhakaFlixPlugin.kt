package com.dhakaflix

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class BdixDhakaFlixPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(DhakaFlix14Provider())
        //registerMainAPI(DhakaFlix7Provider())
        //registerMainAPI(DhakaFlix9Provider())
        //registerMainAPI(DhakaFlix12Provider())
    }
}
package com.vslimit.kotlindemo.service


import com.vslimit.kotlindemo.model.IPResult
import retrofit.http.*
import rx.Observable

/**
 * Created by vslimit on 16/7/22.
 */
interface RestfulService {

    /**
     * post请求实现样例代码，非可用
     */
    @FormUrlEncoded
    @POST("/login")
    fun login(@Field("q") q: String): Observable<IPResult>

    /**
     * get请求代码，可用
     */
    @GET("/getIpInfo.php")
    fun getIpInfo(@Query("ip") ip: String): Observable<IPResult>

    companion object {
        val SERVICE_ENDPOINT = "http://ip.taobao.com/service"
    }

}
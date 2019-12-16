package personal.givemepass.gsondemo

import com.google.gson.annotations.SerializedName

class MyJsonObj {
    @SerializedName("id")
    var id: Int = 0

    @SerializedName("age")
    var age: Int = 0

    @SerializedName("start_time")
    var startTime: String? = null

    @SerializedName("end_time")
    var endTime: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("nickname")
    var nickname: String? = null
}

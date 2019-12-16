package personal.givemepass.gsondemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val jsonStr = "[\n" +
            "    {\n" +
            "        \"id\":1,\n" +
            "        \"age\":30,\n" +
            "        \"start_time\":\"09:00\",\n" +
            "        \"end_time\":\"10:00\",\n" +
            "        \"name\":\"Kerker\",\n" +
            "        \"nickname\":\"Test\"\n" +
            "    }\n" +
            "," +
            "    {\n" +
            "        \"id\":2,\n" +
            "        \"age\":20,\n" +
            "        \"start_time\":\"09:00\",\n" +
            "        \"end_time\":\"10:00\",\n" +
            "        \"name\":\"abc\",\n" +
            "        \"nickname\":\"efg\"\n" +
            "    }\n" +
            "]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listType = object : TypeToken<ArrayList<MyJsonObj>>(){}.type
        val jsonArr = Gson().fromJson<ArrayList<MyJsonObj>>(jsonStr, listType)
        val sb = StringBuffer()
        for (obj in jsonArr) {
            sb.append("id:" + obj.id + "\n")
            sb.append("age:" + obj.age + "\n")
            sb.append("start time:" + obj.startTime + "\n")
            sb.append("end time:" + obj.endTime + "\n")
            sb.append("name:" + obj.name + "\n")
            sb.append("nickname:" + obj.nickname + "\n")
        }
        show_text.text = sb.toString()
    }
}

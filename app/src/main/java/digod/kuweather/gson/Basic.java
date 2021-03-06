package digod.kuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by digod on 2018/10/14.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}

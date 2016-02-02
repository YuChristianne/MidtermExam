package sidespell.tech.midtermexam.api;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import sidespell.tech.midtermexam.model.Album;
import sidespell.tech.midtermexam.utils.HttpUtils;

/**
 * Created by User on 2/2/2016.
 */
public class AlbumApi {

    public static final String BASE_URL= "http://ws.audioscrobbler.com/2.0/?method=?";
    public static final String  ALBUM_DATA  = "album";
    public static final String API_KEY ="api_key";
    public static final String PARAM_API_KEY = "appId";

    public static Album getWeather(Uri uri, @NonNull String requestMethod) {
        String json = HttpUtils.getResponse(uri, requestMethod);

        if (TextUtils.isEmpty(json)) {
            return null;
        }

        final String album;
        final String api_key;
        final String appId;
        return null;
    }



}

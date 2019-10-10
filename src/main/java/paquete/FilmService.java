package paquete;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class FilmService {
    public static String getMovie() throws IOException {
        OkHttpClient client = new OkHttpClient();

        String url = "http://www.omdbapi.com/?i=tt3896198&apikey=7bf9263c";

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();
        return response.body().string();
    }
}

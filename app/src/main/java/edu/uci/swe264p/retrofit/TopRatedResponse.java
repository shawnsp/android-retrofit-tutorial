package edu.uci.swe264p.retrofit;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class TopRatedResponse {
    @SerializedName("results")
    private ArrayList<Movie> top20;

    public TopRatedResponse(ArrayList<Movie> top20) {
        this.top20 = top20;
    }

    public ArrayList<Movie> getResults(){ return top20;}
}

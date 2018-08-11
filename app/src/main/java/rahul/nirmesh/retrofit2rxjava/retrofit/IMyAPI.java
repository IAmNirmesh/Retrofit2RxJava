package rahul.nirmesh.retrofit2rxjava.retrofit;

import java.util.List;

import io.reactivex.Observable;
import rahul.nirmesh.retrofit2rxjava.model.Post;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();
}

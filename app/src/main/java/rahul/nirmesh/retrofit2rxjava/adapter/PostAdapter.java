package rahul.nirmesh.retrofit2rxjava.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import rahul.nirmesh.retrofit2rxjava.R;
import rahul.nirmesh.retrofit2rxjava.model.Post;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    Context context;
    List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.textAuthor.setText(String.valueOf(postList.get(position).userId));
        holder.textTitle.setText(String.valueOf(postList.get(position).title));
        holder.textContent.setText(new StringBuilder(postList.get(position).body.substring(0, 20)).append("...").toString());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}

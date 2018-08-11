package rahul.nirmesh.retrofit2rxjava.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import rahul.nirmesh.retrofit2rxjava.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView textTitle, textContent, textAuthor;

    public PostViewHolder(View itemView) {
        super(itemView);

        textTitle = itemView.findViewById(R.id.textTitle);
        textContent = itemView.findViewById(R.id.textContent);
        textAuthor = itemView.findViewById(R.id.textAuthor);
    }
}

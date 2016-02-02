package sidespell.tech.midtermexam;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import sidespell.tech.midtermexam.BuildConfig;
import sidespell.tech.midtermexam.AlbumAdapter;

/**
 * Created by User on 2/2/2016.
 */
public abstract class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {

        Context mContext;
        TextView mTvSongTitle;
        TextView mTvSinger;
        ImageView mIvAlbum;
        CardView cv;

        public AlbumViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            this.mContext = mContext;
            this.mTvSongTitle = mTvSongTitle;
            this.mTvSinger = mTvSinger;
            this.mIvAlbum = mIvAlbum;

        }


    }



}


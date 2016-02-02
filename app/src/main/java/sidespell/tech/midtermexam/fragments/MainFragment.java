package sidespell.tech.midtermexam.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import sidespell.tech.midtermexam.BuildConfig;
import sidespell.tech.midtermexam.R;
import sidespell.tech.midtermexam.api.AlbumApi;
import sidespell.tech.midtermexam.model.Album;
import sidespell.tech.midtermexam.utils.HttpUtils;

public class MainFragment  extends Fragment {
    private EditText mEdAlbum;
    private ProgressBar mProgressBar;
    public TextView mTvSongTitle;
    public TextView mTvSinger;
    public ImageView mIvAlbum;
    private Context context;



    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mEdAlbum = (EditText) view.findViewById(R.id.etAlbum);
        mTvSongTitle = (TextView) view.findViewById(R.id.songTitle);
        mTvSinger = (TextView) view.findViewById(R.id.singer);
        mIvAlbum = (ImageView) view.findViewById(R.id.album_photo);
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressBar);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // TODO: Perform logic operations here..

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                String url ="";
//                String json = HttpUtils.getResponse(url, "GET");
//
//            }
//        }).start();
//

        GetAlbumData getAlbumData = new GetAlbumData();
        getAlbumData.execute("Album.search");

    }

    public class GetAlbumData extends AsyncTask<String, Void, Album> {

        @Override
        protected void onPreExecute() {
            mProgressBar.setVisibility(View.VISIBLE);
            mIvAlbum.setVisibility(View.GONE);
            mTvSongTitle.setVisibility(View.GONE);
            mTvSinger.setVisibility(View.GONE);
        }

        protected Album doInBackground(String... params) {
            if (params.length == 0) {
                return null;
            }

            String album = params[0];

            Uri builtUri =  Uri.parse(AlbumApi.BASE_URL).buildUpon()
                    .appendQueryParameter(AlbumApi.ALBUM_DATA, album)
                    .appendQueryParameter(AlbumApi.API_KEY, "json")
                    .appendQueryParameter(AlbumApi.PARAM_API_KEY,
            BuildConfig.MIDTERM_EXAM_API_KEY).build();

           return null;

        }
    }

}

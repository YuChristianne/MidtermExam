package sidespell.tech.midtermexam.model;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import sidespell.tech.midtermexam.utils.HttpUtils;

import org.w3c.dom.Text;

/**
 * Created by User on 2/2/2016.
 */
public class Album {


    public EditText mEdAlbum;
    public TextView mTvSongTitle;
    public TextView mTvSinger;


    public ImageView mIvAlbum;

    public Album(EditText mEdAlbum, TextView mTvSongTitle, TextView mTvSinger) {
        this.mEdAlbum = mEdAlbum;
        this.mTvSongTitle = mTvSongTitle;
        this.mTvSinger = mTvSinger;
        this.mIvAlbum = mIvAlbum;

    }

    public EditText getmEdAlbum() {
        return mEdAlbum;
    }

    public void setmEdAlbum(EditText mEdAlbum) {
        this.mEdAlbum = mEdAlbum;
    }

    public TextView getmTvSongTitle() {
        return mTvSongTitle;
    }

    public void setmTvSongTitle(TextView mTvSongTitle) {
        this.mTvSongTitle = mTvSongTitle;
    }

    public TextView getmTvSinger() {
        return mTvSinger;
    }

    public void setmTvSinger(TextView mTvSinger) {
        this.mTvSinger = mTvSinger;
    }

    public ImageView getmIvAlbum() {
        return mIvAlbum;
    }

    public void setmIvAlbum(ImageView mIvAlbum) {
        this.mIvAlbum = mIvAlbum;
    }



}

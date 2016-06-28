package com.company;

/**
 * Created by administrator on 6/27/16.
 */
public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song(String songName, String artistName, String albumName){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play(){
        System.out.println("Song name: " + mSongName);
        System.out.println("Artist name: " + mArtistName);
        System.out.println("Album name: " + mAlbumName);
    }

    public String getSongName(){
        return mSongName;
    }

    public void setSongName(String songName){
        mSongName = songName;
    }

    public void setArtistName(String artistName){
        mArtistName = artistName;
    }

    public void setAlbumName(String albumName){
        mAlbumName = albumName;
    }
}

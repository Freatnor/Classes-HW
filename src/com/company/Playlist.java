package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by administrator on 6/27/16.
 */
public class Playlist {
    private String mName;
    private List<Song> songs;

    public Playlist(String name){
        mName = name;
        songs = new LinkedList<>();
    }

    public String getName(){
        return mName;
    }

    public void addSong(Song s){
        songs.add(s);
    }

    public void removeSong(Song s){
        songs.remove(s);
    }

    public void playAll(){
        Iterator iter = songs.iterator();
        while(iter.hasNext()){
            Song s = (Song) iter.next();
            s.play();
        }
    }

    public List<Song> getSongList(){
        return songs;
    }

    public void setName(String name){
        mName = name;
    }


}

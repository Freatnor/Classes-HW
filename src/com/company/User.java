package com.company;

import java.util.*;

/**
 * Created by administrator on 6/27/16.
 */
public class User {
    private String mName;
    private Map<String,Playlist> mPlaylists;

    public User(String name){
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist p){
        mPlaylists.put(p.getName(), p);
    }

    public Set<String> getAllPlaylistNames(){
        return mPlaylists.keySet();
    }

    public Playlist getPlaylistByName(String name){
        return mPlaylists.get(name);
    }

    public void removePlaylistByName(String name){
        mPlaylists.remove(name);
    }

    public void setName(String name){
        mName = name;
    }

    public String getName(){
        return mName;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new User("Jonathan");
        Song song1 = new Song("Suteki da ne", "Nobuo Uematsu", "Final Fantasy X (Original Soundtrack)");
        Song song2 = new Song("Fade to Black", "Metallica", "Ride the Lightning");
        Song song3 = new Song("心晴れて　夜も明けて", "堀江由衣", "楽園");
        Song song4 = new Song("Sea of Madness", "Iron Maiden", "Somewhere In Time");
        Song song5 = new Song("Black Onslaught", "Daisuke Ishiwatari", "BLAZBLUE PHASE III CHRONOPHANTASMA Original Soundtrack");
        Playlist playlist1 = new Playlist("Rock");
        playlist1.addSong(song2);
        playlist1.addSong(song4);
        playlist1.addSong(song5);
        Playlist playlist2 = new Playlist("Other");
        playlist2.addSong(song1);
        playlist2.addSong(song3);
        playlist2.addSong(song5);

        user.addPlaylist(playlist1);
        user.addPlaylist(playlist2);

        System.out.println("User " + user.getName() + " logged in");
        printAll(user);

        user.setName("JT");


        Playlist p = user.getPlaylistByName("Other");
        List<Song> songs = p.getSongList();
        p.setName("jpop?");

        Iterator iter2 = songs.iterator();
        Song songToChange = null;
        while(iter2.hasNext()){
            Song song = (Song) iter2.next();
            if(song.getSongName().equals("Black Onslaught")){
                songToChange = song;
            }
        }
        songToChange.setSongName("スローモーション");
        songToChange.setArtistName("中森明菜");
        songToChange.setAlbumName("スローモーション");

        p = user.getPlaylistByName("Rock");
        p.removeSong(songToChange);

        System.out.println();
        System.out.println();
        System.out.println("User " + user.getName() + " logged in");
        printAll(user);

    }

    public static void printAll(User user){
        Set<String> playlists = user.getAllPlaylistNames();
        Iterator iter = playlists.iterator();
        while(iter.hasNext()){
            String name = (String) iter.next();
            System.out.println("Playing " + user.getPlaylistByName(name).getName());
            user.getPlaylistByName(name).playAll();
            System.out.println();
        }
    }

}

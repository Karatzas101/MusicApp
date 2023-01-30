/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicapp;

import Model.Song;
import dao.SongsDao;
import java.sql.*;


public class MusicApp {

 
    public static void main(String[] args) throws SQLException {
        
          //Bring all Songs
//        System.out.println(sd.getAllSongs());
        
        //Delete all songs
        // sd.deleteAllSongs();        

        
        // GetCountByBitRate
        SongsDao.getCountByBitrate(300);
        
        //Insert new Song
        Song song = new Song("Familly","Glwssa Megallh",320);        
        SongsDao.insertSong(song);
      
    }    
}

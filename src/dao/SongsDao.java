package dao;

import Model.Song;
import Utilities.DbUtil;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SongsDao {
    
    public static int getCountByBitrate(int bitrate){
        
       Connection con = DbUtil.getConnection(); 
       int answer = 0;
       try {
            CallableStatement cs = con.prepareCall("{call getCountByBitrate(? , ?)}");
            
            cs.setInt(1,bitrate);
            
            cs.registerOutParameter(2, java.sql.Types.INTEGER);
            cs.executeQuery();
            answer = cs.getInt(2);
            
        } catch (SQLException ex) {
            Logger.getLogger(SongsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(answer);
        return answer;
    }
    
    
    
    public static List<Song> getAllSongs() throws SQLException {
        
      List<Song> songs = new ArrayList<>();
        
      Connection con  = DbUtil.getConnection();
      
      String sql = "Select * from songs";
      
      PreparedStatement ps = con.prepareStatement(sql);
      
      ResultSet rs = ps.executeQuery();
      
     while(rs.next()){
       
     int id = rs.getInt(1);
     String title = rs.getString(2);
     String band  = rs.getString(3);
     int bitrate  = rs.getInt(4);
     
     Song song = new Song(id,title,band,bitrate);     
     songs.add(song) ;
     
     
     }             
        return songs;
    }
        
    public static boolean deleteAllSongs(){
        Connection con = DbUtil.getConnection();
        
        String sql ="DELETE FROM songs";
        
        PreparedStatement ps;
        ResultSet rs;
        int  answer = 0;
        try {
            ps = con.prepareStatement(sql); 
            answer = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SongsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(answer);
        return true;
    }
    
    
    public static int insertSong(Song s){
        
        Connection con = DbUtil.getConnection();
        String sql = "INSERT INTO songs(band,title,bitrate) VALUES(?, ?, ?)";
        PreparedStatement ps;
        int answer = 0;
        try {                    
             ps = con.prepareStatement(sql); 
         
             ps.setString(1,s.getBand());
             ps.setString(2,s.getTitle());
             ps.setInt(3,s.getBitrate());
             
            answer = ps.executeUpdate();
                         
        } catch (SQLException ex) {
            Logger.getLogger(SongsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(answer);
        return answer;
    }
    
    
       
}

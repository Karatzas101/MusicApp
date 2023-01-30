package Model;


public class Song {
    
private int id  ;
private String band;
private String title;    
private int bitrate;

    public Song() {
    }

    public Song(int id, String band, String title, int bitrate) {
        this.id = id;
        this.band = band;
        this.title = title;
        this.bitrate = bitrate;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
public Song (String band,String title,int bitrate){
    
    this.band = band;
    this.title = title;
    this.bitrate = bitrate;    
}

    public int getId() {
        return id;
    }
    
    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Song{");
        sb.append("id=").append(id);
        sb.append(", band=").append(band);
        sb.append(", title=").append(title);
        sb.append(", bitrate=").append(bitrate);
        sb.append('}');
        return sb.toString();
    }

}

//import for String
import java.lang.String;
//import for Date
import java.util.Date;

public class Song{

    public String Url, name, ID, artist;
    public Date duration;

    SimpleDateFormat dateFormat = new SimpleDateFormat ("mm:ss");

    Song()
    {
        this.Url = "n/a";
        this.name = "n/a";
        this.ID = "n/a";
        this.artist = "n/a";
        this.duration = ft.format("00:00");
    }

    Song (String Url, String name, String artist, String ID, Date duration)
    {
        this.Url = Url;
        this.name = name;
        this.ID = ID;
        this.artist = artist;
        this.duration = duration;
    }

    void setUrl(String Url) { this.Url = Url; }
    void setName(String name) {this.name = name;}
    void setArtist(String artist) {this.artist = artist;}
    void setID(String ID) {this.ID = ID;}
    void setDuration(Date duration) {this.duration = duration;}

    String getUrl() {return this.Url;}
    String getName() {return this.name;}
    String getID() {return this.ID;}
    String getArtist() {return this.artist;}
    Date getDuration() {return this.duration;}

}
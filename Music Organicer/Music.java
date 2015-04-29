import java.util.*;

/**
 * Write a description of class Music here.
 * 
 * @Kelvin
 * @17.04.15
 */
public class Music extends AudioTrack
{
    // instance variables - replace the example below with your own
   private String artist;
   private int date;
   private int timesPlayed;

   
    
   

    /**
     * Constructor for objects of class Music
     */
    public Music(String title, long minutes, long seconds, String artist, int date, int  timesPlayed, Medium medium)
    {   
                
        super(title, minutes, seconds, medium);
        
        //this.duration = duration;
        this.artist = artist;
        this.date = date;
        this.timesPlayed = timesPlayed;
   
        
        
    }

    /**
     * Returns the artist of the music track.
     * 
     * @return      artist.
     */
    public String getArtist() 
    {
        return artist;
    }

    /**
     * Sets new artist to the music track.
     * 
     * @param       artist.
     */
    public void setArtist(String artist) 
    {
        this.artist = artist;
    }

    /**
     * Returns a date of last time music track is played.
     * 
     * @return       date.
     */
    public int getDate() 
    {
        return date;
    }

    /**
     * Sets a new date of the last time music track is played.
     * 
     * 
     * @param       date.
     */
    public void setDate(int date) 
    {
        this.date = date;
    }

    /**
     * Returns the number of times the music track is played.
     * 
     * @return      timesPlayed.
     */
    public int getTimesPlayed() 
    {
        return timesPlayed;
    }

    /**
     * Sets the number of times the music track is played.
     * 
     * @param       timesPlayed.
     */
    public void setTimesPlayed(int timesPlayed) 
    {
        this.timesPlayed = timesPlayed;
    }
    
    public String getAlbumAsString(){
        
        return getMedium().getTitle();
    }

   
    
  
}


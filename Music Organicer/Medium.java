import java.util.ArrayList;

/**
 * Write a description of class Medium here.
 * 
 * @Kelvin og Vegard) 
 * @20.04.15
 * 
 */
public class Medium
{
    // instance variables - replace the example below with your own
    private String title;
    private DurationHandeling totalDuration;
    private ArrayList<AudioTrack> trackList;

    /**
     * Constructor for objects of class Medium
     */
    public Medium(String title)
    {
        this.title = title;
        totalDuration = new DurationHandeling();
        trackList = new ArrayList<AudioTrack>();
        
    }
    
    /**
     * Add a track to the mediums track list
     * 
     * @param    track  Track to add (type Track)
     */
    public void addTrack(AudioTrack track)
    {
        trackList.add(track);
        totalDuration.addSeconds(track.getDurationSeconds());
        
    }
    /**
     * Remove a track from the mediums track list
     * @param track 
     */
    public void removeTrack(AudioTrack track)
    {
        trackList.remove(track);
        totalDuration.removeSeconds(track.getDurationSeconds());
        
    }
    
    public void removeAllTracks()
    {
        trackList.removeAll(trackList);
    }
        
    /**
     * 
     *
     * @return The return value
     */
    public String getTypeOfMedium()
    {
        return null;
    }
    
    /**
     * Returns a string of total time on the medium (Example : "1H2M3S").
     * 
     * @return      time 
     */
    public String getTotalDurationString()
    {
        String returnVal = null;
        long sec = 0;
        
        for(AudioTrack track : trackList)
        {
             sec = sec + track.getDurationSeconds();
        }
        totalDuration.addSeconds(sec);
        return totalDuration.getDurationString();        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DurationHandeling getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(DurationHandeling totalDuration) {
        this.totalDuration = totalDuration;
    }

    public ArrayList<AudioTrack> getTrackList() {
        return trackList;
    }

    public void setTrackList(ArrayList<AudioTrack> trackList) {
        this.trackList = trackList;
    }
    
    

}

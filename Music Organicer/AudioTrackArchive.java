import java.util.ArrayList;

/**
 *Archive of 
 * 
 * @author Olav Rune
 */
public class AudioTrackArchive {

    private ArrayList<AudioTrack> tracks;
    
    
    
    /**
     * Constructor for AudioTracksArchive.
     */
    public AudioTrackArchive() {

        tracks = new ArrayList<>();

    }
    
    /**
     * Adds a track to the archive
     * @param track
     */
    public void addTrack(AudioTrack track)
    {
        tracks.add(track);
        
    }
    /**
     * Remove a track from the archive
     * @param track 
     */
    public void removeTrack(AudioTrack track)
    {
        tracks.remove(track);
               
    }
    
    /**
     * 
     */
    public AudioTrack getTrackAt(int index)
    {
        return tracks.get(index);
    }
    
    /**
     * Get the size of the archive
     * @return number of tracks in the list as an int.
     */
    public int getNumberOfTracks()
    {
        return tracks.size();
        
    }
    
    /**
     * list all the tracks in the archive by its title
     * @return String
     */
    public ArrayList<AudioTrack> getTrackList()
    {
        return tracks;
    }
            
    

}

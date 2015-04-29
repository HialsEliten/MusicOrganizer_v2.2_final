
import java.util.ArrayList;

/**
 * Generating list of all exsiting tracks, regardless of its medium referance
 *
 * @author Vegard Rogne @ HialsEliten
 */
public class TrackOrganizer {

    // Initializing variables
    private AudioTrackArchive trackArchive;
    private MediumArchive mediumArchive;

    // Constructor for TrackOrganizer
    public TrackOrganizer() {
        // Assigning variables
        trackArchive = new AudioTrackArchive();
        mediumArchive = new MediumArchive();
        makeFirstTrack();
        makeArcive();

    }

    public void makeFirstTrack() {
        addCD("Harams hits for kids", "knut", 2001, "HaramStudio", 65);
        //Medium enRandomCd = mediumArchive.getMediumAt(65);

        String title = "Thriller";
        long duration = 12;
        int date = 32;
        int timesPlayed = 2;
        long minutes = 5;
        long seconds = 24;
        int archiveNumber = 65;

        String artist = "Mikkel Jækkson";
        addMusicTrack(title, minutes, seconds, artist, date, timesPlayed, archiveNumber);

    }

    /**
     * Adds track to track archive
     *
     * @param audioTrack audio track you want to add
     */
    public void addTrack(AudioTrack track) {

        this.trackArchive.addTrack(track);

    }

    /**
     * Removes track from track archive
     *
     * @param audioTrack audio track you want to remove
     */
    public void removeTrack(AudioTrack track) {
        this.trackArchive.removeTrack(track);
    }

    public int getNumberOfTracks() {
        return this.trackArchive.getNumberOfTracks();
    }

    /**
     * Return a AudioTrack
     *
     * @param index
     * @return track at specified position
     */
    public AudioTrack getTrackAt(int index) {
        return trackArchive.getTrackAt(index);
    }
    
    
    

    /**
     * Add a Cd too the medium archive
     *
     * @param title
     * @param artist
     * @param releaseYear
     * @param recordLabel
     * @param archiveNumber
     */
    public void addCD(String title, String artist, int releaseYear, String recordLabel, int archiveNumber) {
        CD cd = new CD(title, artist, releaseYear, recordLabel, archiveNumber);
        mediumArchive.addMedium(cd);

    }

    /**
     * Add a HD to the medium archive
     *
     * @param title
     * @param filename
     * @param filePath
     * @param fileSize
     */
    public void addHD(String title, String filename, String filePath, int fileSize) {

        HD hd = new HD(title, filename, filePath, fileSize);
        mediumArchive.addMedium(hd);

    }

    /**
     * add a LP
     *
     * @param title
     * @param artist
     * @param releaseYear
     * @param recordLabel
     * @param archiveNumber
     */
    public void addLP(String title, String artist, int releaseYear, String recordLabel, int archiveNumber) {

        LP lp = new LP(title, artist, releaseYear, recordLabel, archiveNumber);
        mediumArchive.addMedium(lp);

    }

    /**
     * Add a tape to the medium archive
     *
     * @param title
     * @param type
     * @param archiveNumber
     */
    public void addTape(String title, String type, int archiveNumber) {

        Tape tape = new Tape(title, type, archiveNumber);
        mediumArchive.addMedium(tape);

    }

    /**
     * Add a music track to a medium
     *
     * @param title
     * @param minutes
     * @param seconds
     * @param artist
     * @param date
     * @param timesPlayed
     * @param archiveNumber
     */
    public void addMusicTrack(String title, long minutes, long seconds, String artist, int date, int timesPlayed, int archiveNumber) {
        Medium medium = mediumArchive.getMediumAt(archiveNumber);
        if (medium != null) {
            Music music = new Music(title, minutes, seconds, artist, date, timesPlayed, medium);
            trackArchive.addTrack(music);
            medium.addTrack(music);
        } else {
            System.out.println("The medium does not exist, shitface");
        }
    }

    /**
     * add a advertising jingle to the archive
     *
     * @param title
     * @param minutes
     * @param seconds
     * @param archiveNumber
     * @param product
     * @param company
     */
    public void addAvertisingJingle(String title, long minutes, long seconds, int archiveNumber, String product, String company) {
        Medium medium = mediumArchive.getMediumAt(archiveNumber);
        if (medium != null) {
            AdvertisingJingle jingle = new AdvertisingJingle(title, minutes, seconds, medium, product, company);
            trackArchive.addTrack(jingle);
        } else {
            System.out.println("The medium does not exist, shitface");
        }

    }

    /**
     * Add a news track to the archive
     *
     * @param title
     * @param minutes
     * @param seconds
     * @param archiveNumber
     * @param story
     * @param journalist
     * @param dateProduced
     * @param dateBroadcasted
     */
    public void addNewsTrack(String title, long minutes, long seconds, int archiveNumber, String story, String journalist, int dateProduced, int dateBroadcasted) {
        Medium medium = mediumArchive.getMediumAt(archiveNumber);
        if (medium != null) {
            News newsTrack = new News(title, minutes, seconds, medium, story, journalist, dateProduced, dateBroadcasted);
            trackArchive.addTrack(newsTrack);
        } else {
            System.out.println("The medium does not exist, shitface");
        }
    }

    /**
     * Add a sound effect to the archive
     *
     * @param title
     * @param minutes
     * @param seconds
     * @param description
     * @param archiveNumber
     */
    public void addSoundEffect(String title, long minutes, long seconds, String description, int archiveNumber) {
        Medium medium = mediumArchive.getMediumAt(archiveNumber);
        if (medium != null) {
            SoundEffects sound = new SoundEffects(title, minutes, seconds, description, medium);
            trackArchive.addTrack(sound);
        } else {
            System.out.println("The medium does not exist, shitface");
        }

    }

    /**
     * Return the medium at the specified index
     *
     * @param index
     * @return null if the medium doesn't exist
     */
    public Medium getMediaAt(int index) {
        return mediumArchive.getMediumAt(index);
    }
    public String listAllTracks()
    {
       return trackArchive.listAllTracks();
    }
    
    public void printTest()
    {
        System.out.println("PizzaBurger");
    }
    
    public void makeArcive(){
        
        addCD("Harams hits for kids", "Kevin", 2001, "HaramStudio", 10000);
        addCD("Harams hits for retards", "knut", 2015, "Haram gutteklubb", 10001);
        addCD("Brattvågs hits for kids", "Olav", 1975, "Haram bingomafia", 10002);
        addCD("Brattvågs hits for not kids", "Vegard", 1984, "HaramStudie", 10003);
        addCD("Brattvågs hits for drunk kids", "Lars", 1943, "Haram studio?", 10004);
        addCD("Harams tidløse klassikere", "Espen", 4215, "Haram publish AS", 10005);
        addCD("Harams gylne sangløver", "JonKåre", 2006, "NumTek pushlish AS", 10006);
        addCD("Harams symfoniorkester med støtte fra Tore på tuba", "LespeTrond", 2001, "HaramStudio", 10007);
        addCD("Harams bingomusikk", "Petter Pikk", 2009, "Balletronds musikkforening", 10008);
        addCD("Harams påskelåter", "Leif Live", 2003, "HaramStudio", 10009);
       
        
       

        String title = "Thriller";
        long duration = 12;
        int date = 32;
        int timesPlayed = 2;
        long minutes = 5;
        long seconds = 24;
        int archiveNumber = 65;

        String artist = "Mikkel Jækkson";
        addMusicTrack("You are my number one", 1, 14, "Kelvin Kalas", 120415, timesPlayed, 10000);
        addMusicTrack("You are my number two", 1, 54, "Freddy Frøken", 110415, timesPlayed, 10000);
        addMusicTrack("Habala?", 2, 12, "Trond tanga", 150915, timesPlayed, 10000);
        addMusicTrack("the most awesome track ever", 3, 58, "Trude tran", 010315, timesPlayed, 10008);
        addMusicTrack("no title", 3, 02, artist, 100915, timesPlayed, 10005);
        addMusicTrack("kakevisa", 5, 31, artist, 120415, timesPlayed, 10002);
        
        
    }
    

}

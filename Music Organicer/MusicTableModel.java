import javax.swing.table.AbstractTableModel;

/**
 * Write a description of class MusicTableModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicTableModel extends AbstractTableModel
{

    private String[] columnNames = {"Title", "Artist", "Album"}; //same as before...
    private TrackOrganizer trackOrganizer;
    

    
    public MusicTableModel( TrackOrganizer trackOrganizer )
    {
        super();
        this.trackOrganizer = trackOrganizer;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
       int returnNumb = this.trackOrganizer.getNumberOfTracks();
        //System.out.println(returnNumb);
        return returnNumb;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        String result = "";
        Music musicTrack = null;
        // First get the audiotrack corresponding to the row-number
        if(trackOrganizer.getTrackAt(row)instanceof Music) {
        musicTrack  = ((Music)this.trackOrganizer.getTrackAt(row));
        }
        
        if (null != musicTrack)
        { 
            switch( col )
            {
                case 0:
                   result = musicTrack.getTitle();
                   
                    break;
                    
                case 1:
                    result = musicTrack.getArtist();
                   
                    break;
                case 2:
                    result = musicTrack.getAlbumAsString();
                   
                    break;
                default:
                    result = "UNKNOWN";
                    break;
            }
            
        }
        
        
        return result;
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}

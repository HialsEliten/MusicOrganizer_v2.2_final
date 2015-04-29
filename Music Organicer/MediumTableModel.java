
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olav Rune
 */
public class MediumTableModel extends AbstractTableModel {
    
    private String[] columnNames = {"Title", "Artist", "Album"}; //same as before...
    private TrackOrganizer trackOrganizer;

    
    public MediumTableModel( TrackOrganizer trackOrganizer )
    {
        super();
        this.trackOrganizer = trackOrganizer;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return this.trackOrganizer.getNumberOfTracks();
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
    
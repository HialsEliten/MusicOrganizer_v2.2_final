
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
public class CDTableModel extends AbstractTableModel {
    
    private String[] columnNames = {"Title", "Artist", "Release year", "Record Label", "Archive number"}; //same as before...
   
    private TrackOrganizer trackOrganizer;

    
    public CDTableModel(TrackOrganizer trackOrganizer)
    {
        super();
        this.trackOrganizer = trackOrganizer;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        int returnNumb = this.trackOrganizer.getNumberOfMediums();
        //System.out.println(returnNumb);
        return returnNumb;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        String result = "";
        CD CdMedium = null;
        // First get the audiotrack corresponding to the row-number
        
       
        
        if(trackOrganizer.getMediaAt(row)instanceof CD) {
            
         CdMedium  = ((CD)this.trackOrganizer.getMediaAt(row));
         //CdMedium = ((CD)this.trackOrganizer.ge)
        }
        
        if (null != CdMedium)
        { 
            switch( col )
            {
                case 0:
                   //result = musicTrack.getTitle();
                   result = CdMedium.getTitle();
                   
                    break;
                    
                case 1:
                    //result = musicTrack.getArtist();
                    result = CdMedium.getArtist();
                   
                    break;
                case 2:
                    //result = musicTrack.getAlbumAsString();
                    result = "" +CdMedium.getReleaseYear();
                   
                    break;
                    
                case 3:
                    result = CdMedium.getRecordLabel();
                    break;
                    
                case 4:
                    result = "" + CdMedium.getArchiveNumber();
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
    

import java.util.ArrayList;

/**
 * Write a description of class MediumArchive here.
 *
 * @NumTek Solutions
 * @15.04.15
 */
public class MediumArchive {

    private ArrayList<Medium> mediumArchive;

    /**
     * Constructor for objects of class Archive
     */
    public MediumArchive() {
        mediumArchive = new ArrayList<Medium>();

    }

    /**
     * add new medium to archive list
     *
     * @param newMedium a new medium (Medium)
     */
    public void addMedium(Medium newMedium) {
        this.mediumArchive.add(newMedium);
    }

    /**
     * Remove medium from archive list
     *
     * @param mediumToRemove the medium to remove (Medium)
     */
    public boolean removeMedium(Medium mediumToRemove) {
        boolean removeConfirmation = false;
        removeConfirmation = mediumArchive.remove(mediumToRemove);

        return removeConfirmation;

    }

    /**
     * Remove the medium at the specific archive number
     *
     * @param archiveNumber
     */
    public void removeMedium(int archiveNumber) {

        Medium mediumToRemove = getMediumAt(archiveNumber);
        if (mediumToRemove != null) {
            removeAllTracksOnMedium(mediumToRemove);
            removeMedium(mediumToRemove);
        } else {
            System.out.println("The medium does not exist, fuckface");
        }
    }

    /**
     * Return archive list
     *
     * @Return mediumArchive the list of mediums in archive (ArrayList<Medium>)
     */
    public ArrayList<Medium> getMediumList() {
        return this.mediumArchive;
    }

    public Medium getMediumAtArchiveNumber(int archiveNumber) {
        Medium returnMedia = null;
        for(Medium medium:mediumArchive)
        {
            if(medium instanceof CD)
            {
                CD cd = ((CD)medium);
                if(cd.getArchiveNumber() == archiveNumber)
                {
                    returnMedia = medium;
                }
            }
            else if(medium instanceof LP)
            {
                LP lp = ((LP)medium);
                if(lp.getArchiveNumber() == archiveNumber)
                {
                    returnMedia = medium;
                }
            }
            else if(medium instanceof Tape)
            {
                Tape tape = ((Tape)medium);
                if(tape.getArchiveNumber() == archiveNumber)
                {
                    returnMedia = medium;
                }
            }
            else if(medium instanceof HD)
            {
                returnMedia = null;
            }
        }
        
        
        
        
        
        
        /*int archiveNumber = 0;
        for (Medium media : mediumArchive) {
            if(media instanceof CD) {
                archiveNumber = ((CD) media).getArchiveNumber();
            }
            if (archiveNumber == index) {
                returnMedia = media;
            }

        }
                */
        return returnMedia;
    }

    public void removeAllTracksOnMedium(Medium mediumToRemove) {
        mediumToRemove.removeAllTracks();
    }

    public int getNumberOfMediums() {

        return mediumArchive.size();
    }

    public Medium getMediumAt(int index) {

        return mediumArchive.get(index);

    }

}

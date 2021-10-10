/*
Assignment 6.2 - CIS505 - Kylie Gregory 10/10/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {

    // A private List<Composer> data field named composers.  The default is a list of composer objects.

    private List<Composer> composers = new ArrayList<Composer>();

    // A no-argument constructor that creates a default list of five composer objects. 

    public MemComposerDao() {
    
        composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Snoop Dogg", "Hip-Hop/Reggae"));
        composers.add(new Composer(1009, "AC/DC", "Hard Rock"));
        composers.add(new Composer(1010, "Elton John", "Pop"));
        composers.add(new Composer(1011, "Eminem", "Rap/Hip-Hop"));
    }

    // An overridden findAll method that returns a list of composer objects. 

    @Override
    public List<Composer> findAll() {
        return composers;
    }

    // An overridden findBy method that returns a single composer object matching the 
    // arguments id.  

    @Override
    public Composer findBy(Integer id) {
        for (Composer composer : this.composers) {
            if (composer.getId() == id.intValue()) {
                return composer;
            }
        }
        
        return null;
    }

    // An overridden insert method that adds a new composer object to the list of composers.

    @Override
    public void insert(Composer composer) {
        try {
            Composer composerToInsert = findBy(composer.getId());
            if (composerToInsert == null) {
                composers.add(composer);
            } else {
                System.out.println(StringFormatting.MESSAGE_SPACING + "Cannot add a composer twice, please try again.");
            }
            
        } catch (NullPointerException np) {
            
        }
        
    }

}
/*
Assignment 6.2 - CIS505 - Kylie Gregory 10/10/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {
    
    public static void main(String[] args) {
        ProgramEntry();

        // Prompt the user with a menu

        boolean cont = true;
        MemComposerDao composerDao = new MemComposerDao();
        
        do {
            System.out.print(DisplayMenu());
            Scanner sc = new Scanner(System.in);
            switch(sc.nextInt()) {
                case 1: ViewComposers(composerDao); // If option one is selected, displays a list of composers. 
                        break;
                case 2: FindComposer(composerDao, sc); // If option two is selected, prompts the user to enter an id and display the selected composer object. 
                        break; 
                case 3: InsertComposer(composerDao, sc); // If option 3 is selected, prompts the user to create a new composer. 
                        break;
                case 4: Exit(); // If option 4 is selected, the user exits the application. 
                default: 
                    break;
            } 
        } while (cont);

    }

    /**
     * View the Composers
     * @param composerDao MemComposerDao
     */
    private static void ViewComposers(MemComposerDao composerDao) {
        List<Composer> composers = composerDao.findAll();

        System.out.println(StringFormatting.NEW_LINE_CHAR_RETURN + StringFormatting.MESSAGE_SPACING + "--DISPLAYING COMPOSERS--");
        for (Composer composer : composers) {
            System.out.println(composer.toString() + StringFormatting.NEW_LINE_CHAR_RETURN);
        }
    }


    private static void FindComposer(MemComposerDao composerDao, Scanner sc) {
        System.out.println(StringFormatting.NEW_LINE_CHAR_RETURN);
        System.out.print(StringFormatting.MESSAGE_SPACING + "Enter an id: ");
        try {
            Composer composer = composerDao.findBy(sc.nextInt());
            System.out.println(StringFormatting.NEW_LINE_CHAR_RETURN);
            System.out.println(StringFormatting.MESSAGE_SPACING + "--DISPLAYING COMPOSER--");
            System.out.println(composer.toString());
        } catch (NullPointerException np) {
            System.out.println(StringFormatting.MESSAGE_SPACING + "No composer was found");
        }
    }

    private static void InsertComposer(MemComposerDao composerDao, Scanner sc) {
        System.out.print(StringFormatting.MESSAGE_SPACING + "Enter an id: ");
        int id = sc.nextInt();

        System.out.print(StringFormatting.MESSAGE_SPACING + "Enter a name: ");
        String name = sc.next();
        name += sc.nextLine();

        System.out.print(StringFormatting.MESSAGE_SPACING + "Enter a genre: " );
        String genre = sc.next();
        genre += sc.nextLine();

        composerDao.insert(new Composer(id, name, genre));
    }

    private static void ProgramClose() {
        System.out.println(StringFormatting.NEW_LINE_CHAR_RETURN);
        String menuOutput = StringFormatting.MESSAGE_SPACING + "You chose option 4! Goodbye!" + StringFormatting.NEW_LINE_SPACING;
        System.out.println(menuOutput);
    }
    
    /**
     * Program Entry Display
     */
    private static void ProgramEntry() {
        String menuOutput = StringFormatting.MESSAGE_SPACING + "Welcome to the Composer Tracker" + StringFormatting.NEW_LINE_SPACING;
        System.out.print(menuOutput);
    }

    /**
     * Program Menu
     */
    private static String DisplayMenu() {
        String menuOutput = StringFormatting.NEW_LINE_SPACING + StringFormatting.MESSAGE_SPACING + "MENU OPTIONS" + StringFormatting.NEW_LINE_SPACING +
            StringFormatting.MESSAGE_SPACING_WITH_TAB + "1. View Composers" + StringFormatting.NEW_LINE_SPACING +
            StringFormatting.MESSAGE_SPACING_WITH_TAB + "2. Find Composer" + StringFormatting.NEW_LINE_SPACING +
            StringFormatting.MESSAGE_SPACING_WITH_TAB + "3. Add Composer" + StringFormatting.NEW_LINE_SPACING + 
            StringFormatting.MESSAGE_SPACING_WITH_TAB + "4. Exit" + StringFormatting.NEW_LINE_SPACING + 
            StringFormatting.NEW_LINE_SPACING +
            StringFormatting.MESSAGE_SPACING + "Please choose an option: ";
        return menuOutput;
    }
}
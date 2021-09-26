/*
Assignment 4,2 - CIS505 - Kylie Gregory 9/23/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

// getCustomer compares data field against values 1007, 1008, and 1009.
// For each match, returns a new customer object with unique fields.  If there are no matches, returns a default customer object.
public class ProductDB {

    public static GenericQueue<Product> getProducts(String code) {

        if(code.equalsIgnoreCase("a")) { // If the user inputs "a", a Generic Queue of Bag Products will be returned
        
        GenericQueue<Product> bags = new GenericQueue<Product>();
        
        // Creates a new Bag called bag1
        Bag bag1 = new Bag();
        bag1.setCode("A300");
        bag1.setPrice(74.99);
        bag1.setDescription("Silver/Royal Blue");
        bag1.setType("Triple");
        bags.enqueue(bag1);

        // Creates a new bag called bag2
        Bag bag2 = new Bag();
        bag2.setCode("A200");
        bag2.setPrice(54.99);
        bag2.setDescription("Prime Roller Black/Royal Blue");
        bag2.setType("Double");
        bags.enqueue(bag2);

        // Creates a new bag called bag2
        Bag bag3 = new Bag();
        bag3.setCode("A100");
        bag3.setPrice(34.99);
        bag3.setDescription("Path Pro Deluxe");
        bag3.setType("Single");
        bags.enqueue(bag3);

        // Return GenericQueue<Product> of Bag objects
        return bags;
    }

       else if(code.equalsIgnoreCase("b")) { // If user inputs "b", a Generic Queue of Ball Products are created

        // Create new Generic Queue of ball products
        GenericQueue<Product> balls = new GenericQueue<Product>();

        // Creates new Ball called ball1
        Ball ball1 = new Ball();
        ball1.setCode("B500");
        ball1.setPrice(154.99);
        ball1.setDescription("Phaze III");
        ball1.setColor("Purple and Green");
        balls.enqueue(ball1);

        // Creates new Ball called ball2
        Ball ball2 = new Ball();
        ball2.setCode("B400");
        ball2.setPrice(139.99);
        ball2.setDescription("Force Unleashed");
        ball2.setColor("Red and White");
        balls.enqueue(ball2);

        // Creates new Ball called ball3
        Ball ball3 = new Ball();
        ball3.setCode("B300");
        ball3.setPrice(174.95);
        ball3.setDescription("Proton Physix");
        ball3.setColor("Pink and Purple");
        balls.enqueue(ball3);

        // Creates new Ball called ball4
        Ball ball4 = new Ball();
        ball4.setCode("B200");
        ball4.setPrice(154.95);
        ball4.setDescription("Axiom Pearl");
        ball4.setColor("Blue and Red");
        balls.enqueue(ball4);

        // Creates new Ball called ball5
        Ball ball5 = new Ball();
        ball5.setCode("B100");
        ball5.setPrice(144.95);
        ball5.setDescription("Black Widow 2.0");
        ball5.setColor("Black and Red");
        balls.enqueue(ball5);

        // Return GenericQueue<Product> of Ball objects
        return balls;
    }

    // If user inputs "s", a GenericQueue<Product> of Shoe Products will be created and returned
    else if(code.equalsIgnoreCase("s")) {

        // Create new GenericQueue<Product> of Shoes for return
        GenericQueue<Product> shoes = new GenericQueue<Product>();

        // Create new Shoe shoe1, set attributes, and add to shoes queue
        Shoe shoe1 = new Shoe();
        shoe1.setCode("S500");
        shoe1.setPrice(39.99);
        shoe1.setDescription("Youth Skull Green/Black");
        shoe1.setSize(3.0);
        shoes.enqueue(shoe1);

        // Create new Shoe shoe2, set attributes, and add to shoes queue
        Shoe shoe2 = new Shoe();
        shoe2.setCode("S400");
        shoe2.setPrice(26.99);
        shoe2.setDescription("Men's Tribal White");
        shoe2.setSize(8.5);
        shoes.enqueue(shoe2);

        // Create new Shoe shoe3, set attributes, and add to shoes queue
        Shoe shoe3 = new Shoe();
        shoe3.setCode("S300");
        shoe3.setPrice(54.99);
        shoe3.setDescription("Women's Rise Black/Hot Pink");
        shoe3.setSize(7.0);
        shoes.enqueue(shoe3);

        // Create new Shoe shoe4, set attributes, and add to shoes queue
        Shoe shoe4 = new Shoe();
        shoe4.setCode("S100");
        shoe4.setPrice(39.99);
        shoe4.setDescription("Men's Ram Black");
        shoe4.setSize(10.5;
        shoes.enqueue(shoe4);

        // Create new Shoe shoe5, set attributes, and add to shoes queue
        Shoe shoe5 = new Shoe();
        shoe5.setCode("S300");
        shoe5.setPrice(54.99);
        shoe5.setDescription("Women's Path Lite Seamless Mesh");
        shoe5.setSize(6.0);
        shoes.enqueue(shoe5);

        // Return GenericQueue<Product> of Shoe objects
        return shoes;
    }

    // If the user inputs "x" (or any invalid input), an empty GenericQueue<Product> will be returned
    else {

        // Return empty GenericQueue<Product>
        return new GenericQueue<Product>();
    }
}

} // end ProductDB class 
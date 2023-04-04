import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    //Below where we’ve initialized toDo1, initialize two  new String variables: toDo2 and toDo3.
//Set their values to any tasks you like.
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "Learn Java";
    
    // Add to-dos to toDoList
    String toDo3 = "Apply for Dev Jobs";
    
    //Use .add() to add toDo1, toDo2, and toDo3 to toDoList.
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);

    System.out.println(toDoList);
      
        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");
        
        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();
        
        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");
        
        // Print the size of each ArrayList below:
        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());
          
        // Print the name of the detective with the larger to-do list:
        System.out.println("Poirot");
    

        //For ArrayLists, bracket notation won’t work. 
        //Instead, we use the method get() to access an index:

        //Use get() to access the third to-do element of sherlocksToDos 
        //and print the result. 
        System.out.println("Sherlock's third to-do:");
        // Print Sherlock's third to-do:
        System.out.println(sherlocksToDos.get(2));
        
        
        //Use get() to access the second to-do element of poirotsToDos 
        //and print the result.
        System.out.println("\nPoirot's second to-do:");
        // Print Poirot's second to-do:
        System.out.println(poirotsToDos.get(1));


        //Learn Java: ArrayLists
//Changing a Value

         //When we were using arrays, we could rewrite entries by using bracket notation to reassign values:
//ArrayList has a slightly different way of doing this, using the set() method:

    //Modify sherlocksToDos so that the value at "play violin" becomes "listen to Dr. Watson for amusement".
    // Set each to-do below:
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    
    //Modify poirotsToDos so that the value at "trim mustache" becomes "listen to Captain Hastings for amusement".
    poirotsToDos.set(3, "listen to Captain Hastings for amusement");

    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());


    // Learn Java: ArrayLists
    // Removing an Item
    
    // What if we wanted to get rid of an entry altogether? 
// For arrays, we would have to make a completely new array 
    // without the value.
    
    // Luckily, ArrayLists allow us to remove an item by 
    // specifying the index to remove: 

    // We can also remove an item by specifying 
    // the value to remove:
  

    // Remove "visit the crime scene" from sherlocksToDos 
// and poirotsToDos using remove().

sherlocksToDos.remove(0);
poirotsToDos.remove("visit the crime scene");

// remove "play violin" from sherlocksToDos.
sherlocksToDos.remove("play violin");


// Learn Java: ArrayLists
// Getting an Item's Index

// use indexOf() to determine where in the to-do list 
// "solve the case" is.

// Print this information out. That’s the number of to-dos 
// remaining before Sherlock reaches "solve the case".

System.out.println(sherlocksToDos.indexOf("solve the case"));


// Review

// Nice work! You now know the basics of ArrayLists including:

//     Creating an ArrayList.
//     Adding a new ArrayList item using add().
//     Accessing the size of an ArrayList using size().
//     Finding an item by index using get().
//     Changing the value of an ArrayList item using set().
//     Removing an item with a specific value using remove().
//     Retrieving the index of an item with a specific 
//     value using indexOf().
}
}
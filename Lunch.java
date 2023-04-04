import java.util.ArrayList;
// Learn Java: Loops
// Removing Elements During Traversal
//When an element is removed from an ArrayList, all the items 
//that appear after the removed element will have their index 
//value shift by negative one — it’s like all elements shifted 
//to the left! We’ll have to be very careful with how we use 
//our counter variable to avoid skipping elements.

// Removing An Element Using for

// When using a for loop, we, unfortunately, must increase 
// our loop control variable — the loop control variable will 
// always change when we reach the end of the loop (and it 
// will usually change by 1 because we often use something 
// like i++.) Since we can’t avoid increasing our loop control 
// variable, we can take matters into our own hands and 
// decrease the loop control variable whenever we remove an 
// item. 
//Now whenever we remove an item, we’ll decrease i by 1.
//Then when we reach the end of the loop, i will increase by 1.
//It will be like i never changed!

//DO NOT USE A FOR EACH LOOP WHEN REMOVING AN ELEMENT

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    
// Inside the method removeAnts(), use a for loop 
//or a while loop to iterate through lunchBox and 
//remove any element that has the value "ant".

//Outside the loop, return the value of lunchBox

   for(int i = 0; i < lunchBox.size(); i++){
     if(lunchBox.get(i) == "ant"){
       lunchBox.remove(lunchBox.get(i));
       i--;
     }
   }
return lunchBox;
  }
 
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}
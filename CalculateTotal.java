import java.util.ArrayList;

//Learn Java: Loops
//Iterating Over Arrays and ArrayLists

// One common pattern we’ll encounter as a programmer is 
// traversing, or looping, through a list of data and doing 
// something with each item. In Java, that list would be an 
// array or ArrayList and the loop could be a for loop


// In order to traverse an array or ArrayList using a loop, 
// we must find a way to access each element via its index. 
// We may recall that for loops are created with a counter 
// variable. We can use that counter to track the index of the 
// current element as we iterate over the list of data.

// Because the first index in an array or ArrayList is 0, the 
// counter would begin with a value of 0 and increment until the
//  end of the list. So we can increment through the array or 
//  ArrayList using its indices.

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double total = 0;
    
    // Let’s use a for loop to iterate over expenses and 
    // sum up the total of all items.

// Start with the skeleton of a for loop:

//     Initialize a counter i with a value of 0.
//     The loop should run while i is less than the size() 
//     of expenses. Increment i.

    // Iterate over expenses
    for (int i = 0; i < expenses.size(); i++){
//Inside the for loop, add the item’s value to total.
total += expenses.get(i);
    }
    
    System.out.println(total);
    
  }
  
}
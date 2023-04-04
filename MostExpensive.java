import java.util.ArrayList;

class MostExpensive {

//     Learn Java: Loops
// For-Each Loops

// Sometimes we need access to the elements’ indices or we 
//only want to iterate through a portion of a list. If that’s 
//the case, a regular for loop or while loop is a great choice

// But sometimes we couldn’t care less about the indices; we 
// only care about the element itself.

// At times like this, for-each loops come in handy.

//For-each loops, which are also referred to as enhanced loops, 
// allow us to directly loop through each item in a list of 
// items (like an array or ArrayList) and perform some action 
// with each item. 
  
// We can name the enhanced for loop variable whatever we 
// want; using the singular of a plural is just a convention.
//  We may also encounter conventions like 
//  String word : sentence.

  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;

// use a for-each loop to find the priciest item in expenses.

// Build a for-each loop that iterates through each expense 
// in expenses.
    
    // Iterate over expenses
    for(double expense : expenses){
//Inside the for-each loop, check if expense is 
//greater than mostExpensive.
//If it is, set mostExpensive equal to expense.

if(expense > mostExpensive) {
  mostExpensive = expense ;
}
    }
    
    System.out.println(mostExpensive);
    
  }
  
}
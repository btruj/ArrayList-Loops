class Coffee {
  
    public static void main(String[] args) {
      
        //initialize an int variable called 
        //cupsOfCoffee with a value of 1.
        // initialize cupsOfCoffee
        //int cupsOfCoffee = 1;


//Create a while loop that runs as long as cupsOfCoffee 
//is less than or equal to 100.

//Important: Inside the while loop, increment cupsOfCoffee 
//by 1 to prevent an infinite loop.

       // add while loop with counter
//       while(cupsOfCoffee <= 100){
//   System.out.println("Fry drinks cup of coffee # " + cupsOfCoffee);
//   cupsOfCoffee++;
      
//inside the while loop above where you incremented 
//cupsOfCoffee print the following:

// Fry drinks cup of coffee #1

// The 1 in this statement should correspond with the 
//current value of cupsOfCoffee. When cupsOfCoffee is 100, 
//this should be printed:

// Fry drinks cup of coffee #100


//Above is a while loop that loops from 1 to 100 outputting 
//a string on each iteration. Refactor (rewrite) this code 
//as a for loop. 

for (int i = 1; i <=100; i++){
    System.out.println("Fry drinks cup of coffee #" + i);
  }

}
          
      
    }
    
  //}
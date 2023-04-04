class Numbers {

    // If we ever want to exit a loop before it finishes all 
    // its iterations or want to skip one of the iterations, 
    // we can use the break and continue keywords.

    // The break keyword is used to exit, or break, a loop. 
    // Once break is executed, the loop will stop iterating.

    // The continue keyword can be placed inside of a loop if 
    // we want to skip an iteration. If continue is executed, 
    // the current loop iteration will immediately end, and 
    // the next iteration will begin. We can use the continue 
    // keyword to skip any even valued iteration:

    public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
        
        // Inside the loop, create a condition that checks 
        //if i is not divisible by 5. If the condition is 
        //true, skip the iteration. Outside the condition 
        //statement, print i.

// Check if i is not divisible by 5, and skip iteration if true     
  if(i % 5 != 0){
    continue;
  } 
  System.out.println(i);
  }
  
    }
  }
      
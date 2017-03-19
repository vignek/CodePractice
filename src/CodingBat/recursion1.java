// http://codingbat.com/java/Recursion-1

// Problem 1 

public int factorial(int n) {

  if(n == 1 ) 
    return 1;
  
  return n * factorial(n-1);

}

// Problem 2

public int bunnyEars(int bunnies) {
  if( bunnies == 0) return 0;
 
 return 2 + bunnyEars(bunnies-1);  
}



// Problem 3

public int fibonacci(int n) {
  
  if(n == 0) {
    return 0;
  }
  if(n == 1) {
    return 1;
  }
  
  return fibonacci(n-1) + fibonacci(n-2);
  
}


// Problem 4


public int bunnyEars2(int bunnies) {
    int result = 0;
    
    if( bunnies == 0 ) {
      return 0;
    }
    
    if( bunnies % 2 == 0 ) {
     return 3 + bunnyEars2(bunnies-1);
    }
    
    return 2 + bunnyEars2(bunnies-1); 
   
}

// Problem 5

public int count7(int n) {
  int count = 0;
  if( n == 0 ) return 0;
  
  if( n % 10 == 7 )
    count = count + 1;
    
    
    return count + count7(n / 10);
}


// Problem 6

public int count8(int n) {
  int count = 0;
  if ( n == 0 ) return 0;
  
  if ((n % 10 == 8) && ((n / 10) % 10 != 8 )) count = count + 1;
  
  if ((n % 10 == 8) && ((n / 10) % 10 == 8) ) count = count + 2;
  
  return count + count8(n/10);
  
}


// Problem 7

public int powerN(int base, int n) {

  if ( n == 1 ) return base;
  
  return base * powerN(base,n-1);

  
}



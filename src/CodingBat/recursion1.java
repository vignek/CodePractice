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

// Problem 8

public int countX(String str) {
  String chr = "x";
  
  if(str.length() == 0 ) return 0;
  

  if(str.substring(0,1).equals(chr)) return 1 + countX(str.substring(1));

  return countX(str.substring(1));
}


// Problem 9

public int countHi(String str) {
  String mStr = "hi";
  
  if(str.length() == 0 || str.length() == 1 ) return 0;
  
  if(str.substring(0,2).equals(mStr)) return 1 + countHi(str.substring(1));
  
  return countHi(str.substring(1));
  
}

// Problem 10

public String changeXY(String str) {
  
  String newStr = "";
  char to = 'y';
  char from = 'x';
  if(str.length() == 0 ) return "";
  
  if(str.charAt(0) == from ) {
    str = to + str.substring(1);  
  }
  
  return str.charAt(0) + changeXY(str.substring(1, str.length()));
 
}


// Problem 11

public String changePi(String str) {
  
  String from = "pi";
  String to = "3.14";
  
  int index = str.indexOf(from);
  int endIndex = index + from.length();
  
  if(index < 0) return str;
  
  return str.substring(0,index) + to + changePi(str.substring(endIndex));
}

// Problem 12

public String noX(String str) {
 String from = "x";
 int index = str.indexOf(from);
 int endIndex = from.length() + index ;
 
 if(index < 0 ) return str;
 
 return str.substring(0,index) + noX(str.substring(endIndex));
 
}

// Problem 13

public boolean array6(int[] nums, int index) {

  int find = 6;
  
  if(index >= nums.length) return false;
  
  if(nums[index] == find) return true;
  
  return array6(nums, index+1);

  
}

// Problem 14

public int array11(int[] nums, int index) {
  
  int count = 0;
  
  if(index >= nums.length ) return count;
  
  if(nums[index] == 11 ) count = count + 1;
  
  
  return count + array11(nums, index+1);
}

// Problem 15

public boolean array220(int[] nums, int index) {
  
  int tcount = 0;
  
  
  if(nums.length == 0 || nums.length == 1 ) return false;

  if( (index <= nums.length ) &&  ( (nums[index] * 10) == nums[index+1] ) ) {
    tcount = tcount + 1;
    return true;
  }
  
  if (index == (nums.length-2) && ( tcount == 0) )
      return false;
    
  return array220(nums, index+1);
}


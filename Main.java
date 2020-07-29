class Main {
  public static void main(String[] args) {
  //This is a solution to a program.
  int count = 0;
  for(int x = 1; x < 1000; x++){
    if (x % 3 == 0 || x % 5 == 0){
      count = count + x;
    }
    
  }

  //This is a comment.
System.out.println("The sum of all intergers under 10 that are divisible by 3 and 5 is " + count);
  }
}
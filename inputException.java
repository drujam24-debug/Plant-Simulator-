public class inputException extends Exception{
  public inputException (int invalidInput){
   super("Invalid input: " + invalidInput + ". Please enter a valid number the program has provided to you in ().");
  }
  public inputException (String invalidInput){
   super("Invalid input: " + invalidInput + ". Please enter a valid number the program has provided to you in ().");
  }

}
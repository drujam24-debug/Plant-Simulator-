public class inputException extends Exception{
  public inputException (int invalidInput){
   super("Invalid input: " + invalidInput + ". Please enter a valid number from the given list.");
  }

}
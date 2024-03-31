public class Scope {
  // class scope always use static keyword before initializing a variable in order
  // for the variable to be accessible from anywhere in the class
    static int a = 22;
  public static void main(String[] args) {
    // block scope
    int a = 10;
    System.out.println(a);
  }
}

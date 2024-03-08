public class DataTypes {

  int a = 10;
  short b = 10;
  long c = 10;
  byte d = 10;
  double e = 10.5;
  boolean f = true;
  String g = "Hello";
  char h = 'a';
  float i = 10.5f;

  /**
   * byte 1 byte Stores whole numbers from -128 to 127
   * short 2 bytes Stores whole numbers from -32,768 to 32,767
   * int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
   * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
   * 9,223,372,036,854,775,807
   * float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
   * decimal digits
   * double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
   * digits
   * boolean 1 bit Stores true or false values
   * char 2 bytes Stores a single character/letter or ASCII values
   */

  public static void main(String[] args) {

    // possible data type conversions
    int number1 = 100000;
    double number2 = number1;
    long number3 = number1;
    // can use L to say the number is a long or not
    long number4 = 100000L;
    System.out.println(number2);
    System.out.println(number3);
    System.out.println(number4);

    // not possible data type conversions
    // int number5 = 100000.5;
    // int number6 = 100000.5f;
    double number7 = 100000.8;

    // use (int) but the compiler will automatically convert it to an int and there
    // will be data loss
    int number8 = (int) number7;
    System.out.println(number8);

  }
}

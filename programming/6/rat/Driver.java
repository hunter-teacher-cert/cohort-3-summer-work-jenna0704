/**
 * class Driver
 * tester class for class Rational
 */

public class Driver
{
  public static void main( String[] args )
  {
   
      Rational r = new Rational(3, 7);
      Rational z = new Rational(1, 0);
      Rational s = new Rational();
      Rational t = new Rational(8, 5);

      Rational u = new Rational(1, 2);
      Rational v = new Rational(2, 3);
      Rational w = new Rational(8, 12);

      Rational x = new Rational(8, 12);

      System.out.println("r: " + r );
      System.out.println("z: " +  z );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );
      
      System.out.println();

      System.out.println( r + " as a floating point approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating point approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating point approximation: "
      + t.floatValue() );

      System.out.println();   
      
      System.out.print( r + " * " + t + " = ");
      r.multiply(t);
      System.out.println(r);
    
      System.out.println();
      
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);

      System.out.println();
    
      System.out.println(w.gcd());

      System.out.println();
    
      System.out.printf("The greatest common divsor of 8 and 24 is %d.\n", w.gcd(8, 24));

      System.out.println();
      w.reduce();
      System.out.println("8/12 can be reduced to " + w);
  }

}//end class
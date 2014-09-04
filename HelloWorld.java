public class HelloWorld  // Save as HelloWorld.java
{
  public static String getSentence1()
  {
    return "My first console application ";
  }

  public static String getSentence2()
  {
    return "How exciting!";
  }
  
  public static String getSentence3()
  {
    return "I understand this finally...maybe! XD";
  }
  
  public static void main (String[]args)
  {
    String s1 = getSentence1();
    String s2 = getSentence2();
    String s3 = getSentence3();
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
  
}
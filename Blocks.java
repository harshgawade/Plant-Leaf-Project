class Blocks 
{
     // Instance Block ------> it  is  initialised  when obj is created
    
     {
          System.out.println("This is an Instance block");
     }

     static
     {
          System.out.println("This is static block");
     }
     
     Blocks()
     {
          System.out.println("Default Constructor");
     }
 
     static void blockMethod()
     {
          System.out.println("This is Static Method"); 
     }

 
     public static void main(String args[])
     {
          blockMethod();
      }     
}
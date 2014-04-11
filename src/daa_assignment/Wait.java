/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daa_assignment;

//Learn how to use Threds
//http://www.roseindia.net/java/java-methods/java-method-wait.shtml
public class Wait
{

  public static void oneSec()
  {
      try
      {
          Thread.currentThread().sleep(1000);
      }
      catch (InterruptedException e)
      {
           e.printStackTrace();
      }
   }

   public  static void manySec(long s)
   {
       try
       {
          Thread.currentThread().sleep(s * 1000);
       }
       catch (InterruptedException e)
       {
          e.printStackTrace();
       }
   }


}



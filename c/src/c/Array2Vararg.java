/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author test
 */
public class Array2Vararg{
   public static void main(String args[]) { 
      System.out.println(numericProcessor(new Float[] {1.0f, 2.0f, 3.0f, 4.0f}));
   }
   /*
   static Float numericProcessor(Float n[]) {
      System.out.println("Arrays Version");
      Float r = 0.0f;
      for(Float i:n) {
         r += i;
      }
      return r;
   }
*/
    static Float numericProcessor(Float ...n) {
       System.out.println("Var-args Version");
       Float r = 0.0f;
       for(Float f:n) {
          r += f;
       }
       return r;
   }
}
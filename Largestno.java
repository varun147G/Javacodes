class Largestno {
   public static void main(String[] args) {
      System.out.println("programm started");
      int a = 10;
      int b = 20;
      int c = 30;
      if (c > b) {
         if (c > a) {
            System.out.println(c + "is largest no");
         } else {
            System.out.println(b + "is largest no");
         }
      } else if (b > a) {
         System.out.println(b + "is largest no");
      }

      else {
         System.out.println(a + " is largest no");
      }

   }
}
class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int mmTtl = 55*9; //Went with the naming scheme mm for M&Ms
    double mmBlu = mmTtl * .24; 
    double mmBwn = mmTtl * .13;
    double mmGrn = mmTtl * .16;
    double mmOgn = mmTtl * .20;
    double mmRed = mmTtl * .13;
    double mmYlw = mmTtl * .14;
    double mmSum = mmBlu + mmBwn + mmGrn + mmOgn + mmRed + mmYlw; 
    //is 495.00000000000006. This might cause issues later
    
    System.out.println("Blue:" + mmBlu);
    System.out.println("Brown:" + mmBwn);
    System.out.println("Green:" + mmGrn);
    System.out.println("Orange:" + mmOgn);
    System.out.println("Red:" + mmRed);
    System.out.println("Yellow:" + mmYlw);
    System.out.println("Sum:" + mmSum);

    if (mmBlu > mmBwn && mmGrn > mmRed)
      System.out.println("Brown over Brown and Green over Red");
    if (mmBwn <= mmOgn)
      System.out.println("Brown is less than or equal to Orange");
    if (mmSum == mmTtl)
      System.out.println("Numbers match"); 
      //Had a bit of trouble here, as the numbers are super close. Since technically 495.00000000000006 =/= 495, it doesn't output, even though they are close enough that they are for all intents and purposes the same number here.
  }
}
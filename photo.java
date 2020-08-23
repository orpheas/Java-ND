class photo {
  public static void printPhoto(int width, int height, boolean inColour){
      System.out.println("Width = " + width + "cm");
      System.out.println("Height = " + height + "cm");
      if(inColour){
        System.out.println("Print is full colour");
      }
        else {
          System.out.println("Print is black and white");
        }
      }


  }
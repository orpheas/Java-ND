class likey{
  public static int likePhoto(int currentLikes, boolean like){

    if(like){
      currentLikes = currentLikes + 1;
      System.out.println(currentLikes);
    }
      else {
        System.out.println(currentLikes);
      }
    return currentLikes;
  }
  

}
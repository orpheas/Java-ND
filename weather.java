class weatheroo {
public static void weatherInterpreter(int temperature){
    if (temperature >30){
      System.out.println("It's hot outside");
    } else if (temperature <5){
      System.out.println("Brr, consider weating a jacket");
    } else {
      System.out.println("Not too hot, not too cold.");
    }
}
}
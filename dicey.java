
class dicey{

  public static int rollDice(int diceSides){
    double randomNumber = Math.random() * diceSides +1;
    int randomInt = (int) randomNumber;
    return randomInt;

  }

}
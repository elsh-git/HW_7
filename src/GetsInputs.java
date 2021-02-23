import java.util.*;
import java.io.*;


public class GetsInputs {

  private static GetsInputs instance = null;

  private GetsInputs() { }

  public static GetsInputs getInstance() {
    if (instance == null) {
      instance = new GetsInputs();
    }
    return instance;

  }


  public static String info(){
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter your name- ");
    String name = sc.nextLine();
    System.out.println("please enter your age- ");
    String age = sc.nextLine();
    System.out.println("please enter your address- ");
    String address = sc.nextLine();
    System.out.println("please enter your phone number- ");
    String phone_number = sc.nextLine();
    String total_info = name + "," + age + "," + address + "," + phone_number;

    return total_info;
  }
}
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Ejercicio7 {  
  public static void main(String[] args) {
    System.out.println("Ingresar numeros en el arreglo (escribir cualquier letra para terminar cadena): ");
    Scanner scanner = new Scanner(System.in);
    Integer i = 1;
    ArrayList<Integer> list = new ArrayList<Integer>();
    while (i != -163){
      try {
        i = scanner.nextInt();
        list.add(i);
      } catch (Exception e) {
        i = -163;
      }
    }
    
    System.out.println(minNumber(list, 0));
    scanner.close();
  }

  private static Integer minNumber(ArrayList<Integer> list, Integer index){
    if (index == list.size() - 1){
      return list.get(index);
    }
    int val = minNumber(list, index + 1);

    if (list.get(index) < val){
      return list.get(index);
    }else{
      return val;
    }
  }
}
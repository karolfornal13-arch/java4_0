/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
      System.out.println("wybierz:");
      System.out.println("1 - dodanie nowego studenta");
      System.out.println("2 - wyświetlenie listy studentów");
      int x = scanner.nextInt();
      switch (x) {
        case 1:{
          System.out.println("Podaj Imię Studenta:");
          String a = scanner.next();
          System.out.println("Podaj Wiek Studenta:");
          int b = scanner.nextInt();
          s.addStudent(new Student(a, b));
          break;
          }
        case 2:{
          var students = s.getStudents();
          for(Student current : students) {
            System.out.println(current.ToString());    
      }
          break;
        }
      }scanner.close();
    }
     catch (IOException e) {
    }
}
}

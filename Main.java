import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Assistant assistant = new Assistant();
      int choice;
      
      System.out.println("===============================");
      System.out.println("     welcome to study Assistant");
      System.out.println("===============================");

      do {
           System.out.println("\n1. Add study Task");
           System.out.println("2. Add Assignment");
           System.out.println("3. view All Tasks");
           System.out.println("4.mark Task Complete");
           System.out.println("5.Get a Study Tip");
           System.out.println("6.Exit");
           System.out.println(" choose:");
           choice = scanner.nextInt();
           scanner.nextLine();

           switch (choice){
              case 1:
                System.out.print("Task title :");
                String title = scanner.nextLine();
                System.out.print("Subject:");
                String Subject = scanner.nextLine();
                assistant.addTask(title,Subject);
                break;
              case 2:
                System.out.print("Assignment title:");
                String aTitle = scanner.nextLine();
                System.out.print("Subject: ");
                String aSubject = scanner.nextLine();
                System.out.print("Due date:");
                String dueDate = scanner.nextLine();
                assistant.addTask(aTitle,aSubject, dueDate);
                break;
              case 3:
                assistant.showAllTasks();
                break;
              case 4:
                assistant.showAllTasks();
                System.out.print("Enter task number:");
                int index = scanner.nextInt() -1;
                assistant.markComplete(index);
                break;
              case 5:
                assistant.giveTip();
                break;
              case 6:
                System.out.println("goodbye! keep studying!");
                break;
              default:
                 System.out.println("Invalid choice");


                  



           }
        
          }while( choice != 6);

          scanner.close();
      
    }
}
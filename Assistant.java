import java.util.ArrayList;
import java.util.Random;

public class Assistant {
    private ArrayList<Task> tasks;
    private Random random;
    private String[] tips = {
        "Take a short break!",
        "Review yesterday's topic.",
        "Drink some water.",
        "Try teaching what you learned to someone else.",
        "Focus for 25 minutes then rest 5 minutes."
    };

    public Assistant() {
        tasks = new ArrayList<>();
        random = new Random();
    }

    public void addTask(String title, String subject) {
        tasks.add(new StudyTask(title, subject));
        System.out.println("Study task added!");
    }

    public void addTask(String title, String subject, String dueDate) {
        tasks.add(new AssigmentTask(title, subject, dueDate));
        System.out.println("Assignment added!");
    }

    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }
        System.out.println("===== YOUR TASKS =====");
        for (Task t : tasks) {
            t.show();
        }
    }

    public void markComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
            System.out.println("Task marked complete!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    
    public void giveTip() {
        System.out.println("Tip: " + tips[random.nextInt(tips.length)]);
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
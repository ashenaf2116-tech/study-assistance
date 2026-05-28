
public class AssigmentTask extends Task {
    
    private String subject;
    private String dueDate;


    public AssigmentTask(String title,String subject,String dueDate){
        super(title);
        this.subject = subject;
        this.dueDate = dueDate;
    
    }
    public String getSubject() {
        return dueDate;
    }
    @Override
    public void show() {
        System.out.println("Assignment: " + getTitle() + "subject: " + subject + " Due:" + dueDate + "Done: " + isCompleted());
    }



}
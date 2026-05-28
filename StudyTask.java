public class StudyTask extends Task {

    private String subject;

    public StudyTask(String title, String subject) {
        super(title);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void show() {
        System.out.println(" Study Task: " + getTitle() + " Subject: " + subject + " Done: " + isCompleted());
    }
}

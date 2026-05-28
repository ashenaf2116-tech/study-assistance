public class Task {

    private String title;
    private boolean isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;

    }
    public String getTitle() {
    return title;
    }
    
    public boolean isCompleted(){
        return isCompleted;
    }

    public void markComplete() {
        isCompleted = true;

    }
    public void show() {
        System.out.println("Task:" + title + "Done:" + isCompleted);
    }

}
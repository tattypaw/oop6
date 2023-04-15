public class Main{
    public static void main(String[] args){
        User user = new User("Kate");

        Saveable saveable = new Persister(user);
        saveable.save();

        Reportable reportable = new ReportUser(user);
        reportable.report();
    }
}
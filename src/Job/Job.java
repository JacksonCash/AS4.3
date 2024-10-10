package Job;
abstract class Job {
    abstract String companyName(String companyName);
    abstract String position(String position);
    abstract int startDate(int startDate);
    abstract int endDate(int endDate);
    
    public String DisplayJobDetails(String companyName, String position) {
        return (companyName + " " + position);
    }
    public Integer CalculatingJobDuration(int startDate, int endDate) {
        return (endDate - startDate);
    }
    public String AssessJobSatisfaction(String satisfaction) {
        return satisfaction;
    }
}

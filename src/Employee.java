public class Employee {
    private String[] contracts;
    private int[] conSat;
    private int[] contractTime;
    private int contractCount = 0;

    private String[] fullTime;
    private int[] fullSat;
    private int[] fullTimeTime;
    private int fullTimeCount = 0;

    private String[] partTime;
    private int[] partSat;
    private int[] partTimeTime;
    private int partTimeCount = 0;

    public void addContract(String job, int rating, int start, int end) {
        contracts[contractCount + 1] = job;
        conSat[contractCount + 1] = rating;
        contractTime[contractCount + 1] = end - start;
        ++contractCount;
    }

    public void addFullTime(String job, int rating, int start, int end) {
        fullTime[fullTimeCount + 1] = job;
        fullSat[fullTimeCount + 1] = rating;
        fullTimeTime[fullTimeCount + 1] = end - start;
        ++fullTimeCount;
    }

    public void addPartTime(String job, int rating, int start, int end) {
        partTime[partTimeCount + 1] = job;
        partSat[partTimeCount + 1] = rating;
        partTimeTime[partTimeCount + 1] = end - start;
        ++partTimeCount;
    }

    public int workDuration() {
        int totalTime = 0;
        int tempInt = contractCount;
        while (tempInt > 0) {
            totalTime = totalTime + contractTime[tempInt];
            --tempInt;
        } tempInt = fullTimeCount;
        while (tempInt > 0) {
            totalTime = totalTime + fullTimeTime[tempInt];
            --tempInt;
        } tempInt = partTimeCount;
        while (tempInt > 0) {
            totalTime = totalTime + partTimeTime[tempInt];
            --tempInt;
        }
        return totalTime;
    }

    public int jobSatisfaction() {
        int totalJobs = 0;
        int satisfaction = 0;
        int tempInt = contractCount;
        while (tempInt > 0) {
            satisfaction = satisfaction + conSat[tempInt];
            --tempInt;
            ++totalJobs;
        } tempInt = fullTimeCount;
        while (tempInt > 0) {
            satisfaction = satisfaction + fullSat[tempInt];
            --tempInt;
            ++totalJobs;
        } tempInt = partTimeCount;
        while (tempInt > 0) {
            satisfaction = satisfaction + partSat[tempInt];
            --tempInt;
            ++totalJobs;
        } satisfaction = satisfaction / totalJobs;
        return satisfaction;
    }
}

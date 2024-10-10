package Job;
public class PartTimeJob extends Job {
    String companyName(String companyName) {
        return companyName;
    }
    String position(String position) {
        return position;
    }
    int startDate(int startDate) {
        return startDate;
    }
    int endDate(int endDate) {
        return endDate;
    }

    public double calculateSalary(int wage, int hoursWorked, double overtimePay) {
        return (((double)wage * hoursWorked) + overtimePay);
    }

    public String evaluateWorkLifeBalance(int hoursWorked, int flexibility, int stressCount) {
        int rating1 = 0;
        if (hoursWorked <= 40) {
            rating1 = 2;
        } else if (hoursWorked <= 60) {
            rating1 = 1;
        }

        int rating2 = 0;
        if (flexibility >= 5) {
            rating2 = 2;
        } else if (flexibility >= 3) {
            rating2 = 1;
        }

        int rating3 = 0;
        if (stressCount <= 2) {
            rating3 = 2;
        } else if (stressCount <= 4) {
            rating3 = 1;
        }

        int totalRating = rating1 + rating2 + rating3;
        String balance = "ERROR";
        if (totalRating > 4) {
            balance = "Excellent";
        } else if (totalRating > 2) {
            balance = "Moderate";
        } else {
            balance = "Poor";
        } return balance;
    }
}

package Job;
public class ContractJob extends Job {
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

    public double calculatePayment(int wage, int hoursWorked, double payChanges) {
        return (((double)wage * hoursWorked) + payChanges);
    }

    public String evaluateJobSecurity(int duration, int stability, int termClauses) {
        int rating1 = 0;
        if (duration >= 36) {
            rating1 = 2;
        } else if (duration >= 12) {
            rating1 = 1;
        }

        int rating2 = 0;
        if (stability >= 9) {
            rating2 = 2;
        } else if (stability >= 7) {
            rating2 = 1;
        }

        int rating3 = 0;
        if (termClauses <= 1) {
            rating3 = 2;
        } else if (termClauses <= 3) {
            rating3 = 1;
        }

        int totalRating = rating1 + rating2 + rating3;
        String security = "ERROR";
        if (totalRating > 4) {
            security = "High";
        } else if (totalRating > 2) {
            security = "Medium";
        } else {
            security = "Low";
        } return security;
    }
}

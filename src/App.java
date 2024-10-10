public class App {
    public static void main(String[] args) throws Exception {
        Employee Jeb = new Employee();
        Jeb.addPartTime("Fry Cook", 7, 2004, 2005);
        Jeb.addPartTime("Waiter", 3, 2005, 2005);
        Jeb.addPartTime("Delivery Driver", 9, 2006, 2008);
        Jeb.addFullTime("Waiter", 8, 2008, 2010);
        Jeb.addFullTime("Manager", 3, 2010, 2013);
        Jeb.addContract("Construction", 8, 2014, 2024);

        System.out.println("Jeb has worked a total of " + Jeb.workDuration() + " years.\n");
        System.out.println("Jeb has rated his jobs an average of " + Jeb.jobSatisfaction() + "/10.");
    }
}

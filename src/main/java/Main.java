import com.workintech.developers.*;

public class Main {

    public static final String MSG_WORK_BEFORE = "çalışmaya başlamadan önce: ";
    public static final String MSG_WORK_AFTER = "çalışmaya başladıktan sonra: ";

    public static void main(String[] args) {


        JuniorDeveloper ahmet = new JuniorDeveloper(1, "ahmet", 0);
        JuniorDeveloper ayse = new JuniorDeveloper(2, "ayşe", 0);
        printResult(MSG_WORK_BEFORE, ahmet);
        printResult(MSG_WORK_BEFORE, ayse);
        ahmet.work();
        ayse.work();

        printResult(MSG_WORK_AFTER, ahmet);
        printResult(MSG_WORK_AFTER, ayse);

        MidDeveloper mehmet = new MidDeveloper(1, "mehmet", 0);
        printResult(MSG_WORK_BEFORE, mehmet);
        mehmet.work();
        printResult(MSG_WORK_AFTER, mehmet);

        SeniorDeveloper veli = new SeniorDeveloper(1, "veli", 0);
        printResult(MSG_WORK_BEFORE, veli);
        veli.work();
        printResult(MSG_WORK_AFTER, veli);


        HRManager hrManager = new HRManager(1,"kerem", 0,new JuniorDeveloper[5],new MidDeveloper[2],new SeniorDeveloper[1]);
        printResult(MSG_WORK_BEFORE,hrManager);
        hrManager.work();
        printResult(MSG_WORK_AFTER,hrManager);

        hrManager.addEmployee(0,ahmet);
        hrManager.addEmployee(1,ayse);
        hrManager.addEmployee(0,mehmet);
        hrManager.addEmployee(0,veli);

        System.out.println(hrManager);
    }

    private static void printResult(String x, JuniorDeveloper juniorDeveloper) {
        System.out.println(x + juniorDeveloper.toString());
    }

    private static void printResult(String x, MidDeveloper midDeveloper) {
        System.out.println(x + midDeveloper.toString());
    }

    private static void printResult(String x, SeniorDeveloper seniorDeveloper) {
        System.out.println(x + seniorDeveloper.toString());
    }

    private static void printResult(String x, HRManager hrManager) {
        System.out.println(x + hrManager.toString());
    }
}
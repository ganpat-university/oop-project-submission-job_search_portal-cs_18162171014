
import java.util.*;

public class Final{
    private int empcode[]=new int[5];
    private String cname[]= new String[5];
    private String jobpost[]= new String[5];
    private int noofpositon[]=new int[5];
    private int c=0,z=0;
    private String applicant[]=new String[50];
    private int applicantcode[]=new int[50];

    public void set(){
        for(int i=0;i<50;i++){
            applicant[i]="NULL";
            applicantcode[i]=0;
        }
    }

    public void new_job(int x,String y,String z,int aa){
        if(c<5){
            empcode[c]=x;
            cname[c]=y;
            jobpost[c]=z;
            noofpositon[c]=aa;
            c++;
        }
        else{
            System.out.println("you cant add more as we currently support only 5 job" +
                    "entries");
        }
    }

    public void apply(int ab) {
        switch (ab) {
            case 1:
                System.out.println("You Have Successfully applied " +
                        "to this job");
                noofpositon[ab-1]--;
                showjobdetails(0);
                break;
            case 2:
                System.out.println("You have Successfully applied " +
                        "to this job");
                noofpositon[ab-2]--;
                showjobdetails(1);
                break;
            case 3:
                System.out.println("You have Successfully Applied " +
                        "to this job");
                noofpositon[ab-3]--;
                showjobdetails(2);
                break;
            case 4:
                System.out.println("You have successfully applied " +
                        "to this job");
                noofpositon[ab-4]--;
                showjobdetails(3);
                noofpositon[ab-1]--;
            case 5:
                System.out.println("You have successfully applied " +
                        "to this job");
                noofpositon[ab-1]--;
                showjobdetails(4);
                break;
            default:
                System.out.println("Not possible because the " +
                        "no of jobs cant exceed");
        }
    }

    public void apply_job(String x,int y) {
        if(z<50){
            applicantcode[z]=y;
            applicant[z]=x;
            z++;
            System.out.println("Successfull Proceed to finding jobs!!");
        }
        else{
            System.out.println("Users full try again later!");
        }
    }
    public void showjobdetails(int ind){
            System.out.println("Employer code:"+empcode[ind]);
            System.out.println("Company name:"+cname[ind]);
            System.out.println("Job post:"+jobpost[ind]);
            System.out.println("No of Positions available:"+noofpositon[ind]);
    }
    public void showalljobs(){
        for(int i=0;i<c;i++){
            System.out.println("Option no "+(i+1));
            System.out.println("Employer code:"+empcode[i]);
            System.out.println("Company name:"+cname[i]);
            System.out.println("Job post:"+jobpost[i]);
            System.out.println("No of Positions available:"+noofpositon[i]);
            System.out.println();
        }
        int select;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your job selection:");
        select=sc.nextInt();
        apply(select);
    }

    public static void main(String[] args){
        int ch;
        int emcode;
        String comp;
        String job;
        int no;
        int appcode;
        String apnme;
        Final obj=new Final();

        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("***********************************Job Search Portal***************************************");
            System.out.println("\t\t\t\t\t\t\t\tMenu");
            System.out.println("\t\t\t\t\t\t1. Post new job alert");
            System.out.println("\t\t\t\t\t\t2. Create application");
            System.out.println("\t\t\t\t\t\t3. Apply for job");
            System.out.println("\t\t\t\t\t\t4. Exit");
            System.out.print("\t\t\t\t\t\t\tEnter choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter employee code:");
                    emcode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Company name:");
                    comp = sc.nextLine();
                    System.out.print("Job post details :");
                    job = sc.nextLine();
                    System.out.print("No of positions:");
                    no = sc.nextInt();
                    obj.new_job(emcode, comp, job, no);

                    break;

                case 2:
                    System.out.print("Applicant code:");
                    appcode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Applicant name:");
                    apnme = sc.nextLine();
                    obj.apply_job(apnme, appcode);

                    break;

                case 3:
                    obj.showalljobs();
                    break;
                case 4:
                    break;
            }
        }while(ch!=4);
    }
}

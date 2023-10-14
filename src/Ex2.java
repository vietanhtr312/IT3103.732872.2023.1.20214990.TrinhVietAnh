import java.util.Scanner;
public class Ex2 {
    public static class Student{
        private String name = "";
        private int year;
        public Student(String a, int b){
            this.name = a;
            this.year = b;
        }
        public void setName(String a) {
            this.name = a;
        }
        public void setYear(int b) {
            this.year = b;
        }
        public String getName() {
            return name;
        }
        public int getYear() {
            return year;
        }


    }

        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int N = scanner.nextInt();
        Student[] std = new Student[N];
        for (int i = 0; i < N; ++i){
            System.out.println("Nhap thong tin sinh vien ");
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Year: ");
            int year = scanner.nextInt();
            std[i] = new Student(name, year);}

        scanner.close();
        int tuoi = 0;
        System.out.println("Danh sach lop: ");
        for (int i = 0; i < N; i++){
            System.out.println("Name: " +std[i].getName());
            tuoi += 18 + std[i].getYear();

        }
            System.out.println("Tuoi: " + tuoi);


        }


}

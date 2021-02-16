package Arrays;

import java.util.*;

public class ArrayTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while(testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().thenComparing(Student :: getFname).thenComparing(Student :: getId));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }


    private static final Comparator<Student> SENIORITY_ORDER =
            new Comparator<Student>() {
                public int compare(Student e1, Student e2) {
                    int dateCmp = e2.getFname().compareTo(e1.getFname());
                    if (dateCmp != 0)
                        return dateCmp;

                    return (e1.getId() < e2.getId() ? -1 :
                            (e1.getId() == e2.getId() ? 0 : 1));
                }
        };

    static class Student{
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

}

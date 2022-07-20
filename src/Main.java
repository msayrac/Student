public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ali", "Kaya", "1234", "Sivas MErkez", 85);
        Student s2 = new Student("Patika", "Dev", "234", "bb", 85);

        Student s3 = new Student("Kodluyoru", "java102", "2345", "cc", 85);
        Instructor teacher = new Instructor("Mahmut ogretmen", "Cetingag", "CENG");
        Course mat = new Course("MAT101", "MAT", teacher);

        System.out.println(mat.getInstructor().getName());

       // Student[] stu = {s1, s2, s3};

      //  System.out.println("Ortalama : " + mat.calcAverage(stu));


    }
}
package class16;

public class Students {
        String name;
        String id;
        static int numberOfStudents;

        public static void main(String[] args) {
                Students roman=new Students();
                roman.id="1";
                roman.name="Roman";
                Students.numberOfStudents++;

                Students charles=new Students();
                charles.id="2";
                charles.name="Charles";
                Students.numberOfStudents++;

                System.out.println(roman.numberOfStudents);


        }




        }

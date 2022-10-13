package class19;

public class hwuserClass {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.*/

    String name;
    String mobileNumber;

    public hwuserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;

    }
}

class userInfo extends hwuserClass {
        String address;

        public userInfo(String name, String mobileNumber, String address) {
            super(name, mobileNumber);
            this.address = address;
        }

        public void userDetails() {
            System.out.println(name);
            System.out.println(mobileNumber);
            System.out.println(address);
        }

}
class infotester{
        public static void main(String[] args) {
        userInfo user= new userInfo("Kohn","571-908-9712","cahdks@live.com");
        user.userDetails();





        }
    }



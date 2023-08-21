public class Homework14Person {
        private String firstName;
        private String lastName;
        private String city;
        private String phoneNumber;
        public Homework14Person(String firstName, String lastName, String city, String phoneNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.phoneNumber = phoneNumber;
        }


        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public String getCity(){
            return city;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }
        public String personInfo() {
            return "Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city + " можна за номером " + phoneNumber + ".";
        }
    }

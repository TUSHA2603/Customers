package Customers;
    public class ContracterDetail extends Object {
        private   String Frsit_Name;
        private   String Last_Name;
        private String Street;
        private String Adress;
        private String City;
        private String state;
        private String Eamil;
        private String Number;
    
        public ContracterDetail(String frsit_Name, String last_Name, String street, String adress, String city,
                String state, String eamil, String number) {
            Frsit_Name = frsit_Name;
            Last_Name = last_Name;
            Street = street;
            Adress = adress;
            City = city;
            this.state = state;
            Eamil = eamil;
            Number = number;
        }
        public String getFrsit_Name() {
            return Frsit_Name;
        }
        public void setFrsit_Name(String frsit_Name) {
            Frsit_Name = frsit_Name;
        }
        public String getLast_Name() {
            return Last_Name;
        }
        public void setLast_Name(String last_Name) {
            Last_Name = last_Name;
        }
        public String getStreet() {
            return Street;
        }
        public void setStreet(String street) {
            Street = street;
        }
        public String getAdress() {
            return Adress;
        }
        public void setAdress(String adress) {
            Adress = adress;
        }
        public String getCity() {
            return City;
        }
        public void setCity(String city) {
            City = city;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getEamil() {
            return Eamil;
        }
        public void setEamil(String eamil) {
            Eamil = eamil;
        }
        public String getNumber() {
            return Number;
        }
        public void setNumber(String number) {
            Number = number;
        }
        public void Detail(String frsit_Name, String last_Name, String street, String adress, String city, String state,
        String eamil, String number){
            System.out.println(frsit_Name);
            System.out.println(last_Name);
            System.out.println(street);
            System.out.println(adress);
            System.out.println(city);
            System.out.println(state);
            System.out.println(eamil);
            System.out.println(number);
        }
        
    
    
    }
    

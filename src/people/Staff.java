package people;

public class Staff extends Person {
        private String role;

        public Staff(String name, String email, String role){
            super(name, email);
            this.role = role;
        }

    public String getRole() {
            return role;
        }
    public void setRole(String role) {
            this.role = role;
        }
}

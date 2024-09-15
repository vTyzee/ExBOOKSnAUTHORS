package org.example;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

        public String getEmail () {
            return email;
        }

        public String getName() {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public void setEmail (String email){
            if (email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Wrong format email");
            }

        }

    @Override
    public String toString() {
        return "Автор: " + name + ", Email: " + email;
    }
}
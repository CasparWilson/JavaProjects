class Main {
    public static void main(String[] args){
        ContactManager myContactManager = new ContactManager();

        Contact williams = new Contact("Rachel", "RSHWilliams@live.co.uk", "07506548717");
        Contact wilson = new Contact("Ben", "bjwilson", "0717");
        Contact graydon = new Contact("Felix", "Filopastry", "075048717");
        Contact dad = new Contact("Marco", "dad.com", "0765617");
        Contact sheena = new Contact("Sheena", "msbcf", "+447590311859");

        myContactManager.addContact(williams);
        myContactManager.addContact(wilson);
        myContactManager.addContact(graydon);
        myContactManager.addContact(dad);
        myContactManager.addContact(sheena);

      //  myContactManager.searchContact("Sheena");

        System.out.println(myContactManager.searchContact("Sheena").phoneNumber);
    }


}
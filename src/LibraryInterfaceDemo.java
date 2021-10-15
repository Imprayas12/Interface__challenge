interface LibraryUser{
    public void RegisterAccount();
    public void RequestBook();
}

class KidUsers implements LibraryUser{
    int age;
    String book_Type;
    KidUsers(int age,String book_Type){
        this.age = age;
        this.book_Type = book_Type;
    }
    @Override
    public void RegisterAccount() {
        if(age<12)
            System.out.println("You have successfully registered under a kids account");
        else System.out.println("Sorry, Age must be less than 12 to register as kid");
    }

    @Override
    public void RequestBook() {
        if(book_Type.equals("Kid")) System.out.println("Book issued successfully. Please return the book within 10 days");
        else System.out.println("Oops! You're allowed to take only kids books");
    }
}

class AdultUser implements LibraryUser {
    int age;
    String book_Type;
    AdultUser(int age,String book_Type){
        this.age = age;
        this.book_Type = book_Type;
    }

    @Override
    public void RegisterAccount() {
        if(age>12)
            System.out.println("You have successfully registered under an adults account");
        else System.out.println("Sorry, Age must be greater than 12 to register as Adult User");
    }

    @Override
    public void RequestBook() {
        if(book_Type.equals("Fiction")) System.out.println("Book issued successfully. Please return the book within 7 days");
        else System.out.println("Oops! You're allowed to take only adult fiction books");
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers obj1 = new KidUsers(10,"Kid");
        KidUsers obj2 = new KidUsers(18,"Fiction");
        AdultUser obj3 = new AdultUser(5,"Kid");
        AdultUser obj4 = new AdultUser(23,"Fiction");

        obj1.RegisterAccount();
        obj1.RequestBook();
        obj2.RegisterAccount();
        obj2.RequestBook();
        obj3.RegisterAccount();
        obj3.RequestBook();
        obj4.RegisterAccount();
        obj4.RequestBook();
    }
}

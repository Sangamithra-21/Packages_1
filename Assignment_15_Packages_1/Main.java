package Assignment_15_Packages_1;

import Assignment_15_Packages_1.books.Book;
import Assignment_15_Packages_1.members.Member;
import Assignment_15_Packages_1.transactions.Transaction;



public class Main {
    public static void main(String[] args) {
        Book b1=new Book("Rich dad poor dad","Robert T.Kiyosaki","isbn12320");
        Book b2=new Book("Python Course","Eric Matthes","isbn23775");

        Member m1=new Member("Abi","m123");
        Member m2=new Member("Kavi","m373");

        Transaction t1=new Transaction(m1,b1,10,25);
        Transaction t2=new Transaction(m2,b2,15,30);

        System.out.println(t1);
        System.out.println(t2);




    }
}

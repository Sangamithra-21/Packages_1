package Assignment_15_Packages_1.transactions;

import Assignment_15_Packages_1.books.Book;
import Assignment_15_Packages_1.members.Member;



public class Transaction {
    Member member;
    Book book;
    int dateIssued;
    int dateDue;

    public Transaction(Member member,Book book,int dateIssued,int dateDued)
    {
        this.member=member;
        this.book=book;
        this.dateIssued=dateIssued;
        this.dateDue=dateDued;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "member=" + member +
                ", book=" + book +
                ", dateIssued=" + dateIssued +
                ", dateDue=" + dateDue +
                '}';
    }
}

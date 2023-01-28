package aop;

import org.springframework.stereotype.Component;

@Component   //default id "uniLibrary"
public class UniLibrary extends AbstractLibrary{


    public void getBook(){

        System.out.println("we take the book from university: ");
    }

//    public void getBook(Book bookName){
//
//        System.out.println("we take the book from university: " + bookName.getName());
//    }

    public void returnBook(){
        System.out.println("we return book at university");
    }

    public void getMagazine(){
        System.out.println("we take the magazine from university");
    }

    public void returnMagazine(){
        System.out.println("we return magazine at university");
    }

    public void addBook(){
        System.out.println(" we add book at university");
    }

    public void addMagazine(){
        System.out.println(" we add magazine at university");
    }

}

package com.example.spring5webapp.bootstrap;

import com.example.spring5webapp.domain.Author;
import com.example.spring5webapp.domain.Book;
import com.example.spring5webapp.domain.Publisher;
import com.example.spring5webapp.repository.AuthorRepository;
import com.example.spring5webapp.repository.BookRepository;
import com.example.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author A = new Author("Leigh", "Bardugo");
        Book AA = new Book("Crooked Kingdom", "464749");
        Publisher AAA = new Publisher();
        AAA.setName("Harper Collins");
        AAA.setAddressLine1("195 Broadway");
        AAA.setCity("New York City");
        AAA.setState("New York");
        AAA.setZip("10007");
        AAA.getBooks().add(AA);

        A.getBooks().add(AA);
        AA.getAuthors().add(A);

        authorRepository.save(A);
        bookRepository.save(AA);
        publisherRepository.save(AAA);


        Author B = new Author("George", "Martin");
        Book BB = new Book("A dance with Dragons", "434446");

        B.getBooks().add(BB);
        BB.getAuthors().add(B);
        Publisher BBB = new Publisher();
        BBB.setName("Henry Holt and Company");
        BBB.setAddressLine1("120 Broadway");
        BBB.setCity("New York City");
        BBB.setState("New York");
        BBB.setZip("10271");
        BBB.getBooks().add(BB);

        authorRepository.save(B);
        bookRepository.save(BB);
        publisherRepository.save(BBB);

        System.out.println("Started bootstrap");
        System.out.println("AA number of books: " + bookRepository.count());
        System.out.println("AAA number of books: " + AAA.getBooks().size());


    }
}

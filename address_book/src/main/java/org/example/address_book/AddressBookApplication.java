package org.example.address_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AddressBookApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AddressBookApplication.class, args);
        AddressBookController controller = (AddressBookController) context.getBean("addressBookController");
    }

}

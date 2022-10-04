package ch.coop.unittesting.service;

import ch.coop.unittesting.dao.SomeDao;

public class GreetingsService {

    public String getGreeting() {
        SomeDao dao = new SomeDao();

        return "Hello " + dao.getNameFromDb();
    }

}

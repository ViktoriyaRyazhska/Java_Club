package com.team3.service;

public interface OrderService {
    void getTheMostPopularBook();

    void getTheMostUnpopularBook();

    void getHowManyBooksWereBeenReadByUser(Long id);

    void getHowManyBooksWereGivingInSelectedPeriod();
}

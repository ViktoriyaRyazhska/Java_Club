package com.team4.thebest.dao;

import com.team4.thebest.models.RentInfo;

public interface RentInfoDao {
    RentInfo findById(Long id);

    void save(RentInfo rentInfo);

    void deleteRentByBookId(Long bookId);

    void deleteRentByUserId(Long userId);

    void update(RentInfo rentInfo);

    RentInfo findByBookIdAndUserId(Long bookId, Long userId);
}

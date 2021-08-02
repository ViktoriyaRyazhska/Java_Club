package com.library.service.impl;

import com.library.entity.RentInfo;
import com.library.entity.RentStatus;
import com.library.repository.RentInfoRepository;
import com.library.service.RentInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentInfoServiceImpl implements RentInfoService {

    private final RentInfoRepository rentInfoRepository;

    public RentInfoServiceImpl(RentInfoRepository rentInfoRepository) {
        this.rentInfoRepository = rentInfoRepository;
    }

    @Override
    public RentInfo save(RentInfo rentInfo) {
        return rentInfoRepository.save(rentInfo);
    }

    @Override
    public RentInfo update(RentInfo rentInfo) {
        return rentInfoRepository.update(rentInfo);
    }

    @Override
    public void updateDebtors() {
        rentInfoRepository.updateDebtors();
    }

    @Override
    public RentInfo findById(Long id) {
        return rentInfoRepository.findById(id);
    }

    @Override
    public List<RentInfo> findAll() {
        return rentInfoRepository.findAll();
    }

    @Override
    public List<RentInfo> findByRentStatus(RentStatus rentStatus) {
        return rentInfoRepository.findByRentStatus(rentStatus);
    }

    @Override
    public RentInfo remove(Long id) {
        return rentInfoRepository.remove(id);
    }

    @Override
    public List<RentInfo> findByUserId(Long id) {
        return rentInfoRepository.findByUserId(id);
    }

}

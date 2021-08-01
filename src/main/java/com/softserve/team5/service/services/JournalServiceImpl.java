package com.softserve.team5.service.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.entity.Journal;
import com.softserve.team5.service.interfaces.JournalService;

@Service
@EnableTransactionManagement
public class JournalServiceImpl implements JournalService {
	
	
    @Override
    @Transactional
    public void create(Journal entity) {

    }

    @Override
    @Transactional
    public void update(Journal entity) {

    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public Journal getById(Long id) {
        return null;
    }
}

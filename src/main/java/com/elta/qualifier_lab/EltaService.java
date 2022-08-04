package com.elta.qualifier_lab;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public class EltaService {

    @Autowired
    private EltaDao mainDao;

    @Autowired
    private EltaDao backupDao;

    public void doWork() {
        mainDao.saveAll();
    }


    public void doBackup() {
        backupDao.saveAll();
    }
}

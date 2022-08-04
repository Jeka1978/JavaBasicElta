package com.elta.qualifier_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class EltaService {

    @Autowired
    @Mode(ModeType.MAIN)
    private EltaDao mainDao;

    @Autowired
    @Mode(ModeType.BACKUP)
    private EltaDao backupDao;

    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        mainDao.saveAll();
    }


    @Scheduled(fixedDelay = 3000)
//    @Scheduled(cron = "1/1 * * * * FRI")
    public void doBackup() {
        backupDao.saveAll();
    }
}







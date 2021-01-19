package Cursor.Homejob14.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RestController
public class Scheduling {


    @Scheduled(cron = "*/5 * * * * ?")
    public void getTheMainTime() {
        SimpleDateFormat time = new SimpleDateFormat(" HH:mm:ss.SSS");
        Date time1 = new Date();
        String checkDate = time.format(time1);
        System.out.println("Estimated time: " + checkDate);
    }
}



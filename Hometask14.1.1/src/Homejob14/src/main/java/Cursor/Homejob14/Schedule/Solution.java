ackage Cursor.Homejob14.Schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Solution {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext date = new AnnotationConfigApplicationContext(JavaConfig.class);

        Scheduling schedule = date.getBean(Scheduling.class);
        schedule.getTheMainTime();
    }
}

package Cursor.Homejob14.Schedule;

        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.scheduling.TaskScheduler;
        import org.springframework.scheduling.annotation.EnableScheduling;
        import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@EnableScheduling
@Configuration
@ComponentScan("Cursor.Homejob14")
public class JavaConfig {
    @Bean
    TaskScheduler scheduler() {
        return new ConcurrentTaskScheduler();

package ma.enset.springbootpatientmanager;

import ma.enset.springbootpatientmanager.entity.Patient;
import ma.enset.springbootpatientmanager.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootPatientManagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootPatientManagerApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(@Autowired PatientRepo patientRepo) {
        return args -> {
            Patient patient = Patient.builder()
                    .name("omar")
                    .email("omarkhabou6@gmail.com")
                    .build();
            patientRepo.save(patient);
        };
    }
}

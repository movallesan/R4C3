package com.cuatroa.retotres;
import com.cuatroa.retotres.model.Vegetarian;
import com.cuatroa.retotres.model.Order;
import com.cuatroa.retotres.model.User;
import com.cuatroa.retotres.repository.crud.OrderCrudRepository;
import com.cuatroa.retotres.repository.crud.UserCrudRepository;
import com.cuatroa.retotres.repository.crud.VegetarianCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private VegetarianCrudRepository crudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        crudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll(); 
    }
}

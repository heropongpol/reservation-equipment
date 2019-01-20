package com.example.demo;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ApplicationRunner init(Memberrepository memberrepository,
                           Reservationequipmentrepository reservationequipmentrepository, Equipmentrepository equipmentrepository
            , Typeequipmentrepository typeequipmentrepository , Brandequipmentrepository brandequipmentrepository,
                           Timereceiverepository timereceiverepository) {
        return args -> {



            Member e1 = new Member("hero");
            memberrepository.save(e1);

            Timereceive du1 = new Timereceive("รับ 9:00");
            Timereceive du2 = new Timereceive("รับ 12:00");
            Timereceive du3 = new Timereceive("รับ 18:00");
            timereceiverepository.save(du1);
            timereceiverepository.save(du2);
            timereceiverepository.save(du3);

            Typeequipment t1 = new Typeequipment("camera");
            Typeequipment t2 = new Typeequipment("lens");
            Typeequipment t3 = new Typeequipment("Flash");
            typeequipmentrepository.save(t1);
            typeequipmentrepository.save(t2);
            typeequipmentrepository.save(t3);

            Brandequipment b1 = new Brandequipment("Canon");
            Brandequipment b2 = new Brandequipment("nikon");
            Brandequipment b3 = new Brandequipment("sony");
            brandequipmentrepository.save(b1);
            brandequipmentrepository.save(b2);
            brandequipmentrepository.save(b3);


            Equipment equipment1 = new Equipment();
            equipment1.setEquipment_name("6D II");
            equipment1.setEquipment_price(900);
            equipment1.setTypeequipment(t1);
            equipment1.setBrandequipment(b1);
            equipmentrepository.save(equipment1);

            Equipment equipment2 = new Equipment();
            equipment2.setEquipment_name("D5");
            equipment2.setEquipment_price(1200);
            equipment2.setBrandequipment(b2);
            equipment2.setTypeequipment(t1);
            equipmentrepository.save(equipment2);

            Equipment equipment3 = new Equipment();
            equipment3.setEquipment_name("a7 iii");
            equipment3.setEquipment_price(1000);
            equipment3.setTypeequipment(t1);
            equipment3.setBrandequipment(b3);
            equipmentrepository.save(equipment3);

            Equipment equipment4 = new Equipment();
            equipment4.setEquipment_name("1dx");
            equipment4.setEquipment_price(1500);
            equipment4.setBrandequipment(b1);
            equipment4.setTypeequipment(t1);
            equipmentrepository.save(equipment4);

            Equipment equipment5 = new Equipment();
            equipment5.setEquipment_name("D850");
            equipment5.setEquipment_price(1500);
            equipment5.setBrandequipment(b2);
            equipment5.setTypeequipment(t1);
            equipmentrepository.save(equipment5);

            Equipment equipment6 = new Equipment();
            equipment6.setEquipment_name("a9");
            equipment6.setEquipment_price(1600);
            equipment6.setBrandequipment(b3);
            equipment6.setTypeequipment(t1);
            equipmentrepository.save(equipment6);

            Equipment equipment7 = new Equipment();
            equipment7.setEquipment_name("17-40 f2.8l is");
            equipment7.setEquipment_price(500);
            equipment7.setBrandequipment(b1);
            equipment7.setTypeequipment(t2);
            equipmentrepository.save(equipment7);

            Equipment equipment8 = new Equipment();
            equipment8.setEquipment_name("70-200 f2.8l is ii");
            equipment8.setEquipment_price(600);
            equipment8.setBrandequipment(b1);
            equipment8.setTypeequipment(t2);
            equipmentrepository.save(equipment8);

            Equipment equipment9 = new Equipment();
            equipment9.setEquipment_name("24-70 f2.8 vr nano ");
            equipment9.setEquipment_price(600);
            equipment9.setBrandequipment(b2);
            equipment9.setTypeequipment(t2);
            equipmentrepository.save(equipment9);

            Equipment equipment10 = new Equipment();
            equipment10.setEquipment_name("14-24 f4 vr ");
            equipment10.setEquipment_price(500);
            equipment10.setBrandequipment(b2);
            equipment10.setTypeequipment(t2);
            equipmentrepository.save(equipment10);

            Equipment equipment11 = new Equipment();
            equipment11.setEquipment_name("28-75 f2.8 tamron for sony");
            equipment11.setEquipment_price(500);
            equipment11.setBrandequipment(b3);
            equipment11.setTypeequipment(t2);
            equipmentrepository.save(equipment11);

            Equipment equipment12 = new Equipment();
            equipment12.setEquipment_name("70-200 f2.8 G-master");
            equipment12.setEquipment_price(500);
            equipment12.setBrandequipment(b3);
            equipment12.setTypeequipment(t2);
            equipmentrepository.save(equipment12);

            Equipment equipment13 = new Equipment();
            equipment13.setEquipment_name("ex-600rt");
            equipment13.setEquipment_price(300);
            equipment13.setBrandequipment(b1);
            equipment13.setTypeequipment(t3);
            equipmentrepository.save(equipment13);

            Equipment equipment14 = new Equipment();
            equipment14.setEquipment_name("SB-600");
            equipment14.setEquipment_price(300);
            equipment14.setBrandequipment(b2);
            equipment14.setTypeequipment(t3);
            equipmentrepository.save(equipment14);

            Equipment equipment15 = new Equipment();
            equipment15.setEquipment_name("hvl-f60m");
            equipment15.setEquipment_price(300);
            equipment15.setBrandequipment(b3);
            equipment15.setTypeequipment(t3);
            equipmentrepository.save(equipment15);





            Reservationequipment r1 = new Reservationequipment();
            reservationequipmentrepository.save(r1);
        };
    }
}
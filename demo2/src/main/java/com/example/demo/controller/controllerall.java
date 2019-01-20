package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class controllerall {
    @Autowired private Memberrepository memberrepository;
    @Autowired private Reservationequipmentrepository reservationequipmentrepository;
    @Autowired private Equipmentrepository equipmentrepository;
    @Autowired private Timereceiverepository timereceiverepository;


@GetMapping(path = "/Reservationequipment")
public Collection<Reservationequipment> reservationrepository() {
    return reservationequipmentrepository.findAll().stream().collect(Collectors.toList());
}
    @GetMapping(path = "/Member")
    public Collection<Member> memberrepository() {
    return memberrepository.findAll().stream().collect(Collectors.toList());

    }@GetMapping(path = "/Equipment")
    public Collection<Equipment> equipmentrepository() {
        return equipmentrepository.findAll().stream().collect(Collectors.toList());

    }@GetMapping(path = "/Timereceive")
    public Collection<Timereceive> timereceiverepository() {
        return timereceiverepository.findAll().stream().collect(Collectors.toList());
    }
        @PostMapping(path = "/reservationequipment/{daterent}/{timereceive}/{equipment}/{mem}")
    public Reservationequipment reservationequipment(
            @PathVariable Date daterent ,
                @PathVariable Long timereceive,@PathVariable Long equipment
                ,@PathVariable Long  mem){

        Member member1 = memberrepository.findById(mem).get();
        Timereceive timereceive1 = timereceiverepository.findById(timereceive).get();
        Equipment equipment1 = equipmentrepository.findById(equipment).get();

        Reservationequipment reservationequipment = new Reservationequipment();
        reservationequipment.setDaterent(daterent);
        reservationequipment.setMember(member1);
        reservationequipment.setTimereceive(timereceive1);
        reservationequipment.setEquipment(equipment1);

        reservationequipmentrepository.save(reservationequipment);
        return reservationequipment;
    }

}

import { Component, OnInit } from '@angular/core';
import { Controllerall } from '../controller/controllerall';

import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-reservation-equipment',
  templateUrl: './reservation-equipment.component.html',
  styleUrls: ['./reservation-equipment.component.css']
})
export class ReservationEquipmentComponent implements OnInit {
  private daterent:Date;


  equis: Array<any>;
  times: Array<any>;
  mems: Array<any>;


  equiSelect ='';
  timeSelect = '';
  memSelect = '';

  constructor(private controller: Controllerall,
              private httpClient: HttpClient){}



  ngOnInit() {
    this.controller.getMember().subscribe(data => {
      this.mems = data;
      console.log(this.mems);
    })

    this.controller.getEquipment().subscribe(data => {
      this.equis = data;
      console.log(this.equis);
    })
    this.controller.getTimereceive().subscribe(data => {
      this.times = data;
      console.log(this.times);
    });


  }
  insert() {
         if (this.daterent == null || this.timeSelect == null|| this.equiSelect == null|| this.memSelect == null) {
                alert('กรุณากรอกข้อมูลให้ครบ');

          }
          else{
    this.httpClient.post('http://localhost:3020/reservationequipment/ ' + this.daterent + '/' + this.timeSelect + '/' + this.equiSelect + '/' + this.memSelect , {})
      .subscribe(
        data => {
          console.log('PUT Request is successful', data);
        },
        error => {
          console.log('Error', error);
        }
      );
    alert('สำเร็จ');
  }

}
}



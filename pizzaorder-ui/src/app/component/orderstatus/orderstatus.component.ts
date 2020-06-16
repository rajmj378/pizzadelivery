import { OrderService } from './../../service/order.service';
import { OrderStatusResponse } from './../../model/orderstatus.response'
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-orderstatus',
  templateUrl: './orderstatus.component.html',
  styleUrls: ['./orderstatus.component.css']
})
export class OrderstatusComponent implements OnInit {

  response: OrderStatusResponse;
  phoneNumber: string;
  status: string;

  constructor(
    private orderService : OrderService
  ) { }

  ngOnInit(): void {
  }

  searchOrder() {
    this.getStatus();
  }

    getStatus() {
         this.orderService.getOrderStatus(this.phoneNumber)
             .subscribe((data: OrderStatusResponse) => {
               console.log(data);
               this.response = data;
               this.status = data.status;
               console.log(this.status);
             }, (err) => {
                 console.log("Error getting details. [" + err.status + "]");
             });
     }

}

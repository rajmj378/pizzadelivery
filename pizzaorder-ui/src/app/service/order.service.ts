import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  host : string = "http://localhost:8080/order"

  constructor(private http : HttpClient) { }

  getOrderStatus(phone : string){
    return this.http.get(this.host + "?phone=" + phone);
  }
}

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OrderstatusComponent } from './component/orderstatus/orderstatus.component';

const routes: Routes = [
  { path: '', component: OrderstatusComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LeadDTO } from './lead-dto';

@Injectable({
  providedIn: 'root'
})
export class LeadService {

  baseURL:string = 'http://localhost:9090';

allLeadsEndPoint : string= this.baseURL+'/lead/all';


submitMultiformEndPoint:string=this.baseURL+'/lead/add';


  constructor(private http:HttpClient) { }


  submitMultiform(multiform: LeadDTO): Observable<LeadDTO> {
    console.log("Inside submitMultiform method:", multiform);

    return this.http.post<LeadDTO>(this.submitMultiformEndPoint, multiform);
  }


  getAllLeadsFromSpring():Observable<LeadDTO[]>
  {
    console.log("inside service : "+this.allLeadsEndPoint);


    return this.http.get<LeadDTO[]>(`${this.allLeadsEndPoint}`);
  }
}

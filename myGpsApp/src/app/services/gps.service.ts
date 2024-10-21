import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GpsService {
  private apiUrl = 'http://localhost:8080/api/gps'; // URL du backend

  constructor(private http: HttpClient) {}

  getAllCoordinates(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}

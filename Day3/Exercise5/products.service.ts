import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../interfaces/product.interface';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  private jsonServerURL="http://localhost:3000/products";
  constructor(private httpClient: HttpClient) { }

    getProducts(): Observable<Product[]> {
      return this.httpClient.get<Product[]>(this.jsonServerURL);
    }
}


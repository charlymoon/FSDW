import { Component, OnInit } from '@angular/core';
import { ProductsService } from './services/products.service';
import { tap } from 'rxjs';
import { Product } from './interfaces/product.interface';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnInit {
  productList !: Product[];

  constructor(private queryService: ProductsService) { }

  ngOnInit(): void {
    this.queryService.getProducts().pipe(
      tap((actualProducts : Product[]) => this.productList=actualProducts)
    ).subscribe();
  }
}

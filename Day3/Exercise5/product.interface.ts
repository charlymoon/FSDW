import { AppRoutingModule } from "src/app/app-routing.module";

export interface Product{
    id: number;
    name: string;
    price: number;
    description: string;
    categoryId: number;
    stock: number;
}
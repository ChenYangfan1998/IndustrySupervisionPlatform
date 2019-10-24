export interface ProductVO {
  id: number,
  date: number,
  data: string
}


export interface UserServicesInterface {
  GetProductionById(): Promise<ProductVO>,

  UpdateProductionById(): Promise<ProductVO>,
}

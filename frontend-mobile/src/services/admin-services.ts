export interface AdminVO {
  id: number,
  wx_id: string,
  phone: string,
  password: string
}


export interface UserServicesInterface {
  InsertAdmin(): Promise<AdminVO>,

  UpdateAdminById(): Promise<AdminVO>,
}

export interface UserVO {
  id: number,
  wx_id: string,
  phone: string,
  password: string
}


export interface UserServicesInterface {
  GetUserById(): Promise<UserVO>,

  InsertUser(): Promise<UserVO>,

  UpdateUserById: Promise<UserVO>
}

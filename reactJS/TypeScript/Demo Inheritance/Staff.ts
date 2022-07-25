class Staff {
  private name: string;
  private age: number;
  private sex: string;
  private addres: string;

  constructor(name: string, age: number, sex: string, addres: string) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.addres = addres;
  }

  public getName(): string {
    return this.name;
  }

  public setName(value: string) {
    this.name = value;
  }

  public getAge(): number {
    return this.age;
  }

  public getSex(): string {
    return this.sex;
  }

  public getAddres(): string {
    return this.addres;
  }

  public setAge(value: number) {
    this.age = value;
  }

  public setSex(value: string) {
    this.sex = value;
  }

  public setAddres(value: string) {
    this.addres = value;
  }
}

export { Staff };

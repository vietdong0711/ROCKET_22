class Department {
  private id: number;
  private name: string;
  constructor(id: number, name: string) {
    this.id = id;
    this.name = name;
  }

  public getID(): number {
    return this.id;
  }

  public setID(value: number) {
    this.id = value;
  }

  public getName(): string {
    return this.name;
  }

  public setName(value: string) {
    this.name = value;
  }

  printInfo() {
    console.log("ID: ", this.id, ",  Name: ", this.name);
  }
}

var myName: string = "Hello";

function printInfoDepartment(department: Department) {
  console.log(department.getID(), "   ", department.getName());
}

export { Department, myName, printInfoDepartment };

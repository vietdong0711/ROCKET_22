import { Staff } from "./Staff";

class Worker extends Staff {
  private rank: number;

  constructor(name: string, age: number, sex: string, addres: string, rank: number) {
    super(name, age, sex, addres);
    this.rank = rank;
  }

  public getRank(): number {
    return this.rank;
  }

  public setRank(value: number) {
    this.rank = value;
  }

  printInfo(): void {
    console.log("Name: ", super.getName());
    console.log("Age: ", super.getAge());
    console.log("Sex: ", super.getSex());
    console.log("Address: ", super.getAddres());
    console.log("Rank: ", this.rank);
  }
}

function print(w: Worker) {
  console.log("Name: ", w.getName(), " Age: ", w.getAge(), " Rank: ", w.getRank());
}

var printf = (wo: Worker): void => {
  console.log("Name: ", wo.getName(), " Age: ", wo.getAge(), " Rank: ", wo.getRank());
};

export { Worker, printf };

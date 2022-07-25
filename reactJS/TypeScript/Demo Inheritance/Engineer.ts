import { Staff } from "./Staff";
class Engineer extends Staff {
  private step: number;

  constructor(name: string, age: number, sex: string, addres: string, step: number) {
    super(name, age, sex, addres);
    this.step = step;
  }

  public getStep(): number {
    return this.step;
  }

  public setStep(value: number) {
    this.step = value;
  }
}

export { Engineer };

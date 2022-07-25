import { Department, printInfoDepartment } from "./Department";

var department1 = new Department(1, "Sale");
var department2 = new Department(2, "Marketing");
var department3 = new Department(3, "BOD");
var department4 = new Department(4, "Kỹ thuật");

console.log("Thông tin khách hàng số 1");
department1.printInfo();

console.log("Thông tin khách hàng số 2");
printInfoDepartment(department2);

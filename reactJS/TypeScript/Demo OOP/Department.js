"use strict";
exports.__esModule = true;
exports.printInfoDepartment = exports.myName = exports.Department = void 0;
var Department = /** @class */ (function () {
    function Department(id, name) {
        this.id = id;
        this.name = name;
    }
    Department.prototype.getID = function () {
        return this.id;
    };
    Department.prototype.setID = function (value) {
        this.id = value;
    };
    Department.prototype.getName = function () {
        return this.name;
    };
    Department.prototype.setName = function (value) {
        this.name = value;
    };
    Department.prototype.printInfo = function () {
        console.log("ID: ", this.id, ",  Name: ", this.name);
    };
    return Department;
}());
exports.Department = Department;
var myName = "Hello";
exports.myName = myName;
function printInfoDepartment(department) {
    console.log(department.getID(), "   ", department.getName());
}
exports.printInfoDepartment = printInfoDepartment;

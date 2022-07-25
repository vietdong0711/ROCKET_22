"use strict";
exports.__esModule = true;
exports.Staff = void 0;
var Staff = /** @class */ (function () {
    function Staff(name, age, sex, addres) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.addres = addres;
    }
    Staff.prototype.getName = function () {
        return this.name;
    };
    Staff.prototype.setName = function (value) {
        this.name = value;
    };
    Staff.prototype.getAge = function () {
        return this.age;
    };
    Staff.prototype.getSex = function () {
        return this.sex;
    };
    Staff.prototype.getAddres = function () {
        return this.addres;
    };
    Staff.prototype.setAge = function (value) {
        this.age = value;
    };
    Staff.prototype.setSex = function (value) {
        this.sex = value;
    };
    Staff.prototype.setAddres = function (value) {
        this.addres = value;
    };
    return Staff;
}());
exports.Staff = Staff;

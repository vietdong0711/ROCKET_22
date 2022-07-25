"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.printf = exports.Worker = void 0;
var Staff_1 = require("./Staff");
var Worker = /** @class */ (function (_super) {
    __extends(Worker, _super);
    function Worker(name, age, sex, addres, rank) {
        var _this = _super.call(this, name, age, sex, addres) || this;
        _this.rank = rank;
        return _this;
    }
    Worker.prototype.getRank = function () {
        return this.rank;
    };
    Worker.prototype.setRank = function (value) {
        this.rank = value;
    };
    Worker.prototype.printInfo = function () {
        console.log("Name: ", _super.prototype.getName.call(this));
        console.log("Age: ", _super.prototype.getAge.call(this));
        console.log("Sex: ", _super.prototype.getSex.call(this));
        console.log("Address: ", _super.prototype.getAddres.call(this));
        console.log("Rank: ", this.rank);
    };
    return Worker;
}(Staff_1.Staff));
exports.Worker = Worker;
function print(w) {
    console.log("Name: ", w.getName(), " Age: ", w.getAge(), " Rank: ", w.getRank());
}
var printf = function (wo) {
    console.log("Name: ", wo.getName(), " Age: ", wo.getAge(), " Rank: ", wo.getRank());
};
exports.printf = printf;

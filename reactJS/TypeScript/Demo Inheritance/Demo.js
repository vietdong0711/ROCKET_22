"use strict";
exports.__esModule = true;
var Worker_1 = require("./Worker");
var woker1 = new Worker_1.Worker("Worker1", 30, "Male", "HN", 9);
var woker2 = new Worker_1.Worker("Worker2", 33, "Female", "SG", 8);
var woker3 = new Worker_1.Worker("Worker3", 27, "Male", "HN", 7);
var woker4 = new Worker_1.Worker("Worker4", 20, "Female", "HT", 6);
var workers;
workers = [woker1, woker2, woker3, woker4];
workers.forEach(function (e, key) {
    console.log("Thông tin worker thứ ", key + 1);
    e.printInfo();
    console.log("===========");
});
var workerSet = new Set();
workers.forEach(function (element) {
    workerSet.add(element);
});
workerSet.forEach(function (element) {
    console.log(element);
    console.log("===========");
});
console.log("w3");
(0, Worker_1.printf)(woker3);

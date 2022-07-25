import { Worker, printf } from "./Worker";

var woker1 = new Worker("Worker1", 30, "Male", "HN", 9);
var woker2 = new Worker("Worker2", 33, "Female", "SG", 8);
var woker3 = new Worker("Worker3", 27, "Male", "HN", 7);
var woker4 = new Worker("Worker4", 20, "Female", "HT", 6);

var workers: Worker[];
workers = [woker1, woker2, woker3, woker4];
workers.forEach((e, key) => {
  console.log("Thông tin worker thứ ", key + 1);
  e.printInfo();
  console.log("===========");
});

var workerSet = new Set();
workers.forEach((element) => {
  workerSet.add(element);
});

workerSet.forEach((element) => {
  console.log(element);
  console.log("===========");
});

console.log("w3");
printf(woker3);

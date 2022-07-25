import React from "react";
import { useState, useEffect } from "react";

function DemoFunction(props) {
  const [count, setCount] = useState(0);
  const [count1, setCount1] = useState(0);
  //1.Thay thees cho componentDidMount, componentDidUpdate
  // useEffect(() => {
  //   console.log("Call UseEffect");
  // });
  //2.//1.Thay thees cho componentDidMount
  // useEffect(() => {
  //   console.log("Call UseEffect");
  // }, []);
  //3.
  // useEffect(() => {
  //   console.log("Call UseEffect");
  //}, [count, count1]);
  //4. có thể khai báo nhiều useEffect
  // useEffect(() => {
  //   console.log("Call UseEffect count");
  //}, [count]);
  // useEffect(() => {
  //   console.log("Call UseEffect count1");
  //}, [ count1]);
  //5. thay thế cho componentWillUnMount
  // useEffect(() => {
  //   console.log("Call UseEffect");

  //   return () => {
  //     console.log("Call componentWillUnMount");
  //   };
  // });

  let handleClick = () => {
    setCount(count + 1);
  };
  let handleClick1 = () => {
    setCount1(count1 + 1);
  };
  return (
    <div>
      <div className="row">
        <div className="col-xs-5 col-sm-5 col-md-5 col-lg-5">
          <button type="button" onClick={handleClick} className="btn btn-danger">
            Click
          </button>
          <button type="button" onClick={handleClick1} className="btn btn-danger">
            Click1
          </button>
        </div>

        <div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
          <h1>Bạn đã click {count} lần</h1>
          <h1>Bạn đã click1 {count1} lần</h1>
        </div>
      </div>
    </div>
  );
}

export default DemoFunction;

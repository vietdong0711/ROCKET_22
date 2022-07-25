import React, { useContext } from "react";
import { DataContext } from "../../Context/DataContext";

function ChildComponent(props) {
  let data = useContext(DataContext);
  console.log(data);
  return <div></div>;
}

export default ChildComponent;

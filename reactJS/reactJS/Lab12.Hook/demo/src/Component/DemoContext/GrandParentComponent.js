import React from "react";
import { DataContext } from "../../Context/DataContext";
import ParentComponent from "./ParentComponent";

function GrandParentComponent(props) {
  let data = "Hello";
  return (
    <div>
      <DataContext.Provider value={data}>
        <ParentComponent />
      </DataContext.Provider>
    </div>
  );
}

export default GrandParentComponent;

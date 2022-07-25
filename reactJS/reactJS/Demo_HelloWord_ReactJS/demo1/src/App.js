import React from "react";
import "./App.css";

function App() {
  //  return React.createElement("div", null, React.createElement("h1", null, "HELLO VTI"));
  //let cssa = { color: "red" };
  let handleClick = () => {
    alert("Hello");
  };
  return (
    //jsx

    <div className="App">
      <h1>Hello</h1>
       <button type="button" onClick={handleClick} class="btn btn-danger">
         Click me
      </button>
    </div>
  );
}

export default App;

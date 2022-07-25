import React, { Component } from "react";

class LifeCycle extends Component {
  constructor(props) {
    super(props);
    console.log("1");
  }
  //
  render() {
    console.log("2");
    return <div>Hello VTI</div>;
  }
  //
  componentDidMount() {
    console.log("3");
  }
}

export default LifeCycle;

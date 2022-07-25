import "./App.css";
import LifeCycle from "./Components/LifeCycle";
import React, { Component } from "react";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      show: true,
    };
  }

  handleDelete = () => {
    this.setState({ show: false });
  };

  render() {
    let componentLifeCycle = "";
    if (this.state.show) {
      componentLifeCycle = <LifeCycle />;
    }
    return (
      <div className="App">
        {componentLifeCycle}

        <button type="button" className="btn btn-default" onClick={this.handleDelete}>
          Delete Component
        </button>
      </div>
    );
  }
}

export default App;

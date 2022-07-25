import React, { Component } from "react";

class DemoClass extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
  }
  handleClick = () => {
    this.setState({
      count: this.state.count + 1,
    });
  };

  render() {
    return (
      <div>
        <div className="row">
          <div className="col-xs-5 col-sm-5 col-md-5 col-lg-5">
            <button type="button" onClick={this.handleClick} className="btn btn-danger">
              Click
            </button>
          </div>

          <div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
            <h1>Bạn đã click {this.state.count} lần</h1>
          </div>
        </div>
      </div>
    );
  }
}

export default DemoClass;

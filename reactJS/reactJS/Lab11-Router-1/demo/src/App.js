import "./App.css";
import Home from "./Component/Home";
import { Route, Routes, Link } from "react-router-dom";

function App() {
  return (
    <div className="container">
      {/* Menu */}

      <nav className="navbar navbar-inverse">
        <ul className="nav navbar-nav">
          <li className="">
            <Link to={"/home"}>Home</Link>
          </li>
          <li>
            <a href="#">About</a>
          </li>
          <li>
            <a href="#">AccountManagement</a>
          </li>
          <li>
            <a href="#">DepartmentManagement</a>
          </li>
        </ul>
        <ul className="nav navbar-nav navbar-right">
          <li>
            <a href="#">
              <span className="glyphicon glyphicon-user"></span> Sign Up
            </a>
          </li>
          <li>
            <a href="#">
              <span className="glyphicon glyphicon-log-in"></span> Login
            </a>
          </li>
        </ul>
      </nav>

      {/* Content */}
      <Routes>
        <Route path="/home" element={<Home />} />
        {/* <Route path="/home" element={<About />} />
        <Route path="/home" element={<Home />} /> */}
      </Routes>
    </div>
  );
}

export default App;

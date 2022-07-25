import React from "react";
import { NavLink } from "react-router-dom";

function Menu(props) {
  return (
    <div>
      <nav className="navbar navbar-inverse">
        <ul className="nav navbar-nav">
          <li className="">
            <NavLink to={"/home"}>Home</NavLink>
          </li>
          <li>
            <NavLink to={"/about"}>About</NavLink>
          </li>
          <li>
            <NavLink to={"/accountManagement"}>AccountManagement</NavLink>
          </li>
          <li>
            <NavLink to={"/accountDepartment"}>DepartmentManagement</NavLink>
          </li>
        </ul>
        <ul className="nav navbar-nav navbar-right">
          <li>
            <NavLink to={"/signUp"}>
              <span className="glyphicon glyphicon-user"></span> Sign Up
            </NavLink>
          </li>
          <li>
            <NavLink to={"/login"}>
              <span className="glyphicon glyphicon-log-in"></span> Login
            </NavLink>
          </li>
        </ul>
      </nav>
    </div>
  );
}

export default Menu;

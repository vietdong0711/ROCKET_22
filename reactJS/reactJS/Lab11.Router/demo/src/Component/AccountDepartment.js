import React, { useEffect } from "react";
import { useNavigate } from "react-router-dom";

function AccountDepartment(props) {
  let navigate = useNavigate();
  useEffect(() => {
    //check login
    let user_login = JSON.parse(localStorage.getItem("use_login"));
    if (!user_login) {
      navigate("/login");
    }
  }, []);
  return (
    <div>
      <h1>This is AccountDepartment page</h1>
    </div>
  );
}

export default AccountDepartment;

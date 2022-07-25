import React, { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";

function AccountManagement(props) {
  let [listAccount, setListAccount] = useState([]);
  let navigate = useNavigate();
  useEffect(() => {
    //check login
    let user_login = JSON.parse(localStorage.getItem("use_login"));
    if (!user_login) {
      navigate("/login");
    }

    let listAccounts_API_FAKE = [
      {
        ID: "1",
        Email: "Email1@gmail.com",
      },
      {
        ID: "2",
        Email: "Email2@gmail.com",
      },
      {
        ID: "3",
        Email: "Email3@gmail.com",
      },
      {
        ID: "4",
        Email: "Email4@gmail.com",
      },
    ];
    setListAccount(listAccounts_API_FAKE);
  }, []);
  let rowItem = listAccount.map((account, index) => {
    let url = "/accountDetail/" + account.ID;
    return (
      <tr>
        <td>{account.ID}</td>
        <td>
          <Link to={url}> {account.Email}</Link>
        </td>
      </tr>
    );
  });
  return (
    <div class="container">
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
          <table class="table table-hover">
            <thead>
              <tr>
                <th>ID</th>
                <th>Email</th>
              </tr>
            </thead>
            <tbody>
              {/* <tr>
                <td>1</td>
                <td>1@gmail.com</td>
              </tr> */}
              {rowItem}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
}

export default AccountManagement;

import React from "react";
import { useParams } from "react-router-dom";

function AccountDetail(props) {
  let param = useParams();
  let idLink = param.ID;
  console.log("id: ", idLink);
  return (
    <div class="container">
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
          <table class="table table-hover">
            <thead>
              <tr>
                <th>ID</th>
                <th>Email</th>
                <th>Username</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>1@gmail.com</td>
                <td>Username1</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
}

export default AccountDetail;

import React from "react";
import { Button } from "reactstrap";
import { useSelector } from "react-redux";

function ResultFormItem(props) {
  let {} = props;
  let rowItem;
  // console.log(listAccount);

  let stateRedux = useSelector((state) => state);
  let listAccount = stateRedux.listAccount;
  let handleDelete = (id) => {
    props.onHandleDeleteAccount(id);
  };

  let handleEdit = (account) => {
    props.onHandleEdit(account);
  };

  if (listAccount != null) {
    rowItem = listAccount.map((account, index) => {
      return (
        <tr>
          <td>{account.id}</td>
          <td>{account.email}</td>
          <td>{account.username}</td>
          <td>{account.fullname}</td>
          <td>{account.department}</td>
          <td>{account.position}</td>
          <td>{account.createDate}</td>
          <td>
            <Button color="warning" onClick={() => handleEdit(account)}>
              Edit
            </Button>
          </td>
          <td>
            <Button color="warning" onClick={() => handleDelete(account.id)}>
              Delete
            </Button>
          </td>
        </tr>
      );
    });
  }

  return rowItem;
}

//

export default ResultFormItem;

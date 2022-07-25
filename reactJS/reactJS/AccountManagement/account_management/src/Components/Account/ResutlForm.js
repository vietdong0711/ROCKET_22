import React from "react";
import ResultFormItem from "./ResultFormItem";
import { Container, Table } from "reactstrap";

function ResutlForm(props) {
  let { listAccount } = props;
  // console.log(listAccount);
  return (
    <Container>
      <br />
      <h2>Danh sách Account</h2>
      <Table hover>
        <thead>
          <tr>
            <th>ID</th>
            <th>Email</th>
            <th>Username</th>
            <th>Fullname</th>
            <th>Department</th>
            <th>Position</th>
            <th>Create Date</th>
            <th>Edit</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody>
          <ResultFormItem listAccount={listAccount} onHandleDeleteAccount={props.onHandleDeleteAccount} onHandleEdit={props.onHandleEdit} />
        </tbody>
      </Table>
    </Container>
  );
}

export default ResutlForm;

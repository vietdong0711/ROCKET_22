import React, { useState } from "react";
import { useSelector } from "react-redux";
import { Button, Container, Form, FormGroup, Input, Label } from "reactstrap";
import { genericID } from "../../../Utils/Helper/generateId";
import { getNowDate } from "../../../Utils/Helper/getNowDate";

function InputForm(props) {
  let [Email, setEmail] = useState("");
  let [Username, setUsername] = useState("");
  let [Fullname, setFullname] = useState("");
  let [Department, setDepartment] = useState("");
  let [Position, setPosition] = useState("");

  let handleReset = () => {
    setEmail("");
    setFullname("");
    setUsername("");
  };

  let stateRedux = useSelector((state) => state);
  let listDepartment = stateRedux.listDepartment;
  let listPosition = stateRedux.listPosition;

  let departmentItems = listDepartment.map((department, index) => {
    return <option value={department.id}>{department.name}</option>;
  });

  let positionItems = listPosition.map((position, index) => {
    return <option value={position.id}>{position.name}</option>;
  });
  // console.log("listDepartment", props.listDepartment);
  // console.log("listPosition", props.listPosition);

  let handleCreate = () => {
    let account = {
      id: genericID(),
      email: Email,
      username: Username,
      fullname: Fullname,
      department: Department,
      position: Position,
      createDate: getNowDate(),
    };

    props.handleCreateAccount(account);
    props.isOpen(false);
  };
  return (
    <Container>
      <Form>
        {/* Email */}
        <FormGroup>
          <Label>Email</Label>
          <Input
            id="Email"
            name="Email"
            value={Email}
            type="email"
            placeholder="Input Email"
            onChange={(event) => {
              setEmail(event.target.value);
            }}
          />
        </FormGroup>
        {/* Username */}
        <FormGroup>
          <Label>Username</Label>
          <Input
            id="Username"
            name="Username"
            value={Username}
            type="text"
            placeholder="Input Username"
            onChange={(event) => {
              setUsername(event.target.value);
            }}
          />
        </FormGroup>
        {/* Fullname */}
        <FormGroup>
          <Label>Fullname</Label>
          <Input
            id="Fullname"
            name="Fullname"
            value={Fullname}
            type="text"
            placeholder="Input Fullname"
            onChange={(event) => {
              setFullname(event.target.value);
            }}
          />
        </FormGroup>
        {/* Department */}
        <FormGroup>
          <Label>Select a Department</Label>
          <Input
            id="Department"
            name="Department"
            type="select"
            value={Department}
            onChange={(event) => {
              setDepartment(event.target.value);
            }}
          >
            <option value={"0"}>--- Chose Department ---</option>
            {departmentItems}
            {/* <option value={"Bán hàng"}>Bán hàng</option>
            <option value={"Bảo vệ"}>Bảo vệ</option>
            <option value={"Giám đốc"}>Giám đốc</option>
            <option value={"Sale"}>Sale</option>
            <option value={"Marketing"}>Marketing</option> */}
          </Input>
        </FormGroup>
        {/* Position */}
        <FormGroup>
          <Label>Select a Position</Label>
          <Input
            id="Position"
            name="Position"
            value={Position}
            type="select"
            onChange={(event) => {
              setPosition(event.target.value);
            }}
          >
            <option value={"0"}>--- Chose Position ---</option>
            {positionItems}
            {/* <option value={"Dev"}>Dev</option>
            <option value={"Test"}>Test</option>
            <option value={"Scrum_Master"}>Scrum_Master</option>
            <option value={"PM"}>PM</option> */}
          </Input>
        </FormGroup>
      </Form>

      {/* Nút xử li */}
      <Button color="primary" onClick={handleCreate}>
        Create
      </Button>
      <Button color="danger" onClick={handleReset}>
        Reset
      </Button>
    </Container>
  );
}

export default InputForm;

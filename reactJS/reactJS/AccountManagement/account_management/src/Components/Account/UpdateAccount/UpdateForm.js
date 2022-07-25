import React, { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { Container, Button, Form, FormGroup, Label, Input } from "reactstrap";

function UpdateForm(props) {
  // Gọi lại các props từ bên trên truyền xuống
  let {} = props;

  let stateRedux = useSelector((state) => state);
  let listDepartment = stateRedux.listDepartment;
  let listPosition = stateRedux.listPosition;

  // Khai báo State lưu trữ giá trị của các ô nhập liệu
  let [Fullname, SetFullname] = useState("");
  let [Department, SetDepartment] = useState("");
  let [Postion, SetPostion] = useState("");

  let accountUpdate = stateRedux.formUpdate.accountUpdateInfo;
  let departmentID;
  let positionID;

  if (accountUpdate != null) {
    departmentID = listDepartment.find((department) => department.name === accountUpdate.department).id;
    positionID = listPosition.find((position) => position.name === accountUpdate.position).id;
  }

  useEffect(() => {
    SetFullname(accountUpdate.fullname);
    SetDepartment(departmentID);
    SetPostion(positionID);
  }, []);

  // Hàm xử lý khi click vào nút Create
  let handleUpdate = () => {
    let accountUpdate = {
      fullname: Fullname,
      departmentId: Department,
      positionId: Postion,
    };
    //
    // console.log("handleUpdate: ", accountUpdate);
    props.onHandleUpdate(accountUpdate);
  };

  // Hàm xử lý khi click vào nút Reset
  let handleReset = () => {
    SetFullname(accountUpdate.fullname);
    SetDepartment(departmentID);
    SetPostion(positionID);
  };
  // Hiển thị danh sách Department
  let departmentItem = listDepartment.map((department, index) => {
    return (
      <option value={department.id} key={index}>
        {department.name}
      </option>
    );
  });
  // Hiển thị danh sách Position
  let positionItem = listPosition.map((position, index) => {
    return (
      <option value={position.id} key={index}>
        {position.name}
      </option>
    );
  });
  //
  return (
    <Container>
      <Form>
        {/* Fullname */}
        <FormGroup>
          <Label for="Fullname">Fullname: </Label>
          <Input
            id="Fullname"
            placeholder="Input Fullname"
            type="text"
            name="Fullname"
            value={Fullname}
            onChange={(event) => {
              SetFullname(event.target.value);
            }}
          />
        </FormGroup>

        {/* Department */}
        <FormGroup>
          <Label for="Department">Select a Department: </Label>
          <Input
            id="Department"
            name="Department"
            type="select"
            value={Department}
            onChange={(event) => {
              SetDepartment(event.target.value);
            }}
          >
            {departmentItem}
          </Input>
        </FormGroup>

        {/* Postion */}
        <FormGroup>
          <Label for="Postion">Select a Postion: </Label>
          <Input
            id="Postion"
            name="Postion"
            type="select"
            value={Postion}
            onChange={(event) => {
              SetPostion(event.target.value);
            }}
          >
            {positionItem}
          </Input>
        </FormGroup>
      </Form>
      {/* Nút xử lý */}
      <Button color="primary" onClick={handleUpdate}>
        Update
      </Button>
      <Button color="danger" onClick={handleReset}>
        Reset
      </Button>
    </Container>
  );
}

export default UpdateForm;

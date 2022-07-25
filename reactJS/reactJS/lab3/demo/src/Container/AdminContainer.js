import React from "react";
import { Container } from "reactstrap";
import ResultForm from "../Components/Admin/ResultForm";
import CreateButton from "./../Components/Admin/CreateButton";

function AdminContainer(props) {
  return (
    <Container>
      {/* Nút thêm mới */}
      <CreateButton />
      {/* Form kết quả */}
      <ResultForm></ResultForm>
    </Container>
  );
}

export default AdminContainer;

import React from "react";
import { useSelector } from "react-redux";
import { Button, Modal, ModalHeader, ModalBody, ModalFooter, Container } from "reactstrap";
import UpdateForm from "./UpdateForm";

function ModalUpdateAccount(props) {
  // Gọi lại các props truyền từ bên ngoài vào
  let {} = props;
  // Lấy giá trị State đang lưu trên Redux để sử dụng
  let stateRedux = useSelector((state) => state);
  // Hàm xử lý khi nhấn nút Close
  let handleCloseModal = () => {
    props.onHandleCloseFormUpdate();
  };
  //
  return (
    <Container>
      <br />
      <Modal isOpen={stateRedux.formUpdate.isShowFormUpdate}>
        <ModalHeader>
          <h3>Update Account</h3>
        </ModalHeader>
        <ModalBody>
          <UpdateForm onHandleUpdate={props.onHandleUpdate} />
        </ModalBody>
        <ModalFooter>
          <Button color="danger" onClick={handleCloseModal}>
            Close
          </Button>
        </ModalFooter>
      </Modal>
    </Container>
  );
}

export default ModalUpdateAccount;

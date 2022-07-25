import React from "react";
import { Button, Container, Modal, ModalBody, ModalFooter, ModalHeader } from "reactstrap";
import rootReducers from "../../../Redux/Reducer/RootReducer";
import InputForm from "./InputForm";
import { useSelector } from "react-redux";

function ModalCreateNewAccount(props) {
  let handleClose = () => {
    props.HandleClose();
  };
  let stateRedux = useSelector((state) => state);
  let showForm = stateRedux.showForm;
  return (
    <Container>
      <br />
      <Modal isOpen={showForm}>
        <ModalHeader>
          <h3>Creat New Account</h3>
        </ModalHeader>
        <ModalBody>
          <InputForm
            isOpen={props.isOpen}
            handleCreateAccount={props.handleCreateAccount}
            listDepartment={props.listDepartment}
            listPosition={props.listPosition}
          />
        </ModalBody>
        <ModalFooter>
          <Button color="danger" onClick={handleClose}>
            Close
          </Button>
        </ModalFooter>
      </Modal>
    </Container>
  );
}

export default ModalCreateNewAccount;

import React from "react";
import { Button, Container } from "reactstrap";

function CreateButton(props) {
  let { HandleClick } = props;
  let handleCreateNewAccount = () => {
    HandleClick();
  };
  return (
    <Container>
      <br />
      <Button color="primary" onClick={handleCreateNewAccount}>
        Create Account
      </Button>
    </Container>
  );
}

export default CreateButton;

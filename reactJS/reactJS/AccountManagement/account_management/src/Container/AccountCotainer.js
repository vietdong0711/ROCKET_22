import React, { useEffect } from "react";
import { Container } from "reactstrap";
import ModalCreateNewAccount from "../Components/Account/CreateAccount/ModalCreateNewAccount";
import CreateButton from "../Components/Account/CreateButton";
import ResutlForm from "../Components/Account/ResutlForm";
import { getListAccountAPI } from "../API/AccountAPI";
import { getListPositionAPI } from "../API/PositionAPI";
import { getListDepartmentAPI } from "../API/DepartmentAPI";
import { useDispatch, useSelector } from "react-redux";
import { actionCloseForm, actionShowForm } from "../Redux/Action/FormAction";
import {
  actionAddAccountAPI,
  actionDeleteAccountAPI,
  actionFecthListAccountAPI,
  actionFetchAccountUpdateInfoRedux,
  actionTogleRedux,
  actionUpdateAccountAPI,
} from "../Redux/Action/AccountAction";
import { actionFecthListDepartmentAPI } from "../Redux/Action/DepartmentAction";
import { actionFecthListPositionAPI } from "../Redux/Action/PositionAction";
import ModalUpdateAccount from "../Components/Account/UpdateAccount/ModalUpdateAccount";

function AccountCotainer(props) {
  // let [listAccount, setListAccount] = useState([]);
  // let [listDepartment, setListDepartment] = useState([]);

  // let [listPosition, setListPosition] = useState([]);

  let dispatchRedux = useDispatch();
  let stateRedux = useSelector((state) => state);

  // const [open, setOpen] = useState(false);
  let HandleClick = () => {
    // setOpen(open);
    console.log("Mở");
    dispatchRedux(actionShowForm());
  };

  let HandleClose = () => {
    // setOpen(open);
    console.log("Đóng");
    dispatchRedux(actionCloseForm());
  };

  let onHandleCreateNewAccount = (accountNew) => {
    let accountNewAPI = {
      email: accountNew.email,
      username: accountNew.username,
      fullname: accountNew.fullname,
      departmentId: accountNew.department,
      positionId: accountNew.position,
    };
    // console.log(accountNewAPI);

    // addAccountAPI(accountNewAPI).then((response) => {
    //   fectListAccount();
    //   alert(response);
    // });

    dispatchRedux(actionAddAccountAPI(accountNewAPI));
    alert("Thêm mới thành công");
    dispatchRedux(actionCloseForm());
  };

  let onHandleDeleteAccount = (id) => {
    dispatchRedux(actionDeleteAccountAPI(id));
  };

  let fectListAccount = () => {
    getListAccountAPI().then((response) => {
      // setListAccount(response);
    });
  };

  let fectListDepartment = () => {
    getListDepartmentAPI().then((response) => {
      // setListDepartment(response);
    });
  };

  let fectListPosition = () => {
    getListPositionAPI().then((response) => {
      // setListPosition(response);
    });
  };

  useEffect(() => {
    dispatchRedux(actionFecthListAccountAPI());
    dispatchRedux(actionFecthListDepartmentAPI());
    dispatchRedux(actionFecthListPositionAPI());
  }, []);

  let onHandleEdit = (account) => {
    // console.log(account);
    // dispatchRedux(actionFetchAccountUpdateInfoRedux(account));
    dispatchRedux(actionTogleRedux(account));
  };

  let onHandleCloseFormUpdate = () => {
    // console.log("close");
    dispatchRedux(actionTogleRedux());
  };

  let onHandleUpdate = (accountUpdate) => {
    // console.log("accountUpdate", accountUpdate);
    let id = stateRedux.formUpdate.accountUpdateInfo.id;
    dispatchRedux(actionUpdateAccountAPI(id, accountUpdate));
    dispatchRedux(actionTogleRedux());
  };

  return (
    <Container>
      <CreateButton HandleClick={HandleClick} />
      <ModalCreateNewAccount HandleClose={HandleClose} handleCreateAccount={onHandleCreateNewAccount} />
      {/* Form Update Account*/}
      <ModalUpdateAccount onHandleUpdate={onHandleUpdate} onHandleCloseFormUpdate={onHandleCloseFormUpdate} />
      <ResutlForm onHandleDeleteAccount={onHandleDeleteAccount} onHandleEdit={onHandleEdit} />
    </Container>
  );
}

export default AccountCotainer;

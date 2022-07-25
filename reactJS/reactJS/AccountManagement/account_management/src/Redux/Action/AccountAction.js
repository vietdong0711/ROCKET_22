import { addAccountAPI, deleteAccountAPI, getListAccountAPI, updateAccountAPI } from "../../API/AccountAPI";
import { DELETE_ACCOUNT, FETCH_ACCOUNT_LIST, FETCH_ACCOUNT_UPDATE_INFO, TOGLE_FORM_UPDATE } from "../Contants/ActionType";

//action call API, đưa dữ liệu vào redux
export let actionFecthListAccountAPI = () => {
  return (dispatch) => {
    return getListAccountAPI().then((list) => {
      // list ===> listAccount redux
      // dispatch
      dispatch(actionFecthListAccountRedux(list));
    });
  };
};

export let actionFecthListAccountRedux = (list) => {
  return {
    type: FETCH_ACCOUNT_LIST,
    payload: list,
  };
};

export let actionAddAccountAPI = (accountNew) => {
  return (dispatch) => {
    return addAccountAPI(accountNew).then((respone) => {
      // list ===> listAccount redux
      // dispatch
      dispatch(actionFecthListAccountAPI());
    });
  };
};

export let actionDeleteAccountAPI = (id) => {
  return (dispatch) => {
    return deleteAccountAPI(id).then((respone) => {
      alert(respone);
      dispatch(actionDeleteAccountRedux(id));
    });
  };
};

export let actionDeleteAccountRedux = (id) => {
  return {
    type: DELETE_ACCOUNT,
    payload: id,
  };
};

export let actionTogleRedux = (account) => {
  return {
    type: TOGLE_FORM_UPDATE,
    payload: account,
  };
};

export let actionFetchAccountUpdateInfoRedux = (account) => {
  return {
    type: FETCH_ACCOUNT_UPDATE_INFO,
    payload: account,
  };
};

export let actionUpdateAccountAPI = (id, account) => {
  return (dispatch) => {
    return updateAccountAPI(id, account).then((respone) => {
      alert(respone);
      // dispatch(actionDeleteAccountRedux(id));
      dispatch(actionFecthListAccountAPI());
    });
  };
};

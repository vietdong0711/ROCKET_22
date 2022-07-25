import { createStore } from "redux";

//Bước 3: Khai báo các state cần quản lí
let initialState = {
  isShowForm: false,
  listAccount: [],
};

//Bước 2 tạo reducer
let reducer = (state = initialState, action) => {
  switch (action.type) {
    case "SHOW_INPUT_FORM":
      return {
        ...state,
        isShowForm: true,
      };
    case "CLOSE_FORM":
      return {
        ...state,
        isShowForm: false,
      };
    case "ADD_ACCOUNT":
      let list = state.listAccount;
      list.push(action.account);
      return {
        ...state,
        listAccount: list,
      };
    case "GET_ALL_ACCOUNT":
      return {
        ...state,
      };
    default:
      return state;
  }
};

//Buoc1: Tạo store redux
let store = createStore(reducer);

//DEMO
//Bước 4: tạo ra acction
let acctionShowForm = {
  type: "SHOW_INPUT_FORM",
};
//Thực hiện dispatch
store.dispatch(acctionShowForm);
console.log(store.getState());

//ĐÓng form
let acctionCloseForm = {
  type: "CLOSE_FORM",
};
//Thực hiện đóng form
store.dispatch(acctionCloseForm);
console.log(store.getState());

let actionAddAcount = {
  type: "ADD_ACCOUNT",
  account: {
    id: 1,
    username: "abc",
    fullname: "abc1",
  },
};
store.dispatch(actionAddAcount);
console.log("state sau khi sua la: ", store.getState());

let actionGetListAccount = {
  type: "GET_ALL_ACCOUNT",
};
store.dispatch(actionGetListAccount);
console.log("state sau khi get all la: ", store.getState());

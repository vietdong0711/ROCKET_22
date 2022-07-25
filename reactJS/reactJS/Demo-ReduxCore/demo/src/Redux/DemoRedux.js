import { createStore } from "redux";
import { actionAddAccount, actionCloseForm, actionShowForm } from "./Actions/ActionRedux";
import { SHOW_INPUT_FORM } from "./Contants/ActionType";
import rootReducers from "./Reducers/rootReducers";

let storeRedux = createStore(rootReducers);

console.log("State ban đầu: ", storeRedux.getState());

//Thực hiện mở form
storeRedux.dispatch(actionShowForm());
console.log("State sau khi mở form", storeRedux.getState());

//Thực hiện đóng form
storeRedux.dispatch(actionCloseForm());
console.log("State sau khi mở form", storeRedux.getState());

account = {
  id: 1,
  username: "abc",
  fullname: "abc1",
};
//Thực hiện thêm account
storeRedux.dispatch(actionAddAccount(account));
console.log("State sau khi mở form", storeRedux.getState());

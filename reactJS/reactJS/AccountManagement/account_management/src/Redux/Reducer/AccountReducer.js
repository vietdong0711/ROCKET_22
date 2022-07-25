import { DELETE_ACCOUNT, FETCH_ACCOUNT_LIST } from "../Contants/ActionType";

let initialState = [];

let accountReducer = (state = initialState, action) => {
  switch (action.type) {
    case FETCH_ACCOUNT_LIST:
      let listAccountAPI = action.payload;
      return listAccountAPI;

    case DELETE_ACCOUNT:
      let id = action.payload;
      let list = state;
      let indexDel = list.findIndex((account) => account.id === id);
      list.splice(indexDel, 1);
      return list;
    default:
      return [...state];
  }
};

export default accountReducer;

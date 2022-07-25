import { ADD_ACCOUNT, GET_ALL_ACCOUNT } from "../Contants/ActionType";

let initialState = {
  listAccount: [],
};

let accountReducer = (state = initialState, action) => {
  switch (action.type) {
    case ADD_ACCOUNT:
      let list = state.listAccount;
      list.push(action.account);
      return {
        ...state,
        listAccount: list,
      };
    case GET_ALL_ACCOUNT:
      return {
        ...state,
      };
    default:
      return state;
  }
};

export default accountReducer;

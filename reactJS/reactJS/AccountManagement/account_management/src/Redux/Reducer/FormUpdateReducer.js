import { FETCH_ACCOUNT_UPDATE_INFO, TOGLE_FORM_UPDATE } from "../Contants/ActionType";

let initialState = {
  isShowFormUpdate: false,
  accountUpdateInfo: {},
};

let formUpdateReducer = (state = initialState, action) => {
  switch (action.type) {
    case TOGLE_FORM_UPDATE:
      return { ...state, isShowFormUpdate: !state.isShowFormUpdate, accountUpdateInfo: action.payload };

    case FETCH_ACCOUNT_UPDATE_INFO:
      return { ...state, accountUpdateInfo: action.payload };
    default:
      return state;
  }
};

export default formUpdateReducer;

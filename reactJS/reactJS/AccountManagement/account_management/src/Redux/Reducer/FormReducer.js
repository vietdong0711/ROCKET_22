import { SHOW_FORM, CLOSE_FORM } from "../Contants/ActionType";

let initialState = false;

let formReducer = (state = initialState, action) => {
  switch (action.type) {
    case SHOW_FORM:
      return true;

    case CLOSE_FORM:
      return false;

    default:
      return state;
  }
};

export default formReducer;

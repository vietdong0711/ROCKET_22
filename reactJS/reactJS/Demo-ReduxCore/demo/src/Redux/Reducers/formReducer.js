import { CLOSE_FORM, SHOW_INPUT_FORM } from "../Contants/ActionType";

let initialState = {
  isShowForm: false,
};

let formReducer = (state = initialState, action) => {
  switch (action.type) {
    case SHOW_INPUT_FORM:
      return {
        ...state,
        isShowForm: true,
      };
    case CLOSE_FORM:
      return {
        ...state,
        isShowForm: false,
      };
    default:
      return state;
  }
};

export default formReducer;

import { FETCH_POSITION_LIST } from "../Contants/ActionType";

let initialState = [];

let positionReducer = (state = initialState, action) => {
  switch (action.type) {
    case FETCH_POSITION_LIST:
      let listPositionAPI = action.payload;
      return listPositionAPI;

    default:
      return [...state];
  }
};

export default positionReducer;

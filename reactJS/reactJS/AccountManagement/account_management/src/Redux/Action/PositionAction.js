import { getListPositionAPI } from "../../API/PositionAPI";
import { FETCH_POSITION_LIST } from "../Contants/ActionType";

//action call API, đưa dữ liệu vào redux
export let actionFecthListPositionAPI = () => {
  return (dispatch) => {
    return getListPositionAPI().then((list) => {
      // list ===> listAccount redux
      // dispatch
      dispatch(actionFecthListPositionRedux(list));
    });
  };
};

export let actionFecthListPositionRedux = (list) => {
  return {
    type: FETCH_POSITION_LIST,
    payload: list,
  };
};

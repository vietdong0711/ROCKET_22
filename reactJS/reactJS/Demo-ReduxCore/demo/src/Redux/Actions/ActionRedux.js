import { CLOSE_FORM, SHOW_INPUT_FORM } from "../Contants/ActionType";

export let actionShowForm = () => {
  return {
    type: SHOW_INPUT_FORM,
  };
};

export let actionCloseForm = () => {
  return {
    type: CLOSE_FORM,
  };
};

export let actionAddAccount = (account) => {
  return {
    type: ADD_ACCOUNT,
    account: account,
  };
};

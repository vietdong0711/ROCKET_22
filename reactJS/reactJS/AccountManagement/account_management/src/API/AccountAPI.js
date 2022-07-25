import { api } from "./api";

//get listAccountAPI
const getListAccountAPI = () => {
  return api("GET", "accounts/", null);
};

// add account
const addAccountAPI = (accountNew) => {
  return api("POST", "accounts/", accountNew);
};

const deleteAccountAPI = (id) => {
  return api("DELETE", "accounts/" + id, null);
};

const updateAccountAPI = (id, account) => {
  let url = "accounts/" + id;
  return api("PUT", url, account);
};

export { updateAccountAPI, getListAccountAPI, addAccountAPI, deleteAccountAPI };

function ccheckEmail() {
  return new Promise(function (resolve, reject) {
    var response = true;
    if (response) {
      reject("Email đã tồn tại");
    } else {
      resolve("Chưa tồn tại");
    }
  });
}

function ccheckUsername() {
  return new Promise(function (resolve, reject) {
    var response = true;
    if (response) {
      reject("Username đã tồn tại");
    } else {
      resolve("Chưa tồn tại");
    }
  });
}

function ccreateAccount() {
  return new Promise(function (resolve, reject) {
    var response = true;
    if (response) {
      reject("Tạo account ko thành công");
    } else {
      resolve("Tại account thành công");
    }
  });
}

ccheckEmail()
  .then(function (mes) {
    return ccheckUsername();
  })
  .then(function (mes) {
    return ccreateAccount();
  })
  .catch(function (mes) {
    alert(mes);
  });

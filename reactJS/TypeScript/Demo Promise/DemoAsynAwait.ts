function checkEmail() {
  return new Promise(function (resolve, reject) {
    var response = true;
    return response;
  });
}

function checkUsername() {
  return new Promise(function (resolve, reject) {
    var response = true;
    return response;
  });
}

function createAccount() {
  return new Promise(function (resolve, reject) {
    var response = true;
    return response;
  });
}

async function createAccount_() {
  let rsEmail = await checkEmail();
  if (rsEmail) {
    console.log("Email đã tồn tại");
    return;
  } else {
    console.log("Email chưa tồn tại");
  }
  let rsUsername = await checkUsername();
  if (rsUsername) {
    console.log("Username đã tồn tại");
    return;
  } else {
    console.log("Username chưa tồn tại");
  }
  let rsAccount = await createAccount();
  if (rsAccount) {
    console.log("Account đã có lỗi");
    return;
  } else {
    console.log("Account tạo thành công");
  }
}

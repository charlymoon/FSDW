//Modify this line if you are not running the exercise from other than localhost
const url = 'http://localhost/FSDW/api.json';
const btn = document.querySelector('#btnGet');
const msg = document.querySelector('#message');

function load(URL) {
  return new Promise(function (resolve, reject) {
    const request = new XMLHttpRequest();
    request.onload = function () {
      if (this.status == 200) {
        resolve(this.response);
      } else {
        reject(this.status);
      }
    };
    request.open('GET', URL, true);
    request.send();
  });
}


btn.addEventListener('click', () => {
  load(url)
    .then((data) => {
      console.log("data received" + data);
      const result = JSON.parse(data);
      msg.innerHTML = result.name;
    })
    .catch((error) => {
      console.log( `Error getting the message, HTTP status: ${error}`);
    });
});

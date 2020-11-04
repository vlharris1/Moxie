
let myNodelist = document.getElementsByTagName("LI");

for (let i = 0; i < myNodelist.length; i++) {
  closeButton(myNodelist[i]);
}

closer();
function closer() {
  let close = document.getElementsByClassName("close");

  for (let i = 0; i < close.length; i++) {
    close[i].onclick = function () {
      let div = this.parentElement;
      div.classList.toggle('checked');
      setTimeout(function () {
        div.style.display = "none";
      }, 2000);
    }
  }

}


let list = document.querySelector('ul');
list.addEventListener('click', function (ev) {
  if (ev.target.tagName === 'LI') {
    ev.target.classList.toggle('checked');
  }
}, false);


function newElement() {
  let li = document.createElement("li");
  const input = document.getElementById("myInput");
  let inputValue = input.value;
  console.log(inputValue);
  li.innerHTML = inputValue;
  // var t = document.createTextNode(inputValue);
  // li.appendChild(t);
  if (inputValue === '') {
    alert("You must write something!");
  } else {
    document.getElementById("myUL").appendChild(li);
  }
  input.value = "";
  closeButton(li);
  closer();


}

function closeButton(item) {
  let span = document.createElement("SPAN");
  let txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  item.appendChild(span);
}

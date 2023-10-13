let currentInput = "";
let currentOperation = "";
let result = "0";

function clearDisplay() {
  currentInput = "";
  currentOperation = "";
  result = "0";
  document.getElementById("result").value = result;
}

function appendToDisplay(value) {
  if (currentOperation === "=") {
    currentOperation = "";
    result = "";
    currentInput = "";
  }

  currentInput += value;
  document.getElementById("result").value = currentInput;
}

function operate(operator) {
  if (currentInput !== "") {
    if (currentOperation !== "") {
      calculate();
    }
    currentOperation = operator;
    result = currentInput;
    currentInput = "";
  }
}

function calculate() {
  if (currentOperation === "+" && currentInput !== "") {
    result = String(parseFloat(result) + parseFloat(currentInput));
  } else if (currentOperation === "-" && currentInput !== "") {
    result = String(parseFloat(result) - parseFloat(currentInput));
  } else if (currentOperation === "*" && currentInput !== "") {
    result = String(parseFloat(result) * parseFloat(currentInput));
  } else if (currentOperation === "/" && currentInput !== "") {
    if (currentInput === "0") {
      result = "Error";
    } else {
      result = String(parseFloat(result) / parseFloat(currentInput));
    }
  }

  document.getElementById("result").value = result;
  currentOperation = "=";
  currentInput = "";
}

  function appendNumber(num) {
    document.getElementById('result').value += num;
  }

  function appendOperator(op) {
    document.getElementById('result').value += op;
  }

  function clearResult() {
    document.getElementById('result').value = '';
  }
    

  document.getElementById('equal').addEventListener('click', function() {
      calculateResult();
  });

  function appendNumber(number) {
    document.getElementById('result').value += number;
}

function calculateResult() {
  var expression = document.getElementById('result').value;
  var result = eval(expression);
  document.getElementById('result').value = result;
}

  function backspace() {
    let currentResult = document.getElementById('result').value;
    document.getElementById('result').value = currentResult.slice(0, -1);
  }
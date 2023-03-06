function changeMoney() {
    let Amount = +document.getElementById("Amount").value;
    let from = document.getElementById("from").value;
    let to = document.getElementById("to").value;
    let Result;

    if (from == "VND" && to == "USD") {
        Result = ("result = " + "$ " + (Amount / 23000.000));
    } else if (from == "USD" && to == "VND") {
        Result = "result = " + (Amount * 23000.000) + " VND"
    } else if (from === "VND" && to === "VND") {
        Result = "result = " + Amount + " VND"
    } else  {
        Result = "result = " + Amount + " VND"
    };
document.getElementById("Result").innerHTML = Result;
}


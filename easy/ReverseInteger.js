var ifInRange = function (x) {
    if (x >= Math.pow(2, 31) - 1 || x <= Math.pow(-2, 31)) {
        return false;
    }
    return true;
}

var reverse = function (x) {
    let result = "";
    if (x == 0) {
        return 0;
    }
    else if (x < 0) {
        x = -(x);
        result = "-";
    }
    else if (x > Math.pow(2, 31) - 1 || x < Math.pow(-2, 31)) {
        return 0;
    } else {
        while (x != 0) {
            var value = x % 10;
            result += value;
            x = Math.floor(x / 10);
        }
    }
    return ifInRange(result) ? result : 0;
}

var val = 1563847412;
var result = reverse(val);
console.log(result);
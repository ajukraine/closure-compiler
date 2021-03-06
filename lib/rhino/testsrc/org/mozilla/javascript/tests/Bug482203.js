var __terminate_interpreter__ = new Continuation();
var c;

function fib(x) {
    c = getContinuation();
    if(c != null) {
    	this.__terminate_interpreter__(null);
    }
    return x < 2 ? 1 : (fib(x-1) + fib(x-2));
}

function getContinuation() {
	return new Continuation();
}

var result = fib(3);
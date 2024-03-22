/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let memo = {};

    return function(...args) {
        const argString = JSON.stringify(args);

        if (argString in memo) {
            return memo[argString];
        } else {
            let temp = fn(...args);
            memo[argString] = temp;
            return temp;
        }
    }
}

/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */
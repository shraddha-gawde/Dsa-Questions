/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {

    if(s.length === 0){
        return true
    } 
    s = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase()
    let i = 0
    let j = s.length-1

    while(i<j){
        if(s[i] != s[j]){
            return false
        }
        j--
        i++
    }
    return true
    
};
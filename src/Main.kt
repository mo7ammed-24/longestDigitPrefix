fun main() {
    print(longestDigitsPrefix("123aa1"))
}
fun longestDigitsPrefix(inputString: String): String {
    var index=-1
    for(i in 0 until inputString.length){
        if(inputString[i].isDigit())
            continue
        else{
            index=i
            break}
    }
    if(index==-1)
        return inputString
    else
        return inputString.slice(0 until index)
}

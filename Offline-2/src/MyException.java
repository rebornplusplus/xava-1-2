class MyException extends Exception {
    Boolean wrongInputFormat;
    Boolean valueflag;  // flag = 0 for menuChoice, 1 for other value inputs

    MyException(Boolean wflag, Boolean vflag) {
        wrongInputFormat = wflag;
        valueflag = vflag;
    }

    @Override
    public String toString() {
        if(wrongInputFormat) {
            return "Enter a valid number\n";
        }
        else {
            if (valueflag) {
                return "You can not enter a negative value.\n";
            } else {
                return "You need to enter a value between 1 and 5\n";
            }
        }
    }
}
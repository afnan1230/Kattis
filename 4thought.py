operators = ["*","+","-","//"]
def operate(number):
    for i in operators:
        for j in operators:
            for k in operators:
                equation = "4 "+i+" 4 "+j+" 4 "+k+" 4 "
                if(eval(equation)==number):
                    equation = equation.replace("//","/")
                    return equation + "= "+ str(number)
    return "no solution"
cases = int(input())
for x in range(cases):
    num = int(input())
    print(operate(num))

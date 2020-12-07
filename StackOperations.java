import java.util.Scanner;

class StackOperations{
    public static void main(String[] args) {
        int i, size, choice;
        int top = -1;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Size of STACK : ");
        size = s.nextByte();

        int stack[] = new int[size];

        String options = "1]PUSH 2]POP 3]DISPLAY 4]EXIT";
        do {
            System.out.println("Select choice from below \n " + options);
            choice = s.nextInt();
            switch (choice){
                case 1:
                    if(top == size-1){
                        System.out.println("Stack is FULL");
                    }
                    else{
                        System.out.print("Enter element to PUSH : ");
                        int element = s.nextInt();
                        top += 1;
                        stack[top] = element;
                    }
                    break;
                case 2:
                    if (top == -1){
                        System.out.println("Stack is empty");
                    }
                    else {
                        int temporary = stack[top];
                        top -= 1;
                        System.out.print("Popped element is : " + temporary);
                    }
                    System.out.println("");
                    break;
                case 3:
                    if(top==-1)
                    {
                        System.out.println("STACK IS EMPTY\n");
                    }
                    else
                    {
                        System.out.print("Stack elements are : ");
                        for(i=top;i>=0;i--)
                        {
                            System.out.print(stack[i] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Select correct choice ");
            }
        }while (choice != 4);
    }
}
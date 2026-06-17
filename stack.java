class Stack
{ int s[],cap,top;
    Stack (int nn)
    {  
        cap=nn;
        top=-1;
        s=new int[cap];
    }

    void push(int v)
    {
        if (top<cap-1)
            s[++top]=v;
        else  System.out.println("STACK FULL");

    }

    int pop()
    {
        if (top>=0)
            return(s[top--]);
        else return -9999;
    }

    void display()
    {
        for(int i=top;i>=0;i--)
            System.out.println(s[i]);
    }
}

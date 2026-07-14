class insertion {

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
//insertion at the beginning
void insertBeginning(Node head,int data)
{
    Node newNode = new Node(data);
    newNode.next=head;
    head=newNode;
}
//insertion at the end
void insertEnd(Node head , int data)
{
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node temp = head;
    while(temp.next != null)
    {
        temp = temp.next;
    }
    temp.next = newNode;
}
//insertion at a given position
void insertatPosition(Node head,int pos,int data)
{
    Node newNode = new Node(data);
    if(pos == 1)
    {
        newNode.next = head;
        head = newNode;
        return;
    }
    Node temp = head;
    for(int i=0;i<pos-1;i++)
    {
        temp = temp.next;
    }
    if(temp==null){
        System.out.println("position out of bound");
        return;
    }
    newNode.next = temp.next;
    temp.next = newNode;
}
void display()
{
    Node temp = head;
    if(temp == null)
    {
        System.out.println("List is empty");
        return;
    }
    while(temp != null){
        System.out.println(temp.data+" -> ");
        temp= temp.next;
    }
    System.out.println("NULL");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        insertion ob = new insertion();
        int choice , data;
        do{
            System.out.println("1.\nInsert at the beginning");
            System.out.println("\n2.Insert at the end");
            System.out.println("\n 3. Insert at a specified position");
            System.out.println("\n4.display");
            System.out.println("\n5.exit");

            System.out.println("enter your choice");
            choice  = sc.nextInt();
            switch(choice)
            {
                case 1:
                    
            }

        }
    }
}

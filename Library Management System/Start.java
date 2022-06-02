import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

class Author {
    public int id;
    public String name;
    public String email;

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}



 class Book {

    public int id;
    public String title;
    public String subtitle;
    public Author author;
    public Publisher publisher;
    public double price;

    public void setId(int id){
        this.id=id;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setSubTitle(String subtitle){
        this.subtitle=subtitle;
    }

    public void setAuthor(Author author){
        this.author=author;
    }

    public void setPublisher(Publisher publisher){
        this.publisher=publisher;
    }
    
    public void setPrice(double price){
        this.price=price;
    }


}

class Publisher {
    int id;
    String name;
    String contactNo;

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setContactNo(String contactNo){
        this.contactNo=contactNo;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getContactNo(){
        return contactNo;
    }
    
}
abstract class Patron{
    public int id;
    public String name;
    public String departmentName;
    public String email;
    public String contactNo;
    public String adress;
    public double amount;

    public void setId(int id){

        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDepartmentName(String departmentName ){
        this.departmentName = departmentName;
    }
    public void setEmail(String email){
        this.email = email;    
    }

    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
    public void setAddress(String adress){
        this.adress = adress;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getContactNo(){
        return this.contactNo;
    }
    public String getAddress(){
        return this.adress;
    }
    public double getAmount(){
        return this.amount;
    }
    public abstract void showinfo();

    
}


class Student extends Patron{
    public String studentId;
    public String guardianName;
    public String guardianContactNo;


    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public void setGuardianName(String guardianName){
        this.guardianName = guardianName;
    }
    public void setGuardianContactNo(String guardianContactNo){
        this.guardianContactNo=guardianContactNo;
    }

    public String getStudentId(){
        return this.studentId;
    }
    public String getGuardianName(){
        return this.guardianName;
    }
    public String getGuardianContactNo(){
        return this.guardianContactNo;
    }
    public void showinfo(){
        System.out.println("ID: "+studentId+"\nGuandian name: "+guardianName+"\nGuandian Contact No: "+guardianContactNo);
    }

}
class Teacher extends Patron{
    public String teacherId;
    
    public void setTeacherId(String teacherId){
        this.teacherId = teacherId;
    }
    public String getTeacherid(){
        return teacherId;
    } 
    public void showinfo(){
        System.out.println("ID: "+teacherId);
    }


}
interface IBasicOperations{
   
    static public void borrow(Patron p, Book b){
        File file = new File("F:\\Project\\mytext.txt");
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file,true);
            fileWriter.write("Borrow Information!!");
            fileWriter.write("\n");
            fileWriter.write("Patron ID : "+p.id + " "+" Book ID : "+b.id);
            fileWriter.write("\n");
            
            System.out.println("Data Successfully appended into file");
            
        }
        catch(IOException e){
            e.printStackTrace(); 
            System.out.println("IOException Occured!! Something went wrong!! Please Try and check again later");
        }
        finally {
            try {
                 fileWriter.close();
             }
             catch(IOException e) {
                e.printStackTrace(); 
                 System.out.println("Couldn't close the file");
             }

    }

    }
    
    static public void returnBook(Patron p, Book b){
        File file = new File("F:\\Project\\mytext.txt");
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file,true);
            fileWriter.write("Return Information");
            fileWriter.write("\n");
            fileWriter.write("Patron ID : "+p.id+"  "+ " Book ID : "+b.id);
            fileWriter.write("\n");
            System.out.println("!!!!!!!!!!Successfully returned this book!!!!!!!!!!!!!!");
            
        }
        catch(IOException e){
            e.printStackTrace(); 
            System.out.println("IOException Occured!! Something went wrong!! Please Try and check again later");
        }
        finally {
            try {
                 fileWriter.close();
             }
             catch(IOException e) {
                e.printStackTrace(); 
                 System.out.println("Couldn't close the file");
             }

    }

    }

    static public void fine (Patron p, double amount){
        File file = new File("F:\\Project\\mytext.txt");
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file,true);
            fileWriter.write("Fine Information!!");
            fileWriter.write("\n");
            fileWriter.write("Patron ID: "+p.id+"    "+"Amount: "+amount);
            fileWriter.write("\n");
            System.out.println("!!!!!!!!According to the policy you have got some fine!!!!!!!!!!!!!!");
            
        }
        catch(IOException e){
            e.printStackTrace(); 
            System.out.println("IOException Occured!! Something went wrong!! Please Try and check again later");
        }
        finally {
            try {
                 fileWriter.close();
             }
             catch(IOException e) {
                e.printStackTrace(); 
                 System.out.println("Couldn't close the file");
             }

    }



}
   


}
class Basicoperation implements IBasicOperations{
    public Patron p=0;
    public Book b=0;
    public double amount=0;
   
    Basicoperation obj = new Basicoperation();
    obj.void borrow(Patron p, Book b);
    obj.void returnBook(Patron p, Book b);
    obj.void fine (Patron p, double amount);

    }
     
   



/*class IBasicOperations {
    public Patron p;
    public Book b;
    public double amount;
    static public void borrow(Patron p, Book b){
        File file = new File("F:\\Project\\mytext.txt");
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file,true);
            fileWriter.write("Borrow Information!!");
            fileWriter.write("\n");
            fileWriter.write("Patron ID : "+p.id + " "+" Book ID : "+b.id);
            fileWriter.write("\n");
            
            System.out.println("Data Successfully appended into file");
            
        }
        catch(IOException e){
            e.printStackTrace(); 
            System.out.println("IOException Occured!! Something went wrong!! Please Try and check again later");
        }
        finally {
            try {
                 fileWriter.close();
             }
             catch(IOException e) {
                e.printStackTrace(); 
                 System.out.println("Couldn't close the file");
             }

    }

    }*/
    
    /*static public void returnBook(Patron p, Book b){
        File file = new File("F:\\Project\\mytext.txt");
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file,true);
            fileWriter.write("Return Information");
            fileWriter.write("\n");
            fileWriter.write("Patron ID : "+p.id+"  "+ " Book ID : "+b.id);
            fileWriter.write("\n");
            System.out.println("!!!!!!!!!!Successfully returned this book!!!!!!!!!!!!!!");
            
        }
        catch(IOException e){
            e.printStackTrace(); 
            System.out.println("IOException Occured!! Something went wrong!! Please Try and check again later");
        }
        finally {
            try {
                 fileWriter.close();
             }
             catch(IOException e) {
                e.printStackTrace(); 
                 System.out.println("Couldn't close the file");
             }

    }

    }

    static public void fine (Patron p, double amount){
        File file = new File("F:\\Project\\mytext.txt");
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file,true);
            fileWriter.write("Fine Information!!");
            fileWriter.write("\n");
            fileWriter.write("Patron ID: "+p.id+"    "+"Amount: "+amount);
            fileWriter.write("\n");
            System.out.println("!!!!!!!!According to the policy you have got some fine!!!!!!!!!!!!!!");
            
        }
        catch(IOException e){
            e.printStackTrace(); 
            System.out.println("IOException Occured!! Something went wrong!! Please Try and check again later");
        }
        finally {
            try {
                 fileWriter.close();
             }
             catch(IOException e) {
                e.printStackTrace(); 
                 System.out.println("Couldn't close the file");
             }

    }



}
}*/

class BookOperations {
    public int book=0;
   
    static public void insertBook(Book b){
        File file = new File("F:\\Project\\mytext.txt");
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file,true);
            fileWriter.write("ID: "+b.id+"    Title: "+b.title+"    Subtitle: "+b.subtitle+"    Price: "+b.price+"    Auther id: "+b.author.id+"    Auther Name: "+b.author.name+"    Email: "+b.author.email+"    Publisher Id: "+b.publisher.id+"    Publisher Name: "+b.publisher.name+"    Publisher Phone: "+b.publisher.contactNo);
            fileWriter.write("\n");
            System.out.println("Data Successfully appended into file");
            
        }
        catch(IOException e){
            e.printStackTrace(); 
            System.out.println("IOException Occured!! Something went wrong!! Please Try and check again later");
        }
        finally {
            try {
                 fileWriter.close();
             }
             catch(IOException e) {
                e.printStackTrace(); 
                 System.out.println("Couldn't close the file");
             }

    }
}

    static public void  getBook(int bookId){
        String idnumber=Integer.toString(bookId);
        File file = new File("F:\\Project\\mytext.txt");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try{
          fileReader = new FileReader(file);
          bufferedReader = new BufferedReader(fileReader);
          String line = null;
          int flag =0;//If any record is not available then
          while((line=bufferedReader.readLine())!=null){
            if(line.contains(String.valueOf(bookId))){
                System.out.println("Yes Sir Your file is Founded! and here it is: ");
                System.out.println(line);
                flag = 1;
                break;
            }
        }
            if(flag==0){
                System.out.println("Sorry Sir! We didn't find your file Yet!!!!");
            }
        
    }
            catch(IOException e) {
                e.printStackTrace(); 
                System.out.println("Something went wrong");
            }
            finally {
                try {
                    fileReader.close();
                }
                catch(IOException e) {
                    e.printStackTrace(); 
                    System.out.println("Closure is not available here");
                }


          }


    }

    static public void showAllBooks(){
        File file = new File("F:\\Project\\mytext.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            int numberOfBook=1;
            String line = null;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println("Book no "+numberOfBook+" "+line);
                numberOfBook++;              
            }
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Something went Wrong here");
        }
        finally {
            try {
                fileReader.close();
            }
            catch(IOException e) {
                e.printStackTrace();
                System.out.println("Couldn't close the file");
            }
        }
    }
        
    }
    

class TeacherOperation{
    static void insertTeacher(Teacher t){
        File myfile = new File ("F:\\Project\\Teacher.txt");
        FileWriter myfileWriter = null;

        try{
            myfileWriter = new FileWriter(myfile,true);
            myfileWriter.write("Teacher Id: "+t.getTeacherid()+"    Patron id: "+t.getId()+"    Name:"+t.getName()+"    Dept: "+t.getDepartmentName()+"    Email: "+t.getEmail()+"    Phone: "+t.getContactNo()+"    Address: "+t.getAddress()+"    Amount: "+t.getAmount());
            myfileWriter.write("\n");
            System.out.println("Teacher Incertion Done");
        }

        catch(IOException io){
            System.out.println("Exception occured");
        }
        finally{
            try{
                myfileWriter.close();
            }
            catch(IOException io){
                System.out.println("File could not close");
            }
        }


    }


    static void getTeacher(String teacherid){
        File myfile = new File ("F:\\Project\\Teacher.txt");
        FileReader myfilereader = null;
        BufferedReader mybufferreader = null;
        try{
            myfilereader = new FileReader(myfile);
            mybufferreader = new BufferedReader(myfilereader);
            int flag = -1;
            String line;
            while((line = mybufferreader.readLine()) != null){
                
                if(line.contains(String.valueOf(teacherid))){
                System.out.println("Teachers ID Found");
                System.out.println(line);
                flag = 1;
                break;
                }
            }
            if(flag == -1){
                System.out.println("Not found");
            }

        }
        catch(IOException io){
            System.out.println("Error");
        }
        finally {
            try {
                myfilereader.close();
            }
            catch(IOException io) {
                System.out.println("Couldn't close the file");
            }
        }


    }
    static void ShowAllTeacher(){

        File myfile = new File ("F:\\Project\\Teacher.txt");
        FileReader myfilereader = null;
        BufferedReader mybufferreader = null;
        try{
          myfilereader = new FileReader(myfile);
          mybufferreader = new BufferedReader(myfilereader);
          int number = 1;
          String line;
          while((line = mybufferreader.readLine()) != null){
            System.out.println("Teacher No:"+number+" "+line);
            number++;
          }
        }
          catch(IOException io){
              System.out.println("Error occur");
              
          }
          finally {
            try {
                myfilereader.close();
            }
            catch(IOException io) {
                System.out.println("Couldn't close the file");
            }
        }

  
        }

        }  
    

class studentOperation{
    static void insertStudent(Student s){
        File myfile = new File("F:\\Project\\student.txt");
        FileWriter myfileWriter = null;
        try{
            myfileWriter  = new FileWriter(myfile,true);
            myfileWriter.write("ID: "+s.getStudentId()+"    Guardian Name: "+s.getGuardianName()+"    Guardian phone: "+s.guardianContactNo+"    Patron Id: "+s.getId()+"    Name: "+s.getName()+"    Department Name: "+s.getDepartmentName()+"    Email: "+s.getEmail()+"    Phone: "+s.getContactNo()+"    Address: "+s.getAddress()+"    Amount: "+s.getAmount());
            myfileWriter.write("\n");
            System.out.println("Student Incertion Done");

        }
        catch(IOException io){
            System.out.println("Io exception occured");

        }

        finally{
            try{
                myfileWriter.close();
            }
            catch(IOException io){
                System.out.println("File doesnot Close");  
            }
        }


    }

static void getStudent(String studentId){
    File myfile = new File("F:\\Project\\student.txt");
    FileReader  myfileReader = null;
    BufferedReader mybufferedReader = null;
    try{
        myfileReader = new FileReader(myfile);
        mybufferedReader = new BufferedReader(myfileReader);
        int flag = -1;
        String line;
        while((line = mybufferedReader.readLine()) != null ){
            if(line.contains(String.valueOf(studentId))){
                System.out.println("Student Found");
                System.out.println(line);
                flag = 1;
                break;
            }
        }
        if(flag == -1){
            System.out.println("Student Not found");

        }
    }
    catch(IOException io){
        System.out.println("Io exception occure");
    }
    finally{
        try{
            myfileReader.close();
        }
        catch(IOException io){
            System.out.println("File did not close");
        }
    }
}

static void showallStudents(){
    File myfile = new File("F:\\Project\\student.txt");
    FileReader myfileReader = null;
    BufferedReader mybufferedReader = null;

    try{
        myfileReader = new FileReader(myfile);
        mybufferedReader = new BufferedReader(myfileReader);
        int number = 1;
        String line ;
        while((line= mybufferedReader.readLine()) != null){
            System.out.println("Student Number: "+number+" "+line);
            number++;
        }
    }
    catch(IOException io){
        System.out.println("Io excedption occured!!!!");

    }
    finally{
        try{
            myfileReader.close();
        }
        catch(IOException io){
            System.out.println("file doesnot close ");
        }
    }
}

}

public class Start{
    public static void main(String[] args){
        Book b[] = new Book[100];
        Author a[] = new Author[100];
        Publisher p[] = new Publisher[100];
        Teacher t[] = new Teacher[100];
        Student s[] = new Student[100];
        Scanner userInput =new Scanner(System.in);
        int n = 1;
        int number =0;
        int number1 = 0;
        int number2 = 0;
        int studentobjnumber =0;
        int teacherobjnumber =0;
        int number3=0;
        int number4=0;
        int bookobjnumber=0;
        int authorobjnumber=0;
        int publisherobjnumber=0;
        int partonobjnumber=0;
        //public Patron p=0;
        //public Book b=0;
        //public double amount=0;
        //int ptrn;
        //int bok;
        Patron ptrn =new Student() ;
        Book bok = new Book();
        while(n != 5){
        
        
        System.out.println("\t\t\t|------------------------------------------------------|");
        System.out.println("\t\t\t|------------------------------------------------------|");
 System.out.println("\t\t\t|    WELCOME TO LIBRARY MANAGEMENT SYSTEM              |");
        System.out.println("\t\t\t|------------------------------------------------------|");
        System.out.println("\t\t\t|------------------------------------------------------|\n");


        System.out.println("\t\t\t ______________________________________________________  ");
 System.out.println("\t\t\t|    1.Student Management                              | ");
 System.out.println("\t\t\t|    2.Teacher Management                              | ");
 System.out.println("\t\t\t|    3.Book Management                                 | ");
 System.out.println("\t\t\t|    4.Basic Operation                                 | ");
 System.out.println("\t\t\t|    5.Exit                                            | ");
        System.out.println("\t\t\t|______________________________________________________|");

        System.out.println("Please! Select your desire number from Above: ");
        number = userInput.nextInt();
        switch(number){
            case 1:
            System.out.println("1.Insert New Student");
            System.out.println("2. Search by studentId");
            System.out.println("3.Show All Student");
            System.out.println("Select Option Number");
            number1 = userInput.nextInt();
            switch(number1){
                case 1:
                s[studentobjnumber] = new Student();
                System.out.println("Student Id:  ");
                String studentId = userInput.next();
                s[studentobjnumber].setStudentId(studentId);
                userInput.nextLine();
                System.out.println("Guardian Name:  ");
                String GuardianName = userInput.nextLine();
                s[studentobjnumber].setGuardianName(GuardianName);
                System.out.println("Guardian contactno:  ");
                String Guardiancontactno = userInput.nextLine();
                s[studentobjnumber].setGuardianContactNo(Guardiancontactno);
                System.out.println("Patron Id:  ");
                int PatronId = userInput.nextInt();
                s[studentobjnumber].setId(PatronId);
                userInput.nextLine();
                System.out.println("Name: ");
                String name = userInput.nextLine();
                s[studentobjnumber].setName(name);
                System.out.println("Department Name: ");
                String DepartmentName = userInput.nextLine();
                s[studentobjnumber].setDepartmentName(DepartmentName);
                System.out.println("Email: ");
                String Email = userInput.nextLine();
                s[studentobjnumber].setEmail(Email);
                System.out.println("Contact no: ");
                String Contactno = userInput.nextLine();
                s[studentobjnumber].setContactNo(Contactno);
                System.out.println("Address: ");
                String Address = userInput.nextLine();
                s[studentobjnumber].setAddress(Address);
                System.out.println("Amount: ");
                double Amount= userInput.nextDouble();
                s[studentobjnumber].setAmount(Amount);
                studentOperation.insertStudent(s[studentobjnumber]);
                studentobjnumber++;
                break;
                case 2:System.out.print("Enter Student Id:  ");
                String student_Id = userInput.next();
                studentOperation.getStudent(student_Id);
                break;
                case 3:
                studentOperation.showallStudents();
                break;
                default:
                System.out.println("Wrong Choice Try Again");
                break;
              }
              break;
            case 2: 
            System.out.println("1.Insert New Teacher");
            System.out.println("2. Search by TeacherID");
            System.out.println("3.Show All Teacher");
            System.out.println("Select Your Number");
            number2 = userInput.nextInt();
              switch(number2){
                  case 1:
                  t[teacherobjnumber] = new Teacher();
                  System.out.println("Teacher Id:  ");
                  String teacherId = userInput.next();
                  t[teacherobjnumber].setTeacherId(teacherId);
                  System.out.println("Patron id: ");
                  int Patron_id = userInput.nextInt();
                  t[teacherobjnumber].setId(Patron_id);
                  System.out.println("Name: ");
                  String namee = userInput.next();   
                  t[teacherobjnumber].setName(namee);         
                  System.out.println("Department Name: ");
                  String Department_Name = userInput.next();
                  t[teacherobjnumber].setDepartmentName(Department_Name);
                  System.out.println("Email: ");
                  String Email = userInput.next();
                  t[teacherobjnumber].setEmail(Email);
                  System.out.println("Contact no: ");
                  String Contactno = userInput.next();
                  t[teacherobjnumber].setContactNo(Contactno);
                  System.out.println("Address: ");
                  String Address = userInput.next();
                  t[teacherobjnumber].setAddress(Address);
                  System.out.println("Amount: ");
                  double Amount= userInput.nextDouble();
                  t[teacherobjnumber].setAmount(Amount);
                  TeacherOperation.insertTeacher(t[teacherobjnumber]);
                  teacherobjnumber++;
                  break;
                  case 2:
                  System.out.println("Enter Teacher Id:  ");
                  String Teacher_Id = userInput.next();
                  TeacherOperation.getTeacher(Teacher_Id);
                  break;
                  case 3:
                  TeacherOperation.ShowAllTeacher();
                  break;
                  default:
                  System.out.println("Wrong Choice Try Again");
                  break;

              }
              break;
              case 3:
              System.out.println("1.Insert New Book");
              System.out.println("2.Search by bookId");
              System.out.println("3.Show All Books");
              System.out.println("Select your desired number from above to move futher ");
              number3 = userInput.nextInt();
                switch(number3){
                    case 1:
                    b[bookobjnumber]=new Book();
                    System.out.print("Book Id :  ");
                    int id = userInput.nextInt();
                    b[bookobjnumber].setId(id);
                    userInput.nextLine();
                    System.out.print("Title :  ");
                    String Title = userInput.next();
                    b[bookobjnumber].setTitle(Title);
                    userInput.nextLine();
                    System.out.print("Subtitle :  ");
                    String  Subtitle = userInput.next();
                    b[bookobjnumber].setSubTitle(Subtitle);
                    userInput.nextLine();
                    System.out.print("Price :  ");
                    double Price = userInput.nextDouble();
                    b[bookobjnumber].setPrice(Price);

                    a[authorobjnumber]=new Author();
                    System.out.print("Author Id :  ");
                    int ID= userInput.nextInt();
                    a[authorobjnumber].setId(ID);
                    userInput.nextLine();
                    System.out.print("Author Name :  ");
                    String NAME= userInput.next();
                    a[authorobjnumber].setName(NAME);
                    userInput.nextLine();
                    System.out.print("Email :  ");
                    String  Email= userInput.next();
                    a[authorobjnumber].setEmail(Email);
                    userInput.nextLine();
                    b[bookobjnumber].setAuthor( a[authorobjnumber]);


                    p[publisherobjnumber]=new Publisher();
                    System.out.print("Publisher Id :  ");
                    int PublisherID = userInput.nextInt();
                    p[publisherobjnumber].setId(PublisherID);
                    userInput.nextLine();
                    System.out.print("Publisher Name :  ");
                    String PublisherName= userInput.next();
                    p[publisherobjnumber].setName(PublisherName);
                    userInput.nextLine();
                    System.out.print("Contact number :  ");
                    String  ContactNo= userInput.next();
                    p[publisherobjnumber].setContactNo(ContactNo);
                    userInput.nextLine();
                    b[bookobjnumber].setPublisher(p[publisherobjnumber]);
                    BookOperations.insertBook(b[bookobjnumber]);
                    bookobjnumber++;
                    authorobjnumber++;
                    publisherobjnumber++;
                    break;
                    case 2:
                    System.out.println("Search your book by bookId ");
                    int IDV=userInput.nextInt();
                    BookOperations.getBook(IDV);
                    break;
                    case 3:
                    BookOperations.showAllBooks();
                    break;
                    default:
                    System.out.println("Wrong Choice try Again");
                    break;




                    


                }
                break;

                case 4:
                System.out.println("1. Borrow book");
                System.out.println("2. Return Book");
                System.out.println("3. Add Fine");
                System.out.println("Enter Your Desire number to move further ");
                number4=userInput.nextInt();
                switch (number4){
                    case 1:
                    
                    System.out.print("Patron id:  ");
                    int PatronId=userInput.nextInt();
                    System.out.print("Book id:  ");
                    int id=userInput.nextInt();
                    ptrn.id=PatronId;
                    bok.id=id;
                    //IBasicOperations.borrow(ptrn,bok);
                    BasicOperation.borrow(ptrn,bok);
                    break; 
                    case 2:
                    System.out.print("Patron id:  ");
                    int Patronid=userInput.nextInt();
                    System.out.print("Book id:  ");
                    int iD=userInput.nextInt();
                    ptrn.id=Patronid;
                    bok.id=iD;
                    //IBasicOperations.returnBook(ptrn,bok);
                    BasicOperation.returnBook(ptrn,bok);
                    break;
                    case 3:
                    System.out.print("Patron id:  ");
                    int patronId =userInput.nextInt();
                     
                    System.out.print("Ammount:  ");
                    double Amm = userInput.nextDouble();
                    ptrn.id = patronId;
                    
                    
                    //IBasicOperations.fine(ptrn,Amm);
                    BasicOperation.fine(ptrn,Amm);
                    break;
                    default:
                    System.out.println("Wrong Choice Try Again");
                    break;

        }
            break;
            case 5:
            n = 5;
            System.out.println("Successfully Exited!!");
            break;
            default:
            System.out.println("Wrong Choice Try Again");
            break;
        }




        

    }

}
}
      
      





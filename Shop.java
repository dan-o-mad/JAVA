
package shop;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Vector;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Shop extends FileChooserExample {

    
   public static void main(String[] args) {
       
       
       JFrame zero = new JFrame("WELCOME");
zero.setSize(550,600);
zero.setLayout(null);
zero.setLocationRelativeTo(null);
zero.setVisible(true);
zero.getContentPane().setBackground(Color.lightGray);

zero.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  zero.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 
       
   ImageIcon image1 = new ImageIcon("C:\\Users\\PC\\Desktop\\1.jpg\\");
JLabel imageLabel1 = new JLabel(image1); 
zero.add(imageLabel1);
imageLabel1.setBounds(0, 5, 500, 400);
imageLabel1.setVisible(true);    
       
       JLabel crr = new JLabel(" \u00a9  "+" Daniyal Khan.  All Rights Reserved.");
crr.setBounds(100,200,400,380);
crr.setForeground(Color.black);
zero.add(crr);

JLabel a = new JLabel("Easy Tracking..");
a.setBounds(100,0,350,150);
//a.setForeground(Color.white);
a.setFont(new Font("Jokerman", Font.BOLD, 20));
zero.add(a);
       
       
    JButton get = new JButton("Login");
get.setBounds(100,320,100,40);
get.setBackground(Color.orange);
get.setForeground(Color.white);
zero.add(get);   

    JButton signup = new JButton("Signup");
signup.setBounds(220,320,100,40);
signup.setBackground(Color.black);
signup.setForeground(Color.white);
zero.add(signup); 
       

  get.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
       
    //new frame main    
 zero.setVisible(false);      
JFrame f = new JFrame("Easy Tracking");
f.setSize(550,500);
f.setLayout(null);
f.setLocationRelativeTo(null);
f.setVisible(true);
f.getContentPane().setBackground(Color.lightGray);

f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 


ImageIcon image = new ImageIcon("C:\\Users\\PC\\Desktop\\1.jpg\\");
JLabel imageLabel = new JLabel(image); 
f.add(imageLabel);
imageLabel.setBounds(250, 85, 252, 166);
imageLabel.setVisible(true);
//f.setLayout(new FlowLayout());






JLabel a = new JLabel("Enter Name: ");
a.setBounds(50,20,100,150);
//a.setForeground(Color.white);
f.add(a);



JTextField b = new JTextField(250);
b.setBounds(130,80,100,30);
f.add(b);

JLabel p = new JLabel("Password: ");
p.setBounds(50,30,150,200);
f.add(p);

JPasswordField x = new JPasswordField(250);
x.setBounds(130,120,100,30);
f.add(x);


JButton y = new JButton("Login");
y.setBounds(130,160,100,40);
y.setBackground(Color.yellow);
y.setForeground(Color.black);
f.add(y);


JButton exit = new JButton("Home");
exit.setBounds(130,210,100,40);
exit.setBackground(Color.black);
exit.setForeground(Color.white);
f.add(exit);

JLabel cr = new JLabel(" \u00a9  "+" Daniyal Khan.  All Rights Reserved.");
cr.setBounds(100,200,400,400);
//a.setForeground(Color.white);
f.add(cr);


  y.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
    
     String name = b.getText();

        char[] pa = x.getPassword();

        String pass = new String(pa);
      

try{
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
          
            PreparedStatement ps = con.prepareStatement("select name from user where name=? and pass=?");

            ps.setString(1, name);

            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()){
           
           if(  name.equals("")  || pass.equals("") ){JOptionPane.showMessageDialog(null,

                   "Name or Password Required!");}
           
           else{
           

f.setVisible(false);
JFrame f1 = new JFrame("WELCOME");
f1.setSize(500,600);
f1.setLayout(null);
f1.setLocationRelativeTo(null);
f1.setVisible(true);
f1.getContentPane().setBackground(Color.lightGray);

f1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  f1.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 


JLabel p1 = new JLabel("WELCOME  " + rs.getString(1));
p1.setBounds(60, 30, 400, 30);
p1.setFont(new Font("Jokerman", Font.BOLD, 20));
f1.add(p1);


JButton y1 = new JButton("Add New Order");
y1.setBounds(130,120,140,40);
y1.setBackground(Color.black);
y1.setForeground(Color.white);
f1.add(y1);

y1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
f1.setVisible(false);
JFrame neworder = new JFrame("New Order");
neworder.setSize(500,500);
neworder.setLayout(null);
neworder.setLocationRelativeTo(null);
neworder.setVisible(true);
neworder.getContentPane().setBackground(Color.lightGray);

neworder.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  neworder.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 


JLabel tit = new JLabel("Enter order details");
tit.setBounds(100, 30, 400, 30);
neworder.add(tit);
    
JLabel id = new JLabel("Enter Order id: ");
id.setBounds(50,20,100,150);
neworder.add(id);

JTextField b = new JTextField(250);
b.setBounds(200,80,100,30);
neworder.add(b);

JLabel a = new JLabel("Courier company: ");
a.setBounds(50,50,150,150);
neworder.add(a);

JTextField bb = new JTextField(250);
bb.setBounds(200,110,100,30);
neworder.add(bb);

JLabel aa = new JLabel("Order Amount: ");
aa.setBounds(50,80,100,150);
neworder.add(aa);

JTextField bbb = new JTextField(250);
bbb.setBounds(200,140,100,30);
neworder.add(bbb);

JLabel aaa = new JLabel("Order Description: ");
aaa.setBounds(50,110,150,150);
neworder.add(aaa);

JTextField kb = new JTextField(250);
kb.setBounds(200,170,100,30);
neworder.add(kb);
    
JButton submit = new JButton("Add Order");
submit.setBounds(130,220,100,40);
submit.setBackground(Color.orange);
submit.setForeground(Color.white);
neworder.add(submit);

JButton bk = new JButton("Back");
bk.setBounds(130,270,100,40);
bk.setBackground(Color.red);
bk.setForeground(Color.white);
neworder.add(bk);
    //String orderid=track.getText();
submit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){    
  
    String oid=b.getText();
    String cname=bb.getText();
    String oamount=bbb.getText();
    String odesc=kb.getText();
    if(oid.equals("") || cname.equals("") || oamount.equals("")  || odesc.equals("")){JOptionPane.showMessageDialog(null,

                   "cant be empty");}
    else
    try{
   
        String sql = "insert into user_orders(oid,cname,oamount,odesc) values(?,?,?,?)";
          
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, oid);
            ps.setString(2, cname);
            ps.setString(3, oamount);
            ps.setString(4, odesc);

            ps.executeUpdate();
            
            
            
            
            JOptionPane.showMessageDialog(null,

                   "Order added successfully");
            
            
            //JButton z2 = new JButton("Back");
//z2.setBounds(130,170,100,40);
//neworder.add(z2);

    }
    
    catch(Exception e5)
    {System.out.println(e5);}

}
}
        
);

//back btn action listner new order frame

  bk.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

    
    
    neworder.setVisible(false);
f1.setVisible(true);

    
    
}
}
        
);





}
}
);

JButton all = new JButton("All Orders");
all.setBounds(130,70,140,40);
all.setBackground(Color.black);
all.setForeground(Color.white);
f1.add(all);


all.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
        JFrame f;    
      


    f=new JFrame();
    Vector data = new Vector();
     JTable table;
    
   //DefaultTableModel model = new DefaultTableModel(new String[]{a, a, a}, 0);

    try{
    
        PreparedStatement ps = con.prepareStatement("select*from user_orders");
        
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int columns = metaData.getColumnCount();
        
        while(rs.next()){
        //while(rs.next()){
        
        Vector row = new Vector(columns);
        
        for (int i = 1; i <= columns; i++) {
        row.addElement(rs.getObject(i));
       }
       data.addElement(row);
        //String id = rs.getString(1);
        //System.out.println(id);
        
          // String name = rs.getString(2);
        //System.out.println(name);
        
           //String amount = rs.getString(3);
        //System.out.println(amount);
        
           //String desc = rs.getString(4);
        //System.out.println(desc);
        
           
         
    //model.addRow(new Object[]{id, name, amount, desc});
        
        //}
        
        
        }
    
        
    //table.setModel(model);
    
    
  
    
    
//    
    
    
    
       f1.setVisible(false);
    f.setSize(500,500);    
    f.setVisible(true);    
    f.setLocationRelativeTo(null);
   f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
   f.setLayout(new FlowLayout());
   
    f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 
   
   
}
   
   
     catch(Exception ex){
    
        System.out.println(ex);
    
    
    
    }
  Vector columnNames = new Vector();
columnNames.addElement("Order ID");

columnNames.addElement("Courier Name");
columnNames.addElement("Order Amount");
columnNames.addElement("Order Desc.");
//columnNames.
table = new JTable(data,columnNames);
table.setSize(300,300);

f.add(table);
f.add(new JScrollPane(table));




JButton back = new JButton("Back");
back.setBounds(100,200,100,40);
back.setBackground(Color.orange);
back.setForeground(Color.white);
f.add(back);

JButton exit = new JButton("Exit");
exit.setBounds(220,200,100,40);
exit.setBackground(Color.red);
exit.setForeground(Color.white);
f.add(exit);

back.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
    f.setVisible(false);
    f1.setVisible(true);
}
}
);

exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
   
     System.exit(1);
}
}
);


}
}
);

JButton del = new JButton("Delete Order");
del.setBounds(130,370,140,40);
del.setBackground(Color.red);
del.setForeground(Color.white);
f1.add(del);


del.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
        JFrame f;    
      f=new JFrame("Delete Order");
    
        f1.setVisible(false);
    f.setSize(500,500);  
    f.setLayout(null);
    f.setVisible(true);    
    f.setLocationRelativeTo(null);
   f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      });  
   f.getContentPane().setBackground(Color.lightGray);
      
      
JLabel log1 = new JLabel("Enter Order ID:");
log1.setBounds(100, 30, 400, 30);
f.add(log1);
     

JTextField track = new JTextField(250);
track.setBounds(200, 30, 40, 30);
f.add(track);

JButton trackbtn = new JButton("Delete");
trackbtn.setBounds(180,70,100,40);
trackbtn.setBackground(Color.red);
trackbtn.setForeground(Color.white);
f.add(trackbtn);
    //Vector data = new Vector();
     //JTable table;
    
   //DefaultTableModel model = new DefaultTableModel(new String[]{a, a, a}, 0);
   trackbtn.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

    String orderid=track.getText();
     if(  orderid.equals("") ){JOptionPane.showMessageDialog(null,

                   "Can't be Empty!");}
    else
    try{
    String sq = "select* from user_orders where oid=?";
    String sql = "delete from user_orders where oid=?";
    
        //PreparedStatement ps = con.prepareStatement(sql);
         PreparedStatement p = con.prepareStatement(sq);   
//ps.setString(1, orderid);
p.setString(1, orderid);
           // ps.executeUpdate();
            p.setString(1, orderid);
            
            ResultSet rs = p.executeQuery();
//
            //if (rs.next()){
            //while(rs.next()){
            
                
        
                 if(rs.next()){
 

                             PreparedStatement ps = con.prepareStatement(sql);
         //PreparedStatement p = con.prepareStatement(sq);   
ps.setString(1, orderid);
//p.setString(1, orderid);
            ps.executeUpdate();
            //p.setString(1, orderid);
                     
                     
JOptionPane.showMessageDialog(null,

                   "Order Deleted Successfully");
                 }
    
                 else{
                     JOptionPane.showMessageDialog(null,

                   "Invalid Order ID");
                 }
    
    
    }
    
    
   
   
     catch(Exception ex){
    
        System.out.println(ex);
    
    
    
    }
 // Vector columnNames = new Vector();
//columnNames.addElement("Order ID");

//columnNames.addElement("Courier");
//columnNames.addElement("Amount");
//columnNames.addElement("Desc.");
//columnNames.
//table = new JTable(data,columnNames);
//table.setSize(300, 300);

//f.add(table);
//f.add(new JScrollPane(table));


}
   }
   );

JButton back = new JButton("Back");
back.setBounds(100,270,100,40);
back.setBackground(Color.orange);
back.setForeground(Color.white);
f.add(back);

JButton exit = new JButton("Exit");
exit.setBounds(220,270,100,40);
exit.setBackground(Color.red);
exit.setForeground(Color.white);
f.add(exit);

back.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
    f.setVisible(false);
    f1.setVisible(true);
}
}
);

exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
   
     System.exit(0);
}
}
);


}
}
);


JButton y2 = new JButton("Track Order");
y2.setBounds(130,170,140,40);
y2.setBackground(Color.black);
y2.setForeground(Color.white);
f1.add(y2);

y2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

f1.setVisible(false);
JFrame f2 = new JFrame("Track Order");
f2.getContentPane().setBackground(Color.lightGray);
f2.setSize(500,500);
f2.setLayout(null);
f2.setLocationRelativeTo(null);
f2.setVisible(true);


f2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  f2.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 

 


JLabel log1 = new JLabel("Enter order id:");
log1.setBounds(100, 30, 400, 30);
f2.add(log1);

//textfield for tracking order

JTextField track = new JTextField(250);
track.setBounds(200, 30, 40, 30);
f2.add(track);

JButton trackbtn = new JButton("Track");
trackbtn.setBounds(130,120,100,40);
trackbtn.setBackground(Color.orange);
trackbtn.setForeground(Color.white);
f2.add(trackbtn);

JButton z2 = new JButton("Back");
z2.setBounds(130,170,100,40);
z2.setBackground(Color.black);
z2.setForeground(Color.white);
f2.add(z2);

trackbtn.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
String orderid=track.getText();
//System.out.println(orderid);
if(  orderid.equals("") ){JOptionPane.showMessageDialog(null,

                   "Can't be Empty!");}
else
    try{
   
          
            PreparedStatement ps = con.prepareStatement("select*from user_orders where oid=?");

            ps.setString(1, orderid);

            ResultSet rs = ps.executeQuery();

            if (rs.next()){
            //while(rs.next()){
            
                 
                 
                 
                
                f2.setVisible(false);

JFrame f3 = new JFrame("Track Order results");
f3.setSize(500,500);
f3.setLayout(null);
f3.setLocationRelativeTo(null);
f3.setVisible(true);
f3.getContentPane().setBackground(Color.lightGray);

f3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  f3.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 
                
                /* JFrame f3 = new JFrame("Track Order results");

String id = rs.getString(1);
                
                  String data[][]={ {id},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","Courier NAME","Amount"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f3.add(sp);          
    f3.setSize(500,500);    
    f3.setVisible(true);
 */               
    
JLabel tit = new JLabel("Order details");
tit.setBounds(100, 30, 400, 30);
f3.add(tit);
    
JLabel id = new JLabel("Order id: ");
id.setBounds(50,20,100,150);
f3.add(id);

JTextField b = new JTextField(250);
b.setBounds(200,80,100,30);
b.setEditable(false);
f3.add(b);
b.setText(rs.getString(1));

JLabel a = new JLabel("Courier company: ");
a.setBounds(50,50,150,150);
f3.add(a);

JTextField bb = new JTextField(250);
bb.setBounds(200,110,100,30);
bb.setEditable(false);
f3.add(bb);
bb.setText(rs.getString(2));


JLabel aa = new JLabel("Order Amount: ");
aa.setBounds(50,80,100,150);
f3.add(aa);

JTextField bbb = new JTextField(250);
bbb.setBounds(200,140,100,30);
bbb.setEditable(false);
f3.add(bbb);
bbb.setText(rs.getString(3));


JLabel aaa = new JLabel("Order Description: ");
aaa.setBounds(50,110,150,150);
f3.add(aaa);

JTextField kb = new JTextField(250);
kb.setBounds(200,170,100,30);
kb.setEditable(false);
f3.add(kb);
kb.setText(rs.getString(4));
  //String data[][]={ {rs.getString(1),rs.getString(2),rs.getString(3)}};  
  
  
            //}
    //String column[]={"ORDER ID","COURIER NAME","AMOUNT"};         
  

    
    //JTable jt=new JTable(data,column);    
    //jt.setBounds(100, 30, 400, 30);          
    //JScrollPane sp=new JScrollPane(jt);    
    //f3.add(sp);          
    //f3.setSize(300,400);    
    //f3.setVisible(true);  












            //System.out.println("order details:  " + rs.getString(1)+"   "+ rs.getString(2)+"   "+ rs.getString(3)+"   "+ rs.getString(4));
JButton back = new JButton("Back");
back.setBounds(130,230,100,40);
back.setBackground(Color.black);
back.setForeground(Color.white);
f3.add(back);

JButton exit = new JButton("Exit");
exit.setBounds(130,280,100,40);
exit.setBackground(Color.red);
exit.setForeground(Color.white);
f3.add(exit);

back.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
    f3.setVisible(false);
    f2.setVisible(true);
}
}
);

exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
   
     System.exit(0);
}
}
);

            
            
            }
            else

            {

                JOptionPane.showMessageDialog(null,

                   "no records found");

            }
    }
    
    catch(Exception e3){
        
        System.out.println(e3);
    
    }

}


}


 );


z2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
f2.setVisible(false);

f1.setVisible(true);

}


}


 );



}


}


 );


JButton y3 = new JButton("Pending Payments");
y3.setBounds(130,220,140,40);
y3.setBackground(Color.black);
y3.setForeground(Color.white);
f1.add(y3);

y3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

                
                f1.setVisible(false);
JFrame pending = new JFrame("Pending Payments");
pending.setSize(500,500);
pending.setLayout(null);
pending.setLocationRelativeTo(null);
pending.setVisible(true);
pending.getContentPane().setBackground(Color.lightGray);

pending.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  pending.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 
                
            /*  JLabel log1 = new JLabel("Total pending payments are:");
log1.setBounds(100, 30, 400, 30);
pending.add(log1); */

            
            
//textfield for tracking order

//JTextField track = new JTextField(250);
//track.setBounds(200, 30, 40, 30);
//f4.add(track);

//JButton trackbtn = new JButton("Track");
//trackbtn.setBounds(130,120,100,40);
//trackbtn.setBackground(Color.green);
//trackbtn.setForeground(Color.white);
//f4.add(trackbtn);

JButton back = new JButton("Back");
back.setBounds(130,170,100,40);
back.setBackground(Color.orange);
back.setForeground(Color.white);
pending.add(back);


JButton exit = new JButton("Exit");
exit.setBounds(130,220,100,40);
exit.setBackground(Color.red);
exit.setForeground(Color.white);
pending.add(exit);

back.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
    pending.setVisible(false);
    f1.setVisible(true);
}
}
);

exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
   
     System.exit(0);
}
}
);

//trackbtn.addActionListener(new ActionListener(){

//public void actionPerformed(ActionEvent e){
    
//String orderid=track.getText();
    try{
   
          
            PreparedStatement ps = con.prepareStatement("select*from user_payments");

            //ps.setString(1, orderid);

            ResultSet rs = ps.executeQuery();

            if (rs.next()){
            //while(rs.next()){
                
                //f4.setVisible(false);
//JFrame f5 = new JFrame("Track Order results");
//f5.setSize(500,500);
//f5.setLayout(null);
//f5.setVisible(true);
//f5.getContentPane().setBackground(Color.lightGray);

//f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
JLabel tit = new JLabel("Pending Order details");
tit.setBounds(100, 30, 400, 30);
pending.add(tit);
    
JLabel id = new JLabel("Order ID: ");
id.setBounds(50,20,100,150);
pending.add(id);

JTextField b = new JTextField(250);
b.setBounds(200,80,100,30);
b.setEditable(false);
pending.add(b);
b.setText(rs.getString(3)); 

JLabel a = new JLabel("Amount: ");
a.setBounds(50,50,150,150);
pending.add(a);

JTextField bb = new JTextField(250);
bb.setBounds(200,110,100,30);
bb.setEditable(false);
pending.add(bb);
bb.setText(rs.getString(1));



            /*  JLabel result = new JLabel();
result.setBounds(100, 130, 400, 30);
pending.add(result); 

result.setText("payment details:  " + rs.getString(1)); */
                
            //System.out.println("order details:  " + rs.getString(1)+"   "+ rs.getString(2)+"   "+ rs.getString(3)+"   "+ rs.getString(4));
//JButton back = new JButton("Back");
//back.setBounds(130,170,100,40);
//f4.add(back);


            
            //}
            }
            else

            {

                JOptionPane.showMessageDialog(null,

                   "no pending payments found");

            }
    }
    
    catch(Exception e6){
        
        System.out.println(e6);
    
    }

}


}


 );


//}
//}
//);

JButton y4 = new JButton("Received Payments");
y4.setBounds(130,270,140,40);
y4.setBackground(Color.black);
y4.setForeground(Color.white);
f1.add(y4);

y4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){


               f1.setVisible(false);
JFrame paid = new JFrame("Paid Payments");
paid.setSize(500,500);
paid.setLayout(null);
paid.setLocationRelativeTo(null);
paid.setVisible(true);
paid.getContentPane().setBackground(Color.lightGray);

paid.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  paid.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 
                
//JLabel log1 = new JLabel("Total paid payments are:");
//log1.setBounds(100, 30, 400, 30);
//paid.add(log1);

//textfield for tracking order

//JTextField track = new JTextField(250);
//track.setBounds(200, 30, 40, 30);
//f4.add(track);

//JButton trackbtn = new JButton("Track");
//trackbtn.setBounds(130,120,100,40);
//trackbtn.setBackground(Color.green);
//trackbtn.setForeground(Color.white);
//f4.add(trackbtn);

JButton back = new JButton("Back");
back.setBounds(130,170,100,40);
back.setBackground(Color.orange);
back.setForeground(Color.white);
paid.add(back);


JButton exit = new JButton("Exit");
exit.setBounds(130,220,100,40);
exit.setBackground(Color.red);
exit.setForeground(Color.white);
paid.add(exit);

back.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
    paid.setVisible(false);
    f1.setVisible(true);
}
}
);

exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
   
     System.exit(0);
}
}
);

//trackbtn.addActionListener(new ActionListener(){

//public void actionPerformed(ActionEvent e){
    
//String orderid=track.getText();
    try{
   
          
            PreparedStatement ps = con.prepareStatement("select*from user_payments");

            //ps.setString(1, orderid);

            ResultSet rs = ps.executeQuery();

            if (rs.next()){
            //while(rs.next()){
                
                //f4.setVisible(false);
//JFrame f5 = new JFrame("Track Order results");
//f5.setSize(500,500);
//f5.setLayout(null);
//f5.setVisible(true);
//f5.getContentPane().setBackground(Color.lightGray);

//f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
JLabel tit = new JLabel("Paid Order details");
tit.setBounds(100, 30, 400, 30);
paid.add(tit);
    
JLabel id = new JLabel("Order ID: ");
id.setBounds(50,20,100,150);
paid.add(id);

JTextField b = new JTextField(250);
b.setBounds(200,80,100,30);
b.setEditable(false);
paid.add(b);
b.setText(rs.getString(3)); 

JLabel a = new JLabel("Amount: ");
a.setBounds(50,50,150,150);
paid.add(a);

JTextField bb = new JTextField(250);
bb.setBounds(200,110,100,30);
bb.setEditable(false);
paid.add(bb);
bb.setText(rs.getString(1));
                
            //System.out.println("order details:  " + rs.getString(1)+"   "+ rs.getString(2)+"   "+ rs.getString(3)+"   "+ rs.getString(4));
//JButton back = new JButton("Back");
//back.setBounds(130,170,100,40);
//f4.add(back);


            
            //}
            }
            else

            {

                JOptionPane.showMessageDialog(null,

                   "no paid payments found");

            } 
    }
    
    catch(Exception e6){
        
        System.out.println(e6);
    
    }


}
}
);
JButton y5 = new JButton("Track by Image");
y5.setBounds(130,320,140,40);
y5.setBackground(Color.black);
y5.setForeground(Color.white);
f1.add(y5);

y5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){




               
                f1.setVisible(false);
JFrame image = new JFrame("Track by Image");
image.setSize(500,500);
image.setLayout(null);
image.setLocationRelativeTo(null);
//image.setVisible(true);
image.getContentPane().setBackground(Color.lightGray);

image.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  image.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 
                
              JLabel log1 = new JLabel("Under development please check again after some time");
log1.setBounds(1, 1, 400, 50);
image.add(log1);

image.setVisible(false);

 FileChooserExample om=new FileChooserExample(); 
 om.setTitle("Track by Image");
             om.setSize(500,500);    
             om.setLayout(null); 
             f1.setVisible(false);
             om.setVisible(true);    
             om.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  om.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 
             
             om.setLocationRelativeTo(null);
             om.getContentPane().setBackground(Color.lightGray);
             
             
JLabel log11 = new JLabel("Choose File To Compare..");
log11.setBounds(50, 150, 400, 80);
log11.setFont(new Font("Jokerman", Font.BOLD, 20));
log11.setForeground(Color.WHITE);
om.add(log11);


  ImageIcon image1 = new ImageIcon("C:\\Users\\PC\\Desktop\\tbyi.png\\");
JLabel imageLabel1 = new JLabel(image1); 
om.add(imageLabel1);
imageLabel1.setBounds(50, 25, 320, 320);
imageLabel1.setVisible(true); 

//textfield for tracking order

//JTextField track = new JTextField(250);
//track.setBounds(200, 30, 40, 30);
//f4.add(track);

//JButton trackbtn = new JButton("Track");
//trackbtn.setBounds(130,120,100,40);
//trackbtn.setBackground(Color.green);
//trackbtn.setForeground(Color.white);
//f4.add(trackbtn);



//trackbtn.addActionListener(new ActionListener(){

//public void actionPerformed(ActionEvent e){
    
//String orderid=track.getText();
  //  try{
   
          
    //        PreparedStatement ps = con.prepareStatement("select * from payment where oid=?");

      //      ps.setString(1, orderid);

        //    ResultSet rs = ps.executeQuery();

          //  if (rs.next()){
            //while(rs.next()){
                
              //  f4.setVisible(false);
//JFrame f5 = new JFrame("Track Order results");
//f5.setSize(500,500);
//f5.setLayout(null);
//f5.setVisible(true);
//f5.getContentPane().setBackground(Color.lightGray);

//f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                
//              JLabel result = new JLabel();
//result.setBounds(100, 30, 400, 30);
//f5.add(result); 

//result.setText("payment details:  " + rs.getString(1)+"   "+ rs.getString(2)+"   "+ rs.getString(3)+"   "+ rs.getString(4));
                
            //System.out.println("order details:  " + rs.getString(1)+"   "+ rs.getString(2)+"   "+ rs.getString(3)+"   "+ rs.getString(4));
          JButton back = new JButton("Back");
back.setBounds(100,400,100,40);
back.setBackground(Color.orange);
back.setForeground(Color.white);
om.add(back);

JButton exit = new JButton("Exit");
exit.setBounds(220,400,100,40);
exit.setBackground(Color.red);
exit.setForeground(Color.white);
om.add(exit);

back.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    om.setVisible(false);
    image.setVisible(false);
    f1.setVisible(true);
}
}
);

exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
   
     System.exit(0);
}
}
);

            
      //      }
        //    }
          //  else

            //{

              //  JOptionPane.showMessageDialog(null,

                //   "no records found");

            //}
   // }
    
    //catch(Exception e6){
        
      //  System.out.println(e6);
    
   // }

//}


//}


 //);


}
}
);

JButton y6 = new JButton("Logout");
y6.setBounds(130,420,140,40);
y6.setBackground(Color.red);
y6.setForeground(Color.white);
f1.add(y6);

y6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

//System.exit(1);
f1.setVisible(false);

f.setVisible(true);
try{
con.close();
}
catch(Exception e4){
    System.out.println(e4);
}

}


}


 );
           }

            
            }

           
                
                
                
            else{
               
                JOptionPane.showMessageDialog(null,

                   "Incorrect username or password..Try Again with correct details");
            
                  // JLabel xxx = new JLabel("Incorrect username or password");
                   //xxx.setBounds(100,300,500,500);
                   //f.add(xxx);
                   
                   
            }
            
    }
  
       
       catch(Exception e11){
           System.out.println(e11);
       }
 
 }


}


 );

  
  //main exit action list start
  
  exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

f.setVisible(false);
    zero.setVisible(true);
    //System.exit(1);
}


}


 );
  
  //main exit action list end
  
  
   }


}


 ); 
  
  
  
  signup.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
  
    
      //new frame main    
 zero.setVisible(false);      
JFrame f = new JFrame("Easy Tracking");
f.setSize(550,500);
f.setLayout(null);
f.setLocationRelativeTo(null);
f.setVisible(true);
f.getContentPane().setBackground(Color.lightGray);

f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
   if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
              //System.out.println("Yes button clicked");
    } 
         }        
      }); 


ImageIcon image = new ImageIcon("C:\\Users\\PC\\Desktop\\1.jpg\\");
JLabel imageLabel = new JLabel(image); 
f.add(imageLabel);
imageLabel.setBounds(250, 85, 252, 166);
imageLabel.setVisible(true);
//f.setLayout(new FlowLayout());






JLabel a = new JLabel("Enter Name: ");
a.setBounds(50,20,100,150);
//a.setForeground(Color.white);
f.add(a);



JTextField b = new JTextField(250);
b.setBounds(130,80,100,30);
f.add(b);

JLabel p = new JLabel("Password: ");
p.setBounds(50,35,150,200);
f.add(p);

JPasswordField x = new JPasswordField(250);
x.setBounds(130,120,100,30);
f.add(x);


    
    JLabel email = new JLabel("Email ID: ");
email.setBounds(50,50,150,250);
f.add(email);

JTextField email1 = new JTextField(250);
email1.setBounds(130,160,100,30);
f.add(email1);
    
    
    
   JButton y = new JButton("Signup");
y.setBounds(130,200,100,40);
y.setBackground(Color.yellow);
y.setForeground(Color.black);
f.add(y);


JButton exit = new JButton("Home");
exit.setBounds(130,250,100,40);
exit.setBackground(Color.black);
exit.setForeground(Color.white);
f.add(exit);

JLabel cr = new JLabel(" \u00a9  "+" Daniyal Khan.  All Rights Reserved.");
cr.setBounds(100,200,400,400);
//a.setForeground(Color.white);
f.add(cr);


  exit.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

f.setVisible(false);
    zero.setVisible(true);
    //System.exit(1);
}


}


 );




  y.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    
    
     String name = b.getText();

        char[] pa = x.getPassword();

        String pass = new String(pa);
        
        String email = email1.getText();
        
        if(     name.equals("") || email.equals("") || pass.equals("") ){JOptionPane.showMessageDialog(null,

                   "Name, Password or Email.. Cant be Empty");}
        
        else{  

try{
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
          
            PreparedStatement ps = con.prepareStatement("insert into user(name,pass,email) values(?,?,?)");

            ps.setString(1, name);

            ps.setString(2, pass);
            
            ps.setString(3, email);

            ps.executeUpdate();

            
            
            
          
            
            
            JOptionPane.showMessageDialog(null,

                   "Voila! You just Signed Up. You'll be redirected to home. Login from there.");
            
            f.setVisible(false);
            zero.setVisible(true);
            
            }
           
           
        



catch(Exception exp){
    
    
 System.out.println(exp) ;  
    
}





        }

}
}


 );
  
  //main exit action list end
  






}


    }
  

); 
     



  
       }
}

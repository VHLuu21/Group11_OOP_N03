package Jframe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author luuvu
 */
public class BorrowBook extends javax.swing.JFrame {

    /**
     * Creates new form BorrowBook
     */
    public BorrowBook() {
        initComponents();
    }
    
    //Lấy thông tin database và hiển thị thông tin sách
    public void getBookDetails(){
        int bookId = Integer.parseInt(txt_bookId.getText());
        
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM book_details WHERE book_id = ?");
            pst.setInt(1, bookId);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                lbl_bookId.setText(rs.getString("book_id"));
                lbl_bookName.setText(rs.getString("book_name"));
                lbl_author.setText(rs.getString("author"));
                lbl_quantity.setText(rs.getString("quantity"));
                lbl_bookError.setText("");
            }else{
                lbl_bookError.setText("Không tìm thấy thông tin sách !");
                lbl_bookId.setText("");
                lbl_bookName.setText("");
                lbl_author.setText("");
                lbl_quantity.setText("");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    //Lấy thông tin từ database và hiển thị thông tin học sinh
    public void getStudentDetails(){
        int studentId = Integer.parseInt(txt_studentId.getText());
        
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM student_details WHERE student_id = ?");
            pst.setInt(1, studentId);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                lbl_studentId.setText(rs.getString("student_id"));
                lbl_studentName.setText(rs.getString("student_name"));
                lbl_course.setText(rs.getString("course"));
                lbl_branch.setText(rs.getString("branch"));
                lbl_studentError.setText("");
            }else{
                lbl_studentError.setText("Không tìm thấy thông tin sinh viên !");
                lbl_studentId.setText("");
                lbl_studentName.setText("");
                lbl_course.setText("");
                lbl_branch.setText("");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Add thông tin mượn vào database
    public boolean borrowBook(){
        
        boolean isBorrow = false;
        
        int bookId = Integer.parseInt(txt_bookId.getText());
        int studentId = Integer.parseInt(txt_studentId.getText());
        String bookName = lbl_bookName.getText();
        String studentName = lbl_studentName.getText();
        
        Date uBorrowDate = date_borrowDate.getDatoFecha();
        Date uDueDate = date_dueDate.getDatoFecha();
        
        Long l1 = uBorrowDate.getTime();
        Long l2 = uDueDate.getTime();
        
        java.sql.Date sBorrowDate = new java.sql.Date(l1);
        java.sql.Date sDueDate = new java.sql.Date(l2);
        
        try{
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO borrow_book_details(book_id,book_name,student_id,student_name,"
                    + "borrow_date,due_date,status) VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.setString(2, bookName);
            pst.setInt(3, studentId);
            pst.setString(4, studentName);
            pst.setDate(5, sBorrowDate);
            pst.setDate(6, sDueDate);
            pst.setString(7, "Borrowing");
            
            int RC = pst.executeUpdate();
            if(RC > 0){
                isBorrow = true;
            }else{
                isBorrow = false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isBorrow;
    }
    
    //Update số lượng sách
    public void updateBookCount(){
        int bookId = Integer.parseInt(txt_bookId.getText());
        try{
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE book_details SET quantity = quantity - 1 WHERE book_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);
            
            int RC = pst.executeUpdate();
                if(RC > 0){
                    JOptionPane.showMessageDialog(this, "Số lượng sách đã được update !");
                    int A = Integer.parseInt(lbl_quantity.getText());
                    lbl_quantity.setText(Integer.toString(A - 1));
                }else{
                    JOptionPane.showMessageDialog(this, "Không thể update số lượng sách !");
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Check xem sinh viên đã mượn sách naỳ chưa
    public boolean isARBook(){
        
        boolean isAlready = false;
        int bookId = Integer.parseInt(txt_bookId.getText());
        int studentId = Integer.parseInt(txt_studentId.getText());
        
        try{
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM borrow_book_details WHERE book_id = ? AND student_id = ? and status = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.setInt(2, studentId);
            pst.setString(3, "Borrowing");
            
            ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    isAlready = true;
                }else{
                    isAlready = false;
                }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isAlready;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JTextField();
        lbl_bookId = new javax.swing.JTextField();
        lbl_bookName = new javax.swing.JTextField();
        lbl_author = new javax.swing.JTextField();
        lbl_bookError = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbl_studentId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbl_studentName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbl_course = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lbl_branch = new javax.swing.JTextField();
        lbl_studentError = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_studentId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_bookId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        date_borrowDate = new rojeru_san.componentes.RSDateChooser();
        jLabel16 = new javax.swing.JLabel();
        date_dueDate = new rojeru_san.componentes.RSDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_main.setBackground(new java.awt.Color(255, 255, 255));
        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_icon/arrow-left.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/Icon/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel2.setText(" Book Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 270, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 180, 150, 5));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book ID :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Author :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        lbl_quantity.setBackground(new java.awt.Color(204, 0, 204));
        lbl_quantity.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_quantity.setForeground(new java.awt.Color(255, 255, 255));
        lbl_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_quantityActionPerformed(evt);
            }
        });
        jPanel1.add(lbl_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 230, 40));

        lbl_bookId.setBackground(new java.awt.Color(204, 0, 204));
        lbl_bookId.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_bookId.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_bookIdActionPerformed(evt);
            }
        });
        jPanel1.add(lbl_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 230, 40));

        lbl_bookName.setBackground(new java.awt.Color(204, 0, 204));
        lbl_bookName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_bookName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_bookNameActionPerformed(evt);
            }
        });
        jPanel1.add(lbl_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 230, 40));

        lbl_author.setBackground(new java.awt.Color(204, 0, 204));
        lbl_author.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(255, 255, 255));
        lbl_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_authorActionPerformed(evt);
            }
        });
        jPanel1.add(lbl_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 230, 40));

        lbl_bookError.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbl_bookError.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.add(lbl_bookError, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 670, 360, 30));

        panel_main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 750));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/Icon/icons8_Student_Registration_100px_2.png"))); // NOI18N
        jLabel7.setText(" Student Details");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 280, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 190, 5));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student ID :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lbl_studentId.setBackground(new java.awt.Color(255, 102, 102));
        lbl_studentId.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_studentId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lbl_studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 240, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student Name :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        lbl_studentName.setBackground(new java.awt.Color(255, 102, 102));
        lbl_studentName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_studentName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lbl_studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 240, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 80, 30));

        lbl_course.setBackground(new java.awt.Color(255, 102, 102));
        lbl_course.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_course.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lbl_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 240, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Branch :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        lbl_branch.setBackground(new java.awt.Color(255, 102, 102));
        lbl_branch.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_branch.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lbl_branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 240, 40));

        lbl_studentError.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbl_studentError.setForeground(new java.awt.Color(204, 204, 0));
        jPanel4.add(lbl_studentError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 390, 30));

        panel_main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 430, 750));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/Icon/icons8_Books_52px_1.png"))); // NOI18N
        jLabel12.setText("  Borrow Book");
        panel_main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, 230, -1));

        jPanel5.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        panel_main.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 250, 5));

        txt_studentId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_studentId.setForeground(new java.awt.Color(255, 51, 51));
        txt_studentId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_studentId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_studentIdFocusLost(evt);
            }
        });
        panel_main.add(txt_studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 260, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Student ID :");
        panel_main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Book ID :");
        panel_main.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, -1, -1));

        txt_bookId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_bookId.setForeground(new java.awt.Color(255, 51, 0));
        txt_bookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_bookId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_bookIdFocusLost(evt);
            }
        });
        panel_main.add(txt_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 260, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Borrow Date :");
        panel_main.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, -1, -1));

        date_borrowDate.setColorBackground(new java.awt.Color(255, 51, 0));
        date_borrowDate.setColorForeground(new java.awt.Color(255, 51, 0));
        date_borrowDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date_borrowDate.setFormatoFecha("dd/MM/yy");
        date_borrowDate.setFuente(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        date_borrowDate.setPlaceholder("Select Borrow Date");
        panel_main.add(date_borrowDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 260, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Due Date :");
        panel_main.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, -1, -1));

        date_dueDate.setColorBackground(new java.awt.Color(255, 51, 0));
        date_dueDate.setColorForeground(new java.awt.Color(255, 51, 0));
        date_dueDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date_dueDate.setFormatoFecha("dd/MM/yy");
        date_dueDate.setFuente(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        date_dueDate.setPlaceholder("Select Due Date");
        panel_main.add(date_dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 260, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BORROW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_main.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 210, 50));

        getContentPane().add(panel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 750));

        setSize(new java.awt.Dimension(1314, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_quantityActionPerformed

    private void lbl_bookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_bookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_bookIdActionPerformed

    private void lbl_bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_bookNameActionPerformed

    private void lbl_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_authorActionPerformed

    private void txt_bookIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bookIdFocusLost
        
        if(!txt_bookId.getText().equals("")){
            getBookDetails();
        }
    }//GEN-LAST:event_txt_bookIdFocusLost

    private void txt_studentIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_studentIdFocusLost
        
        if(!txt_studentId.getText().equals("")){
            getStudentDetails();
        }
    }//GEN-LAST:event_txt_studentIdFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(lbl_quantity.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "Sách đã hết !");
        }else{
            if(isARBook() == false){
                
                if(borrowBook() == true){
                    JOptionPane.showMessageDialog(this, "Mượn sách thành công !");
                    updateBookCount();
                }else{
                JOptionPane.showMessageDialog(this, "Mượn sách thất bại !");
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Sinh viên đã mượn sách này !");
            }
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser date_borrowDate;
    private rojeru_san.componentes.RSDateChooser date_dueDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lbl_author;
    private javax.swing.JLabel lbl_bookError;
    private javax.swing.JTextField lbl_bookId;
    private javax.swing.JTextField lbl_bookName;
    private javax.swing.JTextField lbl_branch;
    private javax.swing.JTextField lbl_course;
    private javax.swing.JTextField lbl_quantity;
    private javax.swing.JLabel lbl_studentError;
    private javax.swing.JTextField lbl_studentId;
    private javax.swing.JTextField lbl_studentName;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTextField txt_bookId;
    private javax.swing.JTextField txt_studentId;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaacademicapp;

import DAO.DBConnector;
import DAO.UserDAO;
import Model.Activity;
import Model.Customer;
import Model.Partner;
import Model.Staff;
import Model.User;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;
import java.time.ZonedDateTime;

/**
 *
 * @author LEGION 5
 */

/*
Pada kelas main, lakukan aksi-aksi berikut secara berurut.
    1. Buat 5 buat user baru!
    2. Ubah username 2 user yang telah anda buat!
    3. Coba ubah username salah satu user dengan menggunakan username yang sama dengan username yang 
    ada!
    4. Coba ubah username 2 user yang lain dengan menggunakan username yang telah ada!
    5. Cetak seluruh activity yang telah ada!
    6. Cetak seluruh activity yang terjadi pada hari ini. 
    7. Lakukan login 2 kali dengan menggunakan user yang berbeda!
    8. Lakukan failed login 2 kali dengan menggunakan user yang berbeda!
    9. Cetak seluruh activity yang dilakukan oleh 2 user tertentu. 
    10. Cetak 10 activity terakhir.
 */
public class JavaUserManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Inisialisasi Database
        DBConnector.initiateDB();

//        Tambah 5 user ke database
        User user1 = new User("Ayu", "Ayu082", "081234567890");
        User user2 = new User("Ririn", "Ririn09123", "081234567891");
        User user3 = new User("Rani", "Rani122", "081234567892");
        User user4 = new User("Bara", "Baraass1233", "081234567893");
        User user5 = new User("Dito", "Dito9123", "081234567894");

        UserDAO.addUser(user1);
        UserDAO.addUser(user2);
        UserDAO.addUser(user3);
        UserDAO.addUser(user4);
        UserDAO.addUser(user5);

//         Tambah 5 Staff ke database
        Staff staff1 = new Staff("Ayu", "081234567890", "Ayu082", "Ayu Prasinta", "1");
        Staff staff2 = new Staff("Ririn", "081234567891", "Ririn09123", "Syabrina Ramadhani", "3");
        Staff staff3 = new Staff("Rani", "081234567892", "Rani122", "Rani Syafitri", "2");
        Staff staff4 = new Staff("Bara", "081234567893", "Baraass1233", "Edwin Brayen", "3");
        Staff staff5 = new Staff("Dito", "081234567894", "Dito9123", "Dito Majid", "2");

        UserDAO.addStaff(staff1);
        UserDAO.addStaff(staff2);
        UserDAO.addStaff(staff3);
        UserDAO.addStaff(staff4);
        UserDAO.addStaff(staff5);

//        Tambah 5 Customer ke Database
        Customer cus1 = new Customer("Ayu", "081234567890", "Ayu082", "Ayu Prasinta", ZonedDateTime.now().toString());
        Customer cus2 = new Customer("Ririn", "081234567891", "Ririn09123", "Syabrina Ramadhani", ZonedDateTime.now().toString());
        Customer cus3 = new Customer("Rani", "081234567892", "Rani122", "Rani Syafitri", ZonedDateTime.now().toString());
        Customer cus4 = new Customer("Bara", "081234567893", "Baraass1233", "Edwin Brayen", ZonedDateTime.now().toString());
        Customer cus5 = new Customer("Dito", "081234567894", "Dito9123", "Dito Majid", ZonedDateTime.now().toString());

        UserDAO.addCustomer(cus1);
        UserDAO.addCustomer(cus2);
        UserDAO.addCustomer(cus3);
        UserDAO.addCustomer(cus4);
        UserDAO.addCustomer(cus5);

//        Tambah 5 Partner
        Partner par1 = new Partner("Wak Ijal", "Ijals12", "1612445", "Rijalul", "Ijal Corporation", "Semarang");
        Partner par2 = new Partner("Adi", "suryadi11", "1928452", "Mulyadi", "Adi Corp", "Magelang");
        Partner par3 = new Partner("Jono", "jonogtg23", "2891042", "Joman", "Jono Enterprise", "Bali");
        Partner par4 = new Partner("joni", "joni113", "2901984", "Joniwan", "Joni Tower", "Pekanbaru");
        Partner par5 = new Partner("Masihul", "sihul114", "20918948", "Masihul", "Sihul Life", "Medan");

        UserDAO.addPartner(par1);
        UserDAO.addPartner(par2);
        UserDAO.addPartner(par3);
        UserDAO.addPartner(par4);
        UserDAO.addPartner(par5);

        (new UserManagementFrame()).setVisible(true);

    }

}

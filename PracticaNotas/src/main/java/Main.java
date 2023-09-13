import singledomain.ConexionDB;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try (Connection conn = ConexionDB.getInstance()) {

        } catch (Exception e) {

        }
    }
}

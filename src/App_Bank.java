import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prova {
    private JTextField txtCompromisso;
    private JSpinner spnData;
    private JTable tblResultado;
    private JButton btnRemover;
    private JButton btnAdicionar;
    private JPanel panelMain;
    private JLabel lblSelecioneData;
    private JLabel lblQualseuCompromisso;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Prova");
        frame.setContentPane(new Prova().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
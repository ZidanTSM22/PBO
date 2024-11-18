import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FoodOrderApp extends JFrame {
    private JTextField namaField, alamatField, telpField;
    private JCheckBox steakCheck, spaghettiCheck, pizzaCheck;
    private JTextArea pesananArea;
    private JLabel totalLabel;
    private int totalHarga = 0;

    public FoodOrderApp() {
        // Setting JFrame properties
        setTitle("Aplikasi Pemesanan Makanan");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel untuk Data Customer
        JPanel customerPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        customerPanel.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        customerPanel.add(new JLabel("Nama:"));
        namaField = new JTextField();
        customerPanel.add(namaField);
        customerPanel.add(new JLabel("Alamat:"));
        alamatField = new JTextField();
        customerPanel.add(alamatField);
        customerPanel.add(new JLabel("No Telp:"));
        telpField = new JTextField();
        customerPanel.add(telpField);

        // Panel untuk Pilihan Menu
        JPanel menuPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        menuPanel.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));

        // Checkbox untuk setiap menu
        steakCheck = new JCheckBox("Steak (Rp 50.000)");
        spaghettiCheck = new JCheckBox("Spaghetti (Rp 40.000)");
        pizzaCheck = new JCheckBox("Pizza (Rp 80.000)");

        // Menambahkan ItemListener untuk menghitung total harga saat dipilih
        steakCheck.addItemListener(new MenuItemListener(50000));
        spaghettiCheck.addItemListener(new MenuItemListener(40000));
        pizzaCheck.addItemListener(new MenuItemListener(80000));

        menuPanel.add(steakCheck);
        menuPanel.add(spaghettiCheck);
        menuPanel.add(pizzaCheck);

        // Panel untuk tombol dan area pesanan
        JPanel orderPanel = new JPanel(new BorderLayout());

        // Tombol Tambah
        JButton addButton = new JButton("Tambah");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahPesanan();
            }
        });

        // Area untuk menampilkan pesanan
        pesananArea = new JTextArea(5, 20);
        pesananArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(pesananArea);

        // Label untuk total bayar
        totalLabel = new JLabel("Total Bayar: Rp 0");

        orderPanel.add(addButton, BorderLayout.NORTH);
        orderPanel.add(scrollPane, BorderLayout.CENTER);
        orderPanel.add(totalLabel, BorderLayout.SOUTH);

        // Menambahkan semua panel ke JFrame
        add(customerPanel, BorderLayout.NORTH);
        add(menuPanel, BorderLayout.CENTER);
        add(orderPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void tambahPesanan() {
        StringBuilder pesanan = new StringBuilder("Pesanan:\n");

        if (steakCheck.isSelected()) pesanan.append("- Steak\n");
        if (spaghettiCheck.isSelected()) pesanan.append("- Spaghetti\n");
        if (pizzaCheck.isSelected()) pesanan.append("- Pizza\n");

        pesananArea.setText(pesanan.toString());
    }

    private class MenuItemListener implements ItemListener {
        private int harga;

        public MenuItemListener(int harga) {
            this.harga = harga;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                totalHarga += harga;
            } else {
                totalHarga -= harga;
            }
            totalLabel.setText("Total Bayar: Rp " + totalHarga);
        }
    }

    public static void main(String[] args) {
        new FoodOrderApp();
    }
}

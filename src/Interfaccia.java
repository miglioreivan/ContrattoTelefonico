import javax.swing.*;

public class Interfaccia  {
    protected String Nome;
    protected String numerotelefono;
    private Double  Costot;
    private int numerotelefonate;
    private Double costominuto;
    private String costot2;
    private Double calcolo;
    private String calcolo1;
    private String calcolo2;
    private String costrisp;
   private String costorisp1;

    private JLabel NumeroTel;
    private JLabel NumeroUtente;
    private JLabel Ntelefonate;
    private JLabel Num1;
    private JButton invianumero;
    private JButton invianome;
    private JPanel interfaccia;
    private JTextField Tx1;
    private JTextField Tx2;
    private JLabel Label3;
    private JLabel telefonate;
    private JLabel NumeroT;
    private JLabel nome;
    private JLabel Nome1;
    private JTextField Tx3;
    private JButton aggiungicosto;
    private JLabel aggcosto;
    private JCheckBox CB1;
    private JTextField Tx4;
    private JLabel indirizzo;
    private JButton inviaindirizzo;
    private JLabel bollettaM;
    private JTextField Tx5;
    private JLabel Costomin;
    private JLabel costoR;
    private JLabel costoR1;
    private JButton inviacostoR;
    private JButton salvatelefono;
    private JTextField Tx6;
    private JLabel instel;
    private JButton Calcola;
    private JLabel TotaleM;
    private JLabel CostoF;
    private JTextField Tx7;
    private JLabel CostoMens;
    private JButton inviacostfisso;
    private JTextField Tx8;
    private JButton ntel;
    private JLabel telefonate2;
    private JLabel telfield;

    public Interfaccia()
    {
        invianumero.addActionListener(actionEvent ->
        {
          numerotelefono=Tx1.getText();
          Num1.setText(numerotelefono);
          Tx1.setText("");
        });
        invianome.addActionListener(actionEvent ->
        {
     Nome=Tx2.getText();
     Nome1.setText(Nome);
     Tx2.setText("");
        });

        inviaindirizzo.addActionListener(actionEvent ->
        {
            bollettaM.setText(Tx4.getText());
           Tx4.setText("");
        });
        aggiungicosto.addActionListener(actionEvent ->
        {
            Costomin.setText( Tx3.getText());
            Tx3.setText("");
        });
        inviacostoR.addActionListener(actionEvent ->
        {
          costoR.setText(Tx5.getText());
          costorisp1=Tx5.getText();
          costoR.setText(Tx5.getText());
          Tx5.setText("");
        });
        salvatelefono.addActionListener(actionEvent ->
        {
            telefonate.setText(Tx6.getText());
            Tx6.setText("");
        });
        inviacostfisso.addActionListener(actionEvent ->
        {
           CostoF.setText(Tx7.getText()+"€");
           Tx7.setText("");
        });
        ntel.addActionListener(actionEvent ->
        {
            telfield.setText(Tx8.getText());
            Tx8.setText("");
        });
        Calcola.addActionListener(actionEvent ->
        {
            calcolo1=Costomin.getText();
            calcolo=Double.parseDouble(calcolo1);
            calcolo2=telefonate.getText();
            calcolo=calcolo*Double.parseDouble(calcolo2)+Double.parseDouble(costorisp1);
            TotaleM.setText(String.valueOf(calcolo)+"€");
            telefonate.setText(telefonate.getText()+"€");
            costoR.setText(costoR.getText()+"€");
            Costomin.setText( Costomin.getText()+"€");
        });
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Contratto telefonico");
        frame.setContentPane(new Interfaccia().interfaccia);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

import javax.swing.*;

public class ContrattoTelefonico {

    private JPanel ContrattoTelefonico;
    private JLabel costo;
    private JLabel nchiamate;
    private JLabel costomin;
    private JTextField numtelefono;
    private JButton button02;
    private JButton button01;
    private JTextField nomeutente;
    private String x,y;

    public ContrattoTelefonico(){
        costo.setText("7.99€");
        nchiamate.setText("500");
        costomin.setText("0.5€");

        button01.addActionListener( a->{
            x=numtelefono.getText();
        });

        button02.addActionListener( a->{
            y=nomeutente.getText();
        });





    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Calcolatrice");
        frame.setContentPane(new ContrattoTelefonico().ContrattoTelefonico);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}

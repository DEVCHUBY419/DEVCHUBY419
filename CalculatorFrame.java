import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame implements ActionListener {
    private JTextField txtForce, txtDistance, txtTime;
    private JLabel lblWork, lblEnergy, lblPower;

    public CalculatorFrame() {
        setLayout(new GridLayout(4, 2));

        JLabel lblForce = new JLabel("Force (N):");
        txtForce = new JTextField();
        JLabel lblDistance = new JLabel("Distance (m):");
        txtDistance = new JTextField();
        JLabel lblTime = new JLabel("Time (s):");
        txtTime = new JTextField();

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);

        JLabel lblWorkTitle = new JLabel("Work (J):");
        lblWork = new JLabel();
        JLabel lblEnergyTitle = new JLabel("Energy (J):");
        lblEnergy = new JLabel();
        JLabel lblPowerTitle = new JLabel("Power (W):");
        lblPower = new JLabel();

        add(lblForce);
        add(txtForce);
        add(lblDistance);
        add(txtDistance);
        add(lblTime);
        add(txtTime);
        add(btnCalculate);
        add(new JLabel()); // Empty label for spacing
        add(lblWorkTitle);
        add(lblWork);
        add(lblEnergyTitle);
        add(lblEnergy);
        add(lblPowerTitle);
        add(lblPower);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            double force = Double.parseDouble(txtForce.getText());
            double distance = Double.parseDouble(txtDistance.getText());
            double time = Double.parseDouble(txtTime.getText());

            double work = force * distance;
            double energy = work;
            double power = work / time;

            lblWork.setText(String.format("%.2f", work));
            lblEnergy.setText(String.format("%.2f", energy));
            lblPower.setText(String.format("%.2f", power));
        }
    }
}

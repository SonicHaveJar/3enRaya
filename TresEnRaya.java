
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TresEnRaya extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static final int ANCHO = 630;
	public static final int ALTO = 330;

	public static String beginLabel = "";

	public static final String NAME = "3EnRaya";

	public static int turn = (int) (Math.random() * 2);

	public static boolean ULB = false, UMB = false, URB = false, MLB = false, MMB = false, MRB = false, DLB = false,
			DMB = false, DRB = false;

	public static boolean ULR = false, UMR = false, URR = false, MLR = false, MMR = false, MRR = false, DLR = false,
			DMR = false, DRR = false;
	public static int ULj = 0, UMj = 0, URj = 0, MLj = 0, MMj = 0, MRj = 0, DLj = 0, DMj = 0, DRj = 0;

	JFrame frame = new JFrame(NAME);
	Dimension d = new Dimension(ANCHO, ALTO);

	JLabel begin = new JLabel(beginLabel);

	Color myBlue = new Color(49, 116, 241);
	Color myRed = new Color(230, 49, 37);

	// Botones arriba
	JButton botonUL = new JButton();
	JButton botonUM = new JButton();
	JButton botonUR = new JButton();
	// end Botones arriba
	// Botones Medio
	JButton botonML = new JButton();
	JButton botonMM = new JButton();
	JButton botonMR = new JButton();
	// Botones Medio
	// Botones Abajo
	JButton botonDL = new JButton();
	JButton botonDM = new JButton();
	JButton botonDR = new JButton();
	// Botones Abajo

	JButton botonRestart = new JButton("Restart");

	public TresEnRaya() {
		// cREACIÓN DE VENTANA
		frame.setLayout(null);

		frame.setLocationRelativeTo(null);
		frame.setSize(d);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// end cREACIÓN DE VENTANA

		// Botones arriba
		botonUL.setBounds(0, 0, 100, 100);
		botonUL.addActionListener(this);
		frame.add(botonUL);

		botonUM.setBounds(100, 0, 100, 100);
		botonUM.addActionListener(this);
		frame.add(botonUM);

		botonUR.setBounds(200, 0, 100, 100);
		botonUR.addActionListener(this);
		frame.add(botonUR);
		// end Botones arriba

		// Botones Medio
		botonML.setBounds(0, 100, 100, 100);
		botonML.addActionListener(this);
		frame.add(botonML);

		botonMM.setBounds(100, 100, 100, 100);
		botonMM.addActionListener(this);
		frame.add(botonMM);

		botonMR.setBounds(200, 100, 100, 100);
		botonMR.addActionListener(this);
		frame.add(botonMR);
		// end Botones Medio

		// Botones Abajo
		botonDL.setBounds(0, 200, 100, 100);
		botonDL.addActionListener(this);
		frame.add(botonDL);

		botonDM.setBounds(100, 200, 100, 100);
		botonDM.addActionListener(this);
		frame.add(botonDM);

		botonDR.setBounds(200, 200, 100, 100);
		botonDR.addActionListener(this);
		frame.add(botonDR);
		// Botones Abajo

		botonRestart.setBounds(510, 10, 90, 45);
		botonRestart.addActionListener(this);
		frame.add(botonRestart);

		begin.setBounds(320, 10, 200, 20);
		frame.add(begin);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(botonRestart)) {
			restart();
		}

		// Botones arriba

		if (!ULB && e.getSource().equals(botonUL)) {
			if (turn >= 1) {
				botonUL.setBackground(myBlue);
				turn = 0;
				ULB = true;
				ULR = true;
			}
		}
		if (!ULR && e.getSource().equals(botonUL)) {
			botonUL.setBackground(myRed);
			turn = 1;
			ULB = true;
			ULR = true;
		}

		if (!UMB && e.getSource().equals(botonUM)) {
			if (turn >= 1) {
				botonUM.setBackground(myBlue);
				turn = 0;
				UMB = true;
				UMR = true;
			}
		}
		if (!UMR && e.getSource().equals(botonUM)) {
			botonUM.setBackground(myRed);
			turn = 1;
			UMB = true;
			UMR = true;
		}

		if (!URB && e.getSource().equals(botonUR)) {
			if (turn >= 1) {
				botonUR.setBackground(myBlue);
				turn = 0;
				URB = true;
				URR = true;
			}
		}
		if (!URR && e.getSource().equals(botonUR)) {
			botonUR.setBackground(myRed);
			turn = 1;
			URB = true;
			URR = true;
		}
		// end Botones arriba

		// Botones Medio

		if (!MLB && e.getSource().equals(botonML)) {
			if (turn >= 1) {
				botonML.setBackground(myBlue);
				turn = 0;
				MLB = true;
				MLR = true;
			}
		}
		if (!MLR && e.getSource().equals(botonML)) {
			botonML.setBackground(myRed);
			turn = 1;
			MLB = true;
			MLR = true;
		}

		if (!MMB && e.getSource().equals(botonMM)) {
			if (turn >= 1) {
				botonMM.setBackground(myBlue);
				turn = 0;
				MMB = true;
				MMR = true;
			}
		}
		if (!MMR && e.getSource().equals(botonMM)) {
			botonMM.setBackground(myRed);
			turn = 1;
			MMB = true;
			MMR = true;
		}

		if (!MRB && e.getSource().equals(botonMR)) {
			if (turn >= 1) {
				botonMR.setBackground(myBlue);
				turn = 0;
				MRB = true;
				MRR = true;
			}
		}
		if (!MRR && e.getSource().equals(botonMR)) {
			botonMR.setBackground(myRed);
			turn = 1;
			MRB = true;
			MRR = true;
		}

		// end Botones Medio

		// Botones Abajo
		if (!DLB && e.getSource().equals(botonDL)) {
			if (turn >= 1) {
				botonDL.setBackground(myBlue);
				turn = 0;
				DLB = true;
				DLR = true;
			}
		}
		if (!DLR && e.getSource().equals(botonDL)) {
			botonDL.setBackground(myRed);
			turn = 1;
			DLB = true;
			DLR = true;
		}

		if (!DMB && e.getSource().equals(botonDM)) {
			if (turn >= 1) {
				botonDM.setBackground(myBlue);
				turn = 0;
				DMB = true;
				DMR = true;
			}
		}
		if (!DMR && e.getSource().equals(botonDM)) {
			botonDM.setBackground(myRed);
			turn = 1;
			DMB = true;
			DMR = true;
		}

		if (!DRB && e.getSource().equals(botonDR)) {
			if (turn >= 1) {
				botonDR.setBackground(myBlue);
				turn = 0;
				DRB = true;
				DRR = true;
			}
		}
		if (!DRR && e.getSource().equals(botonDR)) {
			botonDR.setBackground(myRed);
			turn = 1;
			DRB = true;
			DRR = true;
		}
		// end Botones Abajo

		if (turn > 1) {
			turn = 0;
		}

	}

	public void restart() {
		ULB = false;
		UMB = false;
		URB = false;
		MLB = false;
		MMB = false;
		MRB = false;
		DLB = false;
		DMB = false;
		DRB = false;
		ULR = false;
		UMR = false;
		URR = false;
		MLR = false;
		MMR = false;
		MRR = false;
		DLR = false;
		DMR = false;
		DRR = false;

		botonUL.setBackground(null);
		botonUM.setBackground(null);
		botonUR.setBackground(null);
		botonML.setBackground(null);
		botonMM.setBackground(null);
		botonMR.setBackground(null);
		botonDL.setBackground(null);
		botonDM.setBackground(null);
		botonDR.setBackground(null);
	}

	public void finish() {
		try {
			Thread.sleep(3000);
			restart();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (turn >= 1) {
			beginLabel = "Turno del azul";
		} else {
			beginLabel = "Turno del rojo";
		}
		new TresEnRaya();
	}
}

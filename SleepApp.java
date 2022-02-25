import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * Calculates your change in coins depending on the ammount you entered
 * ASDJHAKSDHASDJHASKJLHDLAKDJ
 * modified 2022-02-15 date 2022-02-15
 * 
 * @filename SleepApp.java
 * @author Anuja
 * @version 1.0
 * @see ICS4U 1.4 Activity Change
 */

public class SleepApp extends javax.swing.JFrame {

	public SleepApp() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		lblTitle = new javax.swing.JLabel();
		lblEnterBirth = new javax.swing.JLabel();
		btnCalculate = new javax.swing.JButton();
		btnExit = new javax.swing.JButton();
		lblTodayDate = new javax.swing.JLabel();
		txtBirthYear = new javax.swing.JTextField();
		lblBirthDay = new javax.swing.JLabel();
		lblBirthDay.setText("Day");
		lblBirthMonth = new javax.swing.JLabel();
		lblBirthMonth.setText("Month");
		lblTodayDay = new javax.swing.JLabel();
		txtBirthDay = new javax.swing.JTextField();
		txtTodayDay = new javax.swing.JTextField();
		txtBirthMonth = new javax.swing.JTextField();
		txtTodayMonth = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24));
		lblTitle.setForeground(new java.awt.Color(255, 0, 102));
		lblTitle.setText("Sleep Caclulator");

		lblEnterBirth.setFont(new java.awt.Font("Tahoma", 0, 14));
		lblEnterBirth.setText("Enter Your Birthdate ");

		btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 14));
		btnCalculate.setText("Calculate");
		btnCalculate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCalculateActionPerformed(evt);
			}
		});

		btnExit.setFont(new java.awt.Font("Tahoma", 0, 14));
		btnExit.setText("Exit");
		btnExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExitActionPerformed(evt);
			}
		});

		lblTodayDate.setFont(new java.awt.Font("Tahoma", 0, 14));
		lblTodayDate.setText("Enter Today's Date");

		txtBirthYear.setFont(new java.awt.Font("Tahoma", 0, 14));

		lblBirthDay.setFont(new java.awt.Font("Tahoma", 0, 14));

		lblBirthMonth.setFont(new java.awt.Font("Tahoma", 0, 14));

		lblTodayDay.setFont(new java.awt.Font("Tahoma", 0, 14));
		lblTodayDay.setText("Day");

		txtBirthDay.setFont(new java.awt.Font("Tahoma", 0, 14));

		txtTodayDay.setFont(new java.awt.Font("Tahoma", 0, 14));

		txtBirthMonth.setFont(new java.awt.Font("Tahoma", 0, 14));

		txtTodayMonth.setFont(new java.awt.Font("Tahoma", 0, 14));

		JLabel lblBirthYear = new JLabel("Year");
		lblBirthYear.setFont(new java.awt.Font("Tahoma", 0, 14));
		JLabel lblTodayYear = new JLabel("Year");
		lblTodayYear.setFont(new java.awt.Font("Tahoma", 0, 14));

		txtTodayYear = new JTextField();
		txtTodayYear.setColumns(10);
		txtAlive = new JTextField();
		txtAlive.setColumns(10);

		txtSleep = new JTextField();
		txtSleep.setColumns(10);

		JLabel lblTdyMonth = new JLabel("Month");
		lblTdyMonth.setFont(new Font("Tahoma", Font.PLAIN, 14));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addGap(42)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(btnCalculate).addGap(66))
								.addGroup(layout
										.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblEnterBirth)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(Alignment.LEADING)
														.addComponent(btnExit, Alignment.TRAILING,
																GroupLayout.PREFERRED_SIZE, 89,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(layout.createSequentialGroup().addGap(26)
																.addGroup(layout.createParallelGroup(Alignment.TRAILING)
																		.addComponent(lblBirthYear,
																				GroupLayout.PREFERRED_SIZE, 37,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(layout
																				.createParallelGroup(Alignment.LEADING)
																				.addComponent(lblBirthDay,
																						GroupLayout.PREFERRED_SIZE, 36,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblBirthMonth)))))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(layout.createParallelGroup(Alignment.LEADING)
																.addComponent(txtBirthDay, GroupLayout.DEFAULT_SIZE, 79,
																		Short.MAX_VALUE)
																.addComponent(txtBirthMonth, GroupLayout.DEFAULT_SIZE,
																		79, Short.MAX_VALUE)
																.addComponent(txtBirthYear, GroupLayout.PREFERRED_SIZE,
																		73, GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtAlive, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
								.addComponent(txtSleep))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(lblTodayDate)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblTodayYear).addComponent(lblTodayDay))
												.addComponent(lblTdyMonth))
										.addGap(18)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(txtTodayDay, GroupLayout.DEFAULT_SIZE, 91,
																Short.MAX_VALUE)
														.addGap(1))
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
																.addComponent(txtTodayMonth).addComponent(txtTodayYear))
														.addPreferredGap(ComponentPlacement.RELATED, 5,
																Short.MAX_VALUE)))))
						.addGap(100))
				.addGroup(layout.createSequentialGroup().addContainerGap(279, Short.MAX_VALUE).addComponent(lblTitle)
						.addGap(267)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap().addComponent(lblTitle).addGap(11)
				.addGroup(layout
						.createParallelGroup(Alignment.BASELINE).addComponent(lblEnterBirth).addComponent(lblTodayDate))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(lblTodayDay)
						.addComponent(txtTodayDay, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBirthDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBirthDay))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtBirthMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBirthMonth))
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTodayMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTdyMonth)))
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(lblTodayYear)
										.addComponent(txtTodayYear, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup().addComponent(lblBirthYear).addGap(19)
												.addComponent(btnCalculate).addGap(32).addComponent(btnExit))
										.addGroup(
												layout.createSequentialGroup()
														.addComponent(txtBirthYear, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(27)
														.addComponent(txtAlive, GroupLayout.PREFERRED_SIZE, 29,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(txtSleep, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap()));
		getContentPane().setLayout(layout);

		pack();

		txtBirthDay.setText("0");
		txtBirthMonth.setText("0");
		txtTodayDay.setText("0");
		txtTodayMonth.setText("0");
		txtTodayYear.setText("0");
		txtBirthYear.setText("0");
		txtAlive.setText("You have been alive for O days");
		
	}

	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {

		System.exit(0);
	}

	private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {

		int birthDays, birthMonths, birthYear, todayDays, todayMonths, todayYear, todayAlive, hoursSlept;
		boolean display = true;
		try {
			birthDays = Integer.parseInt(txtBirthDay.getText());
			birthMonths = Integer.parseInt(txtBirthMonth.getText());
			birthYear = Integer.parseInt(txtBirthYear.getText());

			todayDays = Integer.parseInt(txtTodayDay.getText());
			todayMonths = Integer.parseInt(txtTodayMonth.getText());
			todayYear = Integer.parseInt(txtTodayYear.getText());

			todayAlive = (((todayYear - birthYear) * 365) + ((todayMonths - birthMonths) * 30)
					+ (todayDays - birthDays));
			hoursSlept = todayAlive * 24;

			if ((birthDays > 31) || (birthDays < 1) || (todayDays > 31) || (todayDays < 0)) {
				txtAlive.setText("Please enter a valid date");
				display = false;
			}

			if ((birthMonths > 12) || (birthMonths < 1) || (todayMonths > 12) || (todayMonths < 0)) {
				txtAlive.setText("Please enter a valid date");
				display = false;
			}

		
			if ((todayAlive < 0) || (todayAlive > 1000000)) {
				txtAlive.setText("Please enter valid dates");
				display = false;
			}

			if ((hoursSlept < 0) || (hoursSlept > 1000000)) {
				txtAlive.setText("Please enter valid dates");
				display = false;
			}
			 
			if (display) {
				txtAlive.setText("You have been alive for " + todayAlive + " days");
				txtSleep.setText("You have been asleep for " + hoursSlept + " hours");
			}

		} catch (java.lang.NumberFormatException ex) {
			txtAlive.setText("Please enter valid dates");
		}

	}

	// Check number too big for text field 
	// Make a format label 
	
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}

		catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SleepApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SleepApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SleepApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SleepApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SleepApp().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnCalculate;
	private javax.swing.JButton btnExit;
	private javax.swing.JLabel lblTodayDate;
	private javax.swing.JLabel lblTitle;
	private javax.swing.JLabel lblBirthMonth;
	private javax.swing.JLabel lblEnterBirth;
	private javax.swing.JLabel lblTodayDay;
	private javax.swing.JLabel lblBirthDay;
	private javax.swing.JTextField txtBirthYear;
	private javax.swing.JTextField txtBirthMonth;
	private javax.swing.JTextField txtTodayDay;
	private javax.swing.JTextField txtTodayMonth;
	private javax.swing.JTextField txtBirthDay;
	private JTextField txtTodayYear;
	private JTextField txtAlive;
	private JTextField txtSleep;

}

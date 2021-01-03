package registration_system;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_System extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField jtxtRefNo;
	private JTextField jtxtFirstname;
	private JTextField jtxtSurname;
	private JTextField jtxtAddress;
	private JTextField jtxtPostCode;
	private JTextField jtxtTelephone;
	private JTextField jtxtDateReg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_System frame = new Registration_System();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration_System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1338, 637);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(26, 26, 1280, 95);
		panel.add(panel_1);
		
		JLabel lblMembershipRegistrationSystem = new JLabel("Proton Car Registration System");
		lblMembershipRegistrationSystem.setFont(new Font("Calibri", Font.PLAIN, 40));
		lblMembershipRegistrationSystem.setBounds(24, 23, 847, 61);
		panel_1.add(lblMembershipRegistrationSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(26, 206, 518, 405);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Reference No");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setBounds(31, 27, 150, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Calibri", Font.BOLD, 20));
		lblFirstname.setBounds(31, 57, 150, 25);
		panel_2.add(lblFirstname);
		
		jtxtRefNo = new JTextField();
		jtxtRefNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtRefNo.setColumns(10);
		jtxtRefNo.setBounds(245, 25, 218, 27);
		panel_2.add(jtxtRefNo);
		
		jtxtFirstname = new JTextField();
		jtxtFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtFirstname.setColumns(10);
		jtxtFirstname.setBounds(245, 57, 218, 26);
		panel_2.add(jtxtFirstname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(245, 92, 218, 26);
		panel_2.add(jtxtSurname);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtAddress.setColumns(10);
		jtxtAddress.setBounds(245, 123, 218, 26);
		panel_2.add(jtxtAddress);
		
		jtxtPostCode = new JTextField();
		jtxtPostCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtPostCode.setColumns(10);
		jtxtPostCode.setBounds(245, 152, 218, 26);
		panel_2.add(jtxtPostCode);
		
		jtxtTelephone = new JTextField();
		jtxtTelephone.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtTelephone.setColumns(10);
		jtxtTelephone.setBounds(245, 182, 218, 26);
		panel_2.add(jtxtTelephone);
		
		jtxtDateReg = new JTextField();
		jtxtDateReg.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtDateReg.setColumns(10);
		jtxtDateReg.setBounds(245, 212, 218, 26);
		panel_2.add(jtxtDateReg);
		
		JComboBox cmbProveofID = new JComboBox();
		cmbProveofID.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Saga", "Persona", "Iriz", "X70"}));
		cmbProveofID.setFont(new Font("Calibri", Font.BOLD, 20));
		cmbProveofID.setBounds(245, 245, 218, 33);
		panel_2.add(cmbProveofID);
		
		JLabel label = new JLabel("Surname");
		label.setFont(new Font("Calibri", Font.BOLD, 20));
		label.setBounds(31, 93, 154, 25);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Address");
		label_1.setFont(new Font("Calibri", Font.BOLD, 20));
		label_1.setBounds(31, 123, 154, 25);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Post Code");
		label_2.setFont(new Font("Calibri", Font.BOLD, 20));
		label_2.setBounds(31, 158, 154, 25);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Telephone");
		label_3.setFont(new Font("Calibri", Font.BOLD, 20));
		label_3.setBounds(31, 188, 154, 25);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Date Registed");
		label_4.setFont(new Font("Calibri", Font.BOLD, 20));
		label_4.setBounds(31, 218, 154, 25);
		panel_2.add(label_4);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblModel.setBounds(27, 249, 154, 25);
		panel_2.add(lblModel);
		
		JLabel lblVarian = new JLabel("Varian");
		lblVarian.setFont(new Font("Calibri", Font.BOLD, 20));
		lblVarian.setBounds(28, 285, 187, 25);
		panel_2.add(lblVarian);
		
		JLabel label_7 = new JLabel("Amount Paid");
		label_7.setFont(new Font("Calibri", Font.BOLD, 20));
		label_7.setBounds(28, 333, 154, 25);
		panel_2.add(label_7);
		
		JComboBox cmbAmountPaid = new JComboBox();
		cmbAmountPaid.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "\u00A345", "\u00A3120", "\u00A3200", "\u00A3370"}));
		cmbAmountPaid.setFont(new Font("Calibri", Font.BOLD, 20));
		cmbAmountPaid.setBounds(245, 329, 218, 33);
		panel_2.add(cmbAmountPaid);
		
		JComboBox cmbMembership = new JComboBox();
		cmbMembership.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Standart", "Executive", "Premium"}));
		cmbMembership.setFont(new Font("Calibri", Font.BOLD, 20));
		cmbMembership.setBounds(245, 286, 218, 33);
		panel_2.add(cmbMembership);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(562, 206, 744, 405);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 24, 681, 333);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No", "Firstname", "Surname", "Address", "Post Code", "Telephone", "Date Reg", "Model", "Varian", "Monthly"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(26, 132, 1280, 63);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton button = new JButton("Add Record");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.addRow(new Object[]{			            
				            jtxtRefNo.getText(),
							jtxtFirstname.getText(),
							jtxtSurname.getText(),
							jtxtAddress.getText(),
							jtxtPostCode.getText(),
							jtxtTelephone.getText(),
							jtxtDateReg.getText(),
							cmbProveofID.getSelectedItem(),
							cmbMembership.getSelectedItem(),
							cmbAmountPaid.getSelectedItem(),
		    	   });
			     
			        
			       if (table.getSelectedRow() == -1){
			           if (table.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Membership Update confirmed","Membership  Management System",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			     
			        }
			        
			
		});
		button.setFont(new Font("Calibri", Font.BOLD, 20));
		button.setBounds(43, 23, 179, 33);
		panel_3.add(button);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtRefNo.setText("");
				jtxtFirstname.setText("");
				jtxtSurname.setText("");
				jtxtAddress.setText("");
				jtxtPostCode.setText("");
				jtxtTelephone.setText("");
				jtxtDateReg.setText("");		       
				cmbProveofID.setSelectedItem("Make a Selection");
				cmbMembership.setSelectedItem("Make a Selection");
				cmbAmountPaid.setSelectedItem("Make a Selection");
			}
		});
		button_1.setFont(new Font("Calibri", Font.BOLD, 20));
		button_1.setBounds(260, 23, 179, 33);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()==-1){
		            if(table.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Membership Management System",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
		                        "Membership Management System",JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }     
				
			}
		});
		button_2.setFont(new Font("Calibri", Font.BOLD, 20));
		button_2.setBounds(740, 23, 179, 33);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame =new JFrame();
		        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Membership Registration Systems",
		              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
		            System.exit(0);
		        }
				
			}
		});
		button_3.setFont(new Font("Calibri", Font.BOLD, 20));
		button_3.setBounds(1000, 23, 179, 33);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("Print");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try
				{
					table.print();
				}
				catch(java.awt.print.PrinterException e){
					System.err.format("No Printer found", e.getMessage());
				}	
			}
		});
		button_4.setFont(new Font("Calibri", Font.BOLD, 20));
		button_4.setBounds(501, 23, 179, 33);
		panel_3.add(button_4);
	}
}
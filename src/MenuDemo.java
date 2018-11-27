import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MenuDemo extends JFrame implements ActionListener {

	// �л� ����.
	static Student[] stu = new Student[40];

	public MenuDemo() throws SQLException {
		super("����ó�� ���α׷�");
		makeMenu();
		makePanels();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 1200);
		setVisible(true);
	}

	public void makeMenu() {
		JMenuItem item;

		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("����");
		JMenu m3 = new JMenu("���");
		JMenu m4 = new JMenu("�⼮");
		JMenu m5 = new JMenu("����");

		m1.add(new JMenuItem("�ҷ�����"));
		m1.add(new JMenuItem("����"));

		mb.add(m1);

		m2.add(new JMenuItem("���� ���"));
		m2.add(new JMenuItem("��� ���"));
		m2.add(new JMenuItem("��� ���� ���"));
		m2.add(new JMenuItem("���� ��� ���"));
		mb.add(m2);

		item = new JMenuItem("������ ������");
		item.addActionListener(this);
		m3.add(item);
		m3.addActionListener(this);
		JMenu m = new JMenu("�� ���� ������");
		item = new JMenuItem("�⼮����");
		item.addActionListener(this);
		m.add(item);
		item = new JMenuItem("�߰���������");
		item.addActionListener(this);
		m.add(item);
		item = new JMenuItem("�⸻��������");
		item.addActionListener(this);
		m.add(item);
		item = new JMenuItem("��������");
		item.addActionListener(this);
		m.add(item);
		item = new JMenuItem("��������");
		item.addActionListener(this);
		m.add(item);
		item = new JMenuItem("��ǥ����");
		item.addActionListener(this);
		m.add(item);
		item = new JMenuItem("��������");
		item.addActionListener(this);
		m.add(item);
		item = new JMenuItem("��Ÿ����");
		item.addActionListener(this);
		m.add(item);
		m3.add(m);
		m3.addActionListener(this);

		mb.add(m3);

		m5.add(new JMenuItem("��� ���� ����"));
		m5.add(new JMenuItem("�� ������ �ݿ� ���� ����"));
		m5.add(new JMenuItem("���� �ο� ����"));
		mb.add(m5);

		setJMenuBar(mb);
	}

	public static void main(String[] args) throws SQLException {
		new MenuDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem mi = (JMenuItem) (e.getSource());
		switch (mi.getText()) {
		case "������ ������":
			System.out.println("������ ������ ���");
			new TotalGraph();
			break;
		case "�⼮����":
			System.out.println("�⼮���� ���");
			// new EachGraph("attenance");
			break;
		case "�߰���������":
			System.out.println("�߰��������� ���");
			new EachGraph("middle");
			break;
		case "�⸻��������":
			System.out.println("�⸻�������� ���");
			new EachGraph("final");
			break;
		case "��������":
			System.out.println("�������� ���");
			new EachGraph("report");
			break;
		case "��������":
			System.out.println("�������� ���");
			new EachGraph("quiz");
			break;
		case "��ǥ����":
			System.out.println("��ǥ���� ���");
			new EachGraph("announcement");
			break;
		case "��������":
			System.out.println("�������� ���");
			new EachGraph("report");
			break;
		case "��Ÿ����":
			System.out.println("��Ÿ���� ���");
			new EachGraph("other");
			break;

		}

	}

	public void makePanels() {
		// �ִ� 40���̱� ������, 40���� ����� ������.
		BorderLayout b = new BorderLayout();
		setLayout(b);
		JPanel Npanel = new JPanel();
		JPanel Cpanel = new JPanel();
		JPanel Spanel = new JPanel();

		add(Npanel, BorderLayout.NORTH);
		add(Cpanel, BorderLayout.CENTER);
		add(Spanel, BorderLayout.SOUTH);

		// ��ư.
		JButton save = new JButton("DB�� ����");

		// ��.
		JLabel LName = new JLabel("�̸�");
		JLabel LStuID = new JLabel("�й�");
		JLabel LMid = new JLabel("�߰�");
		JLabel LFin = new JLabel("�⸻");
		JLabel LSub = new JLabel("����");
		JLabel LQuz = new JLabel("����");
		JLabel LPr = new JLabel("��ǥ");
		JLabel LRe = new JLabel("����");
		JLabel LPl = new JLabel("��Ÿ");
		JLabel LAll = new JLabel("����");
		JLabel LRank = new JLabel("���");
		JLabel LChul = new JLabel("�⼮");

		Npanel.add(LName);
		Npanel.add(LStuID);
		Npanel.add(LMid);
		Npanel.add(LFin);
		Npanel.add(LSub);
		Npanel.add(LQuz);
		Npanel.add(LPr);
		Npanel.add(LRe);
		Npanel.add(LChul);
		Npanel.add(LPl);
		Npanel.add(LAll);
		Npanel.add(LRank);

		// �̸��� ����.
		JTextField[] T_name = new JTextField[40];
		JTextField[] T_ID = new JTextField[40];
		JTextField[] T_mid = new JTextField[40];
		JTextField[] T_fin = new JTextField[40];
		JTextField[] T_Sub = new JTextField[40];
		JTextField[] T_Quz = new JTextField[40];
		JTextField[] T_Pr = new JTextField[40];
		JTextField[] T_Re = new JTextField[40];
		JTextField[] T_Pl = new JTextField[40];
		JTextField[] T_All = new JTextField[40];
		JTextField[] T_Rank = new JTextField[40];
		JTextField[] T_Chul = new JTextField[40];

		for (int i = 0; i < 40; i++) {
			T_name[i] = new JTextField();
			T_ID[i] = new JTextField();
			T_mid[i] = new JTextField();
			T_fin[i] = new JTextField();
			T_Sub[i] = new JTextField();
			T_Quz[i] = new JTextField();
			T_Pr[i] = new JTextField();
			T_Re[i] = new JTextField();
			T_Pl[i] = new JTextField();
			T_Chul[i] = new JTextField();
			T_All[i] = new JTextField();
			T_All[i].setEnabled(false);
			T_Rank[i] = new JTextField();
			T_Rank[i].setEnabled(false);

			Cpanel.add(T_name[i]);
			Cpanel.add(T_ID[i]);
			Cpanel.add(T_mid[i]);
			Cpanel.add(T_fin[i]);
			Cpanel.add(T_Sub[i]);
			Cpanel.add(T_Quz[i]);
			Cpanel.add(T_Pr[i]);
			Cpanel.add(T_Re[i]);
			Cpanel.add(T_Chul[i]);
			Cpanel.add(T_Pl[i]);
			Cpanel.add(T_All[i]);
			Cpanel.add(T_Rank[i]);
		}

		setTitle("���̾ƿ� �׽�Ʈ");

		Spanel.add(save);
		Npanel.setLayout(new GridLayout(0, 12, 3, 3));
		Npanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0));
		Cpanel.setLayout(new GridLayout(40, 12, 3, 3));

		ActionListener listener1 = e -> {
			saveDB save1 = new saveDB();
			if (e.getSource() == save) {
				System.out.println("dhdn");
				for (int i = 0; i < 40; i++) {
					if (T_name[i].getText().isEmpty()) {
						//
					} else {
						stu[i] = new Student();

						stu[i].name = T_name[i].getText();
						stu[i].StudentId = T_ID[i].getText();
						stu[i].Mid = Integer.parseInt(T_mid[i].getText());
						stu[i].Fin = Integer.parseInt(T_fin[i].getText());
						stu[i].Subj = Integer.parseInt(T_Sub[i].getText());
						stu[i].Quiz = Integer.parseInt(T_Quz[i].getText());
						stu[i].Pre = Integer.parseInt(T_Pr[i].getText());
						stu[i].Report = Integer.parseInt(T_Re[i].getText());
						stu[i].Atend = Integer.parseInt(T_Chul[i].getText());
						stu[i].Another = Integer.parseInt(T_Pl[i].getText());

						try {
							saveDB.saving(stu[i]);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}

		};
		// save�� ������ ����.
		save.addActionListener(listener1);
	}

}
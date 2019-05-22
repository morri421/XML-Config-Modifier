
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

/**
 * Basic GUI interface to get prototype working.
 * 
 */
public class GUI implements ActionListener {

	public JFrame frame;

	public void init() {
		frame = new JFrame("Onvio Location Changer");
		frame.setPreferredSize(new Dimension(1000, 260));
		frame.setLayout(new MigLayout("", "", "nogrid"));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JButton usci = new JButton("http://ci.onvio.us/#/");
		usci.addActionListener(this);
		frame.add(usci);

		JButton usdemo = new JButton("http://demo.onvio.us/#/");
		usdemo.addActionListener(this);
		frame.add(usdemo);

		JButton usqed = new JButton("http://qed.onvio.us/#/");
		usqed.addActionListener(this);
		frame.add(usqed);

		JButton usprod = new JButton("http://onvio.us/#/");
		usprod.addActionListener(this);
		frame.add(usprod);

		JButton ukci = new JButton("http://ci.onvio.co.uk/");
		ukci.addActionListener(this);
		frame.add(ukci, "newline");

		JButton ukdemo = new JButton("http://demo.onvio.co.uk/#/");
		ukdemo.addActionListener(this);
		frame.add(ukdemo);

		JButton ukqed = new JButton("https://qed.onvio.co.uk/#/");
		ukqed.addActionListener(this);
		frame.add(ukqed);

		JButton ukprod = new JButton("https://onvio.co.uk/#/");
		ukprod.addActionListener(this);
		frame.add(ukprod);

		JButton canci = new JButton("http://ci.onvio.ca/");
		canci.addActionListener(this);
		frame.add(canci, "newline");

		JButton candemo = new JButton("http://demo.onvio.ca/#/");
		candemo.addActionListener(this);
		frame.add(candemo);

		JButton canqed = new JButton("https://qed.onvio.ca/#/");
		canqed.addActionListener(this);
		frame.add(canqed);

		JButton canprod = new JButton("https://onvio.ca/#/");
		canprod.addActionListener(this);
		frame.add(canprod);

		JButton arci = new JButton("http://ci.onvio.com.ar/");
		arci.addActionListener(this);
		frame.add(arci, "newline");

		JButton ardemo = new JButton("http://demo.onvio.com.ar/");
		ardemo.addActionListener(this);
		frame.add(ardemo);

		JButton arqed = new JButton("http://qed.onvio.com.ar/#/");
		arqed.addActionListener(this);
		frame.add(arqed);

		JButton arprod = new JButton("http://onvio.com.ar/#/");
		arprod.addActionListener(this);
		frame.add(arprod);

		JButton auci = new JButton("http://ci.onvio.com.au");
		auci.addActionListener(this);
		frame.add(auci, "newline");

		JButton audemo = new JButton("http://demo.onvio.com.au");
		audemo.addActionListener(this);
		frame.add(audemo);

		JButton auqed = new JButton("https://qed.onvio.com.au");
		auqed.addActionListener(this);
		frame.add(auqed);

		JButton auprod = new JButton("https://onvio.com.au");
		auprod.addActionListener(this);
		frame.add(auprod);

		JButton neci = new JButton("http://ci.onvio.thomsonreuters.nl/#/");
		neci.addActionListener(this);
		frame.add(neci, "newline");

		JButton nedemo = new JButton("http://demo.onvio.thomsonreuters.nl/#/");
		nedemo.addActionListener(this);
		frame.add(nedemo);

		JButton neqed = new JButton("https://qed.onvio.thomsonreuters.nl/#/");
		neqed.addActionListener(this);
		frame.add(neqed);

		JButton neprod = new JButton("https://onvio.thomsonreuters.nl/#/");
		neprod.addActionListener(this);
		frame.add(neprod);

		JButton brci = new JButton("http://ci.onvio.com.br/");
		brci.addActionListener(this);
		frame.add(brci, "newline");

		JButton brdemo = new JButton("http://demo.onvio.com.br/");
		brdemo.addActionListener(this);
		frame.add(brdemo);

		JButton brqed = new JButton("http://qed.onvio.com.br/");
		brqed.addActionListener(this);
		frame.add(brqed);

		JButton brprod = new JButton("http://onvio.com.br/");
		brprod.addActionListener(this);
		frame.add(brprod);

		frame.getContentPane();

		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent clicked) {
		// TODO Auto-generated method stub
		String buttonname = ((JButton) clicked.getSource()).getText();

		XMLFileModifier xmlModifier = new XMLFileModifier();
		xmlModifier.changeXMLNode(buttonname);

	}

}
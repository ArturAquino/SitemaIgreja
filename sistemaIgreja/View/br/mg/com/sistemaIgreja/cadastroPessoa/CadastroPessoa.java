package br.mg.com.sistemaIgreja.cadastroPessoa;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.mg.com.sistemaIgreja.classe.Pessoa;

public class CadastroPessoa {

	protected Shell shlCadastro;
	private Text nome;
	private Text nomePai;
	private Text nomeMae;
	private Text logradouro;
	private Text numCasa;
	private Text bairro;
	private Text cep;
	private Text cidade;
	private Text compl;
	private Text responsavel;
	private Text telResponsavel;
	private Text celResponsavel;
	private Text email;
	private Text tel;
	private Text cel;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			CadastroPessoa window = new CadastroPessoa();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		
		Display display = Display.getDefault();
		createContents();
		shlCadastro.open();
		shlCadastro.layout();
		
		while (!shlCadastro.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		shlCadastro = new Shell();
		shlCadastro.setModified(true);
		shlCadastro.setSize(692, 762);
		shlCadastro.setText("Cadastro");
		shlCadastro.setLayout(new GridLayout(1, false));
		
		TabFolder tabFolder = new TabFolder(shlCadastro, SWT.NONE);
		tabFolder.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		GridData gd_tabFolder = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_tabFolder.heightHint = 218;
		tabFolder.setLayoutData(gd_tabFolder);
		
		TabItem tbtmDadosPessoais = new TabItem(tabFolder, SWT.NONE);
		tbtmDadosPessoais.setText("Dados Pessoais");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		tbtmDadosPessoais.setControl(composite);
		
		Group grpEndereo = new Group(composite, SWT.NONE);
		grpEndereo.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpEndereo.setText("Endere\u00E7o");
		grpEndereo.setBounds(10, 317, 638, 136);
		
		Label lblLogradouro = new Label(grpEndereo, SWT.NONE);
		lblLogradouro.setText("Logradouro:");
		lblLogradouro.setBounds(10, 24, 65, 15);
		
		logradouro = new Text(grpEndereo, SWT.BORDER);
		logradouro.setBounds(80, 18, 328, 21);
		
		Label lblNmero = new Label(grpEndereo, SWT.NONE);
		lblNmero.setText("N\u00FAmero:");
		lblNmero.setBounds(490, 21, 47, 15);
		
		numCasa = new Text(grpEndereo, SWT.BORDER | SWT.RIGHT);
		numCasa.setBounds(540, 18, 88, 21);
		
		Label lblBairro = new Label(grpEndereo, SWT.NONE);
		lblBairro.setText("Bairro:");
		lblBairro.setBounds(10, 61, 34, 15);
		
		bairro = new Text(grpEndereo, SWT.BORDER);
		bairro.setBounds(50, 58, 189, 21);
		
		Label lblCep = new Label(grpEndereo, SWT.NONE);
		lblCep.setAlignment(SWT.CENTER);
		lblCep.setText("CEP:");
		lblCep.setBounds(508, 61, 29, 15);
		
		cep = new Text(grpEndereo, SWT.BORDER);
		cep.setBounds(540, 55, 88, 21);
		
		Label lblCidade = new Label(grpEndereo, SWT.NONE);
		lblCidade.setAlignment(SWT.CENTER);
		lblCidade.setText("Cidade:");
		lblCidade.setBounds(246, 58, 47, 15);
		
		cidade = new Text(grpEndereo, SWT.BORDER);
		cidade.setBounds(299, 55, 189, 21);
		
		Label lblComplemento = new Label(grpEndereo, SWT.NONE);
		lblComplemento.setAlignment(SWT.CENTER);
		lblComplemento.setText("Complemento:");
		lblComplemento.setBounds(10, 103, 82, 15);
		
		compl = new Text(grpEndereo, SWT.BORDER);
		compl.setBounds(98, 100, 328, 21);
		grpEndereo.setTabList(new Control[]{logradouro, numCasa, bairro, cidade, cep});
		
		Group grpDadosPessoais = new Group(composite, SWT.NONE);
		grpDadosPessoais.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpDadosPessoais.setLocation(10, 18);
		grpDadosPessoais.setSize(638, 199);
		grpDadosPessoais.setText("Dados Pessoais");
		
		Label label = new Label(grpDadosPessoais, SWT.NONE);
		label.setText("Nome Completo:");
		label.setBounds(10, 24, 92, 15);
		
		nome = new Text(grpDadosPessoais, SWT.BORDER);
		nome.setBounds(105, 21, 333, 21);
		
		Label label_1 = new Label(grpDadosPessoais, SWT.NONE);
		label_1.setText("Data de Nascimento:");
		label_1.setBounds(10, 66, 110, 15);
		
		DateTime dtNasc = new DateTime(grpDadosPessoais, SWT.BORDER);
		dtNasc.setBounds(126, 57, 106, 24);
		
		Group group = new Group(grpDadosPessoais, SWT.NONE);
		group.setText("Sexo");
		group.setBounds(497, 12, 131, 69);
		
		Button sexoMasc = new Button(group, SWT.RADIO);
		sexoMasc.setText("Masculino");
		sexoMasc.setBounds(10, 23, 76, 16);
		
		Button sexoFem = new Button(group, SWT.RADIO);
		sexoFem.setText("Feminino");
		sexoFem.setBounds(10, 45, 76, 16);
		
		Label label_2 = new Label(grpDadosPessoais, SWT.NONE);
		label_2.setText("Estado Civil:");
		label_2.setBounds(257, 66, 64, 15);
		
		Combo estCivil = new Combo(grpDadosPessoais, SWT.NONE);
		estCivil.setBounds(327, 58, 152, 23);
		
		Group group_1 = new Group(grpDadosPessoais, SWT.NONE);
		group_1.setText("Filia\u00E7\u00E3o");
		group_1.setBounds(10, 92, 428, 96);
		
		Label label_3 = new Label(group_1, SWT.NONE);
		label_3.setText("Nome do Pai:");
		label_3.setBounds(10, 23, 78, 15);
		
		nomePai = new Text(group_1, SWT.BORDER);
		nomePai.setBounds(89, 17, 328, 21);
		
		Label label_4 = new Label(group_1, SWT.NONE);
		label_4.setText("Nome da M\u00E3e:");
		label_4.setBounds(10, 68, 78, 15);
		
		nomeMae = new Text(group_1, SWT.BORDER);
		nomeMae.setBounds(89, 62, 328, 21);
		
		Label lblEscolaridade = new Label(grpDadosPessoais, SWT.NONE);
		lblEscolaridade.setText("Escolaridade:");
		lblEscolaridade.setBounds(476, 105, 69, 15);
		
		Combo escolaridade = new Combo(grpDadosPessoais, SWT.NONE);
		escolaridade.setBounds(476, 126, 152, 23);
		grpDadosPessoais.setTabList(new Control[]{nome, group, dtNasc, estCivil, group_1, escolaridade});
		
		Group grpResponsvel = new Group(composite, SWT.NONE);
		grpResponsvel.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpResponsvel.setText("Respons\u00E1vel");
		grpResponsvel.setBounds(10, 459, 638, 88);
		
		Label lblResponsvel = new Label(grpResponsvel, SWT.NONE);
		lblResponsvel.setAlignment(SWT.CENTER);
		lblResponsvel.setText("Nome:");
		lblResponsvel.setBounds(10, 23, 40, 15);
		
		responsavel = new Text(grpResponsvel, SWT.BORDER);
		responsavel.setBounds(56, 20, 328, 21);
		
		Label lblTelContato = new Label(grpResponsvel, SWT.NONE);
		lblTelContato.setText("Tel. Contato:");
		lblTelContato.setBounds(418, 23, 72, 15);
		
		telResponsavel = new Text(grpResponsvel, SWT.BORDER);
		telResponsavel.setBounds(494, 20, 101, 21);
		
		Label lblCelularContato = new Label(grpResponsvel, SWT.NONE);
		lblCelularContato.setText("Celular Contato:");
		lblCelularContato.setAlignment(SWT.CENTER);
		lblCelularContato.setBounds(10, 63, 86, 15);
		
		celResponsavel = new Text(grpResponsvel, SWT.BORDER);
		celResponsavel.setBounds(102, 57, 101, 21);
		
		Group grpContato = new Group(composite, SWT.NONE);
		grpContato.setText("Contato");
		grpContato.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpContato.setBounds(10, 223, 638, 88);
		
		Label lblEmail = new Label(grpContato, SWT.NONE);
		lblEmail.setText("E-mail:");
		lblEmail.setAlignment(SWT.CENTER);
		lblEmail.setBounds(10, 23, 40, 15);
		
		email = new Text(grpContato, SWT.BORDER);
		email.setBounds(56, 20, 328, 21);
		
		Label label_6 = new Label(grpContato, SWT.NONE);
		label_6.setText("Tel. Contato:");
		label_6.setBounds(418, 23, 72, 15);
		
		tel = new Text(grpContato, SWT.BORDER);
		tel.setBounds(494, 20, 101, 21);
		
		Label label_7 = new Label(grpContato, SWT.NONE);
		label_7.setText("Celular Contato:");
		label_7.setAlignment(SWT.CENTER);
		label_7.setBounds(10, 63, 86, 15);
		
		cel = new Text(grpContato, SWT.BORDER);
		cel.setBounds(102, 57, 101, 21);
		
		Group grpSituaoReligiosa = new Group(composite, SWT.NONE);
		grpSituaoReligiosa.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpSituaoReligiosa.setText("Situa\u00E7\u00E3o Religiosa");
		grpSituaoReligiosa.setBounds(10, 553, 638, 88);
		
		text = new Text(grpSituaoReligiosa, SWT.BORDER);
		text.setBounds(69, 22, 167, 21);
		
		Label lblBatizado = new Label(grpSituaoReligiosa, SWT.NONE);
		lblBatizado.setBounds(10, 25, 55, 15);
		lblBatizado.setText("Batizado:");
		
		Label lblEucaristia = new Label(grpSituaoReligiosa, SWT.NONE);
		lblEucaristia.setText("1\u00AA Eucaristia:");
		lblEucaristia.setBounds(273, 25, 69, 15);
		
		text_1 = new Text(grpSituaoReligiosa, SWT.BORDER);
		text_1.setBounds(348, 22, 167, 21);
		
		Label lblCrismado = new Label(grpSituaoReligiosa, SWT.NONE);
		lblCrismado.setText("Crismado:");
		lblCrismado.setBounds(10, 60, 55, 15);
		
		text_2 = new Text(grpSituaoReligiosa, SWT.BORDER);
		text_2.setBounds(69, 57, 167, 21);
		
		Label lblCrisma = new Label(grpSituaoReligiosa, SWT.NONE);
		lblCrisma.setText("Crisma:");
		lblCrisma.setBounds(273, 60, 69, 15);
		
		text_3 = new Text(grpSituaoReligiosa, SWT.BORDER);
		text_3.setBounds(348, 57, 167, 21);
		
		TabItem tbtmObservaes = new TabItem(tabFolder, SWT.NONE);
		tbtmObservaes.setText("Observa\u00E7\u00F5es");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		tbtmObservaes.setControl(composite_1);
		
		Group grpObservaesImportantes = new Group(composite_1, SWT.NONE);
		grpObservaesImportantes.setText("Observa\u00E7\u00F5es Importantes");
		grpObservaesImportantes.setBounds(10, 18, 638, 199);
		
		Group grpMedicamentos = new Group(grpObservaesImportantes, SWT.NONE);
		grpMedicamentos.setText("Medicamentos");
		grpMedicamentos.setBounds(10, 26, 187, 69);
		
		Button btnSim = new Button(grpMedicamentos, SWT.RADIO);
		btnSim.setText("Sim");
		btnSim.setBounds(10, 23, 76, 16);
		
		Button btnNo = new Button(grpMedicamentos, SWT.RADIO);
		btnNo.setText("N\u00E3o");
		btnNo.setBounds(10, 45, 76, 16);
		
		Group grpRestrioAlimentar = new Group(grpObservaesImportantes, SWT.NONE);
		grpRestrioAlimentar.setText("Restri\u00E7\u00E3o Alimentar");
		grpRestrioAlimentar.setBounds(441, 26, 187, 69);
		
		Button button = new Button(grpRestrioAlimentar, SWT.RADIO);
		button.setText("Sim");
		button.setBounds(10, 23, 76, 16);
		
		Button button_1 = new Button(grpRestrioAlimentar, SWT.RADIO);
		button_1.setText("N\u00E3o");
		button_1.setBounds(10, 45, 76, 16);
		

	}
	/**
	 * @wbp.factory
	 */
	public static ToolBar createToolBar(Composite parent) {
		ToolBar toolBar = new ToolBar(parent, SWT.FLAT | SWT.RIGHT);
		toolBar.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		toolBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		return toolBar;
	}
}

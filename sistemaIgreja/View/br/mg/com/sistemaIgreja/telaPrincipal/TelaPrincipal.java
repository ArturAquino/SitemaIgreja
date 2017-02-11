package br.mg.com.sistemaIgreja.telaPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;

public class TelaPrincipal {

	protected Shell shlSistemaDeEncontros;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaPrincipal window = new TelaPrincipal();
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
		shlSistemaDeEncontros.open();
		shlSistemaDeEncontros.layout();
		while (!shlSistemaDeEncontros.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSistemaDeEncontros = new Shell();
		shlSistemaDeEncontros.setSize(450, 300);
		shlSistemaDeEncontros.setText("Sistema de Encontros");
		shlSistemaDeEncontros.setLayout(new GridLayout(1, false));
		
		ToolBar toolBar = new ToolBar(shlSistemaDeEncontros, SWT.FLAT | SWT.RIGHT);
		toolBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		ToolItem tltmNewItem = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		tltmNewItem.setText("Cadastro de Pessoas");
		
		ToolItem tltmNewItem_1 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_1.setText("Montagem Equipes");
		
		ToolItem tltmPresenca = new ToolItem(toolBar, SWT.NONE);
		tltmPresenca.setText("Presen\u00E7a");
		
		ToolItem tltmRel = new ToolItem(toolBar, SWT.NONE);
		tltmRel.setText("Relat\u00F3rios");

	}
}

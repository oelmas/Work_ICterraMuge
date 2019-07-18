package icterra.muge.category.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class MugeProjectNewWizard extends Wizard implements INewWizard, IExecutableExtension {

	private static final String PAGE_DESCRIPTION = "Create Medical project from scratch";
	private static final String WIZARD_NAME = "MUGE PROJECT WIZARD";
	private static final String PAGE_NAME = "Muge Type Project Wizard";
	private static final String PAGE_TITLE = "From Medical Project";
	private WizardNewProjectCreationPage _pageOne;
	
	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		
		
		_pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		
		_pageOne.setTitle(PAGE_TITLE);
		_pageOne.setDescription(MugeProjectNewWizard.PAGE_DESCRIPTION);
		addPage(_pageOne);
	}

	@Override
	public void init(IWorkbench arg0, IStructuredSelection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInitializationData(IConfigurationElement arg0, String arg1, Object arg2) throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}

	public MugeProjectNewWizard() {
		setWindowTitle(WIZARD_NAME);
	}

}

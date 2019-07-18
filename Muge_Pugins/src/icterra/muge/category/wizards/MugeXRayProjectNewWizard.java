package icterra.muge.category.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class MugeXRayProjectNewWizard extends Wizard implements INewWizard, IExecutableExtension {

	private static final String PAGE_NAME = "X-Ray Project Wizard";
	private static final String WIZARD_NAME = "New MUGE X-Ray Project ";
	private WizardNewProjectCreationPage _pageOne;

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		_pageOne.setTitle("X-Ray Project");
		_pageOne.setDescription("Create X-Ray project from scratch.");
		addPage(_pageOne);

	}

	public MugeXRayProjectNewWizard() {
		// TODO Auto-generated constructor stub
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}

}

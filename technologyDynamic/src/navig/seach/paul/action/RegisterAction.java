package navig.seach.paul.action;

import navig.seach.paul.massage.UserForm;
import navig.seach.paul.service.UserManaer;
import navig.seach.paul.service.impl.UserManagerImpl;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	/**
	 * myeclipse   版本跟新
	 */
	private static final long serialVersionUID = 1L;
	private UserForm user;
	private UserManaer userManager;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			this.setUserManager(new UserManagerImpl());
			userManager.regUser(user);
			System.out.println("ok!");
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}

	public UserManaer getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManaer userManager) {
		this.userManager = userManager;
	}

}

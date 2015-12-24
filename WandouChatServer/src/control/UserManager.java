package control;

import model.TbUser;
import dao.TbUserDAO;
import exception.DBOperatorException;
import exception.SystemException;

public class UserManager
{
	private TbUserDAO userDao;

	public UserManager() throws SystemException
	{
		this.userDao = new TbUserDAO();
	}

	public void userRegister(TbUser user) throws DBOperatorException
	{
		userDao.userRegister(user);
	}

}
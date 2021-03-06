package utils;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

// CLASSE BEANS PARA MAPEAR E POPULAR OS METODOS DOPOST DO CLIENTE CONTROLLER
public class BeanUtilities {
	public static void populateBean(Object formBean, HttpServletRequest request) {
		populateBean(formBean,request.getParameterMap());
	}

	private static void populateBean(Object bean, Map prop) {
		// TODO Auto-generated method stub
		try {
			BeanUtils.populate(bean,prop);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

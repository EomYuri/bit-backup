package hrapp;

import java.util.List;

public interface HRDAO {
	public List<HRVO> getList();
	public HRVO get(String empName);

}

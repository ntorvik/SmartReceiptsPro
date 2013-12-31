package wb.receiptspro;

import wb.receiptslibrary.SmartReceiptsApplication;
import wb.receiptslibrary.activities.SmartReceiptsActivity;

public class SmartReceiptsProApplication extends SmartReceiptsApplication {

	@Override
	public Class<? extends SmartReceiptsActivity> getTopLevelActivity() {
		return SmartReceiptsProActivity.class;
	}
}

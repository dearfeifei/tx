package forever.foreverandroiddemo.utils;

import android.widget.Toast;

import forever.foreverandroiddemo.application.MyApplication;


public class ToastUtil {
	private static Toast toast;

	/**
	 * 强大的吐司，可以连续弹，不会等上一个消失
	 * 
	 * @param text
	 */
	public static void showToast(final String text) {
		CommonUtil.runOnUIThread(new Runnable() {
			@Override
			public void run() {
				// 保证在主线程弹吐司
				if (toast == null) {
					toast = Toast.makeText(MyApplication.getContext(), text,
							Toast.LENGTH_LONG);
				}
				toast.setText(text);
				toast.show();
			}
		});
	}
}

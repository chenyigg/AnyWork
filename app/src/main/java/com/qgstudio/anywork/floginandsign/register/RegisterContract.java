package com.qgstudio.anywork.floginandsign.register;

import com.qgstudio.anywork.mvp.BasePresenter;
import com.qgstudio.anywork.mvp.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class RegisterContract {
    interface View extends BaseView {

        void showError(String errorInfo);

        void showSuccess();
    }

    interface  Presenter extends BasePresenter<View> {
        void register(String email, String password, String name, String phone);
    }
}

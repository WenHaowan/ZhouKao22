package as.bwei.com.zhoukao2.presenter;

import as.bwei.com.zhoukao2.model.ModelRegirectImpl;
import as.bwei.com.zhoukao2.view.RegirectView;

/**
 * Created by HP on 2018/9/10.
 */

public class RegirectPresenterImpl implements RegirectPresenter,ModelRegirectImpl.Result{

    private RegirectView regirectView;
    private ModelRegirectImpl modelRegirect;

    public RegirectPresenterImpl(RegirectView regirectView) {
        this.regirectView = regirectView;
        modelRegirect = new ModelRegirectImpl();
    }

    @Override
    public void regirect(String ed_name, String ed_passwordstr) {
        modelRegirect.getData(ed_name,ed_passwordstr,RegirectPresenterImpl.this);
    }

    @Override
    public void login(String ed_name, String ed_passwordstr) {
        modelRegirect.getLoginData(ed_name,ed_passwordstr,RegirectPresenterImpl.this);
    }

    @Override
    public void Succesful(String resultData) {
        regirectView.showData(resultData);
    }

    @Override
    public void Errer() {

    }
}

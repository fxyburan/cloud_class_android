package com.vontroy.pku_ss_cloud_class.storage.crypto.encrypt;

import android.support.annotation.NonNull;

import com.vontroy.pku_ss_cloud_class.network.ServerImp;
import com.vontroy.pku_ss_cloud_class.utils.schedulers.BaseSchedulerProvider;

import rx.subscriptions.CompositeSubscription;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by vontroy on 2017/11/15.
 */

public class EncryptPresenter implements EncryptContract.Presenter {
    @NonNull
    private String requestTag;

    @NonNull
    private final ServerImp mServerImp;
    @NonNull
    private final EncryptContract.View mStorageAllView;
    @NonNull
    private final BaseSchedulerProvider mSchedulerProvider;
    @NonNull
    private CompositeSubscription mSubscriptions;


    public EncryptPresenter(@NonNull String requestTag, @NonNull ServerImp serverImp,
                            @NonNull EncryptContract.View view,
                            @NonNull BaseSchedulerProvider schedulerProvider) {
        this.requestTag = requestTag;
        mServerImp = checkNotNull(serverImp, "serverImp cannot be null!");
        mStorageAllView = checkNotNull(view, "loginView cannot be null!");
        mSchedulerProvider = checkNotNull(schedulerProvider, "schedulerProvider cannot be null");

        mSubscriptions = new CompositeSubscription();
        mStorageAllView.setPresenter(this);
    }


    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}

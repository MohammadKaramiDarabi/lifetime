package com.example.lifetime.ui.main.presenter

import com.example.lifetime.ui.base.presenter.BasePresenter
import com.example.lifetime.ui.main.interactor.MainMVPInteractor
import com.example.lifetime.ui.main.view.MainMVPView
import javax.inject.Inject

class MainPresenter<V: MainMVPView, I: MainMVPInteractor> @Inject internal constructor(
    interactor: I?
) :BasePresenter<V,I>(interactor), MainMVPPresenter<V,I> {

    override fun onButtonClicked() {
        getView()?.openUserDialog()
    }
}
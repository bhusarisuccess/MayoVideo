package com.abhay.medicinetime.alarm;

import com.abhay.medicinetime.BasePresenter;
import com.abhay.medicinetime.BaseView;
import com.abhay.medicinetime.data.source.History;
import com.abhay.medicinetime.data.source.MedicineAlarm;

/**
 * Created by Abhay on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}

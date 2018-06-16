package medicinetime;

import android.content.Context;
import android.support.annotation.NonNull;

import com.abhay.medicinetime.data.source.MedicineRepository;
import com.abhay.medicinetime.data.source.local.MedicinesLocalDataSource;

/**
 * Created by gautam on 13/07/17.
 */

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}

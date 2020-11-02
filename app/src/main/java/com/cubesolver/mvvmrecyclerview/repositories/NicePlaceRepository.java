package com.cubesolver.mvvmrecyclerview.repositories;

import android.arch.lifecycle.MutableLiveData;

import com.cubesolver.mvvmrecyclerview.models.NicePlace;

import java.util.ArrayList;
import java.util.List;

public class NicePlaceRepository {

    private static NicePlaceRepository instance;
    private ArrayList<NicePlace> dataSet = new ArrayList<>();

    public static NicePlaceRepository getInstance(){
        if(instance == null){
            instance = new NicePlaceRepository();
        }
        return instance;
    }


    // Pretend to get data from a webservice or online source
    public MutableLiveData<List<NicePlace>> getNicePlaces(){
        setNicePlaces();
        MutableLiveData<List<NicePlace>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }

    private void setNicePlaces(){
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Trondheim")
        );
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Portugal")
        );
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Rocky Mountain National Park")
        );
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Mahahual")
        );
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Frozen Lake")
        );
        dataSet.add(
                new NicePlace("https://i.imgur.com/ZcLLrkY.jpg",
                        "Austrailia")
        );
    }
}












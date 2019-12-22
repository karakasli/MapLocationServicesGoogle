package com.karakasli.maplocationservices;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class ClusterMarkerItem implements ClusterItem
{
    private LatLng position;
    private String title;
    private String snippet;
    private BitmapDescriptor icon;

    public ClusterMarkerItem(LatLng pos) {
        position = pos;
    }

    @Override
    public LatLng getPosition()
    {
        return position;
    }

    @Override
    public String getTitle()
    {
        return null;
    }

    @Override
    public String getSnippet()
    {
        return null;
    }

    public void setIcon(BitmapDescriptor mIcon) {
        icon = mIcon;
    }

    public BitmapDescriptor getIcon(){
        return icon;
    }
}

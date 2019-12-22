package com.karakasli.maplocationservices;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;

public class CustomIconRenderer extends DefaultClusterRenderer<ClusterMarkerItem>
{
    public CustomIconRenderer(Context context, GoogleMap map, ClusterManager<ClusterMarkerItem> clusterManager)
    {
        super(context, map, clusterManager);
    }

    @Override
    protected void onBeforeClusterItemRendered(ClusterMarkerItem item, MarkerOptions markerOptions)
    {
        markerOptions.icon(item.getIcon());
        super.onBeforeClusterItemRendered(item, markerOptions);
    }
}

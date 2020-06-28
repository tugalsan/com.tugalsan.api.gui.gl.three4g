package org.treblereel.gwt.three4g.demo.client.local.mvc.presenter;

import com.google.gwt.core.client.GWT;
import elemental2.dom.HTMLDivElement;
import org.treblereel.gwt.three4g.demo.client.local.Attachable;
import org.treblereel.gwt.three4g.demo.client.local.examples.loaders.WebglLoaderVrml;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 10/9/18.
 */
public class WebglLoaderVrmlPresenter implements Presenter {
    @Override
    public void dispatch(HTMLDivElement container) {
        container.appendChild(((Attachable) GWT.create(WebglLoaderVrml.class)).asWidget());
    }
}
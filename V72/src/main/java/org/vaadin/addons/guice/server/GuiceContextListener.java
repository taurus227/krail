package org.vaadin.addons.guice.server;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.vaadin.addons.guice.ViewModule;
import org.vaadin.addons.guice.ui.AppUIModule;

import uk.co.q3c.v7.base.config.ApplicationConfigurationModule;
import uk.co.q3c.v7.base.guice.uiscope.UIScopeModule;
import uk.co.q3c.v7.base.navigate.sitemap.StandardPagesModule;
import uk.co.q3c.v7.base.navigate.sitemap.SitemapServiceModule;
import uk.co.q3c.v7.base.shiro.StandardShiroModule;
import uk.co.q3c.v7.base.shiro.ShiroVaadinModule;
import uk.co.q3c.v7.base.user.UserModule;
import uk.co.q3c.v7.base.view.StandardViewModule;
import uk.co.q3c.v7.base.view.component.StandardComponentModule;
import uk.co.q3c.v7.i18n.I18NModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceContextListener extends GuiceServletContextListener {
	@Override
	protected Injector getInjector() {
		Injector injector = Guice.createInjector(new ExampleGuiceServletModule(), new UIScopeModule(),
				new ViewModule(), new AppUIModule(), new SitemapServiceModule(), new ApplicationConfigurationModule(),
				new I18NModule(), new StandardViewModule(), new ShiroVaadinModule(), new UserModule(),
				new StandardShiroModule(), new StandardComponentModule(), new StandardPagesModule());

		// By default Shiro provides a binding to DefaultSecurityManager, but that is replaced by a binding to
		// V7SecurityManager in DefaultShiroModule#bindSecurityManager (or potentially to another security manager if
		// the developer overrides that method)
		SecurityManager securityManager = injector.getInstance(SecurityManager.class);
		SecurityUtils.setSecurityManager(securityManager);

		return injector;
	}
}

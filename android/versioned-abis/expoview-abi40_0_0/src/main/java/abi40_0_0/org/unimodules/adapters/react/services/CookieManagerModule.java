package abi40_0_0.org.unimodules.adapters.react.services;

import abi40_0_0.com.facebook.react.bridge.NativeModule;
import abi40_0_0.com.facebook.react.bridge.ReactContext;
import abi40_0_0.com.facebook.react.modules.network.ForwardingCookieHandler;

import java.net.CookieHandler;
import java.util.Collections;
import java.util.List;

import abi40_0_0.org.unimodules.core.interfaces.InternalModule;

public class CookieManagerModule extends ForwardingCookieHandler implements InternalModule, NativeModule {
  private static final String TAG = "CookieManagerModule";

  public CookieManagerModule(ReactContext context) {
    super(context);
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public void initialize() {
    // do nothing
  }

  @Override
  public List<Class> getExportedInterfaces() {
    return Collections.singletonList((Class) CookieHandler.class);
  }

  @Override
  public boolean canOverrideExistingModule() {
    return false;
  }

  @Override
  public void onCatalystInstanceDestroy() {
    // do nothing
  }
}

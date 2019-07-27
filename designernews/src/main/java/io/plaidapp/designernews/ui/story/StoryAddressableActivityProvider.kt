package io.plaidapp.designernews.ui.story

import inversion.InversionProvider
import io.plaidapp.core.util.AddressableActivity
import io.plaidapp.core.util.AddressableActivityImpl

@InversionProvider(AddressableActivity.STORY)
fun provideAddressableActivity() : AddressableActivity = AddressableActivityImpl(StoryActivity::class)
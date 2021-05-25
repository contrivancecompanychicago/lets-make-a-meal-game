BUGSNAG = {
    'api_key': 'fb394e7d0393364dc3946b62f5f66fda',
    'project_root': '/path/to/your/app',
}
MIDDLEWARE = (
    'bugsnag.django.middleware.BugsnagMiddleware',
    # ...
)
import sentry_sdk
from sentry_sdk.integrations.django import DjangoIntegration

sentry_sdk.init(
    dsn="https://8a30cdfdccb841d4ac4f2a04445f7ca2@o229048.ingest.sentry.io/5775430",
    integrations=[DjangoIntegration()],

    # Set traces_sample_rate to 1.0 to capture 100%
    # of transactions for performance monitoring.
    # We recommend adjusting this value in production.
    traces_sample_rate=1.0,

    # If you wish to associate users to errors (assuming you are using
    # django.contrib.auth) you may enable sending PII data.
    send_default_pii=True
)
from django.urls import path

def trigger_error(request):
    division_by_zero = 1 / 0

urlpatterns = [
    path('sentry-debug/', trigger_error),
    # ...
]
urlpatterns = [
    url(r'^$', spreadlinks.views.library_list,
        {'root_dir': settings.SPREADLINKS_DIR}, 'library_list'),
    url(r'^(?P<library_name>[^/]*)/$', spreadlinks.views.library_detail,
        {'root_dir': settings.SPREADLINKS_DIR}, 'library_detail'),
    url(r'^(?P<library_name>[^/]*)/page(?P<page>[0-9]+)$', spreadlinks.views.library_detail,
        {'root_dir': settings.SPREADLINKS_DIR}, 'library_detail'),
    url(r'^(?P<library_name>[^/]*)/tags/(?P<urlencoded_keywords>[a-z_0-9+:-]+)$', spreadlinks.views.library_detail,
        {'root_dir': settings.SPREADLINKS_DIR}, 'library_detail'),
    url(r'^(?P<library_name>[^/]*)/tags/(?P<urlencoded_keywords>[a-z_0-9+:-]+)/page(?P<page>[0-9]+)$', spreadlinks.views.library_detail, {'root_dir': settings.SPREADLINKS_DIR}, 'library_detail'),
]


import bugsnag


bugsnag.configure(
    api_key="f316eee56196b770fea6d8d8184833a8",
    project_root="/path/to/your/app",
)

from bugsnag.flask import handle_exceptions


app = Flask(__name__)
handle_exceptions(app)

bugsnag.notify(Exception('Test error'))

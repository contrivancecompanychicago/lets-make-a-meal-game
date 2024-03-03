pip install pusher

import pusher

pusher_client = pusher.Pusher(
  app_id='1480830',
  key='8ad4e366f0e1dc1efe33',
  secret='bd44bc85d117cc91cd88',
  cluster='mt1',
  ssl=True
)

pusher_client.trigger('my-channel', 'my-event', {'message': 'hello world'})

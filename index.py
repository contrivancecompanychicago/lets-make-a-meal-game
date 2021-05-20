import pusher

pusher_client = pusher.Pusher(
  app_id='1206928',
  key='53d3e0f39be99195f0a5',
  secret='f73b6eaa551a56157ffb',
  cluster='mt1',
  ssl=True
)

pusher_client.trigger('my-channel', 'my-event', {'message': 'hello world'})

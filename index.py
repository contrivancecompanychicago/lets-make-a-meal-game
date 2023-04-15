import pusher

pusher_client = pusher.Pusher(
  app_id='1584890',
  key='63abd4f3dbefea6e0d3f',
  secret='6601b1327848f0b35643',
  cluster='mt1',
  ssl=True
)

pusher_client.trigger('my-channel', 'my-event', {'message': 'hello world'})

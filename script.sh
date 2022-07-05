curl -X POST \
    -H 'Content-type: application/json; charset=utf-8' \
    --data '{ "channel": "#geral", "username": "Bot qazando - E2E", "icon_emoji": ":borat:", "text": "*Execução Dos Testes*","attachments":[{"fallback":"New open task [Urgent]: <http://url_to_task|Test out Slack message attachments>","pretext":"New open task [Urgent]: <http://url_to_task|Test out Slack message attachments>","color":"#28B463","fields":[{"title":"Notificação","value":"This is much easier than I thought it would be.","short":false}]}]}' \
    https://hooks.slack.com/services/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

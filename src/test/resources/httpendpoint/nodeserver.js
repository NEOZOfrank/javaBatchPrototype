var express = require('express');
var app = express();

app.use(express.bodyParser());

app.post('/startWorkflow', function(req, res){
    console.log('POST /');
    console.dir(req.headers);
    console.dir(req.body);
    res.writeHead(200, {'Content-Type': 'text/plain'});
    res.end('thanks');
});

port = 3000;
app.listen(port);
console.log('Listening at http://localhost:' + port)
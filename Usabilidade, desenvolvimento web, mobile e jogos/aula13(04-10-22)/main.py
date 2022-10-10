from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/', methods=["get", "post"])
def main():
    n = request.form['nome']
    return render_template('index.html', n=n)

if __name__ == "__main__":
    app.run(debug=True)

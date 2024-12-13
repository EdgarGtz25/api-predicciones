from flask import Flask, request, jsonify
from sklearn.naive_bayes import GaussianNB
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
import pandas as pd

app = Flask(__name__)

# Cargar datos y entrenar el modelo
data = pd.read_csv('zoo.csv')
X = data.drop('class', axis=1)
y = data['class']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
modelo = GaussianNB()
modelo.fit(X_train, y_train)

@app.route('/predict', methods=['POST'])
def predict():
    # Obtener datos del request
    data = request.get_json()
    
    # Convertir los datos en un DataFrame
    respuestas_df = pd.DataFrame([data])
    
    # Predecir el tipo de animal
    prediccion = modelo.predict(respuestas_df)
    
    # Obtener la probabilidad de la predicción
    probabilidad = modelo.predict_proba(respuestas_df).max()
    
    # Retornar la predicción y la probabilidad como JSON
    return jsonify({'tipo_de_animal': prediccion[0], 'probabilidad': probabilidad})

if __name__ == '__main__':
    app.run(debug=True)
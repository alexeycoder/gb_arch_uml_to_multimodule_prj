## Введение в понятие архитектуры, проектирование ПО и жизненный цикл программного продукта. UML-диаграммы

На основе Диаграммы классов ModelElements, разработать классы: Model Store, PoligonalModel (Texture, Poligon), Flash, Camera, Scene.

*Исходная диаграмма*

![HomeTask](https://github.com/user-attachments/assets/8a9e91a0-0191-4ff4-89b3-ecc9dcb40626)

### Решение на базе мульти-модульного Maven-проекта

Примечания к решению:

* При именовании типов, их членов и методов, применялись правила, принятые в Java.

* Экземпляры членов типов, чья связь на диаграмме указана как 'композиция' (aka строгий вариант агрегации),
создаются в самом содержащем типе и не передаются извне (в конструкторе или иначе),
чтобы подчеркнуть экземпляро-созидательную ответственность содержащего типа.

*Структура модулей*

"ModelElements" (artefactId: model-elements, package: edu.alexey.designer3d.model)

* Общие базовые типы для Camera и Flush в [edu.alexey.designer3d.model.abstractions](model-elements/src/main/java/edu/alexey/designer3d/model/abstractions)
* [class Camera](model-elements/src/main/java/edu/alexey/designer3d/model/Camera.java)
* [class Flash](model-elements/src/main/java/edu/alexey/designer3d/model/Flash.java)
* [class PolygonalModel](model-elements/src/main/java/edu/alexey/designer3d/model/PolygonalModel.java)
* [class Scene](model-elements/src/main/java/edu/alexey/designer3d/model/Scene.java)
* [прочие типы](model-elements/src/main/java/edu/alexey/designer3d/model)

![Снимок экрана от 2024-08-09 19-40-10](https://github.com/user-attachments/assets/89135e08-cd1d-4bb2-8cc4-b7528277603a)

"InMemoryModel" (artefactId: inmemory-model, package: edu.alexey.designer3d.modelstore)

* [interface ModelChangeObserver](inmemory-model/src/main/java/edu/alexey/designer3d/modelstore/abstractions/ModelChangeObserver.java)
* [interface ModelChanger](inmemory-model/src/main/java/edu/alexey/designer3d/modelstore/abstractions/ModelChanger.java)
* [class ModelStore](inmemory-model/src/main/java/edu/alexey/designer3d/modelstore/ModelStore.java)

![Снимок экрана от 2024-08-09 19-39-36](https://github.com/user-attachments/assets/02917049-eebd-4b34-a660-a8abd4495698)

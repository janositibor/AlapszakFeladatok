package j09_AllapotGep_statemachine.typewriter;

public enum TypeWriterState {
    CAPSLOCKON{
        public TypeWriterState next(){
            return TypeWriterState.CAPSLOCKOFF;
        }
    },
    CAPSLOCKOFF{
        public TypeWriterState next(){
            return TypeWriterState.CAPSLOCKON;
        }
    };

    public abstract TypeWriterState next();
}

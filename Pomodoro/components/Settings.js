import React, { useEffect } from 'react';
import { StyleSheet, View, Text } from 'react-native';
import { useForm, Controller } from "react-hook-form";
import ReactDOM from "react-dom";

const rootElement = document.getElementById("root");

// export default function Settings() {
function Settings() {

    const { register, handleSubmit, watch, errors } = useForm();
    const onSubmit = data => {
        console.log(data);
    }; // your form submit function which will invoke after successful validation

    console.log(watch("example")); // you can watch individual input by pass the name of the input

    return (
        <form onSubmit={handleSubmit(onSubmit)}>
            <label>Example</label>
            <input name="example" defaultValue="test" ref={register} />
            <label>ExampleRequired</label>
            <input
                name="exampleRequired"
                ref={register({ required: true, maxLength: 10 })}
            />
            {errors.exampleRequired && <p>This field is required</p>}
            <input type="submit" />
        </form>
    );
}

export default ReactDOM.render(<Settings />, rootElement);
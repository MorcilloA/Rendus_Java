import 'react-native-gesture-handler';
import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
//Alexy Pages
import Settings from './../components/Settings';
import Timer from './../components/Timer';

const Tab = createBottomTabNavigator();

export default function Navigation(){
    return (
        <NavigationContainer>
            <Tab.Navigator>
                <Tab.Screen name="Timer" component={Timer} />
                <Tab.Screen name="Settings" component={Settings} />
                {/* <Tab.Screen name="Calendrier" component={Agenda} /> */}
                {/* <Tab.Screen name="Adding" component={UpsertTask} /> */}
                {/* <Tab.Screen name="Setting" component={Setting} /> */}
            </Tab.Navigator>
        </NavigationContainer>
    )
}
import { StyleSheet, TextInput } from 'react-native';
import {useState} from 'react';

import EditScreenInfo from '../components/EditScreenInfo';
import { Text, View } from '../components/Themed';
import { RootTabScreenProps } from '../types';

export default function TabOneScreen({ navigation }: RootTabScreenProps<'TabOne'>) {
const [myText, setMyText] = useState("My Original Text");
  return (
  
    <View style={styles.container} >
      <Text style={styles.title}>Tab One</Text>
      <View style={styles.separator} lightColor="#eee" darkColor="rgba(255,255,255,0.1)" />
	  <TextInput style={styles.textInput} placeholder="Your name here" onChangeText={(newText)=>{setMyText(newText);}} />
	  <Text>{myText}</Text>
      <EditScreenInfo style={{flex:1}} path="/screens/TabOneScreen.tsx" />
    </View>
  );
}
 
const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  title: {
    fontSize: 20,
	flex: 1,
    fontWeight: 'bold',
  },
  separator: {
    marginVertical: 30,
    height: 1,
    width: '80%',
  },
  textInput : {
     backgroundColor:'gray',
	 width: "100%",
    borderWidth: 1,
    borderRadius: 10,
    padding: 10,
	 border: '1px solid rgb(0.5,0.5,0.5,0.5)',
	 flex: 1
  }
});

import React from 'react';
import {useState, useCallback} from 'react';
import { Alert, FlatList, StyleSheet, Text, View, Switch, SafeAreaView, TouchableOpacity} from 'react-native';
import {NavigationContainer } from '@react-navigation/native';
import {createStackNavigator} from '@react-navigation/stack';

const Stack = createStackNavigator();
const styles = StyleSheet.create({
  container: {
   flex: 1,
   paddingTop: 22
  },
  item: {
    padding: 10,
    fontSize: 18,
    height: 44,
  },
  button : {
     pading : 20,
     height : 30,
     textAlign: 'center',
     textAlignVertical : 'center',
     backgroundColor :'dodgerblue'
  }
});

const countries = [
          {name: 'Mexico'},
          {name: 'Holland'},
          {name: 'Dominican Republic'},
          {name: 'United States'},
          {name: 'Brazil'},
          {name: 'Argentina'},
          {name: 'Canada'},
          {name: 'Peru'},
          {name: 'Spain'},
          {name: 'Germany'},
        ];

const SecondScreen = ({navigation, route}) => {
  const [country, setCountry] = useState('');
  const [isRefreshing, setIsRefreshing] = useState(false);
  const newCountry = route.params ? route.params.country : null;
  const [selectedCountries, setSelectedCountries] = useState([]);
  const handleUpdate = useCallback(
    (country, newValue) => {
      if (newValue === true) {
        setSelectedCountries(current => [country]);
      }
      },
    [ setSelectedCountries],
  );

  const handleSubmit = useCallback(() => {
    if (!country) {
      Alert.alert('Please add a contry');
    } else if (selectedCountries.length < 3) {
      Alert.alert('Please choose at least 3 colors');
    } else {
      navigation.navigate('FlatListBasics', {
        newCountry: { countryName: country, countries: selectedCountries },
      });
    }
  }, [country, navigation, selectedCountries]);
  return(
    <View>
    <TouchableOpacity 
       style={styles.button}
       onPress ={() =>{
            navigation.navigate("FlatListBasics");
         }
       }>
          <Text>
     Go to select countries
          </Text>
    </TouchableOpacity>
    <FlatList 
        data={selectedCountries}
        keyExtractor = {item => item.name}
         renderItem ={({item}) => (
             <View styles >
                 <Text> {item.name} </Text>
             </View>
             )
            }
    />
    </View>
    
  )

}

const FlatListBasics = ({navigation}) => {
    const [selectedCountries, setSelectedCountries] = useState([]);
    const handleValueChange = useCallback((value, country) => {
                if(value === true){
                  setSelectedCountries(countries => [...countries, country]);
                }else{
                  setSelectedCountries(countries => countries.filter(selectedCountry => country.name !== selectedCountry.name, )
,);}},[]);
  return (
    <View style={styles.container}>
      <FlatList
        data={countries}
        keyExtractor = {item => item.name}
         renderItem ={({item}) => (
             <View styles = {styles.item}>
                 <Text> {item.name} </Text>
                 <Switch value={!!selectedCountries.find(country => country.name === item.name)}
                               onValueChange={selected => {handleValueChange(selected, item)}}/>
            </View>
          )
         } />
     <TouchableOpacity onPress = {()=>{
         navigation.navigate("SecondScreen", selectedCountries)
     }}>
         <Text>
            Submit
         </Text>
     </TouchableOpacity>
    </View>
  )
};

const MainNavigator = () => {
  return(
  <NavigationContainer> 
      <Stack.Navigator>
         <Stack.Screen name='Second' component={SecondScreen}/>
         <Stack.Screen name="FlatListBasics" component={FlatListBasics} />
      </Stack.Navigator>
  </NavigationContainer> 
  );
}
export default MainNavigator;

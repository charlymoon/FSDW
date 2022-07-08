import React from 'react';
import {useState, useCallback} from 'react';
import { FlatList, StyleSheet, Text, View, Switch} from 'react-native';

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

const FlatListBasics = () => {
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

    </View>
  )
};

export default FlatListBasics;

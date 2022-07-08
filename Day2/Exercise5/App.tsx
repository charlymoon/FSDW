import React from 'react';
import {useState,useCallback} from 'react';
import {FlatList,StyleSheet,Text,View,Switch} from 'react-native';
const styles = StyleSheet.create({
  container: {
   flex: 1,
   paddingTop: 22,
   backgroundColor : 'red',
  },
  container2: {
   flex: 1,
   paddingTop: 22,
   backgroundColor : 'lightgray',
  },
  container3: {
   flex: 1,
   paddingTop: 22,
   backgroundColor : 'dodgerblue',
  },
});

const Squares=()=>{
  return(
    <View style={({flex:1, flexDirection:"column"})}>
		<View style={({flex:1, flexDirection:"row"})}>
			<View style={styles.container}/>
			<View style={styles.container2}/>
			<View style={styles.container3}/>
		</View>
		<View style={({flex:1, flexDirection:"row"})}>
			<View style={styles.container2}/>
			<View style={styles.container3}/>
			<View style={styles.container}/>
		</View>
		<View style={({flex:1, flexDirection:"row"})}>
			<View style={styles.container3}/>
			<View style={styles.container}/>
			<View style={styles.container2}/>
		</View>
	</View>
  )
};


export default Squares;

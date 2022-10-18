import ReactDOM from 'react-dom/client';
import './SearchPage/SearchPage'
import React from 'react';
import SearchPage from './SearchPage/SearchPage';
import reportWebVitals from './reportWebVitals';
import SubmitButton from './components/SubmitButton';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <SearchPage />
    <SubmitButton/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

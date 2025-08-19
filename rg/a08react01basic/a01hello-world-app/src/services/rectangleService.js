// src/services/rectangleService.js
import axios from 'axios';

const API_BASE_URL = "http://localhost:8080/api/rectangle";

export const calculateRectangle = async (length, breadth) => {
  try {
    const response = await axios.post(API_BASE_URL, {
      length: parseFloat(length),
      breadth: parseFloat(breadth)
    });
    return response.data;
  } catch (error) {
    // Throw error to be caught by the calling component
    throw error.response?.data || "Unknown error occurred";
  }
};

import { Component, Input } from '@angular/core';
import { OnInit } from '@angular/core';
import { GpsService } from '../services/gps.service';
import * as L from 'leaflet';

@Component({
  selector: 'app-explore-container',
  templateUrl: './explore-container.component.html',
  styleUrls: ['./explore-container.component.scss'],
})
export class ExploreContainerComponent implements OnInit {

  @Input() name?: string;
  gpsData: any[] = [];
  map!: L.Map;
  marker!: L.Marker;

  constructor(private gpsService: GpsService) {}

  ngOnInit() {
    this.gpsService.getAllCoordinates().subscribe(data => {
      this.gpsData = data;
      this.loadMap();
      this.startAnimation();
    });
  }

  loadMap() {
    this.map = L.map('mapId').setView([this.gpsData[0].latitude, this.gpsData[0].longitude], 13);

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: '© OpenStreetMap contributors'
    }).addTo(this.map);

    const latlngs = this.gpsData.map(coord => [coord.latitude, coord.longitude]);
    const polyline = L.polyline(latlngs, { color: 'red' }).addTo(this.map);
    this.map.fitBounds(polyline.getBounds());

    this.marker = L.marker([this.gpsData[0].latitude, this.gpsData[0].longitude], {
      icon: L.icon({
        iconRetinaUrl: 'https://unpkg.com/leaflet@1.7.1/dist/images/marker-icon-2x.png',
        iconUrl: 'https://unpkg.com/leaflet@1.7.1/dist/images/marker-icon.png',
        shadowUrl: 'https://unpkg.com/leaflet@1.7.1/dist/images/marker-shadow.png',
        iconSize: [25, 41],
        iconAnchor: [12, 41],
        popupAnchor: [1, -34],
        shadowSize: [41, 41],
      }),
    }).addTo(this.map);

    this.marker.bindPopup("Starting point").openPopup();
  }

  startAnimation() {
    let index = 0;
    const delay = 1000;

    const animateMarker = () => {
      if (index < this.gpsData.length) {
        const coord = this.gpsData[index];


        this.marker.setLatLng([coord.latitude, coord.longitude]);


        const popupContent = `
          <b>Latitude:</b> ${coord.latitude}<br>
          <b>Longitude:</b> ${coord.longitude}<br>
          <b>Speed:</b> ${coord.speed || 'N/A'} km/h<br>
          <b>Fuel:</b> ${coord.fuel || 'N/A'} liters
        `;
        this.marker.bindPopup(popupContent).openPopup();

        index++;
        setTimeout(animateMarker, delay);
      }
    };

    animateMarker();
  }
}

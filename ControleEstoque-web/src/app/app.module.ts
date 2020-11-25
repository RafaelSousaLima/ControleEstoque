import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TesteFontAwesomeComponent } from './teste-font-awesome/teste-font-awesome.component';
import { DocumentacaoAngularComponent } from './documentacao-angular/documentacao-angular.component';

@NgModule({
  declarations: [
    AppComponent,
    TesteFontAwesomeComponent,
    DocumentacaoAngularComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

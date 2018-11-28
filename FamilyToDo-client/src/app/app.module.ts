import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { HomePageComponent } from './home-page/home-page.component';
import { TodoListComponent } from './todo-list/todo-list.component';
import { ItemListComponent } from './item-list/item-list.component';
import { PageContainerComponent } from './page-container/page-container.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { SearchComponent } from './search/search.component';
import { SearchResultPageComponent } from './search-result-page/search-result-page.component';
import { SignInPageComponent } from './sign-in-page/sign-in-page.component';
import { SignUpPageComponent } from './sign-up-page/sign-up-page.component';
import { ItemPageComponent } from './item-page/item-page.component';
import { ListingOnlyItemsComponent } from './listing-only-items/listing-only-items.component';
import { AbutPageComponent } from './abut-page/abut-page.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { DestinationPageComponent } from './destination-page/destination-page.component';
import { DestinationListComponent } from './destination-list/destination-list.component';
import { FamilyListComponent } from './family-list/family-list.component';
import { FamilyPageComponent } from './family-page/family-page.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomePageComponent
  },
  
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
  {
    path: 'items',
    component: ItemPageComponent
  },
  {
    path: 'destinations',
    component: DestinationPageComponent
  },
  {
    path: 'family',
    component: FamilyPageComponent
  },
  {
    path: 'about',
    component: AbutPageComponent
  },
  {
    path: 'search/:keywords',
    component: SearchResultPageComponent
  },
  {
    path: 'sign-in',
    component: SignInPageComponent
  },
  {
    path: 'sign-up',
    component: SignUpPageComponent
  },
  {
    path: '**',
    component: PageNotFoundComponent
  }
  
  
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomePageComponent,
    TodoListComponent,
    ItemListComponent,
    PageContainerComponent,
    SidebarComponent,
    SearchComponent,
    SearchResultPageComponent,
    SignInPageComponent,
    SignUpPageComponent,
    ItemPageComponent,
    ListingOnlyItemsComponent,
    AbutPageComponent,
    PageNotFoundComponent,
    DestinationPageComponent,
    DestinationListComponent,
    FamilyListComponent,
    FamilyPageComponent,


   
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

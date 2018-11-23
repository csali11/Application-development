import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

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

   
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

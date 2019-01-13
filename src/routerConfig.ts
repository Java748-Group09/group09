import {Routes} from '@angular/router';
import {HomeComponent} from './app/home/home.component';
import {AboutComponent} from './app/about/about.component';
import {RegisterComponent} from './app/register/register.component';
//import {LoginComponent} from '/.login/login.component.component';
import {LoginComponent} from './app/login/login.component'

export const appRoutes:Routes=[
    {path:'home',
     component:HomeComponent
    },
    {path:'about',
     component:AboutComponent
    },
    {path:'register',
     component:RegisterComponent
    },
    {path:'login',
     component:LoginComponent
    }
]

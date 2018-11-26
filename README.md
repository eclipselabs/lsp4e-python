# lsp4e-python

### This repository is now part of https://github.com/eclipselabs/language-servers-for-eclipse

***

[![Build Status](https://travis-ci.org/eclipselabs/lsp4e-python.svg?branch=master)](https://travis-ci.org/eclipselabs/lsp4e-python)

Integration of the Python Language Server with LSP4E. 


Plugin integrates:
* [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e)
* [tm4e](https://github.com/eclipse/tm4e)
* [Python Language Server](https://github.com/palantir/python-language-server)

## Installation

Update site: https://dl.bintray.com/mniewrzal/lsp4e-python/snapshot/

Before using follow Python Language Server [installation](https://github.com/palantir/python-language-server#installation) details.   

The update site is automatically updated by the [Travis CI build](https://travis-ci.org/eclipselabs/lsp4e-python) on every new commit to the master branch.

## Features

* Syntax highlighting
* Code validation
* Completion
* Signature help
* Hyperlinks
* Hovers
* Formatting
* Outline

## Usage

To use features provided by this plugin just open Python file with **Generic Editor** (_Open With -> Generic Text Editor_).

## Screenshots

![Integration screenshot](images/screenshot.png)

## Development

To develop and debug plugin in Eclipse: 
1. Open Eclipse for Committers (tested with 2018-09).
2. Import `lsp4e-python` project. Use menu: `File > Import > Maven > Existing Maven project`
3. Install dependencies in repository project: `Right click > Run As... > Maven install`
4. Setup Target platform so it contains dependent plug-ins: `Window > Preferences > Plug-in development > Target platform`. Add new target platform with `Add...` in wizard select `Default`, and then press `Add...` select directory `org.eclipse.lsp4e.python-repository`.
5. Start Eclipse with `lsp4e-python plugin`: right click on `org.eclipse.lsp4e.python` project then select `Run As... > Eclipse Application`


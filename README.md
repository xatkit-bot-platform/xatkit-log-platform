Xatkit Log Platform
=====

[![License Badge](https://img.shields.io/badge/license-EPL%202.0-brightgreen.svg)](https://opensource.org/licenses/EPL-2.0)
[![Build Status](https://travis-ci.com/xatkit-bot-platform/xatkit-log-platform.svg?branch=master)](https://travis-ci.com/xatkit-bot-platform/xatkit-log-platform)

Print log messages from your Xatkit execution model. This platform is bundled with the [Xatkit release](https://github.com/xatkit-bot-platform/xatkit-releases/releases).


## Providers

The log platform does not define any provider.

## Actions

| Action     | Parameters                                                   | Return | Return Type | Description                                        |
| ---------- | ------------------------------------------------------------ | ------ | ----------- | -------------------------------------------------- |
| LogInfo    | - `message` (**String**): the message to log with the `Info` level | `null` | `null`      | Logs the provided `message` with the `Info` level  |
| LogWarning | - `message` (**String**): the message to log with the `Warn` level | `null` | `null`      | Logs the provided `message` with the `Warn` level  |
| LogError   | - `message` (**String**): the message to log with the `Error` level | `null` | `null`      | Logs the provided `message` with the `Error` level |

## Options

The log platform does not support any configuration option.

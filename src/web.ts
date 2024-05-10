import { WebPlugin } from '@capacitor/core';

import type { SetRenderPriorityPlugin } from './definitions';

export class SetRenderPriorityWeb extends WebPlugin implements SetRenderPriorityPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

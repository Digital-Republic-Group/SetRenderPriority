import { registerPlugin } from '@capacitor/core';

import type { SetRenderPriorityPlugin } from './definitions';

const SetRenderPriority = registerPlugin<SetRenderPriorityPlugin>('SetRenderPriority', {
  web: () => import('./web').then(m => new m.SetRenderPriorityWeb()),
});

export * from './definitions';
export { SetRenderPriority };

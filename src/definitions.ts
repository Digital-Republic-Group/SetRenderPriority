export interface SetRenderPriorityPlugin {
  setRenderPriority(options: { priority: string }): Promise<{ priority: string }>;
  echo(options: { value: string }): Promise<{ value: string }>;
}

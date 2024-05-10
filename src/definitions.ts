export interface SetRenderPriorityPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}

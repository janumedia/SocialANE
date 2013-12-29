package com.janumedia.ane.social
{
	import flash.events.StatusEvent;
	import flash.external.ExtensionContext;
	
	public class Social
	{
		private static var _instance:Social;
		private static var _forceSingleton:Boolean;
		
		private var _context:ExtensionContext;
		
		public function Social ()
		{
			if(_instance || !_forceSingleton){
				throw new Error("Social is Singleton... use instance");
			}
			
			_instance = this;
			
			if (!_context)
			{
				_context = ExtensionContext.createExtensionContext ("com.janumedia.ane.social", null);
				_context.addEventListener (StatusEvent.STATUS, onExtensionStatus);
			}
		}
		
		public static function get instance() : Social
		{
			_forceSingleton = true;
			
			if(!_instance){
				_instance = new Social;
			}
			
			return _instance;
		}
		
		private function onExtensionStatus(e:StatusEvent):void 
		{
			trace (this + " code: " + e.code + " , level: " + e.level);
		}
		
		public function share (subject:String, message:String) : void
		{
			_context.call ("share", subject, message);
		}
	}
}
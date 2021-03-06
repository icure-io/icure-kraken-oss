map = function(doc) {
	if (doc.java_type === 'org.taktik.icure.entities.Device' && !doc.deleted && doc.publicKey && (doc.hcPartyKeys || doc.aesExchangeKeys)) {
		var aesPubKeys = Object.keys(doc.aesExchangeKeys || {});
		aesPubKeys.forEach(function (pk) {
			var ks = doc.aesExchangeKeys[pk]
			Object.keys(ks).forEach(function (hcpId) {
				var delegateKeys = ks[hcpId];
				Object.keys(delegateKeys).forEach(function (delPub) {
					var delK = delegateKeys[delPub]
					emit(hcpId, [doc._id, pk.slice(-32), delPub.slice(-32), delK]);
				})
			});
		});

		if (!doc.aesExchangeKeys || !doc.aesExchangeKeys[doc.publicKey]) {
			Object.keys(doc.hcPartyKeys).forEach(function (k) {
				emit(k, [doc._id, doc.publicKey.slice(-32), '', doc.hcPartyKeys[k][1]]);
			});
		}
	}
}

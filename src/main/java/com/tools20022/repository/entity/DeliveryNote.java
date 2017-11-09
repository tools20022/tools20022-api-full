/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeDelivery1;
import com.tools20022.repository.msg.TradeDelivery2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document which is a proof of delivery of the product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DeliveryNote" src="doc-files/DeliveryNote.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#mmDeliveryNote
 * TradeDelivery1.mmDeliveryNote}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryNote
 * TradeDelivery2.mmDeliveryNote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryNote"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Document which is a proof of delivery of the product."</li>
 * </ul>
 */
public class DeliveryNote extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryNote";
				definition = "Document which is a proof of delivery of the product.";
				derivationElement_lazy = () -> Arrays.asList(TradeDelivery1.mmDeliveryNote, TradeDelivery2.mmDeliveryNote);
				superType_lazy = () -> Document.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
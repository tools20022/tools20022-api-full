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
import com.tools20022.repository.entity.InvoicePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StructuredRemittanceInformation10;
import com.tools20022.repository.msg.TradeSettlement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party identified as the liable party on the face of a commercial invoice.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvoicerRole" src="doc-files/InvoicerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoicer
 * TradeSettlement1.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmInvoicer
 * StructuredRemittanceInformation10.mmInvoicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.InvoicePartyRole
 * InvoicePartyRole}</li>
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
 * "InvoicerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party identified as the liable party on the face of a commercial invoice."</li>
 * </ul>
 */
public class InvoicerRole extends InvoicePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoicerRole";
				definition = "Party identified as the liable party on the face of a commercial invoice.";
				derivationElement_lazy = () -> Arrays.asList(TradeSettlement1.mmInvoicer, StructuredRemittanceInformation10.mmInvoicer);
				superType_lazy = () -> InvoicePartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
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
import com.tools20022.repository.entity.InvoicePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party identified as the liable party on the face of a commercial invoice.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvoiceeRole" src="doc-files/InvoiceeRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#Invoicee
 * StructuredRemittanceInformation6.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#Invoicee
 * StructuredRemittanceInformation7.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#Invoicee
 * StructuredRemittanceInformation9.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#Invoicee
 * StructuredRemittanceInformation8.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#Invoicee
 * StructuredRemittanceInformation2.Invoicee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#Invoicee
 * TradeSettlement1.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#Invoicee
 * StructuredRemittanceInformation10.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#Invoicee
 * StructuredRemittanceInformation12.Invoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#Invoicee
 * StructuredRemittanceInformation13.Invoicee}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.InvoicePartyRole
 * InvoicePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceeRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party identified as the liable party on the face of a commercial invoice."</li>
 * </ul>
 */
public class InvoiceeRole extends InvoicePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceeRole";
				definition = "Party identified as the liable party on the face of a commercial invoice.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation6.Invoicee, com.tools20022.repository.msg.StructuredRemittanceInformation7.Invoicee,
						com.tools20022.repository.msg.StructuredRemittanceInformation9.Invoicee, com.tools20022.repository.msg.StructuredRemittanceInformation8.Invoicee,
						com.tools20022.repository.msg.StructuredRemittanceInformation2.Invoicee, com.tools20022.repository.msg.TradeSettlement1.Invoicee, com.tools20022.repository.msg.StructuredRemittanceInformation10.Invoicee,
						com.tools20022.repository.msg.StructuredRemittanceInformation12.Invoicee, com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicee);
				superType_lazy = () -> InvoicePartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
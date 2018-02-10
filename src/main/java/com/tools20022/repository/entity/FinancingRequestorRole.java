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
import com.tools20022.repository.entity.InvoiceFinancingPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvoiceRequestInformation1;
import com.tools20022.repository.msg.RequestGroupInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Credit party that requests the invoice financing, on behalf of creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FinancingRequestorRole"
 * src="doc-files/FinancingRequestorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
 * InvoiceFinancingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmFinancingRequestor
 * RequestGroupInformation1.mmFinancingRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmSupplier
 * InvoiceRequestInformation1.mmSupplier}</li>
 * </ul>
 * </li>
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
 * "FinancingRequestorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit party that requests the invoice financing, on behalf of creditor."</li>
 * </ul>
 */
public class FinancingRequestorRole extends InvoiceFinancingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingRequestorRole";
				definition = "Credit party that requests the invoice financing, on behalf of creditor.";
				derivationElement_lazy = () -> Arrays.asList(RequestGroupInformation1.mmFinancingRequestor, InvoiceRequestInformation1.mmSupplier);
				superType_lazy = () -> InvoiceFinancingPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancingRequestorRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}
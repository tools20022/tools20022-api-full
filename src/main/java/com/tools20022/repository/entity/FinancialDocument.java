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
import com.tools20022.repository.msg.FinancialItem1;
import com.tools20022.repository.msg.InvoiceRequestInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of document used in relation with financial transactions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FinancialDocument" src="doc-files/FinancialDocument.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque Cheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingDocument
 * UndertakingDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditNote CreditNote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1 FinancialItem1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmReferredDocument
 * InvoiceRequestInformation1.mmReferredDocument}</li>
 * </ul>
 * </li>
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
 * "FinancialDocument"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of document used in relation with financial transactions."</li>
 * </ul>
 */
public class FinancialDocument extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialDocument";
				definition = "Type of document used in relation with financial transactions.";
				derivationElement_lazy = () -> Arrays.asList(InvoiceRequestInformation1.mmReferredDocument);
				subType_lazy = () -> Arrays.asList(Cheque.mmObject(), Invoice.mmObject(), UndertakingDocument.mmObject(), CreditNote.mmObject());
				superType_lazy = () -> Document.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(FinancialItem1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialDocument.class;
			}
		});
		return mmObject_lazy.get();
	}
}
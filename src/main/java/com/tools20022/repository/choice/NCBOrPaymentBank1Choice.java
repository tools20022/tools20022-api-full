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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.msg.SystemPartyIdentification3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between a national central bank or a payment bank.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NCBOrPaymentBank1Choice#mmNCBIdentification
 * NCBOrPaymentBank1Choice.mmNCBIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NCBOrPaymentBank1Choice#mmPaymentBankIdentification
 * NCBOrPaymentBank1Choice.mmPaymentBankIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NCBOrPaymentBank1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a national central bank or a payment bank."</li>
 * </ul>
 */
public class NCBOrPaymentBank1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected BICFIIdentifier nCBIdentification;
	/**
	 * Unique business identifier code used to identify the national central
	 * bank providing the information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NCBOrPaymentBank1Choice
	 * NCBOrPaymentBank1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NCBId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NCBIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique business identifier code used to identify the national central bank providing the information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNCBIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NCBOrPaymentBank1Choice.mmObject();
			isDerived = false;
			xmlTag = "NCBId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NCBIdentification";
			definition = "Unique business identifier code used to identify the national central bank providing the information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	protected SystemPartyIdentification3 paymentBankIdentification;
	/**
	 * Unique business identifier code used to identify the payment bank
	 * providing the information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3
	 * SystemPartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NCBOrPaymentBank1Choice
	 * NCBOrPaymentBank1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtBkId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentBankIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique business identifier code used to identify the payment bank providing the information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentBankIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NCBOrPaymentBank1Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtBkId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentBankIdentification";
			definition = "Unique business identifier code used to identify the payment bank providing the information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NCBOrPaymentBank1Choice.mmNCBIdentification, com.tools20022.repository.choice.NCBOrPaymentBank1Choice.mmPaymentBankIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NCBOrPaymentBank1Choice";
				definition = "Choice between a national central bank or a payment bank.";
			}
		});
		return mmObject_lazy.get();
	}

	public BICFIIdentifier getNCBIdentification() {
		return nCBIdentification;
	}

	public void setNCBIdentification(BICFIIdentifier nCBIdentification) {
		this.nCBIdentification = nCBIdentification;
	}

	public SystemPartyIdentification3 getPaymentBankIdentification() {
		return paymentBankIdentification;
	}

	public void setPaymentBankIdentification(SystemPartyIdentification3 paymentBankIdentification) {
		this.paymentBankIdentification = paymentBankIdentification;
	}
}
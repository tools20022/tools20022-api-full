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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.NCBOrPaymentBank1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ISINIdentifier;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details of the eligible securities as defined in the collateral
 * reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1#mmSecurityIdentification
 * EligibleSecurity1.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1#mmCollateralisationCurrency
 * EligibleSecurity1.mmCollateralisationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1#mmPartyIdentification
 * EligibleSecurity1.mmPartyIdentification}</li>
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
 * "EligibleSecurity1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details of the eligible securities as defined in the collateral reference data."
 * </li>
 * </ul>
 */
public class EligibleSecurity1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISINIdentifier securityIdentification;
	/**
	 * Identification of a security by an ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINIdentifier
	 * ISINIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1
	 * EligibleSecurity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleSecurity1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINIdentifier.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode collateralisationCurrency;
	/**
	 * Currency which may be processed by the system. A system may process
	 * transactions in a single currency or in multiple currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1
	 * EligibleSecurity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollstnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralisationCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleSecurity1.mmObject();
			isDerived = false;
			xmlTag = "CollstnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationCurrency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected NCBOrPaymentBank1Choice partyIdentification;
	/**
	 * Identifies the party for which the eligible security is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NCBOrPaymentBank1Choice
	 * NCBOrPaymentBank1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1
	 * EligibleSecurity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party for which the eligible security is defined."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EligibleSecurity1.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Identifies the party for which the eligible security is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NCBOrPaymentBank1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EligibleSecurity1.mmSecurityIdentification, EligibleSecurity1.mmCollateralisationCurrency, EligibleSecurity1.mmPartyIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EligibleSecurity1";
				definition = "Provides details of the eligible securities as defined in the collateral reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISINIdentifier getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(ISINIdentifier securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	public ActiveOrHistoricCurrencyCode getCollateralisationCurrency() {
		return collateralisationCurrency;
	}

	public void setCollateralisationCurrency(ActiveOrHistoricCurrencyCode collateralisationCurrency) {
		this.collateralisationCurrency = collateralisationCurrency;
	}

	public NCBOrPaymentBank1Choice getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(NCBOrPaymentBank1Choice partyIdentification) {
		this.partyIdentification = partyIdentification;
	}
}
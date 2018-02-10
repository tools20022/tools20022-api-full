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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines how the CSD is linked to the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IssuerOrInvestor1choice#mmIssuerCSD
 * IssuerOrInvestor1choice.mmIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IssuerOrInvestor1choice#mmInvestorCSD
 * IssuerOrInvestor1choice.mmInvestorCSD}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuerOrInvestor1choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the CSD is linked to the security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IssuerOrInvestor1choice", propOrder = {"issuerCSD", "investorCSD"})
public class IssuerOrInvestor1choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IssrCSD", required = true)
	protected SystemPartyIdentification1Choice issuerCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IssuerOrInvestor1choice
	 * IssuerOrInvestor1choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Issuer of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuerCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IssuerOrInvestor1choice.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "CSD Issuer of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SystemPartyIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstrCSD", required = true)
	protected SystemPartyIdentification1Choice investorCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IssuerOrInvestor1choice
	 * IssuerOrInvestor1choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Investor of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestorCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IssuerOrInvestor1choice.mmObject();
			isDerived = false;
			xmlTag = "InvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCSD";
			definition = "CSD Investor of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SystemPartyIdentification1Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IssuerOrInvestor1choice.mmIssuerCSD, com.tools20022.repository.choice.IssuerOrInvestor1choice.mmInvestorCSD);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IssuerOrInvestor1choice";
				definition = "Defines how the CSD is linked to the security.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemPartyIdentification1Choice getIssuerCSD() {
		return issuerCSD;
	}

	public IssuerOrInvestor1choice setIssuerCSD(com.tools20022.repository.choice.SystemPartyIdentification1Choice issuerCSD) {
		this.issuerCSD = Objects.requireNonNull(issuerCSD);
		return this;
	}

	public SystemPartyIdentification1Choice getInvestorCSD() {
		return investorCSD;
	}

	public IssuerOrInvestor1choice setInvestorCSD(com.tools20022.repository.choice.SystemPartyIdentification1Choice investorCSD) {
		this.investorCSD = Objects.requireNonNull(investorCSD);
		return this;
	}
}
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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ClearingAccountType3Code;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralAccount5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Operational construct of a central counterparty that defines the relationship
 * between collateral, margin and position accounts and upon default of a
 * clearing member defines the segregation of losses on positions and assets
 * held in such accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ClearingAccount1#mmAccountType
 * ClearingAccount1.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingAccount1#mmCollateralAccountOwner
 * ClearingAccount1.mmCollateralAccountOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
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
 * "ClearingAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Operational construct of a central counterparty that defines the relationship between collateral, margin and position accounts and upon default of a clearing member defines the segregation of losses on positions and assets held in such accounts."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingAccount1", propOrder = {"accountType", "collateralAccountOwner"})
public class ClearingAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctTp", required = true)
	protected ClearingAccountType3Code accountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code
	 * ClearingAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingAccount1
	 * ClearingAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of clearing account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingAccount1, ClearingAccountType3Code> mmAccountType = new MMMessageAttribute<ClearingAccount1, ClearingAccountType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingAccount1.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Indicates the type of clearing account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingAccountType3Code.mmObject();
		}

		@Override
		public ClearingAccountType3Code getValue(ClearingAccount1 obj) {
			return obj.getAccountType();
		}

		@Override
		public void setValue(ClearingAccount1 obj, ClearingAccountType3Code value) {
			obj.setAccountType(value);
		}
	};
	@XmlElement(name = "CollAcctOwnr", required = true)
	protected List<CollateralAccount5> collateralAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralAccount5
	 * CollateralAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingAccount1
	 * ClearingAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central countparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingAccount1, List<CollateralAccount5>> mmCollateralAccountOwner = new MMMessageAssociationEnd<ClearingAccount1, List<CollateralAccount5>>() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingAccount1.mmObject();
			isDerived = false;
			xmlTag = "CollAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccountOwner";
			definition = "Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central countparty.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralAccount5.mmObject();
		}

		@Override
		public List<CollateralAccount5> getValue(ClearingAccount1 obj) {
			return obj.getCollateralAccountOwner();
		}

		@Override
		public void setValue(ClearingAccount1 obj, List<CollateralAccount5> value) {
			obj.setCollateralAccountOwner(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingAccount1.mmAccountType, com.tools20022.repository.msg.ClearingAccount1.mmCollateralAccountOwner);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingAccount1";
				definition = "Operational construct of a central counterparty that defines the relationship between collateral, margin and position accounts and upon default of a clearing member defines the segregation of losses on positions and assets held in such accounts.";
			}
		});
		return mmObject_lazy.get();
	}

	public ClearingAccountType3Code getAccountType() {
		return accountType;
	}

	public ClearingAccount1 setAccountType(ClearingAccountType3Code accountType) {
		this.accountType = Objects.requireNonNull(accountType);
		return this;
	}

	public List<CollateralAccount5> getCollateralAccountOwner() {
		return collateralAccountOwner == null ? collateralAccountOwner = new ArrayList<>() : collateralAccountOwner;
	}

	public ClearingAccount1 setCollateralAccountOwner(List<CollateralAccount5> collateralAccountOwner) {
		this.collateralAccountOwner = Objects.requireNonNull(collateralAccountOwner);
		return this;
	}
}
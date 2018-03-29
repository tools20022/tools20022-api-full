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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.BankTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BankTransactionCodeStructure2;
import com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements to fully identify the type of the bank transaction entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure1#mmDomain
 * BankTransactionCodeStructure1.mmDomain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure1#mmProprietary
 * BankTransactionCodeStructure1.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BankTransaction
 * BankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDomainAndProprietary1Rule#forBankTransactionCodeStructure1
 * ConstraintDomainAndProprietary1Rule.forBankTransactionCodeStructure1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDomainAndProprietary2Rule#forBankTransactionCodeStructure1
 * ConstraintDomainAndProprietary2Rule.forBankTransactionCodeStructure1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFamilyAndSubFamilyRule#forBankTransactionCodeStructure1
 * ConstraintFamilyAndSubFamilyRule.forBankTransactionCodeStructure1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankTransactionCodeStructure1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements to fully identify the type of the bank transaction entry."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankTransactionCodeStructure1", propOrder = {"domain", "proprietary"})
public class BankTransactionCodeStructure1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Domn")
	protected BankTransactionCodeStructure2 domain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure2
	 * BankTransactionCodeStructure2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure1
	 * BankTransactionCodeStructure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Domn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the domain, the family and the sub-family of the bank transaction code, in a structured and hierarchical format.\n\nUsage: If a specific family or subfamily code cannot be provided, the generic family code defined for the domain or the generic subfamily code defined for the family should be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BankTransactionCodeStructure1, Optional<BankTransactionCodeStructure2>> mmDomain = new MMMessageAssociationEnd<BankTransactionCodeStructure1, Optional<BankTransactionCodeStructure2>>() {
		{
			businessComponentTrace_lazy = () -> BankTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure1.mmObject();
			isDerived = false;
			xmlTag = "Domn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domain";
			definition = "Specifies the domain, the family and the sub-family of the bank transaction code, in a structured and hierarchical format.\n\nUsage: If a specific family or subfamily code cannot be provided, the generic family code defined for the domain or the generic subfamily code defined for the family should be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure2.mmObject();
		}

		@Override
		public Optional<BankTransactionCodeStructure2> getValue(BankTransactionCodeStructure1 obj) {
			return obj.getDomain();
		}

		@Override
		public void setValue(BankTransactionCodeStructure1 obj, Optional<BankTransactionCodeStructure2> value) {
			obj.setDomain(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected ProprietaryBankTransactionCodeStructure1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1
	 * ProprietaryBankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
	 * BankTransaction.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure1
	 * BankTransactionCodeStructure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the bank transaction code, as defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BankTransactionCodeStructure1, Optional<ProprietaryBankTransactionCodeStructure1>> mmProprietary = new MMMessageAssociationEnd<BankTransactionCodeStructure1, Optional<ProprietaryBankTransactionCodeStructure1>>() {
		{
			businessElementTrace_lazy = () -> BankTransaction.mmProprietaryIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure1.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary identification of the bank transaction code, as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryBankTransactionCodeStructure1.mmObject();
		}

		@Override
		public Optional<ProprietaryBankTransactionCodeStructure1> getValue(BankTransactionCodeStructure1 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(BankTransactionCodeStructure1 obj, Optional<ProprietaryBankTransactionCodeStructure1> value) {
			obj.setProprietary(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure1.mmDomain, com.tools20022.repository.msg.BankTransactionCodeStructure1.mmProprietary);
				trace_lazy = () -> BankTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDomainAndProprietary1Rule.forBankTransactionCodeStructure1,
						com.tools20022.repository.constraints.ConstraintDomainAndProprietary2Rule.forBankTransactionCodeStructure1, com.tools20022.repository.constraints.ConstraintFamilyAndSubFamilyRule.forBankTransactionCodeStructure1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankTransactionCodeStructure1";
				definition = "Set of elements to fully identify the type of the bank transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BankTransactionCodeStructure2> getDomain() {
		return domain == null ? Optional.empty() : Optional.of(domain);
	}

	public BankTransactionCodeStructure1 setDomain(BankTransactionCodeStructure2 domain) {
		this.domain = domain;
		return this;
	}

	public Optional<ProprietaryBankTransactionCodeStructure1> getProprietary() {
		return proprietary == null ? Optional.empty() : Optional.of(proprietary);
	}

	public BankTransactionCodeStructure1 setProprietary(ProprietaryBankTransactionCodeStructure1 proprietary) {
		this.proprietary = proprietary;
		return this;
	}
}
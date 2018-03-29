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
import com.tools20022.repository.choice.PartyIdentification19Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Distinct pool of financial instruments managed by a single investment policy.
 * May or not be part of an umbrella fund.The pool is issued in at least one
 * investment fund class.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundIdentification3#mmFundIdentification
 * FundIdentification3.mmFundIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundIdentification3#mmAccountIdentificationWithCustodian
 * FundIdentification3.mmAccountIdentificationWithCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundIdentification3#mmCustodianIdentification
 * FundIdentification3.mmCustodianIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFund
 * InvestmentFund}</li>
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
 * "FundIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund.The pool is issued in at least one investment fund class."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundIdentification4
 * FundIdentification4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundIdentification3", propOrder = {"fundIdentification", "accountIdentificationWithCustodian", "custodianIdentification"})
public class FundIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FndId", required = true)
	protected Max35Text fundIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmIdentification
	 * InvestmentFund.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundIdentification3
	 * FundIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the investment fund."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundIdentification3, Max35Text> mmFundIdentification = new MMMessageAttribute<FundIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundIdentification3.mmObject();
			isDerived = false;
			xmlTag = "FndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundIdentification";
			definition = "Identification of the investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(FundIdentification3 obj) {
			return obj.getFundIdentification();
		}

		@Override
		public void setValue(FundIdentification3 obj, Max35Text value) {
			obj.setFundIdentification(value);
		}
	};
	@XmlElement(name = "AcctIdWthCtdn")
	protected Max35Text accountIdentificationWithCustodian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundIdentification3
	 * FundIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctIdWthCtdn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationWithCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the account of the fund held with the custodian."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundIdentification3, Optional<Max35Text>> mmAccountIdentificationWithCustodian = new MMMessageAttribute<FundIdentification3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundIdentification3.mmObject();
			isDerived = false;
			xmlTag = "AcctIdWthCtdn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationWithCustodian";
			definition = "Identifies the account of the fund held with the custodian.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FundIdentification3 obj) {
			return obj.getAccountIdentificationWithCustodian();
		}

		@Override
		public void setValue(FundIdentification3 obj, Optional<Max35Text> value) {
			obj.setAccountIdentificationWithCustodian(value.orElse(null));
		}
	};
	@XmlElement(name = "CtdnId")
	protected PartyIdentification19Choice custodianIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification19Choice
	 * PartyIdentification19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundIdentification3
	 * FundIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the custodian which services the account of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundIdentification3, Optional<PartyIdentification19Choice>> mmCustodianIdentification = new MMMessageAssociationEnd<FundIdentification3, Optional<PartyIdentification19Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundIdentification3.mmObject();
			isDerived = false;
			xmlTag = "CtdnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianIdentification";
			definition = "Identification of the custodian which services the account of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification19Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification19Choice> getValue(FundIdentification3 obj) {
			return obj.getCustodianIdentification();
		}

		@Override
		public void setValue(FundIdentification3 obj, Optional<PartyIdentification19Choice> value) {
			obj.setCustodianIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundIdentification3.mmFundIdentification, com.tools20022.repository.msg.FundIdentification3.mmAccountIdentificationWithCustodian,
						com.tools20022.repository.msg.FundIdentification3.mmCustodianIdentification);
				trace_lazy = () -> InvestmentFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundIdentification3";
				definition = "Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund.The pool is issued in at least one investment fund class.";
				nextVersions_lazy = () -> Arrays.asList(FundIdentification4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getFundIdentification() {
		return fundIdentification;
	}

	public FundIdentification3 setFundIdentification(Max35Text fundIdentification) {
		this.fundIdentification = Objects.requireNonNull(fundIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountIdentificationWithCustodian() {
		return accountIdentificationWithCustodian == null ? Optional.empty() : Optional.of(accountIdentificationWithCustodian);
	}

	public FundIdentification3 setAccountIdentificationWithCustodian(Max35Text accountIdentificationWithCustodian) {
		this.accountIdentificationWithCustodian = accountIdentificationWithCustodian;
		return this;
	}

	public Optional<PartyIdentification19Choice> getCustodianIdentification() {
		return custodianIdentification == null ? Optional.empty() : Optional.of(custodianIdentification);
	}

	public FundIdentification3 setCustodianIdentification(PartyIdentification19Choice custodianIdentification) {
		this.custodianIdentification = custodianIdentification;
		return this;
	}
}